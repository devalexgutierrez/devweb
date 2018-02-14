
public class trapecio implements Interface{

	
	private double a;
	private double b;
	private double c; 
	double area;
	
	public double getArea()
	{
		return area;
	}
	@Override
	public void area() {
		area = a*((b+c)/2);
	}
	double getA() {
		return a;
	}

	double getB() {
		return b;
	}
	double getC() {
		return c;
	}
	void setvalues(double a, double b,double c) throws Exception
	{
		if(a<=0 || b<=0 || c<=0)
		{
			 throw new Exception("Deben de ser valores mayores a 0\n"); 

		}
		else
		{
			this.a = a;
			this.b = b;
			this.c = c;
			area();
		}
		
	}
	
	
	

}
