/*
*	Sergio Cancinos 13062
*	Angel Basegoda	 13256	
*	InterfazGrafo.java
*	Clase interfaz de los gr�fos. 
*
*/

package Lab9; 
public interface InterfazGrafo<V,E> {

    /* Agrega al grafo un nodo*/
    public void add(V label);

    /* Agregar conexion entre nodos */
    public void addEdge(V vtx1, V vtx2, E label);
    
    /* Despliega el grafo */
    public void show();
    
    /* Obtiene la posicion de un nodo */
    public int getIndex(V label);
    
    /* En la posicion label obtiene el nodo */
    public V get(int label);
    
    /* Obtiene el peso de la conexion entre dos nodos */
    public int getEdge(V label1, V label2);
    
    /* Verifica si el nodo indicado existe en el grafo */
    public boolean contains(V label);
    
    /* Indica la cantidad de nodos en el grafo */
    public int size();
    
}