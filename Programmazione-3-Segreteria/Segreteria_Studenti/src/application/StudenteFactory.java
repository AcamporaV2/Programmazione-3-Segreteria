package application;

public class StudenteFactory extends PersonaFactory {
    @Override
    public Persona creaPersona(String nome, String cognome) {
        // Puoi personalizzare la creazione di uno studente qui, se necessario
        return new Studente(nome, cognome, "", "", "", "", false);
    }
}
