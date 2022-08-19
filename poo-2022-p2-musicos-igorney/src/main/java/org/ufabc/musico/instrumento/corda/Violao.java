package org.ufabc.musico.instrumento.corda;

import org.ufabc.musico.instrumento.Instrumento;
import org.ufabc.musico.instrumento.interfaces.Distorcao;

public class Violao extends Instrumento implements Distorcao {
    private final int cordas;

    public Violao(int cordas) {
        this.cordas = cordas;
    }

    @Override
    public String emitirSom() {
        return emitirSomDistorcido();
    }

    public int getCordas() {
        return cordas;
    }

    @Override
    public String toString() {
        return "Violao{" + "cordas=" + cordas + '}';
    }

    public String emitirSomDistorcido() {
        return "Som distorcido";
    }
}
