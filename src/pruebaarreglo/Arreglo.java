
package pruebaarreglo;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Arreglo {

   
    
  
   
 
        
       public static void sumarListas(int [] enteros,Scanner scanner){
           System.out.println("arreglo unidimensional");
          for (int i = 0; i < enteros.length; i++) {
			System.out.print("insertar array[" + i + "]:");
			enteros[i] = scanner.nextInt();
		}
      
		System.out.print("Suma: ");
		int acumulador = 0;
		for (int i = 0; i < enteros.length; i++) {
			acumulador = acumulador + enteros[i];
			System.out.print("+" + enteros[i]);
		}
		System.out.println("= " + acumulador);
	
		double promedio = 0;
		for (int i = 0; i < enteros.length; i++) {
			promedio = promedio + enteros[i];
		}
		promedio = promedio / enteros.length;
                System.out.println("el promedio del arreglo  "+promedio);
	

	}
      
            
            

           public static void buscarMayor(int[][] matriz){
           
        
               System.out.println("arreglo bidimensional y irregular");

   
           
           
           
    for (int x=0; x < matriz.length; x++) {
  System.out.print("|");
  for (int y=0; y < matriz[x].length; y++) {
    System.out.print (matriz[x][y]);
    if (y!=matriz[x].length-1) System.out.print("\t");

    
  }
  
  
  System.out.println("|");
  
}
    
  int mayor = matriz[0][0];
    
  
 for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				int numeroActual = matriz[x][y];
				if (numeroActual > mayor)
					mayor = numeroActual;
			
			}
		}
  System.out.println("El mayor es "+ mayor);
               
                
                
           }
           
           
           
           
           public static void cuentaVocales(String vocales){
                     
            
           vocales = "buenas tardes";
           
               int nmVocales = 0;
               
               
               for(int x=0;x<vocales.length();x++){
                   if((vocales.charAt(x)=='a') || (vocales.charAt(x)=='e') || (vocales.charAt(x)=='i') || (vocales.charAt(x)=='o') || (vocales.charAt(x)=='u')){
                       nmVocales++;
                       
                   }
                   
               }
               System.out.println(" La palabra " + vocales + " contiene " + nmVocales + " vocales ");
               
               
               //“a”, “e”, “i”, “o” y “u”.
           }
           public static void cuentaCaracter(String vocale,char caracter){
               vocale = "buenas tardes";
               int nmVocales = 0;
               
               
                Scanner sc = new Scanner(System.in);
      
        System.out.print("Introduce un carácter: ");

        caracter = sc.next().charAt(0);
        
        
               for(int q=0;q<vocale.length();q++){
                   if((vocale.charAt(q) == caracter)){
              
                
              nmVocales++;  
                   
               }    
               
               }
               System.out.println("-----------------------");
               System.out.println("Carácter introducido -> " + caracter); 
               System.out.println("La palabra "+vocale);
               System.out.println(nmVocales);
               
           }


   
                   
           
}
