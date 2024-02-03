package application;

// Implementazione degli stati dell'esame
public class Prenotato implements StatoEsame {
    @Override
    public void prenotaEsame(Studente studente) {
        System.out.println("L'esame è già prenotato.");
    }

    @Override
    public void iniziaEsame(Studente studente) {
        studente.setStatoEsame(new InCorso());
        System.out.println("L'esame è iniziato.");
    }

    @Override
    public void completaEsame(Studente studente) {
        System.out.println("Impossibile completare un esame non iniziato.");
    }
}
