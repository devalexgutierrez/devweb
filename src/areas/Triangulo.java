package areas;

public class Triangulo implements Figura{

	private double base;
	private double altura;
	private double areaTriangulo;
	
	public Triangulo() {
		
		
		
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
		
		return areaTriangulo = (base*altura)/2;
	}
	
}
