package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupidoMusicalTest {
    private CupidoMusical cm;
    private Usuario u1;
    private Usuario u2;
    private Musica musicaComum;

    @BeforeEach
    public void setUp() {
        cm = new CupidoMusical();
        musicaComum = new Musica(new Artista(1, "IG"), "Gueto");
    }

    @Test
    public void semLikesComMusicas() {
        List<Musica> musicas1 = new ArrayList<>();
        musicas1.add(musicaComum);
        u1 = new Usuario("Ne", 1, musicas1);

        List<Musica> musicas2 = new ArrayList<>();
        musicas2.add(musicaComum);
        u2 = new Usuario("Arthur", 2, musicas2);

        assertFalse(cm.deuMatch(u1, u2));
    }

    @Test
    public void comLikesSemMusicas() {
        List<Musica> musicas1 = new ArrayList<>();
        musicas1.add(new Musica(new Artista(1, "Luan"), "Flores"));
        u1 = new Usuario("Ne", 1, musicas1);

        List<Musica> musicas2 = new ArrayList<>();
        musicas2.add(new Musica(new Artista(2, "Jon"), "Noway"));
        u2 = new Usuario("Arthur", 2, musicas2);

        cm.daLike(u1.getId(), u2.getId());
        cm.daLike(u2.getId(), u1.getId());

        assertFalse(cm.deuMatch(u1, u2));
    }

    @Test
    public void comLikesComMusicas() {
        List<Musica> musicas1 = new ArrayList<>();
        musicas1.add(musicaComum);
        u1 = new Usuario("Ne", 1, musicas1);

        List<Musica> musicas2 = new ArrayList<>();
        musicas2.add(musicaComum);
        u2 = new Usuario("Arthur", 2, musicas2);

        cm.daLike(u1.getId(), u2.getId());
        cm.daLike(u2.getId(), u1.getId());

        assertTrue(cm.deuMatch(u1, u2));
    }
}
