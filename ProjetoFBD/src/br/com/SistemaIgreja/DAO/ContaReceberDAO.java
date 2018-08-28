package br.com.SistemaIgreja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Conta;
import br.com.SistemaIgreja.sql.SQLConection;
import br.com.SistemaIgreja.sql.SQLUtil;

public class ContaReceberDAO implements IContaDAO{
	
	private Connection conexao = SQLConection.getConectionInstance(SQLConection.NOME_BD_CONNECTION_POSTGRESS);
	private PreparedStatement statement;
	private ResultSet result;
	private IComumDAO daoComum = new ComumDAO();
	

	public void salvar(Conta conta) throws DAOException {
		
		try {
			this.statement = conexao.prepareStatement(SQLUtil.Conta.INSERT_ALL);
			
			statement.setString(1, conta.getNomeDespesa());
			statement.setDate(2, conta.getVencimento());
			statement.setFloat(3, conta.getValor());
			
			statement.execute();
			
			int idConta = daoComum.getCurrentValorTabela("contas_receber");
			
			this.conexao.close();
			
			conta.setId(idConta);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro ao salvar no Banco!!");
		}
	}


	public void editar(Conta conta) {
	
	}

	
	public Conta buscarPorID(int id) throws DAOException{
		Conta conta;
		try {
			this.statement = conexao.prepareStatement(SQLUtil.Conta.SELECT_ID);
			this.statement.setInt(1, id);
			
			result = this.statement.executeQuery();
			
			if(result.next()){
				conta = new Conta(result.getInt(1), result.getString(2), result.getDate(3), result.getFloat(4));
			}
			
			else{
				throw new DAOException("Conta não existe!!");
			}
			this.conexao.close();
			
			return conta;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro inesperado, favor contatar ADM");
		}
	}


	public ArrayList<Conta> buscarPorBusca(String busca) {
		return null;
	}

}
