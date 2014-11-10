/*
*	Sergio Cancinos 13062
*	Angel Basegoda	 13256	
*	GraphMatrix.java
*	Se encarga de crear la matriz de adyacenc�a.	
*	
*/
package Lab9; 
import java.util.Vector;

public class GraphMatrix<V,E> implements InterfazGrafo<V,E>{

    private Vector vertices = new Vector();
    private int[][] arcos= new int [25][25];
    
    /* Constructor */
    public GraphMatrix(){
        
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                if(i==j){
                    arcos[i][j]=0;
                }
                else{
                    arcos[i][j]=1000;
                }
            }
        }
    }
	
    @Override
    public void add(V label) {
        
        if(!vertices.contains(label)){
            vertices.add(label);
        }  
    }

    @Override
    public void addEdge(V vtx1, V vtx2, E label) {
        int i = vertices.indexOf(vtx1);
        int j = vertices.indexOf(vtx2);        
        String tmp = ""+label;
        int peso = Integer.parseInt(tmp);
        arcos[i][j]=peso;
    }

    @Override
    public void show(){
        for(int a=0;a<vertices.size();a++){
            for(int b=0;b<vertices.size();b++){
                System.out.print(""+arcos[a][b]+" ");
            }
            System.out.println("");
        }
    }
    
    @Override
    public int size(){
        return vertices.size();
    }

    @Override
    public int getEdge(V label1, V label2){
        return arcos[vertices.indexOf(label1)][vertices.indexOf(label2)];
    }
    
    @Override
    public V get(int label){
        
        return (V)vertices.get(label); 
    }
    
    @Override
    public int getIndex(V label){
        return vertices.indexOf(label);
    }

    public boolean contains(V label){
        return vertices.contains(label);
    }
}