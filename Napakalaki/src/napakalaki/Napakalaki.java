/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
import java.util.ArrayList;

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
    
}
private Player nextPlayer(){
    
}
private boolean nextTurnAllowed(){
   
}
private void setEnemies(){
    
}

public CombatResult developCombat(){
    
    
}
public void discardVisibleTreasures(ArrayList<Treasure> treasures){
    
}
public void discardHiddenTreasures(ArrayList<Treasure> treasures){
    
    
}
public void makeTreasuresVisible(ArrayList<Treasure> treasures){
    
}
public void initGame(ArrayList<String> player){
    
}
public Player getCurrentPlayer(){
    return currentPlayer;

}
public Monster getCurrentMonster(){
       return currentMonster;    
}
public boolean nextTurn(){
    
}
public boolean endOfGame(CombatResult result){
    
}
    
}
