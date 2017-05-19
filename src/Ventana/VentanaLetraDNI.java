package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.CalcularLetra;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblIntroduceDni = new JLabel("Introduce DNI");
		contentPane.add(lblIntroduceDni);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Letra DNI Calculada");
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Calcular");
		contentPane.add(btnNewButton);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "Calcular": 
			CalcularLetra c = new CalcularLetra(textField.getText());
			char letra = c.dLetra();
			textField_1.setText(textField.getText()+letra);
		}
		
	}

}
