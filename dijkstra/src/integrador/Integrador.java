/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import dijkstra.Dijkstra;
import dijkstra.ElementoAdjacencia;
import dijkstra.Grafo;
import dijkstra.Vertice;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leo_n
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Grafo grafo = DijkstraSetup.CriarGrafo();
            System.out.println(grafo.numeroArestas());
            System.out.println(grafo.numeroVertices());
            
            List<Vertice> lista = new ArrayList<>();
            
            Dijkstra dijkstra = new Dijkstra(grafo, grafo.getListaAdjacencia().get(0).getVerticePai());
            
            dijkstra.Executar();
            
            for (ElementoAdjacencia elemento : grafo.getListaAdjacencia()) {
                for(Vertice vertice: elemento.getVerticesFilhos()){
                    if(!lista.contains(vertice)){
                        lista.add(vertice);
                        if(vertice.getPai() != null){
                        System.out.println("Vertice " + vertice.getLabel() + " pai " + vertice.getPai().getLabel() + " distância  " + vertice.getDistancia());
                    }
                    }
                }
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Integrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
