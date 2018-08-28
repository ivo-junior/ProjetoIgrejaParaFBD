package br.com.SistemaIgreja.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JButton;

public class TelaCadastro extends JFrame {
	
	private JLabel informaesBasicasLabel, tpPessoaLabel, nomeLabel, lbtelefoneLabel ; 
	private JTextField nomeField;
	private JTextField telefoneField;
	private JTextField cpfField;
	private JTextField emailField;
	private JRadioButton juridicaRadio, fsicaRadio;
	private JCheckBox membroBox, visitanteBox, funcionrioBox, fornecedorBox ;
	private JButton avancadoButton, listarBtton;
	private JButton salvarButton;

	public TelaCadastro() {
		super("Cadastro de Membro");
		setSize(700, 342);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		informaesBasicasLabel = new JLabel("Informa\u00E7\u00F5es Basicas");
		informaesBasicasLabel.setBounds(40, 45, 166, 28);
		getContentPane().add(informaesBasicasLabel);
		
		tpPessoaLabel = new JLabel("Tipo da Pessoa");
		tpPessoaLabel.setBounds(95, 84, 102, 28);
		getContentPane().add(tpPessoaLabel);
		
		juridicaRadio = new JRadioButton("Jur\u00EDdica");
		juridicaRadio.setBounds(203, 87, 94, 23);
		getContentPane().add(juridicaRadio);
		
		fsicaRadio = new JRadioButton("F\u00EDsica");
		fsicaRadio.setBounds(320, 87, 109, 23);
		getContentPane().add(fsicaRadio);
		
		nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(139, 123, 41, 23);
		getContentPane().add(nomeLabel);
		
		nomeField = new JTextField();
		nomeField.setBounds(203, 124, 166, 20);
		getContentPane().add(nomeField);
		nomeField.setColumns(10);
		
		lbtelefoneLabel = new JLabel("Telefone");
		lbtelefoneLabel.setBounds(126, 157, 58, 23);
		getContentPane().add(lbtelefoneLabel);
		
		telefoneField = new JTextField();
		telefoneField.setBounds(203, 158, 166, 20);
		getContentPane().add(telefoneField);
		telefoneField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(424, 127, 58, 19);
		getContentPane().add(lblCpf);
		
		cpfField = new JTextField();
		cpfField.setToolTipText("");
		cpfField.setBounds(470, 126, 189, 20);
		getContentPane().add(cpfField);
		cpfField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setBounds(470, 160, 189, 20);
		getContentPane().add(emailField);
		emailField.setColumns(10);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(413, 159, 41, 19);
		getContentPane().add(emailLabel);
		
		JLabel estaPessoaLabel = new JLabel("Esta pessoa \u00E9?");
		estaPessoaLabel.setBounds(40, 223, 94, 28);
		getContentPane().add(estaPessoaLabel);
		
		membroBox = new JCheckBox("Membro");
		membroBox.setBounds(139, 226, 76, 23);
		getContentPane().add(membroBox);
		
		visitanteBox = new JCheckBox("Visitante");
		visitanteBox.setBounds(217, 226, 76, 23);
		getContentPane().add(visitanteBox);
		
		funcionrioBox = new JCheckBox("Funcion\u00E1rio");
		funcionrioBox.setBounds(300, 226, 97, 23);
		getContentPane().add(funcionrioBox);
		
		fornecedorBox = new JCheckBox("Fornecedor");
		fornecedorBox.setBounds(399, 226, 97, 23);
		getContentPane().add(fornecedorBox);
		
		avancadoButton = new JButton("Avan\u00E7ado");
		avancadoButton.setBounds(40, 273, 94, 23);
		getContentPane().add(avancadoButton);
		
		listarBtton = new JButton("Listar");
		listarBtton.setBounds(496, 273, 89, 23);
		getContentPane().add(listarBtton);
		
		salvarButton = new JButton("Salvar");
		salvarButton.setBounds(595, 273, 89, 23);
		getContentPane().add(salvarButton);
		
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getTelefoneField() {
		return telefoneField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JRadioButton getJuridicaRadio() {
		return juridicaRadio;
	}

	public JRadioButton getFsicaRadio() {
		return fsicaRadio;
	}

	public JCheckBox getMembroBox() {
		return membroBox;
	}

	public JCheckBox getFuncionrioBox() {
		return funcionrioBox;
	}

	public JCheckBox getFornecedorBox() {
		return fornecedorBox;
	}

	public void setVisitanteBox(JCheckBox visitanteBox) {
		this.visitanteBox = visitanteBox;
	}

	public JCheckBox getVisitanteBox() {
		return visitanteBox;
	}

	public JButton getAvancadoButton() {
		return avancadoButton;
	}
	
	public JButton getListarBtton() {
		return listarBtton;
	}

	public JButton getSalvarButton() {
		return salvarButton;
	}
}
