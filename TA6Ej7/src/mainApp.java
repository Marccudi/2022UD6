import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pregunta= JOptionPane.showInputDialog("Introduce la cantidad de euros a convertir: ");
		double euros = Integer.parseInt(pregunta);
		pregunta = JOptionPane.showInputDialog("A que moneda quieres convertir los euros?");
		cambioMoneda(euros, pregunta);
	}
	
	public static void cambioMoneda(double euro, String moneda) {
if (moneda.equalsIgnoreCase("libra") || moneda.equalsIgnoreCase("libras")) {
			System.out.println(euro + " en libras es: " + euro*0.86);
		}else if (moneda.equalsIgnoreCase("dolar") || moneda.equalsIgnoreCase("dolares")) {
			System.out.println(euro + " en dolares es: " + euro*1.28611);
		}else if (moneda.equalsIgnoreCase("yen") || moneda.equalsIgnoreCase("yenes")) {
			System.out.println(euro + " en yenes es: " + euro*129.852);
		}
	}

}
