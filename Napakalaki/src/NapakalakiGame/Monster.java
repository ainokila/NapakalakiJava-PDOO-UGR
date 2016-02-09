/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;
import java.lang.*;

/**
 *
 * @author  Jorge G. y Cristian V.
 */
public class Monster {
    
    private String name; //Nombre del monstruo.
    private int combatLevel; //Nivel del monstruo.
    private BadConsequence badConse; // Representa el mal rollo del monstruo.
    private Prize price; //Representa el buen rollo del monstruo.
    private int levelChangeAgainstCultistPlayer = 0 ;

    public Monster(String name, int level, BadConsequence bc, Prize price){
    
        this.name = name;
        combatLevel = level;
        badConse = bc;
        this.price = price;        
        
    }
     
    public Monster(String name, int level, BadConsequence bc, Prize price, int IC){
    
        this.name = name;
        combatLevel = level;
        badConse = bc;
        this.price = price;  
        this.levelChangeAgainstCultistPlayer = IC;
        
    }
     
             
    public String getName() {
        return name;
    }

    public int getCombatLevel() {
        return combatLevel;
    }
    
    public BadConsequence getBadConsequence() {
        return badConse;
    }
    
    public int getLevelsGained() {
        return price.getLevel();
    }
    
    public int getTreasuresGained(){
        return price.getTreasures();
    }
    
    public Prize getPrize(){
        return price;
    }
    
    public int getCombatLevelAgainstCultistPlayer(){
        int valor ;
        valor = this.getCombatLevel() + this.levelChangeAgainstCultistPlayer;
        return valor;
    }
    
    
    @Override
     public String toString(){
          
        String solucion = "Name = " + name + " | CombatLevel = " + Integer.toString(combatLevel) 
                + "\nBad Consequence = " + badConse.toString() + "\nPrice : " + price.toString() + "\n";
        return solucion ;
        
      }
     
     
   
    
}
