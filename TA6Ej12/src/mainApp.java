import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String pregunta = JOptionPane.showInputDialog("Tamaño del array:");
		int capacidad = Integer.parseInt(pregunta);
		pregunta = JOptionPane.showInputDialog("Numero del final:");
		int num = Integer.parseInt(pregunta);
		int cont=0;
		int array[]= new int [capacidad];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(299)+1;

			if (array[i]%10==num) {
				cont++;
			}
//			Para comprobar los numeros del primer array
//			System.out.println(array[i]);
//			System.out.println();
		}
		int arrayFinal[] = new int [cont];
		cont=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%10==num) {
				arrayFinal[cont]=array[i];
				cont++;
			}
		}
		for (int i = 0; i < arrayFinal.length; i++) {
			System.out.println(arrayFinal[i]);
		}
		
	}

}
