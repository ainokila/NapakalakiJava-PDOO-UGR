/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author jorge
 */
public class BadConsequence {
    private String text; // Representa lo que dice un Mal Rollo.
    private int levels; //Representa el numero de niveles que se pierden.
    private int nVisibleTreasures;  //Numero de tesoros visibles que se pierden.
    private int nHiddenTreasures; //Numero de tesoros ocultos que se pierden.
    private boolean death; //Representa un Mal Rollo de tipo Muerte.
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden; 
               
    }
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
    }

    public String getText() {
        return text;
    }

    
    public int getLevels() {
        return levels;
    }

    public int getnVisibleTreasures() {
        return nVisibleTreasures;
    }

    public int getnHiddenTreasures() {
        return nHiddenTreasures;
    }


    public boolean isDeath() {
        return death;
    }

    
    
}
