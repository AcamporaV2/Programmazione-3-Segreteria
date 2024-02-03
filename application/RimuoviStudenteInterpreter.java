//ATTENZIONE: QUESTO SI DEVE VEDERE DOVE IMPLEMENTARLO, PER ORA E' UNA COSA IN PIU'

package application;

import java.util.List;

public class RimuoviStudenteInterpreter implements Interpreter {
    private List<Studente> listaStudenti; // La tua lista di studenti

    // Costruttore che riceve la lista degli studenti
    public RimuoviStudenteInterpreter(List<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    @Override
    public Studente interpret(String input) {
        if (input.equalsIgnoreCase("rimuovi studente")) {
            // Implementa la logica per rimuovere uno studente dalla lista
            // In questo esempio, rimuoviamo il primo studente dalla lista
            if (!listaStudenti.isEmpty()) {
                return listaStudenti.remove(0);
            }
        }
        // Restituisci null se il comando non è valido o se la lista è vuota
        return null;
    }
}