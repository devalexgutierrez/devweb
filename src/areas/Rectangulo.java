package areas;

public class Rectangulo implements Figura{

	private double base;
	private double altura;
	private double areaRectangulo;
	
	public Rectangulo() {
		
		
		
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		// TODO Auto-generated method stub
		
		return areaRectangulo = base*altura;
	}
}
