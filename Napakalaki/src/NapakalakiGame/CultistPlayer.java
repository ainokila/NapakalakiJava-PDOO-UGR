/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

/**
 *
 * @author ainokila
 */
public class CultistPlayer extends Player{
    private static int totaCultistPlayers = 0;
    private Cultist myCultistCard ;
       
    public CultistPlayer(Player p ,Cultist c){
        super(p);
        this.myCultistCard = c;
    }
    
    @Override
    protected int getCombatLevel(){
        int sol ;
        
        sol = super.getCombatLevel() ;
        sol = sol * 120;
        sol = sol / 100;
        sol = sol + (myCultistCard.getGainedLevels()*totaCultistPlayers);
        return sol;
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        return m.getCombatLevelAgainstCultistPlayer();
    }
   
    @Override
    protected boolean shouldConvert(){
        return false;
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
        return totaCultistPlayers;
    }
    
}
