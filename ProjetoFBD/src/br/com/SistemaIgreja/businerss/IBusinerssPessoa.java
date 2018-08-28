package br.com.SistemaIgreja.businerss;

import java.util.ArrayList;

import br.com.SistemaIgreja.exception.BusinerssExepion;
import br.com.SistemaIgreja.model.Pessoa;

public interface IBusinerssPessoa {
	
	public Pessoa salvarOuEditar(Pessoa pessoa) throws BusinerssExepion;
	
	public Pessoa buscarPorID(int id) throws BusinerssExepion;
	public Pessoa buscarPorCPF(String cpf) throws BusinerssExepion;
	public ArrayList<Pessoa> buscarPorBusca(String busca);

}
