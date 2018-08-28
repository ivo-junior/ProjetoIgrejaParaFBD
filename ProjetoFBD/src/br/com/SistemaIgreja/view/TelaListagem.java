package br.com.SistemaIgreja.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaListagem extends JFrame {
	private JTable table;
	private JScrollBar scrollBar; 
	private JButton imprimirButton, voltarButton, listarButton;
	private JSeparator separator_1;


		public TelaListagem() {
		setSize(660, 350);
		setResizable(false);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setBounds(10, 49, 634, 211);
		getContentPane().add(table);
		
		imprimirButton = new JButton("Imprimir");
		imprimirButton.setBounds(528, 282, 89, 29);
		getContentPane().add(imprimirButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 262, 634, 9);
		getContentPane().add(separator);
		
		scrollBar = new JScrollBar();
		table.add(scrollBar);
		scrollBar.setBounds(617, 0, 17, 211);
		
		voltarButton = new JButton("Voltar");
		voltarButton.setBounds(325, 282, 89, 29);
		getContentPane().add(voltarButton);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(9, 45, 634, 5);
		getContentPane().add(separator_1);
		
		listarButton = new JButton("Listar");
		listarButton.setBounds(424, 282, 89, 29);
		getContentPane().add(listarButton);
		
	
	}


		public JTable getTable() {
			return table;
		}


		public void setTable(JTable table) {
			this.table = table;
		}


		public JButton getImprimirButton() {
			return imprimirButton;
		}


		public JButton getVoltarButton() {
			return voltarButton;
		}


		public JButton getListarButton() {
			return listarButton;
		}
}
