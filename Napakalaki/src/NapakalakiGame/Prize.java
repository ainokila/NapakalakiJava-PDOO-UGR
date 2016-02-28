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
 * @author Jorge G. y Cristian V.
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
      @Override
      public String toString(){
          
        String solucion = "Treasures = " + Integer.toString(treasures) + " levels = " + Integer.toString(level);
        return solucion ;
        
      }
      
}     
        
