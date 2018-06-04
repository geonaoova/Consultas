package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscolherJanela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscolherJanela frame = new EscolherJanela();
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
	public EscolherJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				FormLogin l = new FormLogin();
				l.show();
				
			}
		});
		btnNewButton.setBounds(27, 24, 180, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNovaConsulta = new JButton("Nova Consulta");
		btnNovaConsulta.setBounds(27, 176, 180, 52);
		contentPane.add(btnNovaConsulta);
		
		JButton btnCadastrarUsuario = new JButton("Cadastrar usu\u00E1rio");
		btnCadastrarUsuario.setBounds(27, 252, 180, 52);
		contentPane.add(btnCadastrarUsuario);
		
		JButton btnCadastrarMdico = new JButton("Cadastrar m\u00E9dico");
		btnCadastrarMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				FormCadastrarMedico c = new FormCadastrarMedico();
			}
		});
		btnCadastrarMdico.setBounds(27, 100, 180, 52);
		contentPane.add(btnCadastrarMdico);
	}

}
