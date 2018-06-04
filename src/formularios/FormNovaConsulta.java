package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.Object;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FormNovaConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtHorarioConsulta;
	
	public String[] especialidade = {"Cardiologia", "Cirurgião", "Dentista", "Neurologia", "Pediatria", "Psicologia"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormNovaConsulta frame = new FormNovaConsulta();
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
	public FormNovaConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomepaciente = new JLabel("Nome do paciente");
		lblNomepaciente.setBounds(10, 31, 109, 14);
		contentPane.add(lblNomepaciente);
		
		textField = new JTextField();
		textField.setBounds(113, 28, 267, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDaConsulta = new JLabel("Data da consulta");
		lblDataDaConsulta.setBounds(10, 71, 95, 14);
		contentPane.add(lblDataDaConsulta);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(106, 68, 95, 20);
		contentPane.add(formattedTextField);
		
		JLabel lblHorarioConsulta = new JLabel("Hor\u00E1rio da Consulta");
		lblHorarioConsulta.setBounds(225, 71, 109, 14);
		contentPane.add(lblHorarioConsulta);
		
		txtHorarioConsulta = new JTextField();
		txtHorarioConsulta.setBounds(343, 68, 37, 20);
		contentPane.add(txtHorarioConsulta);
		txtHorarioConsulta.setColumns(10);
		
		JLabel lblEspecialidade = new JLabel("Especialidade");
		lblEspecialidade.setBounds(10, 107, 72, 14);
		contentPane.add(lblEspecialidade);
		
		JComboBox comboEspecialidade = new JComboBox<>(especialidade);
		comboEspecialidade.setBounds(92, 104, 103, 20);
		contentPane.add(comboEspecialidade);
		
		JLabel lblMdico = new JLabel("M\u00E9dico");
		lblMdico.setBounds(226, 107, 46, 14);
		contentPane.add(lblMdico);
		
		JComboBox comboMedico = new JComboBox();
		comboMedico.setBounds(270, 104, 110, 20);
		contentPane.add(comboMedico);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(195, 147, 185, 42);
		contentPane.add(btnOk);
	}
}
