package br.com.SistemaIgreja.model;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Pessoa {
	
	private Integer id;
	private String nome, cpf, telefone, eMail, qualidade, observacoes;
	private boolean tpPessoa;
	private Endereco endereco;
	private Character sexo;
	
	public Pessoa(String nome, String cpf, String telefone, String eMail, String qualidade,
			boolean tpPessoa, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.eMail = eMail;
		this.qualidade = qualidade;
		this.tpPessoa = tpPessoa;
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, String cpf, String telefone, String eMail, String qualidade,
			boolean tpPessoa) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.eMail = eMail;
		this.qualidade = qualidade;
		this.tpPessoa = tpPessoa;
	}

	public Pessoa(String nome, String cpf, String telefone, String eMail, String qualidade, String observacoes,
			boolean tpPessoa) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.eMail = eMail;
		this.qualidade = qualidade;
		this.observacoes = observacoes;
		this.tpPessoa = tpPessoa;
	}

	public Pessoa(Integer id, String nome, String cpf, String telefone, String eMail, String qualidade,
			String observacoes, boolean tpPessoa, Endereco endereco, Character sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.eMail = eMail;
		this.qualidade = qualidade;
		this.observacoes = observacoes;
		this.tpPessoa = tpPessoa;
		this.endereco = endereco;
		this.sexo = sexo;
	}

	public static String qualidadePesssoa(JCheckBox membroBox, JCheckBox visitanteBox, JCheckBox funcionrioBox, JCheckBox fornecedorBox){
		
		if(membroBox.isSelected()){
			return "Membro";
		}
		if(visitanteBox.isSelected()){
			return "Visitante";
		}
		if(funcionrioBox.isSelected()){
			return "Funcionario";
		}
		if(fornecedorBox.isSelected()){
			return "Fornecedor";
		}
		
		return null;
	}
	
	public boolean tipoDePessoa(JRadioButton juridicaRadio){
		if(juridicaRadio.isSelected()){
			return true;
		}
		
		
		return false;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	public boolean isTpPessoa() {
		return tpPessoa;
	}

	public void setTpPessoa(boolean tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
