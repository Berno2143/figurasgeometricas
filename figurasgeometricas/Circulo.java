
public class Circulo extends figurasgeometricas{

	private double radio;
	public Circulo(double radio) {
		this.radio = radio;
		}
		public double calcularArea(){
		return Math.PI*(radio*radio);
		}
}
