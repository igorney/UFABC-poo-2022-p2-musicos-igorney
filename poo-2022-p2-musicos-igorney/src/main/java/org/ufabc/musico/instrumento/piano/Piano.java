package org.ufabc.musico.instrumento.piano;

import org.ufabc.musico.instrumento.Instrumento;
import org.ufabc.musico.instrumento.interfaces.Normal;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Piano extends Instrumento implements Normal {
    private final ArrayList<EfeitoSonoro> efeitosSonoros;
    private Boolean digital;
    private int pedais;
    private int teclas;
    private Armario armario;

    public Piano(Boolean digital, int pedais, int teclas, Armario armario) {
        this.digital = digital;
        this.pedais = pedais;
        this.teclas = teclas;
        this.armario = armario;
        this.efeitosSonoros = new ArrayList<EfeitoSonoro>();
    }

    public void adicionarEfeitoSonoro(EfeitoSonoro efeitoSonoro) {
        efeitosSonoros.add(efeitoSonoro);
    }

    @Override
    public String emitirSom() {
        return emitirSomNormal();
    }

    @Override
    public String toString() {
        return "Piano{" + "digital=" + digital + ", pedais=" + pedais + ", teclas=" + teclas + ", armario=" + getArmario().getMadeira() + ", efeitosSonoros=" + getEfeitosSonoros().stream().map(EfeitoSonoro::getEfeitoSonoro).collect(Collectors.joining(",")) + '}';
    }

    public Boolean getDigital() {
        return digital;
    }

    public void setDigital(Boolean digital) {
        this.digital = digital;
    }

    public int getPedais() {
        return pedais;
    }

    public void setPedais(int pedais) {
        this.pedais = pedais;
    }

    public int getTeclas() {
        return teclas;
    }

    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public ArrayList<EfeitoSonoro> getEfeitosSonoros() {
        return this.efeitosSonoros;
    }

    public String emitirSomNormal() {
        return "Som normal!";
    }
}
