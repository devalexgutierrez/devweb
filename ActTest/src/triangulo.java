
public class triangulo implements Interface  {

	private double a;
	private double b;
	double area;
	
	public double getArea()
	{
		return area;
	}
	@Override
	public void area() {
		area = (a*b)/2;
	}
	double getA() {
		return a;
	}

	double getB() {
		return b;
	}

	void setvalues(double a, double b) throws Exception
	{
		if(a<=0 || b<=0)
		{
			  throw new Exception("Deben de ser valores mayores a 0\n"); 
		}
		else
		{
			this.a = a;
			this.b = b;
			area();

		}
	}

	

}
