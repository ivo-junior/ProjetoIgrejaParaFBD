package br.com.SistemaIgreja.fachada;

import java.util.ArrayList;

import br.com.SistemaIgreja.businerss.BusinersCPagar;
import br.com.SistemaIgreja.businerss.BusinerssCReceber;
import br.com.SistemaIgreja.businerss.BusinerssPessoa;
import br.com.SistemaIgreja.businerss.IBusinersConta;
import br.com.SistemaIgreja.businerss.IBusinerssPessoa;
import br.com.SistemaIgreja.exception.BusinerssExepion;
import br.com.SistemaIgreja.model.Conta;
import br.com.SistemaIgreja.model.Pessoa;

public class Fachada implements IFachada{
	
	private IBusinerssPessoa businerssPessoa;
	private IBusinersConta businerssContaR, businerssContaP;
	
	private static Fachada fachada;
	
	public static Fachada getInstance(){
		if(fachada==null){
			fachada=new Fachada();
		}
		return fachada;
	}
	
	public Fachada() {
		businerssPessoa=new BusinerssPessoa();
		businerssContaP=new BusinersCPagar();
		businerssContaR=new BusinerssCReceber();
	}

	public void salvarOuEditarPessoa(Pessoa pessoa) throws BusinerssExepion {
		this.businerssPessoa.salvarOuEditar(pessoa);
	}

	public Pessoa buscarPessoaPorID(int id) throws BusinerssExepion {
		return this.businerssPessoa.buscarPorID(id);
	}

	public Pessoa buscarPorCPF(String cpf) throws BusinerssExepion {
		return this.businerssPessoa.buscarPorCPF(cpf);
	}

	public ArrayList<Pessoa> buscarPorPessoa(String busca) {
		return null;
	}

	public void salvarOuEditarC_P(Conta conta) throws BusinerssExepion {
		this.businerssContaP.salvarOuEditar(conta);
	}

	public Conta buscarPorIDC_P(int id) throws BusinerssExepion {
		return this.businerssContaP.buscarPorID(id);
	}

	public ArrayList<Conta> buscarPorBuscaC_P(String busca) {
		return null;
	}

	public void salvarOuEditarReceber(Conta conta) throws BusinerssExepion {
		this.businerssContaR.salvarOuEditar(conta);
	}

	public Conta buscarPorIDReceber(int id) throws BusinerssExepion {
		return this.businerssContaR.buscarPorID(id);
	}

	public ArrayList<Conta> buscarPorBuscaReceber(String busca) {
		return null;
	}

}
