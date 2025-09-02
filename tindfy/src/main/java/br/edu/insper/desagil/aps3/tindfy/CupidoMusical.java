package br.edu.insper.desagil.aps3.tindfy;

public class CupidoMusical extends Cupido {

    public CupidoMusical() { }

    @Override
    public boolean deuMatch(Usuario u1, Usuario u2) {
        if (!super.deuMatch(u1, u2)) {
            return false;
        }

        for (Musica m : u1.getMusicas()) {
            if (u2.jaAdicionou(m)) {
                return true;
            }
        }

        return false;
    }
}
