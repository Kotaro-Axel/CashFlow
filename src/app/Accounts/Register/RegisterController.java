/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Accounts.Register;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RegisterController implements Initializable {
    @FXML
    private TextField nameInput;
    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;
    @FXML
    private TextField lastnameInput;
    @FXML
    private TextField rolInput;
    @FXML
    private DatePicker bdInput;
    @FXML
    private TextField emailInput;
    @FXML
    private PasswordField passwordInput;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

//    Conexionbd service = new Conexionbd();
    
    @FXML
    private void onCreateacc(ActionEvent event) {
        String names = nameInput.getText();
        String lastnames = lastnameInput.getText();
        String role = rolInput.getText();
        LocalDate birthdate = bdInput.getValue();
        String email = emailInput.getText();
        String password = passwordInput.getText();
        String date = birthdate.toString();

//        User newUser = new User(0, names, lastnames, role, date, email, password);
//        service.createUser(newUser);
        
        nameInput.clear();
        lastnameInput.clear();
        rolInput.clear();
        bdInput.getEditor().clear();
        emailInput.clear();
        passwordInput.clear();
    }

    @FXML
    private void onLogIn(ActionEvent event) {
    }
    
}
