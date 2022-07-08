import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pregunta = JOptionPane.showInputDialog("introduce el tamaño del array");
		int num = Integer.parseInt(pregunta);
		int array[] = new int[num];
//		double random =0;
//		for (int i = 0; i < array.length; i++) {
//			random=Math.random()*9;
//			array[i]= (int)random;
//			System.out.println("[" + i + "] = " + array[i]);
//		}
		String preguntaMin = JOptionPane.showInputDialog("Numero minimo de los numeros aleatorios");
		String preguntaMax = JOptionPane.showInputDialog("Numero máximo de los numeros aleatorios");

		int min= Integer.parseInt(preguntaMin);
		int max = Integer.parseInt(preguntaMax);
		
		rellenarArray(array, min, max);
		mostrarArray(array);
	}
	
	public static void rellenarArray(int array[], int min, int max) {
		double random =0;
		for (int i = 0; i < array.length; i++) {
			random= min + (Math.random() * max-min+1);
			array[i]=(int)random;
		}
	}
	
	public static void mostrarArray(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "] = " + array[i]);
			suma += array[i];
		}
		System.out.println("La suma de todo el array es de: " + suma);
	}

}
