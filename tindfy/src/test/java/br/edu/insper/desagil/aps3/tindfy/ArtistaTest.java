package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {
    private Artista a;

    @BeforeEach
    public void setUp() {
        a = new Artista(1,"Felipe");
    }

    @Test
    public void constroi() {
        assertEquals(1,a.getId());
        assertEquals("Felipe",a.getNome());
    }

    @Test
    public void mudaNome() {
        a.setNome("Pedro");
        assertEquals("Pedro",a.getNome());
    }
}
