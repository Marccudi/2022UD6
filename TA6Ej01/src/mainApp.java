import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eleccion=JOptionPane.showInputDialog("1.Circulo 2.Triangulo 3.Cuadrado");
		int figura = Integer.parseInt(eleccion);
		switch (figura) {
		case 1:
			areaCirculo();
			break;
		case 2:
			areaTriangulo();
			break;
		case 3:
			areaCuadrado();
			break;
		default:
			System.out.println("Has introducido un valor equivocado");
			break;
		}
	}
	
	public static void areaCirculo() {
		String pregunta = JOptionPane.showInputDialog("Escribe el radio del circulo:");
		double radio = Double.parseDouble(pregunta);
		double result = (Math.pow(radio, 2))* Math.PI;
		System.out.println("El area del circulo con radio " + radio + " es de: " + result);
	}

	public static void areaTriangulo() {
		String preguntaAlt = JOptionPane.showInputDialog("Escribe la altura del triangulo:");
		double altura = Double.parseDouble(preguntaAlt);
		String preguntaBas = JOptionPane.showInputDialog("Escribe la base del triangulo:");
		double base = Double.parseDouble(preguntaBas);
		double result = (base * altura) / 2;
		System.out.println("El area del triangulo con altura" + altura + " y base" + base + " es de: " + result);
	}
	
	public static void areaCuadrado() {
		String pregunta = JOptionPane.showInputDialog("Introduce un lado del cuadrado: ");
		double lado = Double.parseDouble(pregunta);
		double result = lado * lado;
		System.out.println("El area del cuadrado con lado " + lado + " es de: "+ result);
	}

}
