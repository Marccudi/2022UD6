import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int [10];
		rellenarArray(array);
		mostrarArray(array);
		
		
	}
	
	public static void rellenarArray(int array[]) {
		int num=0;
	
		for (int i = 0; i < array.length; i++) {
			String pregunta = JOptionPane.showInputDialog("Introduce un numero entero: " + (i+1) + "/10");
			num = Integer.parseInt(pregunta);
			array[i]=num;
		}
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "] = " + array[i]);
		}
	}
}
