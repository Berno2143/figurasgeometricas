
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//B b = new B();
		//b.unMetodoDeB();
		
		Triangulo triangulo = new Triangulo(12, 13);
		System.out.println("El area del triangulo es " + triangulo.calcularArea());

		Cuadrado cuadrado = new Cuadrado(5, 5);
		System.out.println("El area del cuadradro es " + cuadrado.calcularArea());
		
		Circulo circulo = new Circulo(7);
		System.out.println("El area del circulo es " + circulo.calcularArea());
	}

}
