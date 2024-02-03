package application;

import java.util.ArrayList;
import java.util.List;

class CorsoDiLaureaNuovo implements Contenuto {
    private String nome;
    private List<Contenuto> contenuti = new ArrayList<>();

    public CorsoDiLaureaNuovo(String nome) {
        this.nome = nome;
    }

    public void aggiungiContenuto(Contenuto contenuto) {
        contenuti.add(contenuto);
    }

    public void rimuoviContenuto(Contenuto contenuto) {
        contenuti.remove(contenuto);
    }

    @Override
    public void stampaDescrizione() {
        System.out.println("Corso di Laurea: " + nome);
        System.out.println("Contenuti:");
        for (Contenuto contenuto : contenuti) {
            contenuto.stampaDescrizione();
        }
    }
}
