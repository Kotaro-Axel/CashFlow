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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MainMenuController implements Initializable {
    @FXML
    private Button categoryButton;
    @FXML
    private Button cashflowButton;
    @FXML
    private Button moneyindexButton;
    @FXML
    private ImageView categoriesImg;
    @FXML
    private ImageView cashflowImg;
    @FXML
    private ImageView moneyindexImg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onCategories(ActionEvent event) {
    }

    @FXML
    private void onCashFlow(ActionEvent event) {
    }

    @FXML
    private void onMoneyIndex(ActionEvent event) {
    }

    @FXML
    private void onCategoriesimg(MouseEvent event) {
    }

    @FXML
    private void onCashFlowImg(MouseEvent event) {
    }

    @FXML
    private void onMoneyIndexImg(MouseEvent event) {
    }
    
}
