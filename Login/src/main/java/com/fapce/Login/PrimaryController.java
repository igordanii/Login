package com.fapce.Login;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrimaryController {

	@FXML
	private TextField username = new TextField();
	@FXML
	private PasswordField password = new PasswordField();
	@FXML
	private Label notMatchText = new Label();
	@FXML
	private Button loginBtn = new Button();
	@FXML
	private Button closeBtn  = new Button(); 
	
    @FXML
    private void login() throws IOException {
        if(username.getText().equals("admin") && password.getText().equals("admin")) {
        	App.setRoot("secondary");
        }else {
        	notMatchText.setVisible(true);
        }
    }
    
    @FXML
    private void setNotMacthUnvisible() {
    	notMatchText.setVisible(false);
    }
    
    @FXML
    private void close() {
    	Stage stage = (Stage) closeBtn.getScene().getWindow();
    	stage.close();
    }
}
