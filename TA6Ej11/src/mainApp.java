import java.util.Iterator;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pregunta = JOptionPane.showInputDialog("Tamaño de los arrays:");
		int capacidad = Integer.parseInt(pregunta);
		int arrayA[]= new int [capacidad];
		int arrayB[]= new int [capacidad];
		double random = 0;
		
		//Revisar si esto es lo que pedía el ejercicio
		for (int i = 0; i < arrayA.length; i++) {
			random = Math.random()*50;
			arrayA[i] = (int) random;
		//al ser el mismo for los he unido directamente
			arrayB[i]=arrayA[i];
		}	
		for (int i = 0; i < arrayB.length; i++) {
			random = Math.random()*50;
			arrayB[i]=(int)random;
		}
		
		mostrarArrays(arrayA, arrayB, multiplicarArrays(arrayA, arrayB));
		
	}
	public static void mostrarArrays(int arrayA[], int arrayB[], int arrayFinal[]) {
		System.out.println("A \t B \t Final");
		for (int i = 0; i < arrayFinal.length; i++) {
			System.out.println(arrayA[i] + "\t" + arrayB[i] + "\t" + arrayFinal[i]);
		}
	}
	
	public static int[] multiplicarArrays(int arrayA[], int arrayB[]) {
		int arrayFinal[] = new int[arrayA.length];
		for (int i = 0; i < arrayB.length; i++) {
			arrayFinal[i]=arrayA[i]*arrayB[i];
		}
		
		return arrayFinal;
	}

}
