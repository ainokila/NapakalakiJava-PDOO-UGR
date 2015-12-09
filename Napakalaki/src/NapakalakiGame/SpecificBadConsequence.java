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
     
     public void substractVisibleTreasure(Treasure t){
        
        for(int i =0; i< specificVisibleTreasures.size(); i++){
             if(t.getType() == specificVisibleTreasures.get(i)){
                 specificVisibleTreasures.remove(i);
                 
             }
        }
    
     }
     
     public void substractHiddenTreasure(Treasure t){
         
         for(int i =0; i< specificHiddenTreasures.size(); i++){
             if(t.getType() == specificHiddenTreasures.get(i)){
                 specificHiddenTreasures.remove(i);
                 
             }
        }
     }
     
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
     public String toString(){

        String solucion = " " + super.getText() + "\nDetalles: " +" Perder " + super.getLevels() + " niveles. "
                +  "\nTipo de Tesoro Visible: " + auxiliarString(specificVisibleTreasures)+", "
                + "Tipo de Tesoro Oculto: " + auxiliarString(specificHiddenTreasures) + " ."
                ;                    
      return solucion;
      }
    
}
