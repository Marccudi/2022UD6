import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demanda = JOptionPane.showInputDialog("Introduce un numero: ");
		int numero = Integer.parseInt(demanda);
		if (primo(numero)) {
			System.out.println("El numero " + numero + " es primo");
		} else {
			System.out.println("El numero " + numero + " no es primo");
		}
	}
	
	public static boolean primo(int num) {
		boolean res=true;
		for (int i = 1; i <= num; i++) {
			if (num%i==0 && i!=num && i!=1) {
				res=false;
				i=num+1;
			}	
		}
		return res;
	}

}
