package calculadora_geometrica;

public class triangulo implements magia {
	   private double base;
	    private double altura;
	    private static double areaTriangulo;
	    

	   
	    public double getBase() 
	    {
	        return base;
	    }

	    public void setBase(double base)
	    {
	        this.base = base;
	    }

	    public double getAltura() 
	    {
	        return altura;
	    }

	    public void setAltura(double altura) 
	    {
	        this.altura = altura;
	    }

	    public static double getareaTriangulo() 
	    {
	        return areaTriangulo;
	    }

	    @Override
	    public void areaTria() 
	    {
	        areaTriangulo = base * altura / 2;
	    }

		@Override
		public void areaCua() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void areaCirc() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void areaTra() {
			// TODO Auto-generated method stub
			
		}    
	    
}
