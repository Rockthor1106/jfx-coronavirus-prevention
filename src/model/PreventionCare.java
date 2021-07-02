package model;

import java.io.FileNotFoundException;

public class PreventionCare {
	
	
	public String getTextCare(int careNumber) {
		String message = "";
		switch(careNumber) {
			case 1:
				message = "Wash your hands with soap frequently";
			break;
			case 2:
				message = "Sneeze or cough into your flexed elbow";
			break;
			case 3:
				message = "Avoid touching your eyes, nose and mouth";
			break;
			case 4:
				message = "Keep spaces well ventilated";
			break;
			case 5:
				message = "Disinfect frequently used objects";
			break;
		}
		return message;
	}
	
	public String getIlustrationCare(int careNumber) throws FileNotFoundException {
		String url = "";
		switch(careNumber) {
			case 1:
				url = "images/WashHands.PNG";
			break;
			case 2:
				url = "images/SneezeElbow.PNG";
			break;
			case 3:
				url = "images/AvoidTouching.PNG";
			break;
			case 4:
				url = "images/KeepVentilated.PNG";
			break;
			case 5:
				url = "images/DisinfectObjects.PNG";
			break;
		}
		return url;
	}
}
