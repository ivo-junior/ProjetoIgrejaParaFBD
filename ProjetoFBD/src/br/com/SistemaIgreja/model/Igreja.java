package br.com.SistemaIgreja.model;

public class Igreja {
	
	private Integer id;
	private String nome;
	private float saldo;
	
	public Igreja(String nome, float saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void somarSaldo(float valor){
		this.saldo+=valor;
	}
	
	public void subtrairSaldo(float valor){
		this.saldo-=valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
