package br.com.SistemaIgreja.app;

import br.com.SistemaIgreja.view.TelaConta;
import br.com.SistemaIgreja.view.TelaEndereco;
import br.com.SistemaIgreja.view.TelaInicial;
import br.com.SistemaIgreja.controller.Controller;
import br.com.SistemaIgreja.view.TelaCadastro;
import br.com.SistemaIgreja.view.TelaListagem;
import br.com.SistemaIgreja.view.TelaLogin;

public class App {

	public static void main(String[] args) {
//		new TelaLogin();
//		new TelaInicial();
//		new TelaCadastro();
//		new TelaEndereco();
//		new TelaConta();
//		new TelaListagem();
		
		new Controller(new TelaCadastro(), new TelaConta(), new TelaEndereco(), new TelaInicial(), new TelaListagem(), new TelaListagem(), new TelaListagem(), new TelaLogin());
	}
	
	

}
