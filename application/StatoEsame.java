package application;

// Interfaccia per gli stati dell'esame
public interface StatoEsame {
    void prenotaEsame(Studente studente);
    void iniziaEsame(Studente studente);
    void completaEsame(Studente studente);
}
