package application;

import javafx.scene.control.TextField;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class HomeSegreteria {
	@FXML 
	 private Button registrazioneButton;
	 
	 @FXML 
	 private Button cercaStudente;
	 
	 @FXML 
	 private Button esame;
	 
	 @FXML
	 private TextField nome;
	 
	 @FXML
	 private TextField cognome;
	 
	 @FXML
	 private TextField matricola;
	 
	 @FXML
	 private TextField dataDiNascita;
	 
	 @FXML
	 private TextField residenza;
	 
	 @FXML
	 private TextField pianoDiStudi;
	 
	 @FXML
	    private void showHomeSegreteria(ActionEvent event) {
	        try {
	            // Carica il file FXML "HomeSegreteria.fxml"
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/HomeSegreteria.fxml"));
	            Parent root = loader.load();

	            // Crea una nuova scena con il contenuto del file FXML
	            Scene scene = new Scene(root);

	            // Crea un nuovo stage (finestra) e imposta la scena
	            Stage stage = new Stage();
	            stage.setScene(scene);
	            stage.setTitle("Home Segreteria");
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 
	 @FXML
	    private void MostraRegistrazione(ActionEvent event) {
	    	try {
	            // Carica il file FXML "HomeSegreteria.fxml"
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RegistrazioneStudente.fxml"));
	            Parent root = loader.load();

	            // Crea una nuova scena con il contenuto del file FXML
	            Scene scene = new Scene(root);

	            // Crea un nuovo stage (finestra) e imposta la scena
	            Stage stage = new Stage();
	            stage.setScene(scene);
	            stage.setTitle("Inserisci uno studente");
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }   
	    }
	 
	 @FXML
	    private void RicercaStudente(ActionEvent event) {
	    	try {
	            // Carica il file FXML "HomeSegreteria.fxml"
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RicercaStudente.fxml"));
	            Parent root = loader.load();

	            // Crea una nuova scena con il contenuto del file FXML
	            Scene scene = new Scene(root);

	            // Crea un nuovo stage (finestra) e imposta la scena
	            Stage stage = new Stage();
	            stage.setScene(scene);
	            stage.setTitle("Inserisci uno studente");
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }   
	    }
	    
	    @FXML
	    private void MostraEsami(ActionEvent event) {
	    	try {
	            // Carica il file FXML "HomeSegreteria.fxml"
	            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MostraEsami.fxml"));
	            Parent root = loader.load();

	            // Crea una nuova scena con il contenuto del file FXML
	            Scene scene = new Scene(root);

	            // Crea un nuovo stage (finestra) e imposta la scena
	            Stage stage = new Stage();
	            stage.setScene(scene);
	            stage.setTitle("Inserisci uno studente");
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	     
	        }   
	    }
	     
	    @FXML
	    private void ConfermaDatiStudente(ActionEvent event) throws IOException {
	        // Ottieni i valori dai TextField
	        String nomeStudente = nome.getText();
	        String cognomeStudente = cognome.getText();
	        String matricolaStudente = matricola.getText();
	        String dataDiNascitaStudente = dataDiNascita.getText();
	        String residenzaStudente = residenza.getText();
	        String pianoDiStudiStudente = pianoDiStudi.getText();

	        // Crea un oggetto Studente con i valori ottenuti
	        Studente nuovoStudente = new Studente(nomeStudente, cognomeStudente, matricolaStudente,
	                dataDiNascitaStudente, residenzaStudente, pianoDiStudiStudente, false);

	        // Salva lo studente nel database MySQL
	        salvaStudenteInMySQL(nuovoStudente);
	    }

	    private void salvaStudenteInMySQL(Studente studente) {
	        // Configura la connessione al database (adatta le informazioni di connessione)
	        String url = "jdbc:mysql://localhost:3306/StudentiDB";
	        String username = "admin";
	        String password = "admin";

	        try (Connection conn = DriverManager.getConnection(url, username, password)) {
	            // Prepara la query SQL per l'inserimento dello studente
	            String query = "INSERT INTO studenti (nome, cognome, matricola, data_nascita, residenza, piano_studi) VALUES (?, ?, ?, ?, ?, ?)";
	            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
	                // Imposta i parametri della query con i dati dello studente
	                pstmt.setString(1, studente.getNome());
	                pstmt.setString(2, studente.getCognome());
	                pstmt.setString(3, studente.getMatricola());
	                pstmt.setString(4, studente.getDataDiNascita());
	                pstmt.setString(5, studente.getResidenza());
	                pstmt.setString(6, studente.getPianoDiStudi());

	                // Esegui la query di inserimento
	                pstmt.executeUpdate();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}