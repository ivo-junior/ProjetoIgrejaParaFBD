package br.com.SistemaIgreja.businerss;

import java.util.ArrayList;

import br.com.SistemaIgreja.DAO.ContaPagarDAO;
import br.com.SistemaIgreja.DAO.ContaReceberDAO;
import br.com.SistemaIgreja.DAO.IContaDAO;
import br.com.SistemaIgreja.exception.BusinerssExepion;
import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Conta;

public class BusinerssCReceber implements IBusinersConta{
	private IContaDAO dao;

	
	public BusinerssCReceber() {
		dao=new ContaReceberDAO();
	}

	public void salvarOuEditar(Conta conta) throws BusinerssExepion {
		if(conta.getId()==null){
			try {
				dao.salvar(conta);
			} catch (DAOException e) {
				e.printStackTrace();
			}
		}
		else{
			dao.editar(conta);
		}
	
	}



	public Conta buscarPorID(int id) throws BusinerssExepion {
		try {
			return dao.buscarPorID(id);
		} catch (DAOException e) {
			throw new BusinerssExepion(e.getMessage());
		}
	}

	public ArrayList<Conta> buscarPorBusca(String busca) {
		return null;
	}

}
