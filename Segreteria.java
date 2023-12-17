import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Segreteria {

    // Mappa per associare ogni corso di laurea alla lista degli studenti iscritti
    private Map<String, List<Studente>> iscrittiPerCorso = new HashMap<>();

    // Metodo per iscrivere uno studente a un corso di laurea
    public void iscriviStudente(Studente studente, String corsoDiLaurea) {
        // Se il corso di laurea non esiste, crea una nuova lista di studenti
        iscrittiPerCorso.putIfAbsent(corsoDiLaurea, new ArrayList<>());

        // Aggiungi lo studente alla lista associata al corso di laurea
        iscrittiPerCorso.get(corsoDiLaurea).add(studente);
    }

    // Metodo per ottenere la lista degli studenti iscritti a un corso di laurea
    public List<Studente> getIscrittiPerCorso(String corsoDiLaurea) {
        return iscrittiPerCorso.getOrDefault(corsoDiLaurea, new ArrayList<>());
    }

    // Metodo principale per testare la classe Segreteria
    public static void main(String[] args) {
        // Creazione di un oggetto Segreteria
        Segreteria segreteria = new Segreteria();

        // Creazione di alcuni studenti
        Studente studente1 = new Studente("Mario", "Rossi", "12345", "01/01/2000", "Roma", "Ingegneria", 8.5f, true);
        Studente studente2 = new Studente("Luigi", "Bianchi", "54321", "05/05/2001", "Milano", "Informatica", 9.0f, true);
        Studente studente3 = new Studente("Giovanna", "Verdi", "98765", "10/10/1999", "Napoli", "Medicina", 9.5f, true);

        // Iscrizione degli studenti a diversi corsi di laurea
        segreteria.iscriviStudente(studente1, "Ingegneria");
        segreteria.iscriviStudente(studente2, "Informatica");
        segreteria.iscriviStudente(studente3, "Medicina");

        // Ottenimento degli studenti iscritti a un corso di laurea
        List<Studente> studentiIngegneria = segreteria.getIscrittiPerCorso("Ingegneria");
        List<Studente> studentiInformatica = segreteria.getIscrittiPerCorso("Informatica");
        List<Studente> studentiMedicina = segreteria.getIscrittiPerCorso("Medicina");   
    }
}
