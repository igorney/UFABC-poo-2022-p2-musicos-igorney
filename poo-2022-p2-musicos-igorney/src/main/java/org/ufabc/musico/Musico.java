package org.ufabc.musico;

import org.ufabc.musico.instrumento.Instrumento;
import org.ufabc.musico.instrumento.corda.Guitarra;
import org.ufabc.musico.instrumento.corda.Violao;
import org.ufabc.musico.instrumento.interfaces.Distorcao;

import java.util.ArrayList;

public class Musico {
    private final ArrayList<Instrumento> instrumentos;
    private String nome;

    public Musico(String nome) {
        this.nome = nome;
        this.instrumentos = new ArrayList<Instrumento>();
    }

    @Override
    public String toString() {
        return "Musico{" +
                "instrumentos=" + instrumentos +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String tocarInstrumento() {
        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Violao || instrumento instanceof Guitarra) {
                return ((Distorcao) instrumento).emitirSomDistorcido();
            }
            return instrumento.emitirSom();
        }
        return "Nenhum instrumento encontrado!";
    }

    public void adicionarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
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
