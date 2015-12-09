/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author ainokila
 */
public class NumericBadConsequence extends BadConsequence  {
    private int nVisibleTreasures;  //Numero de tesoros visibles que se pierden.
    private int nHiddenTreasures; //Numero de tesoros ocultos que se pierden.

    public NumericBadConsequence(String text, int levels , int nVisible, int nHidden) {
        
        super(text, levels);
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
    }
    
    public void setnVisibleTreasures(int n) {
        
        nVisibleTreasures = n;
    }

    public void setnHiddenTreasures(int n) {
        
        nHiddenTreasures = n;
    }
    
        public int getnVisibleTreasures() {
        
        return nVisibleTreasures;
    }

    public int getnHiddenTreasures() {
        
        return nHiddenTreasures;
    }
    
    @Override
    public boolean isEmpty(){
         
                
         boolean solucion = false;
         if(super.getText() == "" && super.getLevels() == 0 && nVisibleTreasures == 0 && nHiddenTreasures == 0 ){
                    solucion = true;
         }
        
      return solucion;

     }
    
    public  BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v , ArrayList<Treasure> h){
            
         BadConsequence solucion;
            
                    int visibles=0;
                    int ocultos=0;

                    int tamV = v.size();
                    int tamH = h.size();

                    if(nVisibleTreasures <= tamV ){
                        visibles = nVisibleTreasures;

                    }else if(tamV < nVisibleTreasures){
                        visibles = tamV;
                    }

                     if(nHiddenTreasures <= tamH ){
                        ocultos = nHiddenTreasures;

                    }else if(tamH < nHiddenTreasures){
                       ocultos = tamH;
                    }
            
          solucion =  new NumericBadConsequence("",super.getLevels(),visibles,ocultos);
                   
        
    return solucion;
 }
    
    @Override
     public String toString(){

        String solucion = " " + super.getText() + "\nDetalles: " +" Perder " + super.getLevels() + " niveles. "
                +  "\n" + Integer.toString(nVisibleTreasures)+" tesoros visibles,  "
                + "\n" + Integer.toString(nHiddenTreasures) + "tesoros ocultos ."
                ;                    
      return solucion;
      }
  
}
