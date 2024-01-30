package application;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoDBManager {

    public static void salvaStudente(Studente studente) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            // Connessione al server MongoDB (modifica l'URL di connessione in base alle tue esigenze)

            MongoDatabase database = mongoClient.getDatabase("javaMongo");
            MongoCollection<Document> collection = database.getCollection("studenti");

            Document document = new Document("nome", studente.getNome())
                .append("cognome", studente.getCognome())
                .append("matricola", studente.getMatricola())
                .append("dataDiNascita", studente.getDataDiNascita())
                .append("residenza", studente.getResidenza())
                .append("pianoDiStudi", studente.getPianoDiStudi())
                .append("tassePagate", studente.isTassePagate());

            collection.insertOne(document);
            // Inserimento del documento nella collezione
        } catch (Exception e) {
            e.printStackTrace();
            // Gestione delle eccezioni, ad esesmpio, connessione fallita o operazioni di MongoDB non riuscite
        }
    }
}
