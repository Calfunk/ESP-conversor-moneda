package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 792.79;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Chilenos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 882.17;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Chilenos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 996.89;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Chilenos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 5.82;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Chilenos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.59;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Chilenos");
	}
}
