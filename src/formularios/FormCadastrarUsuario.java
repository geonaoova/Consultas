package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCadastrarUsuario extends JFrame {

	private JPanel contentPane;
	

	private JTextField txtUsuario;
	private JPasswordField pswSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastrarUsuario frame = new FormCadastrarUsuario();
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
	
	
	String[] nivel = {"Comum", "Admin"};
	
	
	public FormCadastrarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setBounds(10, 21, 46, 14);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(60, 18, 175, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 60, 46, 14);
		contentPane.add(lblSenha);
		
		pswSenha = new JPasswordField();
		pswSenha.setBounds(60, 57, 175, 20);
		contentPane.add(pswSenha);
		
		JComboBox comboBox = new JComboBox(nivel);
		comboBox.setBounds(105, 96, 102, 20);
		contentPane.add(comboBox);
		
		JLabel lblNivel = new JLabel("Nível");
		lblNivel.setBounds(49, 99, 46, 14);
		contentPane.add(lblNivel);
		
		Acao a = new Acao();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String usuario = txtUsuario.getText();
				String senha = String.valueOf(pswSenha.getPassword());
				int nivel = comboBox.getSelectedIndex();
				
				a.cadastrarUsuario(usuario, senha, nivel);
				
				txtUsuario.setText("");
				pswSenha.setText("");
				comboBox.setSelectedIndex(-1);
				
				
				
			}
		});
		btnCadastrar.setBounds(66, 146, 115, 23);
		contentPane.add(btnCadastrar);
	}

}
