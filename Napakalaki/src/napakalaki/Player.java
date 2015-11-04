/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author ainokila
 */
public class Player {
    
 private static final int MAXLEVEL = 10;
 private String name;
 private int level;
 private boolean dead = true;
 private boolean canISteal = true;
 private ArrayList<Treasure> hiddenTreasures = new ArrayList();
 private ArrayList<Treasure> visibleTreasures = new ArrayList();
 private Player enemy;
 private BadConsequence pendingBadConsequence;
 
 
 public Player (String nombre){
     
     name = nombre;
 }
 
 public String getName(){
     
     return name;
 }
 
 private void bringToLife(){
     
     dead = false;
 }
 
 private int getLevelTreasures(){
     
     int solucion  = 0;
    for (Treasure iterador: hiddenTreasures){
            
            solucion = solucion+ iterador.getBonus();
              
    }
    
    for (Treasure iterador: visibleTreasures){
            
            solucion = solucion+ iterador.getBonus();
              
    }
     
    return solucion;
 }
 
 private int getCombatLevel(){
     
        int combatLevel=0;
        combatLevel = getLevelTreasures();
        combatLevel = combatLevel + level;
     
    return combatLevel;
 }
 
 private void incrementLevels(int i){
     
     if(level+i >= 10){
        level = 10;
     }else{
        level = level + i;
     }
 }
 private void decrementLevels(int i){
      
     if(level-i <= 0){
        level = 0;
     }else{
        level = level - i;
     }
 }
 
 private void setPendingBadConsequence(BadConsequence b){
     
     pendingBadConsequence = b;
     
 }
 
 private void dieIfNoTreasures(){
     
     if(hiddenTreasures.size() == 0 && visibleTreasures.size() == 0){
         
         dead = true;
         
     }
     
 }
 
 private boolean validState(){
     
     boolean solucion=false;
     
     if(pendingBadConsequence.isEmpty() && hiddenTreasures.size() == 4){
         
         solucion = false;
     }
     else{
         solucion = false;
     }
     
    return solucion;
    
 }
 
  public int getLevel(){
     
     return level;
 }
 
  private int howManyVisibleTreasures(TreasureKind tKind){
      
      int solucion = 0;
      
       for (Treasure iterador: visibleTreasures){
            
            if(iterador.getType() == tKind){
                
                solucion++;
                
            }
    }
     
     return solucion; 
  }
  
  public void setEnemyPlayer(Player enemy){
      
      this.enemy = enemy;
      
  }

  public boolean canISteal(){
     
      return canISteal;
  }
  
  private void haveStolen(){
      
      canISteal = false;
      
  }

  private boolean canYouGiveMeATreasure(){
      boolean solucion = false;
      
      if(hiddenTreasures.size()>0 || visibleTreasures.size()>0){
         
          solucion = true;
          
      }
      
    return solucion;
  }
         
          
}





