package model;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	private Matricula matricula;

	public Aluno(int id, String nome, LocalDate localDate) {
		super(id, nome);
	}

	public boolean realizarMatricula(Plano tipo) {
		if (this.matricula != null) {
			System.out.println("Este aluno já possui Matrícula.");
			return false;
		}

		this.matricula = new Matricula();
		matricula.setAluno(this);
		matricula.setPlano(tipo);

        return true;
    }

	public void cancelarMatricula() {
		if (matricula != null) {
			matricula.setAluno(null);
			matricula.setInstrutor(null);
			this.matricula = null;
		}
	}

	public Matricula getMatricula() {
		return matricula;
	}
}
