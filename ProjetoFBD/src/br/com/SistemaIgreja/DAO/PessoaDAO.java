package br.com.SistemaIgreja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Endereco;
import br.com.SistemaIgreja.model.Pessoa;
import br.com.SistemaIgreja.sql.SQLConection;
import br.com.SistemaIgreja.sql.SQLUtil;

public class PessoaDAO implements IPessoaDAO{
	
	private Connection conexao = SQLConection.getConectionInstance(SQLConection.NOME_BD_CONNECTION_POSTGRESS);
	private PreparedStatement statement;
	private IComumDAO endereco = new ComumDAO();
	private ResultSet result;
	
	public Pessoa salvar(Pessoa pessoa) throws DAOException{
		
		try {
			
			endereco.salvar(pessoa.getEndereco());
			int idEndereco = endereco.getCurrentValorTabela("endereco");
		
			this.statement = conexao.prepareStatement(SQLUtil.Pessoa.INSERT_ALL);
			
			statement.setString(1, pessoa.getNome());
			statement.setLong(2, pessoa.getSexo());
			statement.setString(3, pessoa.getCpf());
			statement.setString(4, pessoa.getObservacoes());
			statement.setString(5, pessoa.geteMail());
			statement.setString(6, pessoa.getQualidade());
			statement.setBoolean(7, pessoa.isTpPessoa());
			statement.setString(8, pessoa.getTelefone());
			
			statement.execute();
			
			int idPessoa = endereco.getCurrentValorTabela("pessoa");
			
			this.conexao.close();
			
			pessoa.setId(idPessoa);
			pessoa.getEndereco().setId(idEndereco);
			
			return pessoa;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new DAOException("ERRO ao salvar no Banco");
		}
		
		
		
	}

	public void editar(Pessoa pessoa) throws DAOException{
		
	}

	public Pessoa buscarPorID(int id) throws DAOException{
		try {
			this.statement = conexao.prepareStatement(SQLUtil.Pessoa.SELECT_ID);
			this.statement.setInt(1, id);
			
			result = this.statement.executeQuery();
			
			Pessoa pessoa;
			
			if(result.next()){
				pessoa = new Pessoa(result.getInt(1), result.getString(2), result.getString(4), result.getString(9), result.getString(6), result.getString(7), result.getString(5),
						result.getBoolean(8), new Endereco(result.getString(11), result.getString(12), result.getString(13),
								result.getString(15), result.getString(16), result.getInt(12),result.getInt(14), result.getInt(10)), (char) result.getLong(3));
				
			}
			else{
				throw new DAOException("Aluno não existe");
			}
			this.conexao.close();
		
			return pessoa;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro inesperado, favor contatar ADM");
		}
	}

	public Pessoa buscarPorCPF(String cpf) throws DAOException{
		
		try {
			this.statement = conexao.prepareStatement(SQLUtil.Pessoa.SELECT_PESSOA_CPF);
			this.statement.setString(1, cpf);
			
			result = this.statement.executeQuery();
			
			Pessoa pessoa;
			
			if(result.next()){
				pessoa = new Pessoa(result.getInt(1), result.getString(2), result.getString(4), result.getString(9), result.getString(6), result.getString(7), result.getString(5),
						result.getBoolean(8), new Endereco(result.getString(11), result.getString(12), result.getString(13),
								result.getString(15), result.getString(16), result.getInt(12),result.getInt(14), result.getInt(10)), (char) result.getLong(3));
				
			}
			else{
				throw new DAOException("Aluno não existe");
			}
			this.conexao.close();
		
			return pessoa;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro inesperado, favor contatar ADM");
		}
	}

	public ArrayList<Pessoa> buscarPorBusca(String busca) {
		return null;
	}

}
