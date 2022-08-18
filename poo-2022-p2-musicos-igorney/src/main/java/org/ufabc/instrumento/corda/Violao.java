package org.ufabc.instrumento.corda;

import org.ufabc.instrumento.Instrumento;
import org.ufabc.instrumento.interfaces.Distorcao;

public class Violao extends Instrumento implements Distorcao {
    private Long cordas;

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
