/*
Copyright 2016 Cristian Velez Ruiz universidadcvr@gmail.com
Copyright 2016 Jorge Gutierrez Segovia

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>. 
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
    
    @Override
    public boolean isDeath() {
        
        return false;
    }
    
    @Override
    public void substractVisibleTreasure(Treasure t){}
    
    @Override
    public void substractHiddenTreasure(Treasure t){}
    
    @Override
    public void setnVisibleTreasures(int n) {
        
        nVisibleTreasures = n;
    }

    @Override
    public void setnHiddenTreasures(int n) {
        
        nHiddenTreasures = n;
    }
    
    @Override
    public int getnVisibleTreasures() {
        
        return nVisibleTreasures;
    }

    @Override
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
    
    @Override
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

        String solucion = super.getText() + "\nPierdes " + super.getLevels() + " niveles. "
                +  "\n" + Integer.toString(nVisibleTreasures)+" tesoros visibles\n"
                + Integer.toString(nHiddenTreasures) + " tesoros ocultos "
                ;                    
      return solucion;
      }
     
     public String toStringPendingVisible(){
         String solucion = Integer.toString(nVisibleTreasures);
         return solucion;
     }
     
     public String toStringPendingOculto(){
         String solucion = Integer.toString(nHiddenTreasures);
         return solucion;
     }
  
}
