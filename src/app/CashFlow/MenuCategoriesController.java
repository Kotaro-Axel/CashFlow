/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.CashFlow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuCategoriesController implements Initializable {
    @FXML
    private ComboBox<?> clasificacionCombo;
    @FXML
    private TableView<?> CategoriesTable;
    @FXML
    private TableColumn<?, ?> clasificacionCol;
    @FXML
    private TableColumn<?, ?> categoriaCol;
    @FXML
    private TableColumn<?, ?> subcategoriaCol;
    @FXML
    private TextField categoriaInput;
    @FXML
    private TextField subcategoriaInput;
    @FXML
    private Button addButton;
    @FXML
    private Button editButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onAdd(ActionEvent event) {
    }

    @FXML
    private void onEdit(ActionEvent event) {
    }
    
}
