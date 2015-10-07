/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
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

    public Monster(String name, int level, BadConsequence bc, Prize price){
    
        this.name = name;
        combatLevel = level;
        badConse = bc;
        this.price = price;        
        
    }
             
    public String getName() {
        return name;
    }

    public int getCombatLevel() {
        return combatLevel;
    }
    
     public String toString(){
          
        String solucion = "Name = " + name + " combatLevel = " + Integer.toString(combatLevel) 
                + " Bad Consequence = " + badConse.toString() + " Price = " + price.toString() + "\n";
        return solucion ;
        
      }
     
     
   
    
}
