/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
import java.lang.*;

/**
 *
 * @author jorge
 */
public class Prize {
    
      private int treasures;
      private int level;
      
      public Prize(int treasure, int level){
          
          this.treasures = treasure;
          this.level = level;
      }
      
      public int getTreasures(){
          
          return treasures;
      }
    
      public int getLevel(){
          
          return level;
      }
      
      public String toString(){
          
        String solucion = "Treasures = " + Integer.toString(treasures) + " levels = " + Integer.toString(level);
        return solucion ;
        
      }
      
}     
        
