import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) 
	    { 
		 @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		 double a;
		 double b;
		 double c;
		 int op = 0;
	 while(op!=10)
	 {
		 System.out.print("Bienvenido a este programa para calcular areas"
		 		+ "\nEn este programa se tienen las siguientes figuras"
		 		+ "\nTriangulo(1) \nCirculo(2) \nCuadrado(3) \nRectangulo(4) \nTrapecio(5) \nSalir del programa(10)" 
		 		+ "\nIngrese alguna opción:");
		  op=scanner.nextInt();
		 try
		 {
		 switch(op)
		 {
		 case 1: 
			 triangulo tr = new triangulo();
			 System.out.println("Has seleccionado la opción del triagulo ");
			 System.out.println("Ingresa el valor de la base");
			 a= scanner.nextDouble();
			 System.out.println("Ingresa el valor de la altura");
			 b = scanner.nextDouble();
			 tr.setvalues(a, b);
			 System.out.println("El area del triangulo es de "+tr.getArea());
			 
			 break;
		 case 2: 
			 circulo cir = new circulo();
			 System.out.println("Has seleccionado la opción del circulo ");
			 System.out.println("Ingresa el valor del radio");
			 a = scanner.nextDouble();
			 cir.setvalues(a);
			 System.out.println("El area del circulo es de "+cir.getArea());
			 break;
		 case 3: 
			 CuadraRec cuadrado = new CuadraRec();
			 System.out.println("Has seleccionado la opción del cuadrado ");
			 System.out.println("Ingresa el valor de un lado");
			 a = scanner.nextDouble();
			 cuadrado.setvalues(a, a);
			 System.out.println("El area del cuadrado es de "+cuadrado.getArea());
			 break;
		 case 4: 
			 CuadraRec rectangulo = new CuadraRec();
			 System.out.println("Has seleccionado la opción del cuadrado ");
			 System.out.println("Ingresa el valor de lo largo");
			 a = scanner.nextDouble();
			 System.out.println("Ingresa el valor de lo ancho");
			 b = scanner.nextDouble();
			 rectangulo.setvalues(a, b);
			 System.out.println("El area del cuadrado es de "+rectangulo.getArea());
			 
			 break;
		 case 5: 
			 trapecio trap = new trapecio();
			 System.out.println("Has seleccionado la opción del triagulo ");
			 System.out.println("Ingresa el valor de la altura");
			 a = scanner.nextDouble();
			 System.out.println("Ingresa el valor de la base mayor");
			 b = scanner.nextDouble();
			 System.out.println("Ingresa el valor de la base menor");
			 c = scanner.nextDouble();
			 trap.setvalues(a,b,c);
			 System.out.println("El area del triangulo es de "+trap.getArea());
			 break;
		 case 10:
			 System.out.println("Ha salido del programa");
			 System.exit(0); 
			 break;
		 default: 
			 System.out.println("La opción es invalida, intente nuevamente");
			 
		 }
		 }
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
 }
	
}
