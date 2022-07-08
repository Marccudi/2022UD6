import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pregunta = JOptionPane.showInputDialog("Introdice el tamaño del array");
		int capacidad = Integer.parseInt(pregunta);
		int array[] = new int[capacidad];
		rellenarArray(array);
		mostrarArray(array);
		
	}
	public static void rellenarArray(int array []) {
		int num=0;
		double random=0;
		for (int i = 0; i < array.length; i++) {
			random = Math.random() * 100;
			num = (int)random; 
			while (!esPrimo(num)) {
				random = Math.random() * 100;
				num = (int) random; 	
			}
			array[i]=num;
		}
	}
	
	public static boolean esPrimo(int num) {
		boolean res=true;
		for (int i = 1; i <= num; i++) {
			if (num%i==0 && i!=num && i!=1) {
				res=false;
				i=num+1;
			}	
		}
		return res;
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "] = " + array[i]);
		}
	}


}
