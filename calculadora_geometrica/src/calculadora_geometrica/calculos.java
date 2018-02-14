package calculadora_geometrica;

import java.util.Scanner;

public class calculos {
	public static void main(String[] args) 
    {
	  Scanner sc = new Scanner(System.in);
      double num1;
	 double altura, basemenor, basemayor, lado,radio,altura1;
	double num2;
	double num3;
      int op;{
      do{
   	
      System.out.println("introduzca el numero de la operacion que desea realizar");
      System.out.println("1) area de trapecio");
      System.out.println("2) area de cuadrado");
      System.out.println("3) area de circulo");
      System.out.println("4) area de triangulo");
     
      System.out.println("6) salir del programa");
      op = sc.nextInt();
      switch (op){
          case 1:
        	   //  System.out.println("introduzca el valor de la altura");
                 //num1= sc.nextInt();
                 //System.out.println("introduzca el valor del area menor");
                   // num2 = sc.nextInt();
                    //System.out.println("introduzca el valor del area mayor");
                    //num3 = sc.nextInt();
        	  trapecio tra = new trapecio();
        	  System.out.println("introduzca el valor de la altura");
        	     altura= sc.nextDouble();
        	     tra.setAltura(altura);
        	     System.out.println("introduzca el valor de la base menor");
        	     basemenor= sc.nextDouble();
        	     tra.setBasemenor(basemenor);
        	     System.out.println("introduzca el valor de la base mayor");
        	     basemayor= sc.nextDouble();
        	     tra.setBasemayor(basemayor);
        	     tra.areaTra();
               System.out.println("el resultado del area del trapecio es:" + tra.getareaTra());
               break;
               
          case 2:
                cuadrado cua = new cuadrado();
                System.out.println("introduzca el valor de un lado ");
       	     lado= sc.nextDouble();
       	     cua.setLado(lado);
       	     cua.areaCua();
              System.out.println("el resultado del area del cuadrado es:"+ cua.getareaCua());
               break;
      
          case 3:
        	    circulo circ = new circulo();
        	    System.out.println("introduzca el valor del radio");
       	     radio= sc.nextDouble();
       	     circ.setRadio(radio);
       	     circ.areaCirc();
              System.out.println("el resultado del area del circulo es:"+  circ.getareaCirc());
               break;
               
          case 4:
        	  triangulo tria = new triangulo();
        	    System.out.println("introduzca el valor de la base del triangulo");
       	     num1= sc.nextDouble();
       	     tria.setBase(num1);
       	    System.out.println("introduzca el valor de la altura");
   	     num2= sc.nextDouble();
   	     tria.setAltura(num2);
   	     tria.areaTria();
              System.out.println("el resultado del area del triangulo es:"+  triangulo.getareaTriangulo());
               break;
          
          default:
      System.out.println("cerrando programa");
      break;
      }
      }
           
      while (op != 6); 

System.out.println("\nCerrando el sistema.."); 
}

}
}
