package model;

public class Instrutor extends Pessoa {
	private String especialidade;
	private String cref;

	public Instrutor(int id, String nome, String especialidade, String cref) {
		super(id, nome);
		this.especialidade = especialidade;
		this.cref = cref;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}
}
