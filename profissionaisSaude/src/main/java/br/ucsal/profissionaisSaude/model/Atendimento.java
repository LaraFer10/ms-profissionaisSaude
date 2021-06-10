package br.ucsal.profissionaisSaude.model;


public class Atendimento {

	private String diaSemana;
	private String horario;
	
	public Atendimento() {}
	
	
	public Atendimento(String diaSemana, String horario) {
		super();
		this.diaSemana = diaSemana;
		this.horario = horario;
	}


	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
}
