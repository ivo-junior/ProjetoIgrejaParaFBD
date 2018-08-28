package br.com.SistemaIgreja.model;

import java.sql.Date;

import javax.swing.JRadioButton;

public class Conta {
	
	private Integer id;
	private String nomeDespesa, status;
	private Date vencimento;
	private float valor=0;
	
	public Conta(String nomeDespesa, String status, Date vencimento) {
		this.nomeDespesa = nomeDespesa;
		this.status = status;
		this.vencimento = vencimento;
	}

	public Conta(Integer id, String nomeDespesa, Date vencimento, float valor) {
		super();
		this.id = id;
		this.nomeDespesa = nomeDespesa;
		this.status = status;
		this.vencimento = vencimento;
		this.valor = valor;
	}

	public boolean tipoDeConta(JRadioButton contPagarRadio){
		if(contPagarRadio.isSelected()){
			return true;
		}
		return false;
	}

	public String getNomeDespesa() {
		return nomeDespesa;
	}

	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa = nomeDespesa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
