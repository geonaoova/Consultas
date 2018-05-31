package formularios;

import classes.Medico;
import controladores.Acao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;

public class FormCadastrarMedico extends JFrame {

	private JPanel contentPane;
	private JTextField txtnomeMedico;
	
	public String[] especialidade = {"Cardiologia", "Cirurgião", "Dentista", "Neurologia", "Pediatria", "Psicologia"};
	private JTable table;
	private JScrollPane barra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastrarMedico frame = new FormCadastrarMedico();
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
	public FormCadastrarMedico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtnomeMedico = new JTextField();
		txtnomeMedico.setBounds(59, 11, 265, 20);
		contentPane.add(txtnomeMedico);
		txtnomeMedico.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 14, 39, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(20, 45, 26, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCrm = new JLabel("CRM");
		lblCrm.setBounds(177, 45, 46, 14);
		contentPane.add(lblCrm);
		
		JFormattedTextField txtCpf = new JFormattedTextField();
		txtCpf.setBounds(58, 42, 107, 20);
		contentPane.add(txtCpf);
		
		JFormattedTextField txtCrm = new JFormattedTextField();
		txtCrm.setBounds(206, 42, 118, 20);
		contentPane.add(txtCrm);
		
		JLabel lblEspecialidade = new JLabel("Especialidade");
		lblEspecialidade.setBounds(20, 82, 79, 14);
		contentPane.add(lblEspecialidade);
		
		JComboBox comboEspecialidade = new JComboBox(especialidade);
		comboEspecialidade.setBounds(109, 79, 215, 20);
		contentPane.add(comboEspecialidade);
		
		Acao a = new Acao();
		
		table = new JTable(a.modeloMedicos());
		table.setBounds(20, 186, 304, 213);
		contentPane.add(table);
		
		barra = new JScrollPane(table);
		barra.setBounds(20, 180, 304, 213);
		contentPane.add(barra);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(115, 122, 118, 47);
		contentPane.add(btnCadastrar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomeMedico = txtnomeMedico.getText();
				int cpf = Integer.parseInt(txtCpf.getText());
				int crm = Integer.parseInt(txtCrm.getText());
				String indEspecialidade = comboEspecialidade.getSelectedItem().toString();
				
				
				a.cadastrarMedico(nomeMedico, crm, cpf, indEspecialidade);
				
				table.setModel(a.modeloMedicos());
			
				
				txtnomeMedico.setText("");
				txtCpf.setText("");
				txtCrm.setText("");
				comboEspecialidade.setSelectedIndex(-1);
				
				txtnomeMedico.requestFocus();
			}
		});
		
		
	}
}
