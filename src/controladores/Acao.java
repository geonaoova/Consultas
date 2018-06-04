package controladores;

import javax.swing.table.DefaultTableModel;

import classes.Consulta;
import classes.Medico;
import classes.Usuario;

public class Acao {
	
	public void cadastrarMedico(String nomeMedico, int crm, int cpf, String especialidade) {
		
		Medico m = new Medico();
		m.setNomeMedico(nomeMedico);
		m.setCpf(cpf);
		m.setCrm(crm);
		m.setEspecialidade(especialidade);
		
		classes.Medico.medicos.add(m);
		
	}
	
	public void inserirConsulta (String nomePaciente, int horarioIni, int horarioFin, int especialidade) {
		
		Consulta c = new Consulta();
		c.setNomePaciente(nomePaciente);
		c.setHorarioIni(horarioIni);
		c.setHorarioFin(horarioFin);
		c.setEspecialidade(especialidade);
		
		classes.Consulta.consultas.add(c);
	}

	public void cadastrarUsuario(String usuario, String senha, int nivel) {
		
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		u.setNivel(nivel);
		
		classes.Usuario.usuarios.add(u);
		
	}

	public DefaultTableModel modeloMedicos() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Nome");
		modelo.addColumn("CRM");
		modelo.addColumn("Especialidade");
		
		for(int i = 0; i < Medico.medicos.size(); i++)
		modelo.addRow(new Object[] {
				Medico.medicos.get(i).getNomeMedico(),
				Medico.medicos.get(i).getCrm(),
				Medico.medicos.get(i).getEspecialidade()
				
		});
		
		return modelo;
	}


}