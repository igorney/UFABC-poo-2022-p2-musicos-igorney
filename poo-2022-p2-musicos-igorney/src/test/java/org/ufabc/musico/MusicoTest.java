package org.ufabc.musico;

import org.junit.Before;
import org.junit.Test;
import org.ufabc.musico.instrumento.corda.Guitarra;
import org.ufabc.musico.instrumento.corda.Violao;
import org.ufabc.musico.instrumento.piano.Armario;
import org.ufabc.musico.instrumento.piano.EfeitoSonoro;
import org.ufabc.musico.instrumento.piano.Piano;

import static org.junit.Assert.assertEquals;

public class MusicoTest {
    private Musico musico;

    @Before
    public void setUp() throws Exception {
        musico = new Musico("Igor");
    }

    @Test
    public void testMusicoGuitarrista() {
        Guitarra guitarra = new Guitarra(12L);
        musico.adicionarInstrumento(guitarra);
        assertEquals("Som distorcido", musico.tocarInstrumento());
        assertEquals("Musico{instrumentos=[Guitarra{cordas=12}], nome='Igor'}", musico.toString());
    }

    @Test
    public void testMusicoPianista() {
        Armario armario = new Armario("Reflorestada");
        Piano piano = new Piano(true, 13L, 14L, armario);
        EfeitoSonoro efeitoSonoro = new EfeitoSonoro("Susten");
        piano.adicionarEfeitoSonoro(efeitoSonoro);
        musico.adicionarInstrumento(piano);
        assertEquals("Som normal!", musico.tocarInstrumento());
        assertEquals("Musico{instrumentos=[Piano{digital=true, pedais=13, teclas=14, armario=Reflorestada, efeitosSonoros=Susten}], nome='Igor'}", musico.toString());
    }

    @Test
    public void testMusicoViolonista() {
        Violao violao = new Violao(16L);
        musico.adicionarInstrumento(violao);
        assertEquals("Som distorcido", musico.tocarInstrumento());
        assertEquals("Musico{instrumentos=[Violao{cordas=16}], nome='Igor'}", musico.toString());
    }
}