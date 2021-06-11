package src;
import java.util.*;


public class ejercicio1 {

  
    public static void main (String [ ] args) {
        ejercicio1 ej = new ejercicio1();

           //System.out.println ("Empezamos el programa");
           Scanner x = new Scanner (System.in); //Creación de un objeto Scanner
           int[] array = new int[5];
           int i, limiteDelArreglo;
           System.out.println("Ingrese el limite del arreglo");
           limiteDelArreglo = x.nextInt();
           
           System.out.println ("Digite los elementos del arreglo");
           for ( i= 0; i<limiteDelArreglo; i++){
               
               array[i]= x.nextInt();
               System.out.println ("El Indice ["+ (i) +"]="+ " esta en el valor "+array[i]);
           }
           for ( i= 0; i<limiteDelArreglo; i++){
               System.out.print(array[i]+ ", ");
           }
    }
} //Cierre de la clase