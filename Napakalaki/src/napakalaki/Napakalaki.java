/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author  Jorge G. y Cristian V.
 */
public class Napakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BadConsequence bc = new BadConsequence ("Malo", 5, 5, 5);
        Prize price = new Prize(3,3);
        Monster feo = new Monster("Prueba", 10,  bc, price);
        
        System.out.println(feo.toString());
        
        
      }
    
}
