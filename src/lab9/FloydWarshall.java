/*
*	Sergio Cancinos 13062
*	Angel Basegoda	 13256	
*	FloydWarshall.java
*	Se encaraga de llevar a cabo el algoritmo de Floyd para encontrar el centro del grafo y la distancia m�s corta. 
*/
package Lab9; 
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.*;

public class FloydWarshall{

	Archivo texto = new Archivo();
	InterfazGrafo Grafo;
	int[][] Nodos;
	int[] max;
	int min=1000;
	int cnt;
	int tam = texto.grafo.size();
	int grafo1;
	int grafo2;

	public FloydWarshall(){
	
	//se lee el archivo de texto para obtener los nombres de las ciudades
	//y las relaciones entre ellas
		try {
			texto.obtenerArchivo("datos.txt");
			texto.arregloNombres();
			Grafo = texto.matrizCostos();
			Nodos = new int[25][25];
			max = new int[25];

		}
	//si existe un error se notifica
		catch (IOException ex) {
			ex.printStackTrace();
		}
	//se realiza la matriz de adyacencia primero colocando valores altos
	//a cada posicion
		for(int i=0; i<tam; i++){
			for (int j=0; j<tam; j++){
				Nodos[i][j]=1000;
			}
		}
	}
	
	//es el metodo que obtiene la distancia mas corta entre las ciudades
    public void shortestPath(){
	//se realizan tres ciclos para recorrer la matriz de adyacencia y los
	//valores de cada una de las conexiones
        for(int k=0;k<Grafo.size();k++){
            for(int i=0;i<Grafo.size();i++){
                for(int j=0;j<Grafo.size();j++){
				
				//se obtiene el valor de los recorridos, siendo
				//grafo1 el valor original y grafo2 el nuevo recorrido
					grafo1 = Grafo.getEdge(Grafo.get(i),Grafo.get(j));
					grafo2 = Grafo.getEdge(Grafo.get(i), Grafo.get(k))+Grafo.getEdge(Grafo.get(k), Grafo.get(j));
				
				//si la nueva conexion tiene un valor mas bajo que la primera,
				//se reemplaza en la matriz
                    if(grafo1>grafo2){
                        Grafo.addEdge(Grafo.get(i), Grafo.get(j), grafo2);
                        Nodos[i][j]=k;
                    }
                }
            }
        }
    }
	
//se obtiene el centro del grafo obteniendo los valores maximos
//de la matriz en cada columna
    public void graphCenter(){
        shortestPath();
        int n=0;
		
        for(int i=0;i<Grafo.size();i++){
            for(int j=0;j<Grafo.size()-1;j++){
                int valA=Grafo.getEdge(Grafo.get(j), Grafo.get(i));
                n=j;
                n++;
                int valB=Grafo.getEdge(Grafo.get(n), Grafo.get(i));
                if(valA>valB){
                    max[i]=valA;
                }
                else{
                    max[i]=valB;
                }
            }
            n++;
        }
		
//se obtiene el valor maximo mas bajo y se reemplaza el minimo actual
        for(int i=0;i<Grafo.size();i++){
            int valA=max[i];
            if(valA<min){
                cnt=i;
                min=valA;
            }
        }
		JOptionPane.showMessageDialog(null,"La ciudad central es: "+Grafo.get(cnt));   //
    }
}