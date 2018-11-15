/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import dijkstra.Dijkstra;
import dijkstra.Grafo;
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
            
            Dijkstra dijkstra = new Dijkstra(grafo, grafo.getListaAdjacencia().get(0).getVerticePai());
            
            dijkstra.Executar();
            
        } catch (Exception ex) {
            Logger.getLogger(Integrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
