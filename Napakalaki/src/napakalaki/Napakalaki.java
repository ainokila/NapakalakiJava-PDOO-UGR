/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<Monster> monstruos = new ArrayList();
        
        //Monstruo 1******************************************************************
       BadConsequence badConsequence1 = new BadConsequence("Pierdes tu armadura visible y otra oculta.", 0 , new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
              new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
       Prize prize1 = new Prize(2,1);
       monstruos.add(new Monster("Byakhees de bonanza", 8, badConsequence1, prize1));
       
       //Monstruo 2******************************************************************
       BadConsequence badConsequence2 = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible.", 0 , new ArrayList(Arrays.asList(TreasureKind.HELMET)),
               new ArrayList(Arrays.asList()) );
       Prize prize2 = new Prize(1,1);
       monstruos.add(new Monster("Chibithulhu", 2, badConsequence2, prize2));
       
       //Monstruo 3******************************************************************
       BadConsequence badConsequence3 = new BadConsequence("EL primordial bostezo contagioso. Pierdes el calzado visible.", 0 , new ArrayList(Arrays.asList(TreasureKind.SHOES)), 
               new ArrayList(Arrays.asList()) );
       Prize prize3 = new Prize(1,1);
       monstruos.add(new Monster("Chibithulhu", 2, badConsequence3, prize3));
       
       //Monstruo 4******************************************************************
       BadConsequence badConsequence4 = new BadConsequence("Te atrapan para llevarte a la fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible  y 1 mano oculta.",
               0 , new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList(Arrays.asList(TreasureKind.ONEHAND)) );
       Prize prize4 = new Prize(4,1);
       monstruos.add(new Monster("Angeles de la noche ibicenca", 14 , badConsequence4, prize4));
       
        //Monstruo 5    ******************************************************************
       BadConsequence badConsequence5 = new BadConsequence("Pierdes todos tus tesoros visibles.", 0 , 5, 0 ); 
       //Como el maximo de tesoros visibles son 5, no puedes perder mas y por ello pongo 5 en el constructor
       Prize prize5 = new Prize(3,1);
       monstruos.add(new Monster("El gorron en el umbral", 10 , badConsequence5, prize5));
       
        //Monstruo 6    ******************************************************************
       BadConsequence badConsequence6 = new BadConsequence("Pierdes la armadura visible.", 0 ,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
             new ArrayList(Arrays.asList())); 
       Prize prize6 = new Prize(3,1);
       monstruos.add(new Monster("H.P. Munchcraft", 6 , badConsequence6, prize6));
       
       //Monstruo 7    ******************************************************************
       BadConsequence badConsequence7 = new BadConsequence("Sientes bichos bajo la ropa. Descarta tu armadura visibl.e", 0 ,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
               new ArrayList(Arrays.asList())); 
       Prize prize7 = new Prize(1,1);
       monstruos.add(new Monster("Bichgooth", 2 , badConsequence7, prize7));
       
       //Monstruo 8    ******************************************************************
       BadConsequence badConsequence8 = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles.",5 ,3, 0 ); 
       Prize prize8 = new Prize(4,2);
       monstruos.add(new Monster("El rey de rosa", 13 , badConsequence8, prize8));
       
       //Monstruo 9    ******************************************************************
       BadConsequence badConsequence9 = new BadConsequence("Toses los pulmones y pierdes 2 niveles.",2 ,0, 0 ); 
       Prize prize9 = new Prize(1,1);
       monstruos.add(new Monster("Lo que redacta en las tinieblas", 2 , badConsequence9, prize9));
       
       //Monstruo 10    ******************************************************************
       BadConsequence badConsequence10 = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto." ,true); 
       Prize prize10 = new Prize(2,1);
       monstruos.add(new Monster("Los hondos", 2 , badConsequence10, prize10));
       
       //Monstruo 11    ******************************************************************
       BadConsequence badConsequence11 = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos." ,2 ,2 ,0 ); 
       Prize prize11 = new Prize(2,1);
       monstruos.add(new Monster("Semillas Cthulhu", 4 , badConsequence11, prize11));
       
       //Monstruo 12    ******************************************************************
       BadConsequence badConsequence12 = new BadConsequence("Te intentas escaquear. Pierdes una mano visible." ,0 ,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)) , 
               new ArrayList(Arrays.asList())); 
       Prize prize12 = new Prize(2,1);
       monstruos.add(new Monster("Dameargo",1 , badConsequence12, prize12));
         
       //Monstruo 13    ******************************************************************
       BadConsequence badConsequence13 = new BadConsequence("Da mucho asquito. Pierdes 3 niveles." ,3 ,0 ,0 ); 
       Prize prize13 = new Prize(1,1);
       monstruos.add(new Monster("Pollipolipo volante",3 , badConsequence13, prize13));
       
       //Monstruo 14    ******************************************************************
       BadConsequence badConsequence14 = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto." ,true ); 
       Prize prize14 = new Prize(3,1);
       monstruos.add(new Monster("Yskhtihyssg-Goth",12 , badConsequence14, prize14));
       
       //Monstruo 15    ******************************************************************
       BadConsequence badConsequence15 = new BadConsequence("La familia te atrapa. Estas muerto." ,true ); 
       Prize prize15 = new Prize(4,1);
       monstruos.add(new Monster("Familia Feliz",1 , badConsequence15, prize15));
       
       //Monstruo 16    ******************************************************************
       BadConsequence badConsequence16 = new BadConsequence("La quinta directiva te atrapa y te obliga a perder 2 niveles y un tesoro de 2 manos visible." ,2 ,
            new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)), new ArrayList(Arrays.asList())); 
       Prize prize16 = new Prize(2,1);
       monstruos.add(new Monster("Robotggoth",8 , badConsequence16, prize16));
       
       //Monstruo 17    ******************************************************************
       BadConsequence badConsequence17 = new BadConsequence("Te asusta en la noche. Pierdes un casco visible" ,0 ,new ArrayList(Arrays.asList(TreasureKind.HELMET)),
               new ArrayList(Arrays.asList())); 
       Prize prize17 = new Prize(1,1);
       monstruos.add(new Monster("El espia",5 , badConsequence17, prize17));
       
       //Monstruo 18    ******************************************************************
       BadConsequence badConsequence18 = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles." ,2 ,5, 0); 
       Prize prize18 = new Prize(1,1);
       monstruos.add(new Monster("El lenguas" ,20 , badConsequence18, prize18));
       
       //Monstruo 19    ******************************************************************
       BadConsequence badConsequence19 = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 2 niveles y tus tesoros visibles de las manos." ,3 ,
               new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS,TreasureKind.ONEHAND,TreasureKind.ONEHAND)),new ArrayList(Arrays.asList()));
       Prize prize19 = new Prize(1,1);
       monstruos.add(new Monster("Bicéfalo" ,20 , badConsequence19, prize19));
       
       
         
       
        
        
      }
    
}
