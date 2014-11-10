/*
*	Angel Basegoda 13256
*	Sergio Cancinos 13062
*	Main.s
*	Se encarga de pedir los datos al usuario y realizar las diferentes opciones
*
*/
package Lab9;

import java.util.Scanner;
import javax.swing.JOptionPane;
import  java.util.*;

public class Main {

	public static void main(String[] args){
		int opcion, eleccion, distancia; 
       Scanner scan = new Scanner(System.in); 
	   /*Pide los datos*/
       eleccion=Integer.parseInt(JOptionPane.showInputDialog(""
                + "\n1) Encontrar la ruta m�s corta entre dos ciudades "
                + "\n2) Ciudad que represanta el centro del grafo"
                + "\n3) Modificar grafo "
				+ "\n4) Finalizar el programa "));
	/* Defensiva contra otros n�meros */
		while (eleccion!=1&& eleccion!=2&& eleccion!=3&& eleccion!=4){
			JOptionPane.showMessageDialog(null, "Usted no ha ingresado una opcion valida");			
			eleccion=Integer.parseInt(JOptionPane.showInputDialog(""
                + "\n1) Encontrar la ruta m�s corta entre dos ciudades "
                + "\n2) Ciudad que represanta el centro del grafo"
                + "\n3) Modificar grafo "
				+ "\n4) Finalizar el programa "));		
		}	
		
		/*Opci�n 1 */
         if(eleccion==1){
				String ciudad1= JOptionPane.showInputDialog("Ingrese el nombre de la primera ciudad salida");
				String ciudad2= JOptionPane.showInputDialog("Ingrese el nombre de la segunda ciudad destino");
				
			}
			/* Opci�n 2 Centro de Grafo */
         else if(eleccion==2){ 
			}
			/* Opci�n 3 */
         else if(eleccion==3){
			
				opcion=Integer.parseInt(JOptionPane.showInputDialog("n1) Hay interrupci�n entre dos ciudades \nn2) Establecer una nueva conexi�n"));
					if(opcion == 1){
						String ciudad1= JOptionPane.showInputDialog("Ingrese el nombre de la primera ciudad Salida");
						String ciudad2= JOptionPane.showInputDialog("Ingrese el nombre de la segunda ciudad Destino");						
					
					}
					if(opcion == 2){
						String ciudad1= JOptionPane.showInputDialog("Ingrese el nombre de la primera ciudad Salida");
						String ciudad2= JOptionPane.showInputDialog("Ingrese el nombre de la segunda ciudad Destino");					
						distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia entre las ciudades")); 
					}									
			
			}
			/*Opci�n 4*/
			else if (eleccion==4){
			
			}
			
			
			
	}
}
	