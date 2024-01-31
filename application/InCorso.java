package application;

// Implementazione degli stati dell'esame
public class InCorso implements StatoEsame {
    @Override
    public void prenotaEsame(Studente studente) {
        System.out.println("Impossibile prenotare un esame già in corso.");
    }

    @Override
    public void iniziaEsame(Studente studente) {
        System.out.println("L'esame è già in corso.");
    }

    @Override
    public void completaEsame(Studente studente) {
        studente.setStatoEsame(new Completato());
        System.out.println("L'esame è completato.");
    }
}
