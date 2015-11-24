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
public class BadConsequence {
    
    private String text=""; // Representa lo que dice un Mal Rollo.
    private int levels; //Representa el numero de niveles que se pierden.
    private int nVisibleTreasures;  //Numero de tesoros visibles que se pierden.
    private int nHiddenTreasures; //Numero de tesoros ocultos que se pierden.
    private boolean death; //Representa un Mal Rollo de tipo Muerte.
    private static final int MAXTREASURES = 10;
    
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
    
    public ArrayList<TreasureKind> getVisibleTreasures(){
       
        return specificVisibleTreasures;
    } 
    
    public ArrayList<TreasureKind> getHiddenTreasures(){
       
        return specificHiddenTreasures;
    } 
    
    private String auxiliarString(ArrayList<TreasureKind> datos){
        
        String solucion="" ; 
        
        for (TreasureKind uno: datos){
            
            solucion += uno.toString() + "\t";
        }
        return solucion;
        
    }
     @Override
     public String toString(){

        String solucion = " " + text + "\nlevels = " + Integer.toString(levels)+"\n"
                + "Visible Treasures = " + Integer.toString(nVisibleTreasures)+"\n" 
                + "Hidden Treasures = " + Integer.toString(nHiddenTreasures)+"\n"
                + "Death = " + death + "\nSpecific Hidden Treasures = " + auxiliarString(specificHiddenTreasures)+"\n"
                + "Specific Visible Treasures = " + auxiliarString(specificVisibleTreasures);
        
        return solucion;
      }
    
     public boolean isEmpty(){
         
                
         boolean solucion = false;
         if(text == "" && levels == 0 && nVisibleTreasures == 0 && nHiddenTreasures == 0 && death == false && specificHiddenTreasures.size() == 0 && specificVisibleTreasures.size() == 0){
                    solucion = true;
         }
        
      return solucion;

     }
     
     public void substractVisibleTreasure(Treasure t){
         int posicion=0;
         for(TreasureKind iterador : specificVisibleTreasures){
             if(t.getType() == iterador){
                 specificVisibleTreasures.remove(posicion);
             }
             posicion++;
         }
     }
     
     public void substractHiddenTreasure(Treasure t){
         int posicion=0;
         for(TreasureKind iterador : specificHiddenTreasures){
             if(t.getType() == iterador){
                 specificHiddenTreasures.remove(posicion);
             }
             posicion++;
         }
     }
     
     public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v , ArrayList<Treasure> h){
         //***************************DUDAS EN ESTE METODO **************************************

         ArrayList<TreasureKind> visibles = new ArrayList();
         ArrayList<TreasureKind> ocultos = new ArrayList();
         
         for(Treasure iterador:v){
             if(!this.specificVisibleTreasures.contains(iterador.getType())){
                 visibles.add(iterador.getType());
             }
            
         }
         
        for(Treasure iterador:h){
             if(!this.specificHiddenTreasures.contains(iterador.getType())){
                 ocultos.add(iterador.getType());
             }
            
         }
         
          
         return new BadConsequence(this.text,0,visibles,ocultos);
         
     }
    
    
}
