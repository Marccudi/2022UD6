import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eleccion=JOptionPane.showInputDialog("1.Circulo 2.Triangulo 3.Cuadrado");
		int figura = Integer.parseInt(eleccion);
//		ya que el enunciado nos pide que los metodos nos devuelvan numero reales las preguntas las hacemos en el main en vez
//		de en los metodos
		switch (figura) {
		case 1:
			String pregunta = JOptionPane.showInputDialog("Escribe el radio del circulo:");
			double radio = Double.parseDouble(pregunta);
			System.out.println("El area del circulo con radio " + radio + " es de: " + areaCirculo(radio));
			break;
		case 2:
			String preguntaAlt = JOptionPane.showInputDialog("Escribe la altura del triangulo:");
			double altura = Double.parseDouble(preguntaAlt);
			String preguntaBas = JOptionPane.showInputDialog("Escribe la base del triangulo:");
			double base = Double.parseDouble(preguntaBas);
			System.out.println("El area del triangulo con altura" + altura + " y base" + base + " es de: " + areaTriangulo(base, altura));
			break;
		case 3:
			String preguntaLad = JOptionPane.showInputDialog("Introduce un lado del cuadrado: ");
			double lado = Double.parseDouble(preguntaLad);
			System.out.println("El area del cuadrado con lado " + lado + " es de: "+ areaCuadrado(lado));
			break;
		default:
			System.out.println("Has introducido un valor equivocado");
			break;
		}
	}
	
	public static double areaCirculo(double radio) {
		double result = (Math.pow(radio, 2))* Math.PI;
		return result;
	}

	public static double areaTriangulo(double base, double altura) {
		double result = (base * altura) / 2;
		return result;
	}
	
	public static double areaCuadrado( double lado) {
		double result = lado * lado;
		return result;
	}

}
