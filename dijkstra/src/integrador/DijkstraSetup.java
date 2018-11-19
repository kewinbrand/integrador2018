/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import dijkstra.ElementoAdjacencia;
import dijkstra.Grafo;
import dijkstra.ListaAdjacencia;
import dijkstra.Vertice;

/**
 *
 * @author leo_n
 */
public class DijkstraSetup {
    
    public static Grafo CriarGrafo(){
        ListaAdjacencia listaAdjacencia = new ListaAdjacencia();
        
        Vertice verticeCuritiba = new Vertice();
        verticeCuritiba.setLabel("CURITIBA");
        
        Vertice verticeAraucaria = new Vertice();
        verticeAraucaria.setLabel("ARAUCARIA");
        
        Vertice verticeSaoJose = new Vertice();
        verticeSaoJose.setLabel("SÃO JOSÉ DOS PINHAIS");
        
        Vertice verticeTijucas = new Vertice();
        verticeTijucas.setLabel("TIJUCAS DO SUL");
        
        Vertice verticeQuitandinha = new Vertice();
        verticeQuitandinha.setLabel("QUITANDINHA");
        
        Vertice verticeLapa = new Vertice();
        verticeLapa.setLabel("LAPA");
        
        Vertice verticeItaperucu = new Vertice();
        verticeItaperucu.setLabel("ITAPERUCU");
        
        Vertice verticeBocaiuva = new Vertice();
        verticeBocaiuva.setLabel("BOCAIÚVA DO SUL");
        
        Vertice verticeAgudos = new Vertice();
        verticeAgudos.setLabel("AGUDOS DO SUL");
        
        ElementoAdjacencia elemento = new ElementoAdjacencia(verticeCuritiba);
        elemento.AdicionarVerticeFilho(verticeAraucaria, 23);
        elemento.AdicionarVerticeFilho(verticeAgudos, 65);
        elemento.AdicionarVerticeFilho(verticeTijucas, 53);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeAraucaria);
        elemento.AdicionarVerticeFilho(verticeCuritiba, 23);
        elemento.AdicionarVerticeFilho(verticeSaoJose, 36);
        elemento.AdicionarVerticeFilho(verticeItaperucu, 54);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeSaoJose);
        elemento.AdicionarVerticeFilho(verticeBocaiuva, 58);
        elemento.AdicionarVerticeFilho(verticeAraucaria, 36);
        elemento.AdicionarVerticeFilho(verticeTijucas, 29);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeTijucas);
        elemento.AdicionarVerticeFilho(verticeSaoJose, 29);
        elemento.AdicionarVerticeFilho(verticeCuritiba, 53);
        elemento.AdicionarVerticeFilho(verticeAgudos, 26);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeAgudos);
        elemento.AdicionarVerticeFilho(verticeCuritiba, 65);
        elemento.AdicionarVerticeFilho(verticeTijucas, 26);
        elemento.AdicionarVerticeFilho(verticeQuitandinha, 23);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeQuitandinha);
        elemento.AdicionarVerticeFilho(verticeAgudos, 23);
        elemento.AdicionarVerticeFilho(verticeLapa, 42);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeLapa);
        elemento.AdicionarVerticeFilho(verticeQuitandinha, 42);
        elemento.AdicionarVerticeFilho(verticeItaperucu, 80);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeItaperucu);
        elemento.AdicionarVerticeFilho(verticeLapa, 80);
        elemento.AdicionarVerticeFilho(verticeAraucaria, 54);
        elemento.AdicionarVerticeFilho(verticeBocaiuva, 53);
        listaAdjacencia.add(elemento);
        
        elemento = new ElementoAdjacencia(verticeBocaiuva);
        elemento.AdicionarVerticeFilho(verticeItaperucu, 53);
        elemento.AdicionarVerticeFilho(verticeSaoJose, 58);
        listaAdjacencia.add(elemento);
        
        Grafo grafo = new Grafo(listaAdjacencia);
        return grafo;
    }
    
}
