package application;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

// Component
interface Contenuto {
    void stampaDescrizione();
}

// Leaf
class Materia implements Contenuto {
    private String nome;

    public Materia(String nome) {
        this.nome = nome;
    }

    @Override
    public void stampaDescrizione() {
        System.out.println("Materia: " + nome);
    }
}

// Composite
class CorsoDiLaurea implements Contenuto {
    private String nome;
    private List<Contenuto> contenuti = new ArrayList<>();

    public CorsoDiLaurea(String nome) {
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

