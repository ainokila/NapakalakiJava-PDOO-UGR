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
public class Treasure {
    private String dire;
    private String name ;
    private int bonus ;
    private TreasureKind type;
    
    public Treasure(String n, int bonus, TreasureKind t,String direcionImagen){
           name = n;
           this.bonus = bonus;
           type = t;
           this.dire=direcionImagen;
    }
    
    public String getDire(){
        return dire;
    }
        
    public String getName(){
        return name;
    }
    
    public int getBonus(){
        return bonus;
    }
    
    public TreasureKind getType(){
        return type;
    }
    
      @Override
     public String toString(){
          
        String solucion = "Nombre = " + name + " | Bonus = " + Integer.toString(bonus) 
               + " | Tipo = " + type.toString() + "\n";
        return solucion ;
        
      }
}
