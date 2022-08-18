package org.ufabc.instrumento.corda;

import org.ufabc.instrumento.Instrumento;

public class Violao extends Instrumento implements Distorcao {
    private Long cordas;

    @Override
    public String emitirSom() {
        return emitirSomDistorcido();
    }

    @Override
    public String toString() {
        return "Violao{" +
                "cordas=" + cordas +
                '}';
    }

    public Long getCordas() {
        return cordas;
    }

    public String emitirSomDistorcido() {
        return "Som distorcido";
    }
}
