package br.com.SistemaIgreja.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JLabel background;
	private JTextField loginField;
	private JButton entrarButton;
	private JPasswordField senhaField;

	public TelaLogin() {
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);

		background = new JLabel(new ImageIcon("imagens/backLogin.png"));
		background.setBounds(-2, 0, 348, 223);

		getContentPane().add(background);

		entrarButton = new JButton("Entrar");
		entrarButton.setForeground(new Color(0, 0, 0));
		entrarButton.setBounds(121, 165, 91, 23);
		background.add(entrarButton);

		senhaField = new JPasswordField();
		senhaField.setColumns(8);
		background.add(senhaField);
		senhaField.setBounds(19, 116, 299, 26);

		loginField = new JTextField();
		background.add(loginField);
		loginField.setBounds(19, 39, 299, 26);
		loginField.setColumns(10);

		setVisible(true);

	}
	public JTextField getLoginField() {
		return loginField;
	}
	public JButton getEntrarButton() {
		return entrarButton;
	}
	public JPasswordField getSenhaField() {
		return senhaField;
	}
}
