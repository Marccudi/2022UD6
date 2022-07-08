import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pregunta = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(pregunta);
		System.out.println("El numero " + num + " tiene " + numeroCifras(num) + " cifras");
	}
	
	public static int numeroCifras(int num) {
		int cont=0;
		while (num>=1) {
			num/=10;
			cont++;
		}
		return cont;
	}
	

}
