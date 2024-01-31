package application;

import java.util.ArrayList;
import java.util.List;

public class Studente extends Persona { // sottoclasse studente
    private String matricola;
    private String dataDiNascita;
    private String residenza;
    private String pianoDiStudi;
    private boolean tassePagate;
    private List<Observer> osservatori = new ArrayList<>();
    private StatoEsame statoEsame;

    // Costruttore vuoto
    public Studente() {
    	super();
        this.matricola = "";
        this.dataDiNascita = "";
        this.residenza = "";
        this.pianoDiStudi = "";
        this.tassePagate = false;
        this.statoEsame = new Prenotato();
    }

    // Costruttore parametrizzato
    public Studente(String nome, String cognome, String matricola, String dataDiNascita, String residenza, String pianoDiStudi, boolean tassePagate) {
        super(nome, cognome); // Chiamiamo il costruttore parametrizzato della superclasse Persona
        this.matricola = matricola;
        this.dataDiNascita = dataDiNascita;
        this.residenza = residenza;
        this.pianoDiStudi = pianoDiStudi;
        this.tassePagate = tassePagate;
        this.statoEsame = new Prenotato();
    }
    
    public void aggiungiOsservatore(Observer osservatore) {
        osservatori.add(osservatore);
    }

    public void rimuoviOsservatore(Observer osservatore) {
        osservatori.remove(osservatore);
    }

    // Chiamato quando lo stato delle tasse cambia
    private void notificaOsservatori() {
        for (Observer osservatore : osservatori) {
            osservatore.updatePagamentoTasse(this);
        }
    }

    // Metodo per impostare lo stato del pagamento delle tasse
    public void setTassePagate1(boolean tassePagate) {
        this.tassePagate = tassePagate;
        notificaOsservatori();  // Notifica gli osservatori quando cambiano le tasse
    }
 
    // Override dei metodi setNome e setCognome della superclasse Persona
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    //Metodi set e get delle variabili di Studente
    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    public String getPianoDiStudi() {
        return pianoDiStudi;
    }

    public void setPianoDiStudi(String pianoDiStudi) {
        this.pianoDiStudi = pianoDiStudi;
    }

    public boolean isTassePagate() {
        return tassePagate;
    }

    public void setTassePagate(boolean tassePagate) {
        this.tassePagate = tassePagate;
    }
    public void setStatoEsame(StatoEsame statoEsame) {
        this.statoEsame = statoEsame;
    }

    public void prenotaEsame() {
        statoEsame.prenotaEsame(this);
    }

    public void iniziaEsame() {
        statoEsame.iniziaEsame(this);
    }

    public void completaEsame() {
        statoEsame.completaEsame(this);
    }
}
