package model;

public class TipoPlano {

    public static final TipoPlano MENSAL = new TipoPlano("MENSAL", 1);
    public static final TipoPlano TRIMESTRAL = new TipoPlano("TRIMESTRAL", 3);
    public static final TipoPlano ANUAL = new TipoPlano("ANUAL", 12);

    private String nome;
    private int duracaoMeses;

    private TipoPlano(String nome, int duracaoMeses) {
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }
}