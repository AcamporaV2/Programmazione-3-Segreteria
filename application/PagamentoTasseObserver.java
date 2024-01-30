package application;

public class PagamentoTasseObserver implements Observer {

    private Studente studente;

    public PagamentoTasseObserver(Studente studente) {
        this.studente = studente;
        studente.aggiungiOsservatore(this);
    }

    @Override
    public void notificaPagamentoTasse() {
        if (studente.isTassePagate()) {
            System.out.println("Il pagamento delle tasse dello studente " + studente.getNome() + " " + studente.getCognome() + " è stato ricevuto.");
        } else {
            System.out.println("Lo studente " + studente.getNome() + " " + studente.getCognome() + " deve ancora pagare le tasse.");
        }
    }
}
