package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class Usuario extends Pessoa{
    private List<Musica> musicas;

    public Usuario (String nome, int id, List<Musica> musicas) {
        super(id, nome);
        this.musicas = musicas;
    }
    public boolean jaAdicionou(Musica musica) {
        for (Musica m : musicas) {
            if (m.getArtista().getId() == (musica.getArtista().getId()) && m.getTitulo().equals(musica.getTitulo())) {
                return true;

            }
        }
        return false;
    }

    public void adiciona (Musica musica) {
        if (!jaAdicionou(musica)) {
            musicas.add(musica);
        }
    }

}
