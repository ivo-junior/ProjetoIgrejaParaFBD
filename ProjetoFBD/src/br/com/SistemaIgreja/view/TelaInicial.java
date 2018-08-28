package br.com.SistemaIgreja.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class TelaInicial extends JFrame {
	
	private JLabel background;
	private JButton  homeButton, admButton, financeiroButton, listagemReceberButton, novoReceberButton, listagemPagarButton, novoPagarButton;
	
	
	public TelaInicial() {
		super("Sistema Igreja");
	setSize(1572, 676);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	background = new JLabel(new ImageIcon("imagens/backSistema.png"));
	background.setBounds(0, 0, 1564, 649);
	getContentPane().add(background);
	
	homeButton = new JButton(new ImageIcon("imagens/home.png"));
	background.add(homeButton);
	homeButton.setBounds(0, 85, 232, 41);
	
	admButton = new JButton(new ImageIcon("imagens/adm.png"));
	background.add(admButton);
	admButton.setBounds(0, 125, 232, 41);
	
	listagemPagarButton = new JButton("Listagem");
	listagemPagarButton.setBackground(new Color(211, 211, 211));
	background.add(listagemPagarButton);
	listagemPagarButton.setBounds(949, 300, 113, 41);
	
	listagemReceberButton = new JButton("Listagem");
	listagemReceberButton.setBackground(new Color(211, 211, 211));
	background.add(listagemReceberButton);
	listagemReceberButton.setBounds(274, 300, 113, 41);
	
	novoReceberButton = new JButton("Novo");
	novoReceberButton.setBackground(new Color(211, 211, 211));
	background.add(novoReceberButton);
	novoReceberButton.setBounds(397, 300, 113, 41);
	
	novoPagarButton = new JButton("Novo");
	background.add(novoPagarButton);
	novoPagarButton.setBackground(new Color(211, 211, 211));
	novoPagarButton.setBounds(1074, 300, 113, 41);
	
	financeiroButton = new JButton(new ImageIcon("imagens/financeiro.png"));
	background.add(financeiroButton);
	financeiroButton.setBounds(0, 165, 232, 41);
	
	}


	public JButton getHomeButton() {
		return homeButton;
	}


	public JButton getAdmButton() {
		return admButton;
	}


	public JButton getFinanceiroButton() {
		return financeiroButton;
	}


	public JButton getListagemReceberButton() {
		return listagemReceberButton;
	}


	public JButton getNovoReceberButton() {
		return novoReceberButton;
	}


	public JButton getListagemPagarButton() {
		return listagemPagarButton;
	}


	public JButton getNovoPagarButton() {
		return novoPagarButton;
	}
}
