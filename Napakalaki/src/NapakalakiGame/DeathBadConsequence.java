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
public class DeathBadConsequence extends NumericBadConsequence {
    
    private boolean death; //Representa un Mal Rollo de tipo Muerte.

    public DeathBadConsequence(String text, int levels,boolean death,int nVisible, int nHidden) {
        super(text, levels,nVisible,nHidden);
        this.death = death;
    }
    
    public boolean isDeath() {
        
        return death;
    }
    
}
