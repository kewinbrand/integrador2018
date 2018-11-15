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
        
        Vertice verticeX = new Vertice();
        verticeX.setLabel("X");
        
        Vertice verticeB = new Vertice();
        verticeB.setLabel("B");
        
        Vertice verticeD = new Vertice();
        verticeD.setLabel("D");
        
        Vertice verticeE = new Vertice();
        verticeE.setLabel("E");
        
        Vertice verticeC = new Vertice();
        verticeC.setLabel("C");
        
        Vertice verticeA = new Vertice();
        verticeA.setLabel("A");
        
        ElementoAdjacencia elemento = new ElementoAdjacencia(verticeX);
        elemento.AdicionarVerticeFilho(verticeB, 8);
        elemento.AdicionarVerticeFilho(verticeE, 10);
        elemento.AdicionarVerticeFilho(verticeA, 3);
        elemento.AdicionarVerticeFilho(verticeC, 4);
        listaAdjacencia.AdicionarElementoAdjacencia(elemento);
        
        elemento = new ElementoAdjacencia(verticeB);
        elemento.AdicionarVerticeFilho(verticeX, 8);
        elemento.AdicionarVerticeFilho(verticeD, 2);
        listaAdjacencia.AdicionarElementoAdjacencia(elemento);
        
        elemento = new ElementoAdjacencia(verticeD);
        elemento.AdicionarVerticeFilho(verticeB, 2);
        elemento.AdicionarVerticeFilho(verticeC, 1);
        elemento.AdicionarVerticeFilho(verticeE, 1);
        listaAdjacencia.AdicionarElementoAdjacencia(elemento);
        
        elemento = new ElementoAdjacencia(verticeE);
        elemento.AdicionarVerticeFilho(verticeD, 1);
        elemento.AdicionarVerticeFilho(verticeC, 3);
        elemento.AdicionarVerticeFilho(verticeX, 10);
        listaAdjacencia.AdicionarElementoAdjacencia(elemento);
        
        elemento = new ElementoAdjacencia(verticeC);
        elemento.AdicionarVerticeFilho(verticeE, 3);
        elemento.AdicionarVerticeFilho(verticeD, 1);
        elemento.AdicionarVerticeFilho(verticeX, 4);
        elemento.AdicionarVerticeFilho(verticeA, 6);
        listaAdjacencia.AdicionarElementoAdjacencia(elemento);
        
        elemento = new ElementoAdjacencia(verticeA);
        elemento.AdicionarVerticeFilho(verticeX, 3);
        elemento.AdicionarVerticeFilho(verticeC, 6);
        listaAdjacencia.AdicionarElementoAdjacencia(elemento);
        
        Grafo grafo = new Grafo(listaAdjacencia);
        return grafo;
    }
    
}
