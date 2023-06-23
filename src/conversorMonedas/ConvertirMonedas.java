package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosCLPADolares(double valor) {
		String monedaOrigen = JOptionPane.showInputDialog("Ingrese la moneda de origen: ");
		if (monedaOrigen != null) {
			double monedaDolar = valor / 804.45;
			monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
		} else {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}

	public void ConvertirPesosCLPAEuros(double valor) {
		String monedaOrigen = JOptionPane.showInputDialog("Ingrese la moneda de origen: ");
		if (monedaOrigen != null) {
			double monedaEuro = valor / 890.53;
			monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euros");
		} else {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}

	public void ConvertirPesosCLPALibras(double valor) {
		String monedaOrigen = JOptionPane.showInputDialog("Ingrese la moneda de origen: ");
		if (monedaOrigen != null) {
			double monedaLibra = valor / 1011.04;
			monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibra + " Libras Esterlinas");
		} else {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}

	public void ConvertirPesosCLPAYen(double valor) {
		String monedaOrigen = JOptionPane.showInputDialog("Ingrese la moneda de origen: ");
		if (monedaOrigen != null) {
			double monedaYen = valor / 5.98;
			monedaYen = (double) Math.round(monedaYen * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaYen + " Yuanes");
		} else {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}

	public void ConvertirPesosCLPAWon(double valor) {
		String monedaOrigen = JOptionPane.showInputDialog("Ingrese la moneda de origen: ");
		if (monedaOrigen != null) {
			double monedaWon = valor / 0.61;
			monedaWon = (double) Math.round(monedaWon * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaWon + " Wons");
		} else {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}

	public void ConvertirPesosCLPAPesosCOP(double valor) {
		String monedaOrigen = JOptionPane.showInputDialog("Ingrese la moneda de origen: ");
		if (monedaOrigen != null) {
			double monedaCOP = valor / 0.17;
			monedaCOP = (double) Math.round(monedaCOP * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $" + monedaCOP + " Pesos Colombianos");
		} else {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}
}
