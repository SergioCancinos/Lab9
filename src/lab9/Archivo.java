/*
*	Sergio Cancinos 13062
*	Angel Basegoda	 13256	
*Archivo.java
* Se encarga de la lectura del texto y la escritura de datos en este mismo. 
*/
package Lab9;
import java.io.*;

public class Archivo{
    
    File archivo;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    InterfazGrafo grafo = new GraphMatrix();

    /* Obtiene el archivo */
    public void obtenerArchivo(String direccion) throws FileNotFoundException{
       archivo=new File(direccion); 
    }  
    
    /* Obtiene los nombres de los nodos para el grafo */
    public InterfazGrafo arregloNombres() throws IOException{
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.add(tmp[0]);
            grafo.add(tmp[1]);
        }
        return grafo;
    }
    
    /* Escribe en el archivo */
    public void write(String cadena) throws IOException{
        fw = new FileWriter(archivo);
        pw = new PrintWriter(fw);
        pw.println(cadena);
    }
    
    /* Obtiene los pesos de los arcos entre nodos del grafo */
    public InterfazGrafo matrizCostos() throws IOException{
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;

        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.addEdge(tmp[0], tmp[1], tmp[2]);
        }
        return grafo;
    }
}