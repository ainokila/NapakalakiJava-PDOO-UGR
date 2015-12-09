/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author ainokila
 */
public class SpecificBadConsequence {
    private static final int MAXTREASURES = 10;
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    private String text=""; // Representa lo que dice un Mal Rollo.
    private int levels; //Representa el numero de niveles que se pierden.
}
