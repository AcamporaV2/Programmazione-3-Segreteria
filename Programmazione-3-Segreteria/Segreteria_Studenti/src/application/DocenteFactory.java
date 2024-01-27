package application;

public class DocenteFactory extends PersonaFactory {
    @Override
    public Persona creaPersona(String nome, String cognome) {
        return new Docente(nome, cognome, "Materia di default");
    }

    public Persona creaPersona(String nome, String cognome, String materia) {
        return new Docente(nome, cognome, materia);
    }
}
