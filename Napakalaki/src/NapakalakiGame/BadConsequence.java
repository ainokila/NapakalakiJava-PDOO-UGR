/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;
import java.lang.*;

import java.util.ArrayList;

/**
 *
 * @author Jorge G. y Cristian V.
 */
public abstract class BadConsequence {
    
    private String text=""; // Representa lo que dice un Mal Rollo.
    private int levels; //Representa el numero de niveles que se pierden.
    private static final int MAXTREASURES = 10;
    
    public BadConsequence(String text, int levels){
        this.text = text;
        this.levels = levels;
    }
    
    public String getText() {
        
        return text;
    }

    
    public int getLevels() {
        
        return levels;
    }
    
    public void setLevels(int l){
         this.levels = l;
    }
    
    public boolean isEmpty(){
         
                
         boolean solucion = false;
         if(text == "" && levels == 0 ){
                    solucion = true;
         }
        
      return solucion;

     }
     
    public abstract boolean isDeath();
    
    public abstract void setnVisibleTreasures(int n);
    
    public abstract void setnHiddenTreasures(int n);
    
    public abstract int getnVisibleTreasures();
    
    public abstract int getnHiddenTreasures();
    
    public abstract void substractVisibleTreasure(Treasure t);
     
    public abstract void substractHiddenTreasure(Treasure t);
        
    public abstract  BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v , ArrayList<Treasure> h);
            
        
 
} 
