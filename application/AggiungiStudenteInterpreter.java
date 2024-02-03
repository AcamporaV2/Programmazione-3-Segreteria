package application;

public class AggiungiStudenteInterpreter implements Interpreter {
    @Override
    public Studente interpret(String input) {
        if (input.equalsIgnoreCase("aggiungi studente")) {
            return new Studente();
        } else {
            return null;
        }
    }
}
