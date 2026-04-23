package model;

public class Plano {

	private final TipoPlano tipo;
	private double valor;

	public Plano(TipoPlano tipo, double valor) {
		this.tipo = tipo;
		setValor(valor);
	}

	public TipoPlano getTipo() {
		return tipo;
	}

	public int getDuracaoMeses() {
		return tipo.getDuracaoMeses();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor < 0) {
			System.out.println("Valor não pode ser negativo.");
		}
		this.valor = valor;
	}
}