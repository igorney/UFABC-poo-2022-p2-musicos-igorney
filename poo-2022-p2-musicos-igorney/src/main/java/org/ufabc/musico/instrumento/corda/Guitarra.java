package org.ufabc.musico.instrumento.corda;

import org.ufabc.musico.instrumento.Instrumento;
import org.ufabc.musico.instrumento.interfaces.Distorcao;

public class Guitarra extends Instrumento implements Distorcao {
    private final int cordas;

    public Guitarra(int cordas) {
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

    public int getCordas() {
        return cordas;
    }
}
