package application;

public class StudenteFactory extends PersonaFactory {

    @Override
    public Persona creaPersona(String nome, String cognome) {
        // Puoi personalizzare la creazione di uno studente qui, se necessario
        return new Studente(nome, cognome, "", "", "", "", false);
    }

    // Metodo per creare uno studente da input
    public Studente creaStudente(String nome, String cognome, String matricola, String dataDiNascita, String residenza, String pianoDiStudi, boolean tassePagate) {
        return new Studente(nome, cognome, matricola, dataDiNascita, residenza, pianoDiStudi, tassePagate);
    }
}
