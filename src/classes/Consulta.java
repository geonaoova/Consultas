package classes;

import java.util.ArrayList;

public class Consulta {
	
	private int horarioIni, horarioFin, especialidade;
	private String nomePaciente;
	
	public int getHorarioIni() {
		return horarioIni;
	}

	public void setHorarioIni(int horarioIni) {
		this.horarioIni = horarioIni;
	}

	public int getHorarioFin() {
		return horarioFin;
	}

	public void setHorarioFin(int horarioFin) {
		this.horarioFin = horarioFin;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}

	public static ArrayList<Consulta> consultas = new ArrayList<>();

}
