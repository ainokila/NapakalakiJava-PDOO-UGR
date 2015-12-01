//*
 /*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

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
 private BadConsequence pendingBadConsequence = new BadConsequence("",0,0,0);
 
 
 public Player (String nombre){
     
     name = nombre;
     level = 1 ;
 }
 
 
 public boolean isDeath(){
     
    boolean solucion= false;
    
    if(dead){
        solucion = true;
    }
    
    return solucion;
 }
 
   @Override
     public String toString(){
          
        String solucion = "Nombre del Jugador: " + name +" Nivel: " + level+  "\n"  ;
        return solucion ;
        
      }
     
 public String getName(){
     
     return name;
 }
 
 public ArrayList<Treasure> getVisibleTreasures(){
     return visibleTreasures;
 }
 
 public ArrayList<Treasure> getHiddenTreasures(){
     return hiddenTreasures;
 }
 
 private void bringToLife(){
     
     dead = false;
 }
 
 private int getLevelTreasures(){
     
     int solucion  = 0;
     
    for (Treasure iterador: visibleTreasures){
            
            solucion = solucion+ iterador.getBonus();
              
    }
     
    return solucion;
 }
 
 private int getCombatLevel(){
     
        int combatLevel = getLevelTreasures();
        combatLevel = combatLevel + level;
     
    return combatLevel;
 }
 
 private void incrementLevels(int i){
     
     if(level+i >= MAXLEVEL){
        level = MAXLEVEL;
     }else{
        level = level + i;
     }
 }
 private void decrementLevels(int i){
      
     if(level-i <= 1){
        level = 1;
     }else{
        level = level - i;
     }
 }
 
 private void setPendingBadConsequence(BadConsequence b){
     
     pendingBadConsequence = b;
     
 }
 
 private void dieIfNoTreasures(){
     
     if(hiddenTreasures.isEmpty()  && visibleTreasures.isEmpty()){
         
         dead = true;
         
     }
     
 }
 
 public boolean validState(){
     
     boolean solucion=true;
     
     if(!(pendingBadConsequence.isEmpty()) || hiddenTreasures.size() > 4){
         
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
  
  
  private boolean canMakeTreasureVisible(Treasure t){
      
      boolean solucion=true;
      
      if(visibleTreasures.size()<4){
          
          TreasureKind elemento = t.getType();
          
          switch (elemento){
              
              case ONEHAND: 

                    
                    if (howManyVisibleTreasures(TreasureKind.BOTHHANDS)>0) {
                        solucion = false;
                    } else {
                        
                        int i = 0;
                        for (Treasure tv : this.visibleTreasures) {
                            if (tv.getType() == (TreasureKind.ONEHAND)) {
                                i++;
                            }
                        }

                        if (i == 2) {
                            solucion = false;
                        } else {
                            solucion = true;
                        }
                    }
                    break;
               
              case BOTHHANDS:
                  if(howManyVisibleTreasures(TreasureKind.ONEHAND)>0){
                      solucion = false;
                  } else {
                        
                        int j = 0;
                        for (Treasure tv : this.visibleTreasures) {
                            if (tv.getType() == (TreasureKind.BOTHHANDS)) {
                                j++;
                            }
                        }

                        if (j == 1) {
                            solucion = false;
                        } else {
                            solucion = true;
                        }
                    }
                    break;

                default: 
                    solucion = howManyVisibleTreasures(elemento)==0;
                    break;
                        
          }
    
      }else{
          solucion = false;
      }
      
      
      return solucion;
  }
  
  private void applyPrize(Monster m){
      this.incrementLevels(m.getLevelsGained());
      int tesoros = m.getTreasuresGained();
      
      CardDealer baraja = CardDealer.getInstance();
      
      for(int i = 0 ; i<tesoros ; i++){
          hiddenTreasures.add(baraja.nextTreasure());
      }
  }
  
  private void applyBadConsequence(Monster m){
      
      
      BadConsequence bad = m.getBadConsequence();
      BadConsequence pendingBad; 
      
      if(!(bad.isDeath())){
      
                pendingBad = bad.adjustToFitTreasureLists(visibleTreasures,hiddenTreasures);

                int niveles = pendingBad.getLevels();

                this.decrementLevels(niveles);
                
            //Como ya se han perdido los niveles, ahora los vuelvo a poner a 0
                pendingBad.setLevels(0);
                this.setPendingBadConsequence(pendingBad);
                
      }else if(bad.isDeath()){
          //Al morir el jugador, este pierde todos los tesoros de los que dispone (tanto equipados como ocultos)
          //y su nivel quedará fijado en 1.
          System.out.println( "\n\n" + "Al morir el jugador, este pierde todos los tesoros de los que dispone" +
                                "(tanto equipados como ocultos) y su nivel quedará fijado en 1." + "\n\n");
          //Decremento el máximo de niveles para asegurar que el nivel del player se pone a 1.
          this.decrementLevels(MAXLEVEL);
          
          //Y por último descarto todos los tesoros
          this.discardAllTreasures();
          
          
         }
         
      }
      
  public Treasure stealTreasure(){
      boolean canI = this.canISteal();
      Treasure treasure = null;
      
      if(canI){
          boolean canYou = enemy.canYouGiveMeATreasure();
          if(canYou){
              treasure=enemy.giveMeATreasure();
              this.hiddenTreasures.add(treasure);
              this.haveStolen();
          }
      }
      return treasure;
  }
  
  private Treasure giveMeATreasure(){
       
       Treasure solucion;
       int posAleatorio;
       posAleatorio = (int) (Math.random() * hiddenTreasures.size());
       solucion = hiddenTreasures.get(posAleatorio);
       //hiddenTreasures.remove(solucion);
       
       return solucion;
  }
  
  public void discardVisibleTreasure(Treasure t){
      
      visibleTreasures.remove(t);
      
      if((pendingBadConsequence != null) && (!pendingBadConsequence.isEmpty())){
            pendingBadConsequence.substractVisibleTreasure(t);
           if(pendingBadConsequence.getnVisibleTreasures() > 0){
            int n = pendingBadConsequence.getnVisibleTreasures();
            n--;
            pendingBadConsequence.setnVisibleTreasures(n);
           }
      }
       
      dieIfNoTreasures();
  }
  
  public void discardHiddenTreasure(Treasure t){
      
      hiddenTreasures.remove(t);
      
      if((pendingBadConsequence != null) && (!pendingBadConsequence.isEmpty())){
            pendingBadConsequence.substractHiddenTreasure(t);
        if(pendingBadConsequence.getnHiddenTreasures() > 0){
            int n = pendingBadConsequence.getnHiddenTreasures();
            n--;
            pendingBadConsequence.setnHiddenTreasures(n);
            
            }
      }
       
      dieIfNoTreasures();
  }
  
  public void discardAllTreasures(){
      
      for(int i =0; i< visibleTreasures.size(); i++){
          this.discardVisibleTreasure(visibleTreasures.get(i));
      }
      
      for(int i =0; i< hiddenTreasures.size(); i++){
          this.discardHiddenTreasure(hiddenTreasures.get(i));
      }
  }
  
  public void initTreasures(){
      CardDealer dealer = CardDealer.getInstance();
      Dice dice = Dice.getInstance();
      
      this.bringToLife();
      
      Treasure treasure = dealer.nextTreasure();
      hiddenTreasures.add(treasure);
      
      int number = dice.nextNumber();
      
      if(number>1){
          treasure = dealer.nextTreasure();
          hiddenTreasures.add(treasure);
      }
      
      if(number == 6){
          treasure = dealer.nextTreasure();
          hiddenTreasures.add(treasure);
          
      }
  }
  
  public CombatResult combat(Monster m){
      CombatResult combatResult;
      int myLevel = getCombatLevel();
      int monsterLevel = m.getCombatLevel();
      
      if(myLevel > monsterLevel){
          this.applyPrize(m);
          
          if(level >=MAXLEVEL){
                combatResult = CombatResult.WINGAME;
          }
          else{
               combatResult = CombatResult.WIN;
          }
          
      }
      else{
          
          this.applyBadConsequence(m);
          dieIfNoTreasures();
          combatResult = CombatResult.LOSE;
      }
      
      return combatResult = CombatResult.LOSE;
      
  }
  
  public void makeTreasureVisible(Treasure t){
      
      boolean canI = canMakeTreasureVisible(t);
      
      if(canI){
          visibleTreasures.add(t);
          hiddenTreasures.remove(t);
      }
  }
}



