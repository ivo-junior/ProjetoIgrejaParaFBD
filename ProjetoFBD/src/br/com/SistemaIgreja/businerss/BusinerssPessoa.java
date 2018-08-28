package br.com.SistemaIgreja.businerss;

import java.util.ArrayList;

import br.com.SistemaIgreja.DAO.IPessoaDAO;
import br.com.SistemaIgreja.DAO.PessoaDAO;
import br.com.SistemaIgreja.exception.BusinerssExepion;
import br.com.SistemaIgreja.exception.DAOException;
import br.com.SistemaIgreja.model.Pessoa;

public class BusinerssPessoa implements IBusinerssPessoa{

	private static IPessoaDAO dao;

	public BusinerssPessoa() {
		dao=new PessoaDAO();
	}

	public Pessoa salvarOuEditar(Pessoa pessoa) throws BusinerssExepion {
		try {
			if(pessoa.getId()==null){
				dao.salvar(pessoa);
			}
			else{
				dao.editar(pessoa);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
		return pessoa;
	}


	public Pessoa buscarPorID(int id) throws BusinerssExepion {
		try {
			return dao.buscarPorID(id);
		} catch (DAOException e) {
			throw new BusinerssExepion(e.getMessage());
			
		}
	}

	public Pessoa buscarPorCPF(String cpf) throws BusinerssExepion {

		try {
			return dao.buscarPorCPF(cpf);
		} catch (DAOException e) {
			throw new BusinerssExepion(e.getMessage());
		}
	}

	public ArrayList<Pessoa> buscarPorBusca(String busca) {
		
		return null;
	}






}
