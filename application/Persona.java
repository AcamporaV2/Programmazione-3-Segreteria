package application;

public abstract class Persona { // Superclasse Persona
    protected String nome;
    protected String cognome;

    // Costruttore vuoto
    public Persona() {
        this.nome = "";
        this.cognome = "";
    }

    // Costruttore parametrizzato
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    // Metodo getter per il nome
    public String getNome() {
        return nome;
    }

    // Metodo getter per il cognome
    public String getCognome() {
        return cognome;
    }

    // Metodo setter per il nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo setter per il cognome
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
