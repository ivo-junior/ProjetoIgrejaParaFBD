package br.com.SistemaIgreja.fachada;

import java.util.ArrayList;

import br.com.SistemaIgreja.exception.BusinerssExepion;
import br.com.SistemaIgreja.model.Conta;
import br.com.SistemaIgreja.model.Pessoa;

public interface IFachada {

	public void salvarOuEditarPessoa(Pessoa pessoa) throws BusinerssExepion;
	public Pessoa buscarPessoaPorID(int id) throws BusinerssExepion;
	public Pessoa buscarPorCPF(String cpf) throws BusinerssExepion;
	public ArrayList<Pessoa> buscarPorPessoa(String busca);
	
	public void salvarOuEditarC_P(Conta conta) throws BusinerssExepion;
	public Conta buscarPorIDC_P(int id) throws BusinerssExepion;
	public ArrayList<Conta> buscarPorBuscaC_P(String busca);

	public void salvarOuEditarReceber(Conta conta) throws BusinerssExepion;
	public Conta buscarPorIDReceber(int id) throws BusinerssExepion;
	public ArrayList<Conta> buscarPorBuscaReceber(String busca);
}
