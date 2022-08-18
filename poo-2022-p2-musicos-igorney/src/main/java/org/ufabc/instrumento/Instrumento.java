package org.ufabc.instrumento;

public class Instrumento {
    private String marca;
    private Long loteFabricacao;

    public void emitirSom() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getLoteFabricacao() {
        return loteFabricacao;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "marca='" + marca + '\'' +
                ", loteFabricacao=" + loteFabricacao +
                '}';
    }

    public void setLoteFabricacao(Long loteFabricacao) {
        this.loteFabricacao = loteFabricacao;
    }
}
