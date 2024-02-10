//package application;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.ChoiceBox;
//import javafx.scene.control.DatePicker;
//import javafx.scene.control.TextField;
//
//public class ControllerRegistrazioneStudente {
//
//    @FXML
//    private TextField nomeTextField;
//
//    @FXML
//    private TextField cognomeTextField;
//
//    @FXML
//    private TextField matricolaTextField;
//
//    @FXML
//    private DatePicker dataNascitaDatePicker;
//
//    @FXML
//    private TextField residenzaTextField;
//
//    @FXML
//    private ChoiceBox<String> pianoStudiChoiceBox;
//
//    @FXML
//    private Button registraButton;
//   
//    private Interpreter interpreter = new AggiungiStudenteInterpreter();
//    
//    
//    @FXML
//    private void initialize() {
//        // Inizializza il ChoiceBox con opzioni di piano di studi, se necessario
//    }
//
//    @FXML
//    private void handleRegistraButton(ActionEvent event) {
//        // Crea un'istanza di StudenteFactory
//    	String inputCommand = "aggiungi studente";
//        StudenteFactory studenteFactory = new StudenteFactory();
//
//        // Chiamare il metodo della StudenteFactory per creare uno studente
//        Studente studente = studenteFactory.creaStudente(
//            nomeTextField.getText(),
//            cognomeTextField.getText(),
//            matricolaTextField.getText(),
//            dataNascitaDatePicker.getValue().toString(),
//            residenzaTextField.getText(),
//            pianoStudiChoiceBox.getValue(),
//            false // Impostato a false di default, puoi cambiarlo se necessario
//        );
//
//        // Ora, salva le informazioni dello studente su MongoDB
//        try {
//            MongoDBManager.salvaStudente(studente);
//            System.out.println("Studente registrato con successo su MongoDB!");
//            // Puoi anche fornire feedback all'utente, ad esempio, mostrare un messaggio di conferma.
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Gestisci eventuali eccezioni durante il salvataggio su MongoDB
//        }
//    }
//    
//    
//}
