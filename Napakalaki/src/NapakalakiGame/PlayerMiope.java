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

/**
 *
 * @author ainokila
 */
public class PlayerMiope extends Player {

    public PlayerMiope(String nombre) {
        super(nombre);
    }
    
    
    /*DUDA 
    @Override
    public void makeTreasureVisible(Treasure t){
      
      boolean canI = canMakeTreasureVisible(t);
      
      if(canI){
          
          visibleTreasures.add(t);
          hiddenTreasures.remove(t);
      }
    }*/
    
    @Override
      public boolean canMakeTreasureVisible(Treasure t){
      
      boolean solucion=true;
      
      if(getVisibleTreasures().size()<4){
          
          TreasureKind elemento = t.getType();
          
          switch (elemento){
              
              case ONEHAND: 

                    
                    if (howManyVisibleTreasures(TreasureKind.BOTHHANDS)>0) {
                        solucion = false;
                    } else {
                        
                        int i = 0;
                        for (Treasure tv : getVisibleTreasures()) {
                            if (tv.getType() == (TreasureKind.ONEHAND)) {
                                i++;
                            }
                        }

                        if (i == 2) {
                            solucion = false;
                        } else {
                            solucion = true;
                        }
                    }
                    break;
               
              case BOTHHANDS:
                  if(howManyVisibleTreasures(TreasureKind.ONEHAND)>0){
                      solucion = false;
                  } else {
                        
                        int j = 0;
                        for (Treasure tv : getVisibleTreasures()) {
                            if (tv.getType() == (TreasureKind.BOTHHANDS)) {
                                j++;
                            }
                        }

                        if (j == 1) {
                            solucion = false;
                        } else {
                            solucion = true;
                        }
                    }
                    break;
                    
                case HELMET:
                    
                  if(howManyVisibleTreasures(TreasureKind.HELMET)<2){
                      solucion = true;
                  }else{
                      solucion = false;
                  }
                    break;

                default: 
                    solucion = howManyVisibleTreasures(elemento)==0;
                    break;
                        
          }
    
      }else{
          solucion = false;
      }
      
      
      return solucion;
  }
    @Override 
    public boolean SubirNivel(Treasure visible, Treasure oculto){
      boolean subida = false;
      
      if(visible.getType() !=  TreasureKind.HELMET && oculto.getType() !=  TreasureKind.HELMET  && level+2 < 10){
          subida=true;
          
          this.discardVisibleTreasure(visible);
          this.discardHiddenTreasure(oculto);
          level = level +2;
          subidaRealizada=true;
      }
      
      
      return subida;
  }
    
  @Override
   protected boolean shouldConvert(){
     return false;
   }
   
   @Override
    protected int getCombatLevel(){
        int combatLevel = getLevelTreasures();
        if(howManyVisibleTreasures(TreasureKind.HELMET)==1 && howManyHiddenTreasures(TreasureKind.HELMET)==1 ){
            combatLevel = combatLevel + level;
        }else if(combatLevel==7) {
            combatLevel=1;
        }else{
            combatLevel = combatLevel + level;
        }
     
    return combatLevel;
     }
    
    
    
}
