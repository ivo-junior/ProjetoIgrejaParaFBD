package br.com.SistemaIgreja.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaEndereco extends JFrame {
	private JTextField enderecoField, bairroField, numeroField, complementoField, cepField, estadoField, cidadeField;
	private JLabel enderecoLabel, bairroLabel, numeroLabel, complemtoLabel, cepLabel, espadoLabel, cidadeLabel;
	private JComboBox estadosBox;
	private JButton salvarButton, cancelarButton;
	
	public TelaEndereco() {
		setSize(538, 350);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		enderecoLabel = new JLabel("Endereco");
		enderecoLabel.setBounds(45, 22, 54, 20);
		getContentPane().add(enderecoLabel);
		
		enderecoField = new JTextField();
		enderecoField.setBounds(103, 22, 324, 20);
		getContentPane().add(enderecoField);
		enderecoField.setColumns(10);
		
		bairroLabel = new JLabel("Bairro");
		bairroLabel.setBounds(60, 63, 39, 20);
		getContentPane().add(bairroLabel);
		
		bairroField = new JTextField();
		bairroField.setBounds(103, 63, 170, 20);
		getContentPane().add(bairroField);
		bairroField.setColumns(10);
		
		numeroLabel = new JLabel("Numero");
		numeroLabel.setBounds(53, 105, 46, 14);
		getContentPane().add(numeroLabel);
		
		numeroField = new JTextField();
		numeroField.setBounds(103, 102, 54, 20);
		getContentPane().add(numeroField);
		numeroField.setColumns(10);
		
		complemtoLabel = new JLabel("Complemto");
		complemtoLabel.setBounds(36, 140, 54, 20);
		getContentPane().add(complemtoLabel);
		
		complementoField = new JTextField();
		complementoField.setBounds(103, 140, 221, 20);
		getContentPane().add(complementoField);
		complementoField.setColumns(10);
		
		cepLabel = new JLabel("CEP");
		cepLabel.setBounds(60, 177, 29, 20);
		getContentPane().add(cepLabel);
		
		cepField = new JTextField();
		cepField.setBounds(103, 177, 105, 20);
		getContentPane().add(cepField);
		cepField.setColumns(10);
		
		espadoLabel = new JLabel("Espado");
		espadoLabel.setBounds(53, 221, 46, 20);
		getContentPane().add(espadoLabel);
		
		estadosBox = new JComboBox();
		estadosBox.setBounds(141, 221, 16, 20);
		getContentPane().add(estadosBox);
		
		estadoField = new JTextField();
		estadoField.setBounds(103, 221, 39, 20);
		getContentPane().add(estadoField);
		estadoField.setColumns(10);
		
		salvarButton = new JButton("Salvar");
		salvarButton.setBounds(392, 266, 89, 23);
		getContentPane().add(salvarButton);
		
		cancelarButton = new JButton("Cancelar");
		cancelarButton.setBounds(298, 266, 89, 23);
		getContentPane().add(cancelarButton);
		
		cidadeLabel = new JLabel("Cidade");
		cidadeLabel.setBounds(228, 177, 45, 20);
		getContentPane().add(cidadeLabel);
		
		cidadeField = new JTextField();
		cidadeField.setBounds(275, 177, 152, 20);
		getContentPane().add(cidadeField);
		cidadeField.setColumns(10);

	}

	public JTextField getEnderecoField() {
		return enderecoField;
	}

	public JTextField getBairroField() {
		return bairroField;
	}

	public JTextField getNumeroField() {
		return numeroField;
	}

	public JTextField getComplementoField() {
		return complementoField;
	}

	public JTextField getCidadeField() {
		return cidadeField;
	}

	public JTextField getCepField() {
		return cepField;
	}

	public JTextField getEstadoField() {
		return estadoField;
	}

	public JTextField getTextField() {
		return cidadeField;
	}

	public JComboBox getEstadosBox() {
		return estadosBox;
	}

	public JButton getSalvarButton() {
		return salvarButton;
	}

	public JButton getCancelarButton() {
		return cancelarButton;
	}
}
