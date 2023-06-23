package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;

public class Principal {
	public static void main(String[] args) {

		function monedas = new function();
		functionTemperatura temperatura = new functionTemperatura();

		while (true) {
			Object[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
			String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

			if (seleccion != null) {
				switch (seleccion) {
				case "Conversor de Moneda":
					String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
					if (ValidarNumero(input)) {
						double Minput = Double.parseDouble(input);
						monedas.ConvertirMonedas(Minput);

						int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
						if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CLOSED_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							return;
						}

					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido. Asegúrate de ingresar solo números");
					}
					break;

				case "Conversor de Temperatura":
					input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir: ");
					if (ValidarNumero(input)) {
						double Tinput = Double.parseDouble(input);
						temperatura.ConvertirTemperatura(Tinput);

						int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
						if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CLOSED_OPTION) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							return;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido. Asegúrate de ingresar solo números");
					}
					break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				return;
			}
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
