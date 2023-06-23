package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {

	public void ConvertirDolaresAPesosCLP(double valor) {
		double monedaDolar = valor * 804.45;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Chilenos");
	}

	public void ConvertirEurosAPesosCLP(double valor) {
		double monedaEuro = valor * 890.53;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Chilenos");
	}

	public void ConvertirLibrasAPesosCLP(double valor) {
		double monedaLibra = valor * 1011.04;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Chilenos");
	}

	public void ConvertirYenAPesosCLP(double valor) {
		double monedaYen = valor * 5.98;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Chilenos");
	}

	public void ConvertirWonAPesosCLP(double valor) {
		double monedaWon = valor * 0.61;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Chilenos");
	}

	public void ConvertirPesosCOPAPesosCLP(double valor) {
		double monedaCOP = valor * 0.17;
		monedaCOP = (double) Math.round(monedaCOP * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaCOP + " Pesos Chilenos");
	}
}
