import model.*;

import java.time.LocalDate;

public class Aplicacao {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(1, "Gabriel", LocalDate.of(2008, 5, 10));
		Instrutor instrutor  = new Instrutor(2, "João", "Personal Trainer Cardio", "123456-78AB");
		Plano planoMensal = new Plano(TipoPlano.MENSAL, 100.0);
		boolean matriculado = aluno.realizarMatricula(planoMensal);

		if (matriculado) {
			System.out.println("Matrícula realizada com sucesso!");

			Matricula m = aluno.getMatricula();

			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Plano: " + planoMensal.getTipo().getNome());
			System.out.println("Instrutor: " + instrutor.getNome());
			System.out.println("Início: " + m.getDataInicio());
			System.out.println("Fim: " + m.getDataFim());
		}

		aluno.cancelarMatricula();
		System.out.println("Matrícula cancelada.");
	}

}
