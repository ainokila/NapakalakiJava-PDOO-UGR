/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ainokila
 */
public class Napakalaki {
    
    
private Player currentPlayer;
private ArrayList<Player> players;
private CardDealer dealer;
private Monster currentMonster;
private static final Napakalaki instance = new Napakalaki();


private Napakalaki() { 
    
    ArrayList<String> jugadores = new ArrayList();
    jugadores.add("Jugador1");
    jugadores.add("Jugador2");
    jugadores.add("Jugador3");
    
    initPlayers(jugadores);

}
public static Napakalaki getInstance() {
    return instance;
}
        
private void initPlayers(ArrayList<String> names){

   for(String iterador : names){
       players.add(new Player(iterador));
   }
}
private Player nextPlayer(){
        Player aux;
        int posicion;
    if (currentPlayer == null){
          int numeroJugadores = players.size() - 1;
          posicion = (int) Math.random()*numeroJugadores;
          
          aux = players.get(posicion);
    }
    else{
        posicion = players.indexOf(currentPlayer);
        posicion++;
        if(posicion >= players.size()){
                aux = players.get(0);
        }else{
                aux = players.get(posicion);
        }
                
    }
    return aux;
}

private boolean nextTurnAllowed(){
         
    return currentPlayer.validState();
}


private void setEnemies(){
        
    int posAleatorio;
        
    for(Player iterador : players){
        
       posAleatorio = (int) Math.random()*players.size();
       
       while (players.get(posAleatorio) == iterador){
           
           posAleatorio = (int) Math.random()*players.size();
       }
        
       iterador.setEnemyPlayer(players.get(posAleatorio));
    
    }
}

public void initGame(ArrayList<String> player){
    
    initPlayers(player);
    setEnemies();
    dealer.initCards();
    nextTurn();    
}

public boolean nextTurn(){
    
    boolean stateOK = false;
    
   stateOK= nextTurnAllowed();
   
   if(stateOK){
       
       currentMonster = dealer.nextMonster();
       currentPlayer = nextPlayer();
       
       boolean dead = currentPlayer.isDeath();
       
       if(dead){
           currentPlayer.initTreasures();
       }
       
   }
    return stateOK;
}

public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        
      for(Treasure treasure : treasures){
          currentPlayer.discardVisibleTreasure(treasure);
          dealer.giveTreasureBack(treasure);
      }
}

public void discardHiddenTreasures(ArrayList<Treasure> treasures){
    
    for(Treasure treasure : treasures){
          currentPlayer.discardHiddenTreasure(treasure);
          dealer.giveTreasureBack(treasure);
      }
}


public CombatResult developCombat(){
    Monster m = currentMonster;
    CombatResult combatResult = currentPlayer.combat(m);
    
    dealer.giveMonsterBack(m);
    
    return combatResult;  
}

public void makeTreasuresVisible(ArrayList<Treasure> treasures){
    
     for(Treasure t : treasures){
          currentPlayer.makeTreasureVisible(t);
          
    }    
}

public Player getCurrentPlayer(){
    return currentPlayer;

}
public Monster getCurrentMonster(){
       return currentMonster;    
}

public boolean endOfGame(CombatResult result){
        
        boolean resultado=false;
    if(result.toString() == "WINGAME"){
            resultado = true;
    }
    
    return resultado;
 }
    
}
