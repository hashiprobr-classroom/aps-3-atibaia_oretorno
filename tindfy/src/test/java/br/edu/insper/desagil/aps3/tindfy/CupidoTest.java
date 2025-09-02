package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupidoTest {
    private Cupido c;
    private Usuario u1;
    private Usuario u2;

    @BeforeEach
    public void setUp() {
        c = new Cupido();
        u1 = new Usuario("André",1,new ArrayList<>());
        u2 = new Usuario("Arthur", 2, new ArrayList<>());
    }

    @Test
    public void ninguemDaLike(){
        assertFalse(c.deuMatch(u1,u2));
    }

    @Test
    public void primeiroDaLike(){
        c.daLike(u1.getId(),u2.getId());
        assertFalse(c.deuMatch(u1,u2));
    }

    @Test
    public void segundoDaLike(){
        c.daLike(u2.getId(),u1.getId());
        assertFalse(c.deuMatch(u1,u2));
    }
}
