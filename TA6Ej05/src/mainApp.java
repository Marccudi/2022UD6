import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pregunta = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(pregunta);
		System.out.println("El numero " + num + " en binario es: " + aBinario(num));
	}
	
	public static String aBinario(int num) {
		String res = "";
		//contador y vaiable extra para saber el tamaño del array
		int cont=0;
		int numero=num;
		while (numero>=2) {
			numero /=2;
			cont++;
		}
		int array[] = new int [cont];
		
		//rellenamos el array con los restos
		cont=0;
		while (num>=2) {
			array[cont]=num%2;
			cont++;
			num/=2;
		}
		//asignamos al string res todas las posiciones del array
		for (int i = 0; i < array.length; i++) {
			res =res+array[i];
		}
		//por ultimo añadimos el resultado de la ultima division al string y lo añadimos a otro string leeido al revés
		res +=num;
		String resultado="";
		for (int i = res.length()-1; i >=0; i--) {
			resultado +=res.charAt(i);
		}
		return resultado;
	}

}
