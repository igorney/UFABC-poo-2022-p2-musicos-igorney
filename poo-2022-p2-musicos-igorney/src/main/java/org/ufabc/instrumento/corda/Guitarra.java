package org.ufabc.instrumento.corda;

import org.ufabc.instrumento.Instrumento;
import org.ufabc.instrumento.interfaces.Distorcao;

public class Guitarra extends Instrumento implements Distorcao {
    private Long cordas;

    public Guitarra(Long cordas) {
        this.cordas = cordas;
    }

    public String emitirSomDistorcido() {
        return "Som distorcido";
    }

    @Override
    public String toString() {
        return "Guitarra{" + "cordas=" + cordas + '}';
    }

    public String emitirSom() {
        return emitirSomDistorcido();
    }

    public Long getCordas() {
        return cordas;
    }
}
