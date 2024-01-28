package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button registrazioneButton;
    
    @FXML	
    private Button indietroButton;

    @FXML
    private Button loginButton;
    
    @FXML
    private BorderPane mainPane;

    @FXML
    public void initialize() {
        // Verifica che registrazioneButton non sia nullo prima di chiamare setOnAction
        if (registrazioneButton != null) {
            registrazioneButton.setOnAction(event -> handleRegistrazioneButtonClick());
        } 
        if (indietroButton != null) {
        	indietroButton.setOnAction(event -> indietro());
        }
        
        if (loginButton != null) {
        	loginButton.setOnAction(event -> login());
        }
    }

    @FXML
    private void handleRegistrazioneButtonClick() {
        try {
            // Carica il nuovo file FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RegistrazioneStudente.fxml"));
            Parent nuovaPagina = loader.load();

            // Crea una nuova scena
            Scene nuovaScena = new Scene(nuovaPagina);

            // Ottieni lo Stage attuale dalla scena corrente
            Stage stageAttuale = (Stage) mainPane.getScene().getWindow();

            // Imposta la nuova scena nello stesso Stage
            stageAttuale.setScene(nuovaScena);

        } catch (IOException e) {
            System.err.println("Errore durante il caricamento di RegistrazioneStudente.fxml:");
            e.printStackTrace();
        }
    }
    
    private void indietro() {
    	try {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
    		Parent nuovaPagina = loader.load();
    		
    		Scene nuovaScena = new Scene(nuovaPagina);
    		
    		Stage stageAttuale = (Stage) mainPane.getScene().getWindow();
    		
    		stageAttuale.setScene(nuovaScena);

    	} catch(IOException e) {
    		System.err.println("Errore durante il caricamento di Home.fxml:");
    		e.printStackTrace();
    	}
    }
    
//    private void indietroMenuBar() {
//    	try {
//    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
//    		Parent nuovaPagina = loader.load();
//    		
//    		Scene nuovaScena = new Scene(nuovaPagina);
//    		
//    		Stage stageAttuale = (Stage) mainPane.getScene().getWindow();
//    		
//    		stageAttuale.setScene(nuovaScena);
//
//    	} catch(IOException e) {
//    		System.err.println("Errore durante il caricamento di Home.fxml:");
//    		e.printStackTrace();
//    	}
//    }
    
    private void login() {
    	try {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
    		Parent nuovaPagina = loader.load();
    		
    		Scene nuovaScena = new Scene(nuovaPagina);
    		
    		Stage stageAttuale = (Stage) mainPane.getScene().getWindow();
    		
    		stageAttuale.setScene(nuovaScena);

    	} catch(IOException e) {
    		System.err.println("Errore durante il caricamento di Login.fxml:");
    		e.printStackTrace();
    	}
    }
}
