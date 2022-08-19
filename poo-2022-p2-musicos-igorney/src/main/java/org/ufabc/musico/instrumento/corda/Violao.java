package org.ufabc.musico.instrumento.corda;

import org.ufabc.musico.instrumento.Instrumento;
import org.ufabc.musico.instrumento.interfaces.Distorcao;

public class Violao extends Instrumento implements Distorcao {
    private final Long cordas;

    public Violao(Long cordas) {
        this.cordas = cordas;
    }

    @Override
    public String emitirSom() {
        return emitirSomDistorcido();
    }

    public Long getCordas() {
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
