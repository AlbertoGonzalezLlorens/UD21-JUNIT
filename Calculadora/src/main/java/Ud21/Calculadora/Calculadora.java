package Ud21.Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Operaciones op = new Operaciones();
	
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(183, 90, 151, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(536, 90, 151, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(483, 297, 200, 38);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(108, 95, 65, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblValorB = new JLabel("b");
		lblValorB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorB.setBounds(468, 90, 65, 22);
		contentPane.add(lblValorB);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(383, 305, 90, 22);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("a+b");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText(String.valueOf(op.suma(textField.getText(), textField_1.getText())));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Introducir valores que se puedan sumar");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(108, 189, 123, 38);
		contentPane.add(btnNewButton);
		
		JButton btnResta = new JButton("a-b");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText(String.valueOf(op.resta(textField.getText(), textField_1.getText())));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Introducir valores que se puedan restar");
				}
			}
		});
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnResta.setBounds(108, 261, 123, 38);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("a*b");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText(String.valueOf(op.multiplicacion(textField.getText(), textField_1.getText())));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Introducir valores que se puedan multiplicar");
				}
			}
		});
		btnMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMultiplicacion.setBounds(108, 328, 123, 38);
		contentPane.add(btnMultiplicacion);
		
		JButton btnAb = new JButton("a/b");
		btnAb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Double.parseDouble(textField_1.getText())==0) { throw new ExcepcionNoDivisibleEntre0();}
					textField_2.setText(String.valueOf(op.division(textField.getText(), textField_1.getText())));
				}catch(InputMismatchException ex) {
					JOptionPane.showMessageDialog(null, "Introducir valores que se puedan dividir");
				}catch(ExcepcionNoDivisibleEntre0 ex1) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
				}
			}
		});
		btnAb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAb.setBounds(108, 405, 123, 38);
		contentPane.add(btnAb);
	}
}
