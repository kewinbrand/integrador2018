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
public class Aresta {

    /**
     * @return the VerticeAdjacente2
     */
    public Vertice getVerticeAdjacente2() {
        return VerticeAdjacente2;
    }

    /**
     * @param VerticeAdjacente2 the VerticeAdjacente2 to set
     */
    public void setVerticeAdjacente2(Vertice VerticeAdjacente2) {
        this.VerticeAdjacente2 = VerticeAdjacente2;
    }

    /**
     * @return the VerticeAdjacente1
     */
    public Vertice getVerticeAdjacente1() {
        return VerticeAdjacente1;
    }

    /**
     * @param VerticeAdjacente1 the VerticeAdjacente1 to set
     */
    public void setVerticeAdjacente1(Vertice VerticeAdjacente1) {
        this.VerticeAdjacente1 = VerticeAdjacente1;
    }

    /**
     * @return the Peso
     */
    public int getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
    
    private int Peso;
    private Vertice VerticeAdjacente1;
    private Vertice VerticeAdjacente2;
    
    
}
