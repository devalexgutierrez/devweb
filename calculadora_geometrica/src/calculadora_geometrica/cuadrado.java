package calculadora_geometrica;

public class cuadrado implements magia {
	   double lado;
	   double areaCuadrado;

	    public double getareaCua() 
	    {
	        return areaCuadrado;
	    }
	    public double getLado() 
	    {
	        return lado;
	    }

	    public void setLado(double lado) 
	    {
	        this.lado = lado;
	    }

	    public double getareaCuadrado() 
	    {
	        return areaCua;
	    }    
	    
	    void setlado(double lado) {
	    	this.lado = lado;
	    }
	@Override
	public void areaCua() {
		// TODO Auto-generated method stub
	     areaCuadrado = lado * lado;
	}

	@Override
	public void areaCirc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void areaTra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void areaTria() {
		// TODO Auto-generated method stub
		
	}

}
