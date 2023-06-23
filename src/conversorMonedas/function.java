package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();

	public void ConvertirMonedas(double Minput) {
		Object seleccion = JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir tu dinero (precio del mercado: 03/06/2023) ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Pesos CLP a Dólar", "De Pesos CLP a Euro", "De Pesos CLP a Libras",
						"De Pesos CLP a Yen", "De Pesos CLP a Won Coreano", "De Pesos CLP a Pesos COP",
						"De Dólar a Pesos CLP", "De Euro a Pesos CLP", "De Libras a Pesos CLP", "De Yen a Pesos CLP",
						"De Won Coreano a Pesos CLP", "De Pesos COP a Pesos CLP" },
				"Seleccion");

		if (seleccion != null) {
			String opcion = seleccion.toString();
			switch (opcion) {
			case "De Pesos CLP a Dólar":
				monedas.ConvertirPesosCLPADolares(Minput);
				break;
			case "De Pesos CLP a Euro":
				monedas.ConvertirPesosCLPAEuros(Minput);
				break;
			case "De Pesos CLP a Libras":
				monedas.ConvertirPesosCLPALibras(Minput);
				break;
			case "De Pesos CLP a Yen":
				monedas.ConvertirPesosCLPAYen(Minput);
				break;
			case "De Pesos CLP a Won Coreano":
				monedas.ConvertirPesosCLPAWon(Minput);
				break;
			case "De Pesos CLP a Pesos COP":
				monedas.ConvertirPesosCLPAPesosCOP(Minput);
				break;
			case "De Dólar a Pesos CLP":
				pesos.ConvertirDolaresAPesosCLP(Minput);
				break;
			case "De Euro a Pesos CLP":
				pesos.ConvertirEurosAPesosCLP(Minput);
				break;
			case "De Libras a Pesos CLP":
				pesos.ConvertirLibrasAPesosCLP(Minput);
				break;
			case "De Yen a Pesos CLP":
				pesos.ConvertirYenAPesosCLP(Minput);
				break;
			case "De Won Coreano a Pesos CLP":
				pesos.ConvertirWonAPesosCLP(Minput);
				break;
			case "De Pesos COP a Pesos CLP":
				pesos.ConvertirPesosCOPAPesosCLP(Minput);
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Operación cancelada");
		}
	}

}
