    package area;
    
    /* Author Alan Moreno
    Date: 07/02/2018
    */

    //e: What about identation?
    //e: What about meaningful name?
    //e: What about file description, title, author, date, header?

    interface AreaFig 
    {
    // e: constant pi already included in Math library    
    public double pi = 3.14;    
    // e: do you mean computeArea: remember give a meaningful name for the signature!
    // e: other developers will take a look to your code,
    // e: What does x, y, z mean?

    /* e: Take this as an example for a doc comment before your method definition
     *
     * Returns an Image object that can then be painted on the screen. 
     * The url argument must specify an absolute {@link URL}. The name
     * argument is a specifier that is relative to the url argument. 
     * <p>
     * This method always returns immediately, whether or not the 
     * image exists. When this applet attempts to draw the image on
     * the screen, the data will be loaded. The graphics primitives 
     * that draw the image will incrementally paint on the screen. 
     *
     * @param  url  an absolute URL giving the base location of the image
     * @param  name the location of the image, relative to the url argument
     * @return      the image at the specified URL
     * @see         Image
     public Image getImage(URL url, String name) {
        try {
            return getImage(new URL(url, name));
        } catch (MalformedURLException e) {
            return null;
        }
     }
     */


    public double calculate(double x,double y,double z);    
    }    
    
    //e: It should start with a capital letter your class Name
    //e: Why dont you place your new class in a separate java class?

    class rectangle implements AreaFig    
    {    

    //e: Where is the annotation of Override on this method?
    public double calculate(double x,double y, double z)    
    {    

    //e: return x*y;
    /*e: where is z used in this function?,
    shouldnt it be more convenient to use overloading for the
    calculate function so it can be used for rectangle with only 2 args?
    what if we use calculate(double[] arg), and either if it is a circle
    object, a square object etc, we can define a specific body for each
    object*/

    return(x*y);    
    }    
    }
    
    //e: It should start with a capital letter your class Name
    class triangle implements AreaFig   
    {    
    @Override
    public double calculate(double x,double y, double z)    
    {    
    return((x*y)/2);    
    }    
    }

    //e: It should start with a capital letter your class Name
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
    //e: is z used?
    public double calculate(double x,double y, double z)    
    {    
    return(x*x);    
    }    
    }
    
    
    class circle implements AreaFig
    {   

    //e: is z and y used here? 
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

          //e: Polymorphism on runtime 
          AreaFig a;    
    
          a = r;    
         
          System.out.println("\nArea of Rectangle is : " +a.calculate(10,20,0));    
    
          a = c;    
          System.out.println("\nArea of Circle is : " +a.calculate(15,15,0));  
          
          /*e: i know you are in a "rush", why dont you take your time
          /to name your instance with a meaningful name, you have
          many, many characters and different way of combinations to name
          your instances. For this case, c1 can be confused with c, in the
          worst case scenario, why dont you rename it starting with an "s",
          since it is a square?*/
          a = c1;
          System.out.println("\nArea of Square is : " +a.calculate(4,4,0));  
          
          a = t;
          System.out.println("\nArea of Triangle is : " +a.calculate(4,4,0)); 
          
          a = tr;
          System.out.println("\nArea of Trapeze is : " +a.calculate(4,4,4));  
         
    }
    
}
