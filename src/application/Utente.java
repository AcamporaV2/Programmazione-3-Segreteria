package application;

public abstract class Utente {
    protected String nome;
    protected String cognome;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public abstract void operazioneSpecificheUtente();
    
}
