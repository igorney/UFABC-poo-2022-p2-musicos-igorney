package org.ufabc.musico;

import org.ufabc.instrumento.Instrumento;
import org.ufabc.instrumento.corda.Distorcao;
import org.ufabc.instrumento.corda.Guitarra;
import org.ufabc.instrumento.corda.Violao;

import java.util.ArrayList;

public class Musico {
    private final ArrayList<Instrumento> instrumentos;
    private String nome;

    public Musico(String nome) {
        this.nome = nome;
        this.instrumentos = new ArrayList<Instrumento>();
    }

    public void tocarInstrumento() {
        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Violao || instrumento instanceof Guitarra) {
                ((Distorcao) instrumento).emitirSomDistorcido();
            }
            instrumento.emitirSom();
        }
    }

    public void adicionarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    @Override
    public String toString() {
        return "Musico{" + "nome='" + nome + '\'' + ", instrumentos=" + instrumentos + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

}
