/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author jorge
 */
public class Prize {
    
      private int treasure;
      private int level;
      
      public Prize(int treasure, int level){
          this.treasure = treasure;
          this.level = level;
      }
      
      public int getTreasures(){
          return treasure;
      }
    
      public int getLevel(){
          return level;
      }
      
      
}     
        
