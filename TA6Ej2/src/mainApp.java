
import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String limiteMin = JOptionPane.showInputDialog("Introduce el numero mas pequeño posible a generar:");
		String limiteMax = JOptionPane.showInputDialog("Introduce el numero mas grande posible a generar:");
		String cantidad = JOptionPane.showInputDialog("Introduce la cantidad de numeros aleatorios:");
		
		int min = Integer.parseInt(limiteMin);
		int max = Integer.parseInt(limiteMax);
		int tam = Integer.parseInt(cantidad);
		
		for (int i = 0; i < tam; i++) {
				System.out.println(limites(min, max));
		}
	}
	
	
	public static int limites(int min, int max) {
		
		double random = Math.random() * (max - min + 1) + min ;
		int res = (int) random;
		return res;	
	}
}
