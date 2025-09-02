package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    private Usuario u;
    private Musica m1;
    private Musica m2;
    private Musica m3;

    @BeforeEach
    public void setUp() {
        m1 = new Musica(new Artista(1,"Europe"),"The Final Countdown");
        m2 = new Musica( new Artista(2,"Survivor"),"Eye of the Tiger");
        m3 = new Musica(new Artista(3,"Gustavo Lima"), "Bloqueado");
        u = new Usuario("Felipe",1,new ArrayList<>());
        u.adiciona(m1);
        u.adiciona(m2);
        u.adiciona(m3);
    }

    @Test
    public void naoAdiciona() {
        u.adiciona(new Musica(new Artista(1,"Europe"),"The Final Countdown"));
        assertTrue(u.jaAdicionou(new Musica(new Artista(1, "Europe"), "The Final Countdown")));
    }

    @Test
    public void adiciona() {
        assertFalse(u.jaAdicionou(new Musica(new Artista(5, "Nattan"), "Ultima Noite")));
    }
}
