package org.ufabc.instrumento;

public abstract class Instrumento {
    private String marca;
    private Long loteFabricacao;

    public abstract String emitirSom();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getLoteFabricacao() {
        return loteFabricacao;
    }

    public void setLoteFabricacao(Long loteFabricacao) {
        this.loteFabricacao = loteFabricacao;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "marca='" + marca + '\'' + ", loteFabricacao=" + loteFabricacao + '}';
    }
}
