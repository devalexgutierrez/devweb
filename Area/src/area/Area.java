    package area;
    
    /* Author Alan Moreno
    Date: 07/02/2018
    */
    interface AreaFig 
    {
    // e: constant pi already included in Math library    
    public double pi = 3.14;    
    public double calculate(double x,double y,double z);    
    }    
    
    class rectangle implements AreaFig    
    {    
    public double calculate(double x,double y, double z)    
    {    
    return(x*y);    
    }    
    }
    
    
    class triangle implements AreaFig   
    {    
    @Override
    public double calculate(double x,double y, double z)    
    {    
    return((x*y)/2);    
    }    
    }

    
    class trapeze implements AreaFig    
    {    
    @Override
    public double calculate(double x,double y,double z)    
    {    
    return((x+y)*z);    
    }    
    }
    
    
    class square implements AreaFig 
    {    
    @Override
    public double calculate(double x,double y, double z)    
    {    
    return(x*x);    
    }    
    }
    
    
    class circle implements AreaFig
    {    
      @Override
    public double calculate(double x,double y, double z)    
    {    
    return(pi*x*x);    
    }    
    }    
    
   
   public class Area {


    public static void main(String arg[]) {
  
          rectangle r = new rectangle();    
          circle c = new circle();   
          square c1 = new square();
          triangle t = new triangle();
          trapeze tr = new trapeze();
          AreaFig a;    
    
          a = r;    
         
          System.out.println("\nArea of Rectangle is : " +a.calculate(10,20,0));    
    
          a = c;    
          System.out.println("\nArea of Circle is : " +a.calculate(15,15,0));  
          
          a = c1;
          System.out.println("\nArea of Square is : " +a.calculate(4,4,0));  
          
          a = t;
          System.out.println("\nArea of Triangle is : " +a.calculate(4,4,0)); 
          
          a = tr;
          System.out.println("\nArea of Trapeze is : " +a.calculate(4,4,4));  
         
    }
    
}
