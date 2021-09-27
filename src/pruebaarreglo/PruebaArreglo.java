

package pruebaarreglo;


import java.util.Scanner;
import static pruebaarreglo.Arreglo.sumarListas;
import static pruebaarreglo.Arreglo.cuentaVocales;
import static pruebaarreglo.Arreglo.cuentaCaracter;
import static pruebaarreglo.Arreglo.buscarMayor;


public class PruebaArreglo {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int[] enteros = new int[4];
        Scanner scanner = new Scanner(System.in);

        
        
        
        sumarListas(enteros, scanner);
        


                
                

                int[][] matriz = { {1, 2}, {3, 4, 5}, {6, 7}, { 8, 9, 10, 11} };
             buscarMayor(matriz);
 

    String vocales = null;
   cuentaVocales(vocales);

String vocale = null;
char caracter = 0 ;
cuentaCaracter(vocale,caracter);


    
    
    }

   
    
}
