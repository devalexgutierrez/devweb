package java_interface_area;

import java.util.Scanner;

public class Java_Interface_Area {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lados;
        do{
            System.out.println("(con números) cuantos lados tiene su figura?");        
            Figuras f = new Figuras();
            lados = leer.nextInt();
            switch(lados)
        {
            case 0:
                f.CAUnilat();
                break;
            case 3:
                f.CATrilat();
                break;
            case 4:
                f.CAQuadrilat();
                break;
            case 13:
                System.out.println("Adios");
                break;
            default:
                System.out.println("No es Un Número de Lados Valido");
                break;
        }  
    }
    while (lados != 13);
        
    
         
        
        
    }
}

