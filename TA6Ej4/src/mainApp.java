
import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demanda = JOptionPane.showInputDialog("Introduce un numero: ");
		int num= Integer.parseInt(demanda);
		System.out.println("El factorial del numero " + num + " es " + calcularFactorial(num));
	}
	public static int calcularFactorial(int num) {
		int res=1;
		for (int i = 1; i <= num; i++) {
			res*=i;
		}
		
		return res;
	}

}
