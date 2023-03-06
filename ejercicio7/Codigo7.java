package codigodeotros.ejercicio7;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Programa que te permite conocer la capital de distintos paises
 * 		 Si no existen, agrega nuevos paises a la lista
 *
 */
//Quite el asento de la clase
public class Codigo7 {
	// Agregue metodo main
	public static void main(String[] args) {
		//Agregue system.in
		 Scanner s = new Scanner(System.in);
		 //Complete el nombre capitales y el tipo de datos que tendra
		    HashMap<String, String> capitales = new HashMap<>();
	capitales.put("Canadá","Otawa"); 
	capitales.put("Estados Unidos","Washington DC"); 
	capitales.put("México", "México DF");
	capitales.put("Belice", "Belmopán"); 
	capitales.put("Costa rica", "San José");
	capitales.put("El Salvador","San Salvador"); //Complete esta instruccion 
	capitales.put("Guatemala","Ciudad de Guatemala"); 
	capitales.put("Honduras", "Tegucigalpa");
	capitales.put("Nicaragua", "Managua"); 
	capitales.put("Panamá", "Panamá");
		    
	String pais = "";

	    do {
		     System.out.println("Escribe el nombre de un país y te diré su capital: ");
		     //Agregue esta linea
		     System.out.println("Si quiere salir escriba salir");
		     pais = s.nextLine();
		      //Cambie por equals
		      if (!pais.equals("salir")) {
		     	 //Cambio por capitales y cambio por containskey
		        if (capitales.containsKey(pais)) {
		     	   //corregir el syso
		          System.out.print("La capital de " + pais);
		          System.out.println(" es " + capitales.get(pais));
		        } else {
		          System.out.print("No conozco la respuesta ");
		          System.out.print("¿cuál es la capital de " + pais + "?: ");
		          //Cambie ca por nueva capital
		          String nuevaCapital = s.nextLine();
		          capitales.put(pais, nuevaCapital);
		          System.out.println("Gracias por enseñarme nuevas capitales");
		        }
		      }//Estaba mal escrito while
		    } while (!pais.equals("salir"));//Agregue parentesis
	}

}
