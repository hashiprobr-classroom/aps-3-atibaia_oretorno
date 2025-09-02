package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido () {
        likes = new HashMap<>();
    }

    public void daLike(int id1, int id2) {
        List<Integer> lista = likes.get(id1);
        if (lista == null) {
            lista = new ArrayList<>();
            likes.put(id1, lista);
        }
        if (!lista.contains(id2)) {
            lista.add(id2);
        }
    }

    public boolean deuMatch(Usuario u, Usuario u2) {
        List<Integer> likes1 = likes.get(u.getId());
        List<Integer> likes2 = likes.get(u2.getId());

        if (likes1 != null && likes2 != null && likes1.contains(u2.getId()) && likes2.contains(u.getId())) {
            return true;
        }
        return false;
    }
}