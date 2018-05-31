package classes;

import java.util.ArrayList;

public class Medico {
	
	private String nomeMedico, especialidade;
	private int crm, cpf;
	
	public String getNomeMedico() {
		return nomeMedico;
	}



	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}



	public int getCrm() {
		return crm;
	}



	public void setCrm(int crm) {
		this.crm = crm;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public String getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(String Especialidade) {
		this.especialidade = Especialidade;
	}



	public static ArrayList<Medico> medicos = new ArrayList<>();
	
}
