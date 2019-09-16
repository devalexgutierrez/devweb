
public class circulo implements Interface {

	private double a;
	double area;
	
	public double getArea()
	{
		return area;
	}
	@Override
	public void area() {
		area = Math.pow(a, 2)* Math.PI;
	}
	double getA() {
		return a;
	}

	void setvalues(double a) throws Exception
	{
		if(a<=0)
		{
			 throw new Exception("Deben de ser valores mayores a 0\n"); 

		}
		else
		{
			this.a = a;
			area();
		}
		
	}
	

}
