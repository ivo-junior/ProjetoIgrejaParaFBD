package br.com.SistemaIgreja.DAO;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Conta;


public interface IContaDAO {
	
	public void salvar(Conta conta) throws DAOException;
	public void editar(Conta conta);
	
	public Conta buscarPorID(int id) throws DAOException;
	public ArrayList<Conta> buscarPorBusca(String busca);

}
