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
    
    public abstract String toStringPendingVisible();
     
     public abstract String toStringPendingOculto();
        
 
} 
