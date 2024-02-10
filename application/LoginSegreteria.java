package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Classe che gestisce il login della segreteria

 */
public class LoginSegreteria {
    
    @FXML
    private Button confermaLogin;
    
    /**
     * campo di testo per l'inserimento dello username
     */

    @FXML
    private TextField usernameField;

    /**
     * campo di testo per l'inserimento della password
     */
    @FXML
    private PasswordField passwordField;
    /**
    * funzione per il login della segreteria con gestione di errore nel caso in cui le credenziali non siano corrette
     * @param event evento che scatena la funzione
     * @throws Exception eccezione che viene lanciata se non trova il file fxml
     */
    @FXML
    void LoginConferma(ActionEvent event) throws Exception{
        Segreteria segreteria = new Segreteria();
        segreteria.setUsername(usernameField.getText());
        segreteria.setPassword(passwordField.getText());

        if (segreteria.getPassword().equals("admin") && segreteria.getUsername().equals("admin")) {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("/fxml/HomeSegreteria.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setResizable(false);
            window.setScene(tableViewScene);
            window.show();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Errore");
            alert.setHeaderText(null);
            alert.setContentText("Credenziali non riconosciute");
            alert.show();
        }
    }
}