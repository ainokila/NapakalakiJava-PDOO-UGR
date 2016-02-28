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

/**
 *
 * @author  Jorge G. y Cristian V.
 */
public class Monster {
    private String direcionImagen;
    private String name; //Nombre del monstruo.
    private int combatLevel; //Nivel del monstruo.
    private BadConsequence badConse; // Representa el mal rollo del monstruo.
    private Prize price; //Representa el buen rollo del monstruo.
    private int levelChangeAgainstCultistPlayer = 0 ;

    public Monster(String name, int level, BadConsequence bc, Prize price,String dire){
        this.direcionImagen = dire;
        this.name = name;
        combatLevel = level;
        badConse = bc;
        this.price = price;        
        
    }
     
    public Monster(String name, int level, BadConsequence bc, Prize price, int IC,String dire){
        this.direcionImagen = dire;
        this.name = name;
        combatLevel = level;
        badConse = bc;
        this.price = price;  
        this.levelChangeAgainstCultistPlayer = IC;
        
    }
     
    public String getDireccion() {
        return direcionImagen;
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
