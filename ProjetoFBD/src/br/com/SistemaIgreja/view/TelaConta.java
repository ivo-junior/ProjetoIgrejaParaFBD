package br.com.SistemaIgreja.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class TelaConta extends JFrame {
	private JTextField nomedespField, valorField, vencimentoField;
	private JLabel nomeDespLabel, valorLabel, vencimentoLabel, statusLabel, statusDescLabel;
	private JButton salvarbutton;
	private JRadioButton contPagarRadio, contReceberRadio;
	private String statusDaConta;

	public TelaConta() {
		setSize(500, 270);
		getContentPane().setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		nomeDespLabel = new JLabel("Nome da despesa");
		nomeDespLabel.setBounds(10, 23, 109, 27);
		getContentPane().add(nomeDespLabel);

		nomedespField = new JTextField();
		nomedespField.setBounds(126, 25, 205, 22);
		getContentPane().add(nomedespField);
		nomedespField.setColumns(10);

		valorLabel = new JLabel("Valor");
		valorLabel.setBounds(73, 61, 42, 14);
		getContentPane().add(valorLabel);

		vencimentoLabel = new JLabel("Vencimento");
		vencimentoLabel.setBounds(43, 86, 78, 27);
		getContentPane().add(vencimentoLabel);

		statusLabel = new JLabel("Status:");
		statusLabel.setBounds(67, 121, 51, 26);
		getContentPane().add(statusLabel);

		valorField = new JTextField();
		valorField.setBounds(127, 57, 54, 20);
		getContentPane().add(valorField);
		valorField.setColumns(10);

		vencimentoField = new JTextField();
		vencimentoField.setBounds(127, 89, 86, 20);
		getContentPane().add(vencimentoField);
		vencimentoField.setColumns(10);

		salvarbutton = new JButton("Salvar");
		salvarbutton.setBounds(203, 187, 89, 23);
		getContentPane().add(salvarbutton);

		statusDescLabel = new JLabel(statusDaConta);
		statusDescLabel.setBounds(127, 123, 91, 22);
		getContentPane().add(statusDescLabel);

		contReceberRadio = new JRadioButton("Conta receber");
		contReceberRadio.setBounds(129, 152, 109, 23);
		getContentPane().add(contReceberRadio);

		contPagarRadio = new JRadioButton("Conta pagar");
		contPagarRadio.setBounds(269, 152, 109, 23);
		getContentPane().add(contPagarRadio);

	}

	public JLabel getStatusDescLabel() {
		return statusDescLabel;
	}

	public void setStatusDescLabel(JLabel statusDescLabel) {
		this.statusDescLabel = statusDescLabel;
	}

	public JTextField getNomedespField() {
		return nomedespField;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public JTextField getVencimentoField() {
		return vencimentoField;
	}

	public JButton getSalvarbutton() {
		return salvarbutton;
	}

	public JRadioButton getContPagarRadio() {
		return contPagarRadio;
	}

	public JRadioButton getContReceberRadio() {
		return contReceberRadio;
	}

	public String getStatusDaConta() {
		return statusDaConta;
	}

	public void setStatusDaConta(String statusDaConta) {
		this.statusDaConta = statusDaConta;
	}
}
