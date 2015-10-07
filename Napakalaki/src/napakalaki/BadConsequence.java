/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

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
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden; 
        death = false;
               
    }
    
    public BadConsequence(String text, boolean death){
        
        this.text = text;
        this.death = death;
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
       
        this.specificHiddenTreasures = tHidden;
        this.specificVisibleTreasures = tVisible;
        this.text = text;
        this.levels = levels;
        death = false;
        
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
