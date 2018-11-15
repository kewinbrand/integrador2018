/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo_n
 * Um elemento de adjacência corresponde a uma lista de vertices e o seu pai. Ex:
 * 
 *                         vértice pai | vertices filhas
 * elemento de adjacência      2 ->      1
 * elemento de adjacência      3 ->      1 -> 4
 * elemento de adjacência      1 ->      2 -> 3 -> 4
 * elemento de adjacência      4 ->      1 -> 3
 */
public class ElementoAdjacencia {
    
    private final Vertice VerticePai;
    private final List<Vertice> VerticesFilhos;
    private final List<Aresta> Arestas;
    
    public ElementoAdjacencia(Vertice verticePai){
        this.VerticesFilhos = new ArrayList<>();
        this.Arestas = new ArrayList<>();
        this.VerticePai = verticePai;
    }
    
    public void AdicionarVerticeFilho(Vertice vertice, int peso){
        
        Aresta aresta = new Aresta();
        aresta.setPeso(peso);
        aresta.setVerticeAdjacente1(VerticePai);
        aresta.setVerticeAdjacente2(vertice);
        this.Arestas.add(aresta);
        
        this.VerticesFilhos.add(vertice);
    }
    
    public int BuscarPesoAresta(Vertice verticeAdjacente1, Vertice verticeAdjacente2) throws Exception{
        Aresta arestaPeso = this.Arestas.stream().filter( (aresta) -> {
            return (aresta.getVerticeAdjacente1() == verticeAdjacente1 && aresta.getVerticeAdjacente2() == verticeAdjacente2);
        }).findFirst().orElseThrow(() -> new Exception("Nenhuma aresta com os vértices "+verticeAdjacente1.getLabel() + " e "+verticeAdjacente2.getLabel() + " foi encontrada."));
        return arestaPeso.getPeso();
    }

    /**
     * @return the VerticePai
     */
    public Vertice getVerticePai() {
        return VerticePai;
    }

    /**
     * @return the VerticesFilhos
     */
    public List<Vertice> getVerticesFilhos() {
        return VerticesFilhos;
    }
    
    /**
     * @return the Arestas
     */
    public List<Aresta> getArestas() {
        return Arestas;
    }
}
