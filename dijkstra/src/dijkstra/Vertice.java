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
public class Vertice {

    /**
     * @return the Pai
     */
    public Vertice getPai() {
        return Pai;
    }

    /**
     * @param Pai the Pai to set
     */
    public void setPai(Vertice Pai) {
        this.Pai = Pai;
    }

    /**
     * @return the Distancia
     */
    public int getDistancia() {
        return Distancia;
    }

    /**
     * @param Distancia the Distancia to set
     */
    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    /**
     * @return the Label
     */
    public String getLabel() {
        return Label;
    }

    /**
     * @param Label the Label to set
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }
    
    private String Label;
    private int Distancia;
    private Vertice Pai;
    
}
