package org.ufabc.instrumento.piano;

public class Armario extends Piano {
    private String madeira;

    public Armario(Boolean digital, Long pedais, Long teclas, Armario armario) {
        super(digital, pedais, teclas, armario);
    }

    public String getMadeira() {
        return madeira;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }
}
