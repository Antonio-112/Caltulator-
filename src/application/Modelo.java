package application;

public class Modelo {

	public double Calculo(double num1, double num2, String operador) {

		switch (operador) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			return num1 / num2;
		default:
			return 0;
		}

	}

}
