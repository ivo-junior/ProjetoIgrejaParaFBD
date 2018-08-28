package br.com.SistemaIgreja.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Endereco;
import br.com.SistemaIgreja.sql.SQLConection;
import br.com.SistemaIgreja.sql.SQLUtil;

public class ComumDAO implements IComumDAO{

	private Connection conexao = SQLConection.getConectionInstance(SQLConection.NOME_BD_CONNECTION_POSTGRESS);
	private PreparedStatement statement;
	private ResultSet result;


	public void salvar(Endereco endereco) throws DAOException{
		try {
			this.statement = conexao.prepareStatement(SQLUtil.Endereco.INSERT_ALL);
			
			statement.setString(1, endereco.getEndereco());
			statement.setString(2, endereco.getBairro());
			statement.setInt(3, endereco.getNum());
			statement.setString(4, endereco.getComplemento());
			statement.setInt(5, endereco.getCep());
			statement.setString(6, endereco.getCidade());
			statement.setString(7, endereco.getEstado());
			
			statement.execute();
			
			this.conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void editar(Endereco endereco) {		
	}

	public int getCurrentValorTabela(String nomeTabela) throws DAOException {

		try {
			this.statement = conexao.prepareStatement("select id from " + nomeTabela + " order by id desc limit 1");

			result = this.statement.executeQuery();
			int id;
			if (result.next()) {
				id = result.getInt(1);
			} else {
				throw new DAOException("Não há registro nessa tabela");
			}
			this.conexao.close();
			return id;

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("PROBLEMA AO CONSULTAR " + nomeTabela + " - Contate o ADM");
		}

	}

}
