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
import GUI.Dice;


public class CultistPlayer extends Player{
    private static int totalCultistPlayers = 0;
    private Cultist myCultistCard ;
       
    public CultistPlayer(Player p ,Cultist c){
        super(p);
        this.myCultistCard = c;
    }
    
    @Override
    protected int getCombatLevel(){
        int sol ;
        
        sol = super.getCombatLevel() ;
        sol= sol*120;
        sol = sol/100;
        sol = sol + (myCultistCard.getGainedLevels()*totalCultistPlayers);
        return sol;
       
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        int solucion;
       
        solucion = m.getCombatLevelAgainstCultistPlayer();
        
        return solucion;
        
    }
   
    @Override
    protected boolean shouldConvert(){
      Dice dice = Dice.getInstance();
      boolean solucion = false;
      int number = dice.nextNumber();
          
      if (number == 1){
          solucion =true;
      }
  
      return solucion;
    }
    
    
    private Treasure giveMeATreasure(){
       Treasure solucion;
       int posAleatorio;
       posAleatorio = (int) (Math.random() * super.getVisibleTreasures().size());
       solucion = super.getVisibleTreasures().get(posAleatorio);
    
       return solucion;
    }
    
    private boolean canYouGiveMeATreasure(){
      boolean solucion = false;
      
      if(super.getVisibleTreasures().size()> 0){
         
          solucion = true;
          
      }
      
      return solucion;
  }
    
    public int getTotalCultistPlayers(){
        return totalCultistPlayers;
    }
    
    @Override    
    public boolean esSectario(){
        return true;
    }
}
