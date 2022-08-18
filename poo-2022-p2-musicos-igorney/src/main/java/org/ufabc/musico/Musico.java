package org.ufabc.musico;

import org.ufabc.instrumento.Instrumento;

import java.util.ArrayList;

public class Musico {
    private String nome;
    private ArrayList<Instrumento> instrumentos;

    public void tocarInstrumento() {
    }

    @Override
    public String toString() {
        return "Musico{" +
                "nome='" + nome + '\'' +
                ", instrumentos=" + instrumentos +
                '}';
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

    public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}
