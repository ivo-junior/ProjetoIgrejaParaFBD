package br.com.SistemaIgreja.DAO;

import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Endereco;

public interface IComumDAO {
	
	public void salvar(Endereco endereco) throws DAOException;
	public void editar(Endereco endereco);
	public int getCurrentValorTabela(String nomeTabela) throws DAOException;

}
