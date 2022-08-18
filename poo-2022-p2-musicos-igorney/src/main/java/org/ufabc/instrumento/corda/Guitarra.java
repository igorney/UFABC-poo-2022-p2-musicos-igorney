package org.ufabc.instrumento.corda;

import org.ufabc.instrumento.Instrumento;

public class Guitarra extends Instrumento implements Distorcao {
    private Long cordas;

    public void emitirSomDistorcido() {
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "cordas=" + cordas +
                '}';
    }

    public Long getCordas() {
        return cordas;
    }
}
