package areas;

public class Circulo implements Figura {

	private double radio;
    private double areaCirculo;

		// e: what would happen if you removed
		// the constructor?
		// e: Does it make sense to have a blank
		// constructor?
    public Circulo() {


    }
    //e: identation!
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double area() {
		// TODO Auto-generated method stub
		// e: we can remove variable areaCirculo
		// and return just the math expression

		return areaCirculo = Math.PI*Math.pow(radio, 2);
	}


}
