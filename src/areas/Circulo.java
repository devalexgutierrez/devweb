package areas;

public class Circulo implements Figura {

	private double radio;
    private double areaCirculo;
    
    public Circulo() {
    	
    	
    }
    
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	public double area() {
		// TODO Auto-generated method stub
		
		
		return areaCirculo = Math.PI*Math.pow(radio, 2);
	}
    
    
}
