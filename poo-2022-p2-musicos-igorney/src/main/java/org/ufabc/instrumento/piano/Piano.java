package org.ufabc.instrumento.piano;

import org.ufabc.instrumento.Instrumento;

import java.util.ArrayList;

public class Piano extends Instrumento {
    private Boolean digital;
    private Long pedais;
    private Long teclas;
    private Armario armario;
    private ArrayList<EfeitoSonoro> efeitosSonoros;

    public void adicionarEfeitoSonoro(EfeitoSonoro efeitoSonoro) {


    }

    @Override
    public String toString() {
        return "Piano{" + "digital=" + digital + ", pedais=" + pedais + ", teclas=" + teclas + ", armario=" + armario + ", efeitosSonoros=" + efeitosSonoros + '}';
    }

    public Boolean getDigital() {
        return digital;
    }

    public void setDigital(Boolean digital) {
        this.digital = digital;
    }

    public Long getPedais() {
        return pedais;
    }

    public void setPedais(Long pedais) {
        this.pedais = pedais;
    }

    public Long getTeclas() {
        return teclas;
    }

    public void setTeclas(Long teclas) {
        this.teclas = teclas;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public ArrayList<EfeitoSonoro> getEfeitosSonoros() {
        return efeitosSonoros;
    }

    public void setEfeitosSonoros(ArrayList<EfeitoSonoro> efeitosSonoros) {
        this.efeitosSonoros = efeitosSonoros;
    }
}
