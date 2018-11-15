/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

import static java.lang.Integer.MAX_VALUE;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo_n
 */
public class Dijkstra {

    private final Grafo Grafo;
    private final Vertice VerticeOrigem;
    private final FilaPrioridadeMinima FilaPrioridadeMinima;
    private final List<Vertice> VerticesVisitados;
    
    public Dijkstra(Grafo grafo, Vertice verticeOrigem){
        this.FilaPrioridadeMinima = new FilaPrioridadeMinima();
        this.VerticesVisitados = new ArrayList<>();
        this.Grafo = grafo;
        this.VerticeOrigem = verticeOrigem;
    }
    
    public void Executar() throws Exception{
        this.Inicializar();
        this.ExecutarAlgoritmo();
    }

    /**
     * Inicializa as distâncias e as arestas pais.
     */
    private void Inicializar() {
        this.Grafo.getListaAdjacencia().forEach( (ElementoAdjacencia elemento) -> {
            elemento.getVerticesFilhos().forEach( (Vertice vertice) -> {
                vertice.setDistancia(MAX_VALUE);
                vertice.setPai(null);
            });
            this.FilaPrioridadeMinima.add(elemento.getVerticePai());
        });
        this.VerticeOrigem.setDistancia(0);
    }

    private void ExecutarAlgoritmo() throws Exception {
        while(!this.FilaPrioridadeMinima.isEmpty()){
            Vertice vertice = this.FilaPrioridadeMinima.RemoverMinimo();
            this.VerticesVisitados.add(vertice);
            
            ElementoAdjacencia elementoAdj = this.Grafo.getListaAdjacencia().stream()
                    .filter((elemento) -> elemento.getVerticePai() == vertice)
                    .findFirst().orElseThrow(() -> new Exception("Vértice "+ vertice.getLabel() +" de prioridade mínima não encontrado na lista de adjacência."));
            
             elementoAdj.getVerticesFilhos().forEach( verticeFilho -> {
                try {
                    int pesoAresta = elementoAdj.BuscarPesoAresta(vertice, verticeFilho);
                    int pesoFinal = vertice.getDistancia() + pesoAresta;
                    if(verticeFilho.getDistancia() > pesoFinal){
                        verticeFilho.setDistancia(pesoFinal);
                        verticeFilho.setPai(vertice);
                    }
                } catch (Exception ex) {
                    // TODO ??
                }
             });
            
        }
    }
    
}
