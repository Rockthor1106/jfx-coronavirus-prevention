package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.PreventionCare;

public class CoronavirusCareGUI {

    @FXML
    private TextField txtCareNumber;

    @FXML
    private Label labMsg;
    
    @FXML
    private ImageView image;
    
    public void invalidInputAlert() {
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Invalid input");
    	alert.setContentText("There is not a coronavirus prevention for this input"
    					   +"\nRemeber that you must type only a number between 1 and 5"
    					   +"\nPlease try again");
    	alert.show();
    }

    @FXML
    void showCareRecommendation(ActionEvent event) throws FileNotFoundException {
    	try {
    		int number = Integer.parseInt(txtCareNumber.getText());
        	PreventionCare pc = new PreventionCare();
        	if (pc.getTextCare(number).isEmpty() || pc.getTextCare(number).equals("0")) {
    			invalidInputAlert();
    		}
        	else {
            	labMsg.setText(pc.getTextCare(number));
            	InputStream inputStream = new FileInputStream(pc.getIlustrationCare(number));
            	Image img = new Image(inputStream);
            	image.setImage(img);  
            	txtCareNumber.setText("");
    		}
		} catch (NumberFormatException e) {
			invalidInputAlert();
		}
    	

    }

}

