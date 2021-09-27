/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarreglo;


import java.util.Scanner;
import static pruebaarreglo.Arreglo.sumarListas;
import static pruebaarreglo.Arreglo.cuentaVocales;
import static pruebaarreglo.Arreglo.cuentaCaracter;
import static pruebaarreglo.Arreglo.buscarMayor;

/**
 *
 * @author santi
 */
public class PruebaArreglo {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] enteros = new int[4];
        Scanner scanner = new Scanner(System.in);

        
        
        
        sumarListas(enteros, scanner);
        
        
//        sumarArray(enteros);
//        
//        
//        double promedio = promedioArray(enteros);
//		System.out.println("Promedio= " + promedio);
//        

                
                

                int[][] matriz = { {1, 2}, {3, 4, 5}, {6, 7}, { 8, 9, 10, 11} };
             buscarMayor(matriz);
//      
       
                
                
                
                
                
                
                
                
//        int[][] matriz = { {1, 2}, {3, 4, 5}, {6, 7}, { 8, 9, 10, 11} };
//   
//    for (int x=0; x < matriz.length; x++) {
//  System.out.print("|");
//  for (int y=0; y < matriz[x].length; y++) {
//    System.out.print (matriz[x][y]);
//    if (y!=matriz[x].length-1) System.out.print("\t");
//
//    
//  }
//  
//  
//  System.out.println("|");
//  
//}
//    
//  int mayor = matriz[0][0], menor = matriz[0][0];
//    
//  
// for (int x = 0; x < matriz.length; x++) {
//			for (int y = 0; y < matriz[x].length; y++) {
//				int numeroActual = matriz[x][y];
//				if (numeroActual > mayor)
//					mayor = numeroActual;
//			
//			}
//		}
//  System.out.printf("El mayor es "+ mayor);
//  
//  
//  

    String vocales = null;
   cuentaVocales(vocales);

String vocale = null;
char caracter = 0 ;
cuentaCaracter(vocale,caracter);


    
    
    }

   
    
}
