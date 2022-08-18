package org.ufabc.instrumento.corda;

import org.ufabc.instrumento.piano.Piano;
import org.ufabc.musico.Musico;

public class Violao extends Musico implements Distorcao{
    private Long cordas;
    Piano piano;

    @Override
    public String toString() {
        return "Violao{" +
                "cordas=" + cordas +
                '}';
    }

    public Long getCordas() {
        return cordas;
    }

    public void emitirSomDistorcido() {

    }
}
