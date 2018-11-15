/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

import java.util.ArrayList;

/**
 *
 * @author leo_n
 */
public class FilaPrioridadeMinima extends ArrayList<Vertice> {

    private Vertice verticeMinimo;
    
    public Vertice RemoverMinimo(){
        verticeMinimo = this.get(0);
        
        this.forEach( vertice -> {
            if(vertice.getDistancia() < verticeMinimo.getDistancia()){
                verticeMinimo = vertice;
            }
        });
        this.remove(verticeMinimo);
        return verticeMinimo;
    }
    
}
