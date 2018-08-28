package br.com.SistemaIgreja.businerss;

import java.util.ArrayList;

import br.com.SistemaIgreja.exception.BusinerssExepion;
import br.com.SistemaIgreja.model.Conta;

public interface IBusinersConta {
	
	public void salvarOuEditar(Conta conta) throws BusinerssExepion;
	
	public Conta buscarPorID(int id) throws BusinerssExepion;
	public ArrayList<Conta> buscarPorBusca(String busca);


}
