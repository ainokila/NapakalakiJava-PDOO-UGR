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
public class SpecificBadConsequence extends BadConsequence {
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();

    public SpecificBadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden) {
        super(text, levels);
        this.specificHiddenTreasures = tHidden;
        this.specificVisibleTreasures = tVisible;
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
     public boolean isDeath(){
     
       return false;
     }
    
     @Override
     public void setnVisibleTreasures(int n){}
    
     @Override
     public void setnHiddenTreasures(int n){}
    
     @Override
     public int getnVisibleTreasures(){
         return 0;
     }
    
     @Override
     public int getnHiddenTreasures(){
         return 0;
     }
    
     @Override
     public void substractVisibleTreasure(Treasure t){
        
        for(int i =0; i< specificVisibleTreasures.size(); i++){
             if(t.getType() == specificVisibleTreasures.get(i)){
                 specificVisibleTreasures.remove(i);
                 
             }
        }
    
     }
     
     @Override
     public void substractHiddenTreasure(Treasure t){
         
         for(int i =0; i< specificHiddenTreasures.size(); i++){
             if(t.getType() == specificHiddenTreasures.get(i)){
                 specificHiddenTreasures.remove(i);
                 
             }
        }
     }
     
     @Override
     public  BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v , ArrayList<Treasure> h){
            
         BadConsequence solucion;            
            
                ArrayList<TreasureKind> visibles = new ArrayList();
                ArrayList<TreasureKind> ocultos = new ArrayList();

                 for(Treasure iterador:v){
                     if(this.specificVisibleTreasures.contains(iterador.getType())){
                         visibles.add(iterador.getType());
                     }

                 }

                for(Treasure iterador:h){
                     if(this.specificHiddenTreasures.contains(iterador.getType())){
                         ocultos.add(iterador.getType());
                     }

                 }


                 solucion =  new SpecificBadConsequence("",super.getLevels(),visibles,ocultos);    
         
         
    return solucion;
 }
     @Override
     public boolean isEmpty(){
         
                
         boolean solucion = false;
         if(super.getText() == "" && super.getLevels() == 0 && specificHiddenTreasures.isEmpty() && specificVisibleTreasures.isEmpty() ){
                    solucion = true;
         }
        
      return solucion;

     }
     
     @Override
     public String toString(){

        String solucion = super.getText() + "\n Pierdes " + super.getLevels() + " niveles. "
                +  "\nTipo Visible: " + auxiliarString(specificVisibleTreasures)+", "
                + "\nTipo Oculto: " + auxiliarString(specificHiddenTreasures) + " ."
                ;                    
      return solucion;
      }
     
     public String toStringPendingVisible(){
         String solucion = auxiliarString(specificVisibleTreasures);
         return solucion;
     }
     
     public String toStringPendingOculto(){
         String solucion = auxiliarString(specificHiddenTreasures);
         return solucion;
     }
    
}
