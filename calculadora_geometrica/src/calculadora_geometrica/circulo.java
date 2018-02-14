package calculadora_geometrica;

import com.sun.javafx.geom.Area;

public  class circulo implements magia{
	   double radio;
	     double areaRadio;
	    static final double pi = 3.1415;
	    public double getareaCirc()
	    {
	    	return areaRadio;
	    }
	    public double getRadio() 
	    {
	        return radio;
	    }

	    public void setRadio(double radio) 
	    {
	        this.radio = radio;
	    }

	    public double getAreaRadio() 
	    {
	        return areaRadio;
	    }

	    @Override
	    public void areaCirc() 
	    {
	        areaRadio = pi * radio * radio;
	    }

		@Override
		public void areaCua() {
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
