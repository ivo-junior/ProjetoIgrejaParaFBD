package br.com.SistemaIgreja.controller;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Date;

import javax.swing.JOptionPane;

import org.omg.CORBA.DATA_CONVERSION;

import br.com.SistemaIgreja.exception.BusinerssExepion;
import br.com.SistemaIgreja.fachada.Fachada;
import br.com.SistemaIgreja.fachada.IFachada;
import br.com.SistemaIgreja.model.Conta;
import br.com.SistemaIgreja.model.Endereco;
import br.com.SistemaIgreja.model.Pessoa;
import br.com.SistemaIgreja.view.TelaCadastro;
import br.com.SistemaIgreja.view.TelaConta;
import br.com.SistemaIgreja.view.TelaEndereco;
import br.com.SistemaIgreja.view.TelaInicial;
import br.com.SistemaIgreja.view.TelaListagem;
import br.com.SistemaIgreja.view.TelaLogin;

public class Controller implements ActionListener, WindowListener{
	
	private static IFachada fachada = Fachada.getInstance();
	
	TelaCadastro telacadastro;
	TelaConta telaConta;
	TelaEndereco telaEndereco;
	TelaInicial telaInicial;
	TelaListagem telaListagemPessoas, telaListagemContaPagar, telaListagemContaReceber;
	TelaLogin telaLogin;
	
	Pessoa pessoa;
	Endereco endereco;
	Conta contaPagar, contaReceber;

	public Controller(TelaCadastro telacadastro, TelaConta telaConta,
			TelaEndereco telaEndereco, TelaInicial telaInicial, TelaListagem telaListagemPessoas,
			TelaListagem telaListagemContaPagar, TelaListagem telaListagemContaReceber, TelaLogin telaLogin) {
		this.telacadastro = telacadastro;
		this.telaConta = telaConta;
		this.telaEndereco = telaEndereco;
		this.telaInicial = telaInicial;
		this.telaListagemPessoas = telaListagemPessoas;
		this.telaListagemContaPagar = telaListagemContaPagar;
		this.telaListagemContaReceber = telaListagemContaReceber;
		this.telaLogin = telaLogin;
		
		control();
		
	}
	
//	public void exibirTelaCadastro(){
//		if(telacadastro==null){
//			telacadastro=new TelaCadastro();
//		}
//		
//		telacadastro.setVisible(true);
//	}

	public void control(){
		
		telaLogin.getEntrarButton().addActionListener(this);
		
		
		telaInicial.getHomeButton().addActionListener(this);
		telaInicial.getAdmButton().addActionListener(this);
		telaInicial.getFinanceiroButton().addActionListener(this);
		
		telaInicial.getListagemReceberButton().addActionListener(this);
		telaInicial.getNovoReceberButton().addActionListener(this);
		
		telaInicial.getListagemPagarButton().addActionListener(this);
		telaInicial.getNovoPagarButton().addActionListener(this);
		
		
		telacadastro.getAvancadoButton().addActionListener(this);
		telacadastro.getListarBtton().addActionListener(this);
		telacadastro.addWindowListener(this);
		
		
		telaEndereco.getSalvarButton().addActionListener(this);
		telaEndereco.getCancelarButton().addActionListener(this);
		telaEndereco.addWindowListener(this);
		
		telaConta.getSalvarbutton().addActionListener(this);
		telaConta.addWindowListener(this);
		
		telaListagemContaPagar.getVoltarButton().addActionListener(this);
		telaListagemContaPagar.getImprimirButton().addActionListener(this);
		telaListagemContaPagar.getListarButton().addActionListener(this);
		telaListagemContaPagar.addWindowListener(this);
		
		
		telaListagemContaReceber.getVoltarButton().addActionListener(this);
		telaListagemContaReceber.getImprimirButton().addActionListener(this);
		telaListagemContaReceber.getListarButton().addActionListener(this);
		telaListagemContaReceber.addWindowListener(this);
		
		telaListagemPessoas.getVoltarButton().addActionListener(this);
		telaListagemPessoas.getImprimirButton().addActionListener(this);
		telaListagemPessoas.getListarButton().addActionListener(this);
		telaListagemPessoas.addWindowListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaLogin.getEntrarButton()){
			if(telaLogin.getLoginField().getText().equalsIgnoreCase("i")&&
					telaLogin.getSenhaField().getText().equalsIgnoreCase("1")){
				telaLogin.setVisible(false);
				telaInicial.setVisible(true);
			}
		}
		
		if(e.getSource()==telaInicial.getAdmButton()){
			telaInicial.setVisible(false);
			telacadastro.setVisible(true);
		}
		if(e.getSource()==telaInicial.getFinanceiroButton()){
			telaInicial.setVisible(false);
			telaConta.setVisible(true);
		}
		if(e.getSource()==telaInicial.getListagemReceberButton()){
			telaInicial.setVisible(false);
			telaListagemContaReceber.setVisible(true);
		}
		if(e.getSource()==telaInicial.getNovoReceberButton()){
			telaInicial.setVisible(false);
			telaConta.setVisible(true);
		}
		if(e.getSource()==telaInicial.getListagemPagarButton()){
			telaInicial.setVisible(false);
			telaListagemContaPagar.setVisible(true);
		}
		if(e.getSource()==telaInicial.getNovoPagarButton()){
			telaInicial.setVisible(false);
			telaConta.setVisible(true);
		}
		
		if(e.getSource()==telaConta.getSalvarbutton()){
			if(contaPagar.tipoDeConta(telaConta.getContPagarRadio())){
				contaPagar = new Conta(telaConta.getNomedespField().getText(), telaConta.getStatusDaConta(), Date.valueOf(telaConta.getVencimentoField().getText()));
				try {
					fachada.salvarOuEditarC_P(contaPagar);
				} catch (BusinerssExepion e1) {
					e1.printStackTrace();
				}
			}
			else{
				contaReceber = new Conta(telaConta.getNomedespField().getText(), telaConta.getStatusDaConta(), Date.valueOf(telaConta.getVencimentoField().getText()));
				try {
					fachada.salvarOuEditarReceber(contaReceber);
				} catch (BusinerssExepion e1) {
					e1.printStackTrace();
				}
			}
			
			JOptionPane.showInternalMessageDialog(null, "Conta cadastrada com sucesso!!");
			
//			Chamar algum método de salvamento do banco
		
		}
		
		if(e.getSource()==telacadastro.getSalvarButton()){
			pessoa = new Pessoa(telacadastro.getNomeField().getText(), telacadastro.getCpfField().getText(),
					telacadastro.getTelefoneField().getText(), telacadastro.getEmailField().getText(),
						pessoa.qualidadePesssoa(telacadastro.getMembroBox(), telacadastro.getVisitanteBox(), 
								telacadastro.getFornecedorBox(), telacadastro.getFornecedorBox()), pessoa.tipoDePessoa(telacadastro.getJuridicaRadio()));
			
			try {
				fachada.salvarOuEditarPessoa(pessoa);
				JOptionPane.showInternalMessageDialog(null, "Pessoa cadastrada com sucesso!!");
			} catch (BusinerssExepion e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//			Chamar algum método de salvamento do banco
		}

		if(e.getSource()==telacadastro.getAvancadoButton()){
			telacadastro.setVisible(false);
			telaEndereco.setVisible(true);
			
		}
		if(e.getSource()==telacadastro.getListarBtton()){
			telacadastro.setVisible(false);
			telaListagemPessoas.setVisible(true);
		}
		if(e.getSource()==telaEndereco.getSalvarButton()){
			endereco = new Endereco(telaEndereco.getEnderecoField().getText(), telaEndereco.getBairroField().getText(),
					telaEndereco.getComplementoField().getText(), telaEndereco.getCidadeField().getText(),telaEndereco.getEstadoField().getText(),
						Integer.parseInt(telaEndereco.getNumeroField().getText()), Integer.parseInt(telaEndereco.getEnderecoField().getText()));
			
			
			try {
				fachada.salvarOuEditarPessoa(pessoa);
				JOptionPane.showInternalMessageDialog(null, "Pessoa cadastrada com sucesso!!");
			} catch (BusinerssExepion e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//			Chamar algum método de salvamento do banco
		}
		if(e.getSource()==telaEndereco.getCancelarButton()){
			telaEndereco.setVisible(false);
			telacadastro.setVisible(true);
		}
		
		if(e.getSource()==telaListagemContaPagar.getVoltarButton()){
			telaListagemContaPagar.setVisible(false);
			telaInicial.setVisible(true);
		}
		
		if(e.getSource()==telaListagemContaPagar.getListarButton()){
//			Metodo para listar BD no JTable
		}
		
		if(e.getSource()==telaListagemContaPagar.getImprimirButton()){
//			Metodo para gerar pdf aq.
		}

		if(e.getSource()==telaListagemContaReceber.getVoltarButton()){
			telaListagemContaReceber.setVisible(false);
			telaInicial.setVisible(true);
		}
		
		if(e.getSource()==telaListagemContaReceber.getListarButton()){
//			Metodo para listar BD no JTable
		}
		
		if(e.getSource()==telaListagemContaReceber.getImprimirButton()){
//			Metodo para gerar pdf aq.
		}
		if(e.getSource()==telaListagemPessoas.getVoltarButton()){
			telaListagemPessoas.setVisible(false);
			telaInicial.setVisible(true);
		}
		
		if(e.getSource()==telaListagemPessoas.getListarButton()){
//			Metodo para listar BD no JTable
		}
		
		if(e.getSource()==telaListagemPessoas.getImprimirButton()){
//			Metodo para gerar pdf aq.			
		}
		
		
		
	}

	
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		if(e.getWindow()==telacadastro){
			telacadastro.setVisible(false);
			telaInicial.setVisible(true);
		}
		if(e.getWindow()==telaEndereco){
			telaEndereco.setVisible(false);
			telaInicial.setVisible(true);
		}
		if(e.getWindow()==telaConta){
			telaConta.setVisible(false);
			telaInicial.setVisible(true);
		}
		if(e.getWindow()==telaListagemContaPagar){
			telaListagemContaPagar.setVisible(false);
			telaInicial.setVisible(true);
		}
		if(e.getWindow()==telaListagemContaReceber){
			telaListagemContaReceber.setVisible(false);
			telaInicial.setVisible(true);
		}
		if(e.getWindow()==telaListagemPessoas){
			telaListagemPessoas.setVisible(false);
			telaInicial.setVisible(true);
		}
		
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}

}
