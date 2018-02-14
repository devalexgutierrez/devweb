package java_interface_area;

import java.util.Scanner;

public class Figuras implements unilat, trilat, quadrilat{
    public Figuras(){
        
    }
    Scanner leer = new Scanner(System.in);
    double base1, base2, altura, radio;
    int CAQ;
    public void CAUnilat(){
        double ACirc;
        System.out.println("su figura es un circulo");
        System.out.println("Cual es el radio de su circulo?");
        radio=leer.nextDouble();
        ACirc = pi * (radio*radio);
        System.out.println("El area del circulo es: " + ACirc);
    }
    public void CATrilat(){
        double ATri;
        System.out.println("su figura es un triangulo");
        System.out.println("cuanto mide la base?");
        base1=leer.nextDouble();
        System.out.println("cuanto mide la altura?");                
        altura=leer.nextDouble();
        ATri=(base1*altura)/2;
        System.out.println("El area del triangulo es es: " + ATri);
    }
    public void CAQuadrilat(){
        Double ACAQ;
        System.out.println("Presione 1 para cuadrado");
        System.out.println("Presione 2 para rectangulo");
        System.out.println("Presione 3 para trapecio");
        CAQ=leer.nextInt();
        switch(CAQ)
        {
            case 1:
                System.out.println("Cuanto mide la base?");
                base1=leer.nextDouble();
                System.out.println("Cuanto mide la altura?");
                altura=leer.nextDouble();
                ACAQ=base1*altura;
                System.out.println("El area del cuadrado es: " + ACAQ);
                break;
            case 2:
                System.out.println("Cuanto mide la base?");
                base1=leer.nextDouble();
                System.out.println("Cuanto mide la altura?");
                altura=leer.nextDouble();
                ACAQ=base1*altura;
                System.out.println("El area del rectangulo es: " + ACAQ);
                break;
            case 3:
                System.out.println("Cuanto mide la base mayor?");
                base1=leer.nextDouble();
                System.out.println("Cuanto mide la base menor?");
                base2=leer.nextDouble();
                System.out.println("Cuanto mide la altura?");
                altura=leer.nextDouble();
                ACAQ=((base1+base2)/2)*altura;
                System.out.println("El area del trapecio es: " + ACAQ);
                break;
            default:
                break;
        }
    }
}
