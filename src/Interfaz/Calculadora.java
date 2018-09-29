package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Font;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtoperador1;
	private JTextField txtoperador2;
	private JTextField txtresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnDivision);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnSuma);
		
		JButton btnResta = new JButton("Resta");
		panel.add(btnResta);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel lblOperador = new JLabel("Operador 1:");
		lblOperador.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		panel_1.add(lblOperador);
		
		txtoperador1 = new JTextField();
		panel_1.add(txtoperador1);
		txtoperador1.setColumns(10);
		
		JLabel lblOperador2 = new JLabel("Operador 2:");
		lblOperador2.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		panel_1.add(lblOperador2);
		
		txtoperador2 = new JTextField();
		panel_1.add(txtoperador2);
		txtoperador2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		panel_1.add(lblResultado);
		
		txtresultado = new JTextField();
		txtresultado.setEditable(false);
		panel_1.add(txtresultado);
		txtresultado.setColumns(10);
		
		ControladorBoton control=new ControladorBoton(this);
		btnSuma.setActionCommand("Suma");
		btnSuma.addActionListener(control);
		btnResta.setActionCommand("Resta");
		btnResta.addActionListener(control);
		btnMultiplicacion.setActionCommand("Multplicacion");
		btnMultiplicacion.addActionListener(control);
		btnDivision.setActionCommand("Division");
		btnDivision.addActionListener(control);
	}
	

	public JTextField getTxtresultado() {
		return txtresultado;
	}

	public void setTxtresultado(JTextField txtresultado) {
		this.txtresultado = txtresultado;
	}

	public JTextField getTxtoperador1() {
		return txtoperador1;
	}

	public void setTxtoperador1(JTextField txtoperador1) {
		this.txtoperador1 = txtoperador1;
	}

	public JTextField getTxtoperador2() {
		return txtoperador2;
	}

	public void setTxtoperador2(JTextField txtoperador2) {
		this.txtoperador2 = txtoperador2;
	}

}
