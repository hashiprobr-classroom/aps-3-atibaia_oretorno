package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private final Map<Integer, List<Integer>> likes;

    public Cupido () {
        likes = new HashMap<>();
    }

    public void daLike(int id1, int id2) {
        List<Integer> lista = likes.get(id1);
        if (lista.isEmpty()) {
            lista = new ArrayList<>();
            likes.put(id1, lista);
        }
        if (!lista.contains(id2)) {
            lista.add(id2);
        }
    }

    public boolean deuMatch(Usuario u1, Usuario u2) {
          if (likes.get(u2.getId()).contains(u1.getId()) && likes.get(u1.getId()).contains(u2.getId())) {
              return true;
          }
          return false;
    }
}
