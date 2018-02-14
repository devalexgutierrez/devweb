package areas;

import java.util.*;
import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		// e: The below comment should be removed!
		// TODO Auto-generated method stub
		// e: The below comment should be removed!
		// El men� va aqu�
		// e: Is this a constant? If so, we have to declare it
		// e: as static int, what modifier should we use?
		// e: Be careful with your identation!
         int seleccion = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
     try {
         while (seleccion >= 0 | seleccion <= 3)
         {
             System.out.println("ELIGE LO QUE DESEAS HACER");
             System.out.println("1 - Calcular area de circulo");
             System.out.println();
             System.out.println("2 - Calcular area de triangulo");
             System.out.println();
             System.out.println("3 - Calcular area de cuadrado");
             System.out.println();
             System.out.println("O presiona 0 para salir del programa");
             System.out.println();

             int opcion = scan.nextInt();

						 //e: your code would be more compact and elegant if a
						 //e: do you think using ADIOS is the most proper way
						 //e: to print out an exit statement?
						 //switch statement is used

             if(opcion==0) {
            	 System.out.println("ADIOS");
            	 break;
             }
// ----------------------------------------------------------------------------------------- AQUI empieza el c�rculo
             else if(opcion==1) {

            	 JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora de area de un circulo");

            	 try {
            	 String val=JOptionPane.showInputDialog("Introduzca el radio:");

            	 double rad=Double.parseDouble(val);

            	 if(rad<0) {

            		 System.out.println("No se pueden utilizar valores negativos, no es logico");

            	 }
            	 else {
            	 Circulo Circ = new Circulo();
            	 Circ.setRadio(rad);

            	 JOptionPane.showMessageDialog(null, "Usted ha introducido un radio de: "+Circ.getRadio());
            	 JOptionPane.showMessageDialog(null, "El area del circulo es: "+Circ.area());

            	 }
            	 } catch (NumberFormatException ex){
                 	System.out.println("No es un numero");
             	}
             }

						 //e: remove this kind of comments
// ----------------------------------------------------------------------------------------- AQUI empieza el triangulo
             else if(opcion==2) {

            	 JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora de area de un triangulo");

            	 try {
            	 double baseT=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base:"));
            	 double alturaT=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura:"));

            	 if(baseT<0 || alturaT <0) {

            		 System.out.println("No se pueden utilizar valores negativos, no es logico");


            	 } else {

							 // e: there should be a better way to name a variable
            	 Triangulo Tria = new Triangulo();
            	 Tria.setBase(baseT);
            	 Tria.setAltura(alturaT);

            	 JOptionPane.showMessageDialog(null, "Usted ha introducido una base de: "+Tria.getBase());
            	 JOptionPane.showMessageDialog(null, "Usted ha introducido una altura de: "+Tria.getAltura());
            	 JOptionPane.showMessageDialog(null, "El area del triangulo es: "+Tria.area());

            	 }
            	 }catch (NumberFormatException ex){
                 	System.out.println("No es un numero");
             	}

             }
// ----------------------------------------------------------------------------------------- AQUI empieza el rectangulo
             else if(opcion==3) {

            	 JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora de area de un rectangulo");

            	 try {
            	 double base=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base:"));
            	 double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura:"));

							 // e: what if base=altura=0, would it be valid?
            	 if(base<0 || altura <0) {

            		 System.out.println("No se pueden utilizar valores negativos, no es logico");


            	 } else {
            	 Rectangulo Rec = new Rectangulo();
            	 Rec.setBase(base);
            	 Rec.setAltura(altura);

            	 JOptionPane.showMessageDialog(null, "Usted ha introducido una base de: "+Rec.getBase());
            	 JOptionPane.showMessageDialog(null, "Usted ha introducido una altura de: "+Rec.getAltura());
            	 JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+Rec.area());

            	 }
							 // e: explain try-catch blocks
            	 } catch (NumberFormatException ex){
								 // e: try to use ex variable to get the stacktrace of
								 // the exception
                 	System.out.println("No es un numero");
             	}

             }

             else {

            	 System.out.println("Opcion no valida");
             }

         }

     }catch (NumberFormatException ex){
			 		//Output should be displayed in english
         	System.out.println("No es un n�mero");
     	}

     catch (InputMismatchException ex) {

    	 System.out.println("No valido");

     }

	}

}
