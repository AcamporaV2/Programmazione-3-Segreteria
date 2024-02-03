package application;

// Implementazione degli stati dell'esame
public class Completato implements StatoEsame {
    @Override
    public void prenotaEsame(Studente studente) {
        System.out.println("Impossibile prenotare un esame già completato.");
    }

    @Override
    public void iniziaEsame(Studente studente) {
        System.out.println("Impossibile iniziare un esame già completato.");
    }

    @Override
    public void completaEsame(Studente studente) {
        System.out.println("L'esame è già completato.");
    }
}
