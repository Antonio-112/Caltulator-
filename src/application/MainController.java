package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

	private double num1 = 0;

	private String operador = "";

	@FXML
	private Label selectLabel;

	@FXML
	private Label totalLabel;

	public void calcular(ActionEvent event) {
		Modelo modelo = new Modelo();
		try {

			if (!totalLabel.getText().isEmpty()) {

				double total = modelo.Calculo(Double.parseDouble(totalLabel.getText()),
						Double.parseDouble(selectLabel.getText()), operador);
					totalLabel.setText(String.valueOf(total));	
				

			} else {
				
				double total = modelo.Calculo(num1, Double.parseDouble(selectLabel.getText()), operador);
					totalLabel.setText(String.valueOf((int)total));
					totalLabel.setText(String.valueOf(total));	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void selectNumbers(ActionEvent event) {

		String value = ((Button) event.getSource()).getText();
		selectLabel.setText(selectLabel.getText() + value);

	}

	public void selectOperator(ActionEvent event) throws InterruptedException {

		operador = ((Button) event.getSource()).getText();
		try {
			num1 = Double.parseDouble(selectLabel.getText());
		} catch (Exception e) {
			selectLabel.setText("Error");
		}
		selectLabel.setText("");
	}

	public void clear(ActionEvent event) {
		selectLabel.setText("");
		totalLabel.setText("");
		num1 = 0;
		operador = "";
	}

}
