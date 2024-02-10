package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller {
	 @FXML
	    private Button segreteria;
	 
	 @FXML
	 	private Button Docente;
   
	 @FXML
	 	private Button studente;
	 
	 @FXML 
	 private Button AppelloEsame;
	 
	 @FXML 
	 private Button VotoEsame;
	 
	 @FXML 
	 private Button prenotaesame;
	 
	 
	 @FXML 
	 private Button esitoesame;
	 
	 @FXML 
	 private Button Valutazione;
	 

    @FXML
    private void showHomeDocente(ActionEvent event) {
    	 try {
             // Carica il file FXML "HomeSegreteria.fxml"
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/HomeDocente.fxml"));
             Parent root = loader.load();

             // Crea una nuova scena con il contenuto del file FXML
             Scene scene = new Scene(root);

             // Crea un nuovo stage (finestra) e imposta la scena
             Stage stage = new Stage();
             stage.setScene(scene);
             stage.setTitle("Home Docente");
             stage.show();
         } catch (IOException e) {
             e.printStackTrace();
         }    
   }

    @FXML
    private void showHomeStudente(ActionEvent event) {
    	try {
            // Carica il file FXML "HomeSegreteria.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/HomeStudente.fxml"));
            Parent root = loader.load();

            // Crea una nuova scena con il contenuto del file FXML
            Scene scene = new Scene(root);

            // Crea un nuovo stage (finestra) e imposta la scena
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Home Docente");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
         
    @FXML
    private void InserimentoAppello(ActionEvent event) {
    	try {
            // Carica il file FXML "HomeSegreteria.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CreazioneAppelli.fxml"));
            Parent root = loader.load();

            // Crea una nuova scena con il contenuto del file FXML
            Scene scene = new Scene(root);

            // Crea un nuovo stage (finestra) e imposta la scena
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Inserimento nuovo appello esame");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
    
    
    @FXML
    private void ConfermaVotiEsame(ActionEvent event) {
    	try {
            // Carica il file FXML "HomeSegreteria.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InserimentoVoto.fxml"));
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
    private void PrenotaEsame(ActionEvent event) {
    	try {
            // Carica il file FXML "HomeSegreteria.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InserimentoVoto.fxml"));
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
    private void MostraEsitiEsami(ActionEvent event) {
    	try {
            // Carica il file FXML "HomeSegreteria.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InserimentoVoto.fxml"));
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
    private void TestValutazioneEsame(ActionEvent event) {
    	try {
            // Carica il file FXML "HomeSegreteria.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InserimentoVoto.fxml"));
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
}
