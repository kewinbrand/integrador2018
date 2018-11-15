/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

/**
 *
 * @author leo_n
 */
public class Grafo {

    private final ListaAdjacencia ListaAdjacencia;
    
    public Grafo(ListaAdjacencia listaAdjacencia){
        this.ListaAdjacencia = listaAdjacencia;
    }
    
    public int numeroVertices(){
        return this.ListaAdjacencia.size();
    }
    
    public int numeroArestas(){
        int numero = 0;
        for(ElementoAdjacencia elemento: this.ListaAdjacencia){
            numero = elemento.getArestas().size() + numero;
        }
        return numero / 2;
    }
    
    
    
    /**
     * @return the ListaAdjacencia
     */
    public ListaAdjacencia getListaAdjacencia() {
        return ListaAdjacencia;
    }
    
}
