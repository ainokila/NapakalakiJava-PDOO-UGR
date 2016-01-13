/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        //INICIO EXAMEN
        sol = super.getCombatLevel() ;
        sol = sol + (myCultistCard.getGainedLevels()*totalCultistPlayers);
        return sol;
        //FIN EXAMEN
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        int solucion;
        //INICIO EXAMEN
        solucion = m.getCombatLevelAgainstCultistPlayer()+ totalCultistPlayers;
        //FIN EXAMEN
        return solucion;
        
    }
   
    @Override
    protected boolean shouldConvert(){
      Dice dice = Dice.getInstance();
      boolean solucion = false;
      int number = dice.nextNumber();
      //INICIO EXAMEN
      
      if (number == 3){
          solucion =true;
      }
      //FIN EXAMEN
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
    
}
