/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author ainokila
 */
public enum CombatResult {
    
    WINGAME, WIN, LOSE;
    
    
    @Override
    public String toString(){
    String solucion ="";
    switch (this) {
        
    
            case WINGAME :  solucion = "WINGAME";
                          break;
            case WIN :  solucion = "WIN";
                          break;
            case LOSE:  solucion = "LOSE";
                          break;
           default: solucion = "Invalid CombatResult";
                     break;
    }
    return solucion;
}
    
}
