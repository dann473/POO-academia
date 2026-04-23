package model;

import java.time.LocalDate;

public class Matricula {
	private int id;
	private Aluno aluno;
	private Plano plano;
	private Instrutor instrutor;
	private LocalDate dataInicio;
	private LocalDate dataFim;

	public LocalDate getDataFim() {
		return dataFim;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public Matricula() {
		this.dataInicio = LocalDate.now();
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public boolean matriculado() {
		return dataInicio != null && dataFim != null && dataFim.isAfter(dataInicio);
	}

}
