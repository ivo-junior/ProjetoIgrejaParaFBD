package br.com.SistemaIgreja.DAO;

import java.util.ArrayList;

import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Pessoa;

public interface IPessoaDAO {
	
	public Pessoa salvar(Pessoa pessoa) throws DAOException;
	public void editar(Pessoa pessoa) throws DAOException;
	
	public Pessoa buscarPorID(int id) throws DAOException;
	public Pessoa buscarPorCPF(String cpf) throws DAOException;
	public ArrayList<Pessoa> buscarPorBusca(String busca);
	

}
