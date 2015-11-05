/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ainokila
 */
public class CardDealer {
    
    private static final CardDealer instance = new CardDealer();
    private ArrayList<Treasure> unusedTreasures ;
    private ArrayList<Treasure> usedTreasures ;
    private ArrayList<Monster> unusedMonster ;
    private ArrayList<Monster> usedMonster ;
    
    
 public static CardDealer getInstance() {
    return instance;
}
 
 
private CardDealer(){
    
    unusedMonster = new ArrayList();
    usedMonster = new ArrayList();
    unusedTreasures = new ArrayList();
    usedTreasures = new ArrayList();
}
private void initTreasureCardDeck(){
    
        unusedTreasures.add(new Treasure("¡Si mi amo!", 0, 4, 7, TreasureKind.HELMET, "01"));
        unusedTreasures.add(new Treasure("Botas de investigación", 600, 3, 4, TreasureKind.SHOES, "02"));
        unusedTreasures.add(new Treasure("Capucha de Cthulhu", 500, 3, 5, TreasureKind.HELMET, "03"));
        unusedTreasures.add(new Treasure("A prueba de babas", 400, 2, 5, TreasureKind.ARMOR, "04"));
        unusedTreasures.add(new Treasure("Botas de lluvia ácida", 800, 1, 1, TreasureKind.BOTHHANDS, "05"));
        unusedTreasures.add(new Treasure("Casco minero", 400, 2, 4, TreasureKind.HELMET, "06"));
        unusedTreasures.add(new Treasure("Ametralladora Thompson", 600, 4, 8, TreasureKind.BOTHHANDS, "07"));
        unusedTreasures.add(new Treasure("Camiseta de la UGR", 100, 1, 7, TreasureKind.ARMOR, "08"));
        unusedTreasures.add(new Treasure("Clavo de rail ferroviario", 400, 3, 6, TreasureKind.ONEHAND, "09"));
        unusedTreasures.add(new Treasure("Cuchillo de sushi arcano", 300, 2, 3, TreasureKind.ONEHAND, "10"));
        unusedTreasures.add(new Treasure("Fez alópodo", 700, 3, 5, TreasureKind.HELMET, "11"));
        unusedTreasures.add(new Treasure("Hacha prehistórica", 500, 2, 5, TreasureKind.ONEHAND, "12"));
        unusedTreasures.add(new Treasure("El aparato del Pr. Tesla", 900, 4, 8, TreasureKind.ARMOR, "13"));
        unusedTreasures.add(new Treasure("Gaita", 500, 4, 5, TreasureKind.BOTHHANDS, "14"));
        unusedTreasures.add(new Treasure("Insecticida", 300, 2, 3, TreasureKind.ONEHAND, "15"));
        unusedTreasures.add(new Treasure("Escopeta de 3 cañones", 700, 4, 6, TreasureKind.BOTHHANDS, "16"));
        unusedTreasures.add(new Treasure("Garabato Mistico", 300, 2, 2, TreasureKind.ONEHAND, "17"));
        unusedTreasures.add(new Treasure("La fuerza de Mr. T", 1000, 0, 0, TreasureKind.necklace, "18"));
        unusedTreasures.add(new Treasure("La rebeca metálica", 400, 2, 3, TreasureKind.ARMOR, "19"));
        unusedTreasures.add(new Treasure("Mazo de los antiguos", 200, 3, 4, TreasureKind.ONEHAND, "20"));
        unusedTreasures.add(new Treasure("Necro-playboycon", 300, 3, 5, TreasureKind.ONEHAND, "21"));
        unusedTreasures.add(new Treasure("Lanzallamas", 800, 4, 8, TreasureKind.BOTHHANDS, "22"));
        unusedTreasures.add(new Treasure("Necro-comicón", 100, 1, 1, TreasureKind.ONEHAND, "23"));
        unusedTreasures.add(new Treasure("Necronomicón", 800, 5, 7, TreasureKind.BOTHHANDS, "24"));
        unusedTreasures.add(new Treasure("Linterna a 2 manos", 400, 3, 6, TreasureKind.BOTHHANDS, "25"));
        unusedTreasures.add(new Treasure("Necro-gnomicón", 200, 2, 4, TreasureKind.ONEHAND, "26"));
        unusedTreasures.add(new Treasure("Necrotelecom", 300, 2, 3, TreasureKind.HELMET, "27"));
        unusedTreasures.add(new Treasure("Porra preternatural", 200, 2, 3, TreasureKind.ONEHAND, "28"));
        unusedTreasures.add(new Treasure("Tentácula de pega", 200, 0, 1, TreasureKind.HELMET, "29"));
        unusedTreasures.add(new Treasure("Zapato deja-amigos", 500, 0, 1, TreasureKind.SHOES, "30"));
        unusedTreasures.add(new Treasure("Shogulador", 600, 1, 1, TreasureKind.BOTHHANDS, "31"));
        unusedTreasures.add(new Treasure("Varita de atizamiento", 400, 3, 4, TreasureKind.ONEHAND, "32"));
    
}
private void initMonsterCardDeck(){
    
     BadConsequence badConsequence1 = new BadConsequence("Pierdes tu armadura visible y otra oculta.", 0 , new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
              new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
       Prize prize1 = new Prize(2,1);
       unusedMonster.add(new Monster("Byakhees de bonanza", 8, badConsequence1, prize1));
       
       //Monstruo 2******************************************************************
       BadConsequence badConsequence2 = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible.", 0 , new ArrayList(Arrays.asList(TreasureKind.HELMET)),
               new ArrayList(Arrays.asList()) );
       Prize prize2 = new Prize(1,1);
       unusedMonster.add(new Monster("Chibithulhu", 2, badConsequence2, prize2));
       
       //Monstruo 3******************************************************************
       BadConsequence badConsequence3 = new BadConsequence("EL primordial bostezo contagioso. Pierdes el calzado visible.", 0 , new ArrayList(Arrays.asList(TreasureKind.SHOES)), 
               new ArrayList(Arrays.asList()) );
       Prize prize3 = new Prize(1,1);
       unusedMonster.add(new Monster("Chibithulhu", 2, badConsequence3, prize3));
       
       //Monstruo 4******************************************************************
       BadConsequence badConsequence4 = new BadConsequence("Te atrapan para llevarte a la fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible  y 1 mano oculta.",
               0 , new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList(Arrays.asList(TreasureKind.ONEHAND)) );
       Prize prize4 = new Prize(4,1);
       unusedMonster.add(new Monster("Angeles de la noche ibicenca", 14 , badConsequence4, prize4));
       
        //Monstruo 5    ******************************************************************
       BadConsequence badConsequence5 = new BadConsequence("Pierdes todos tus tesoros visibles.", 0 , 5, 0 ); 
       //Como el maximo de tesoros visibles son 5, no puedes perder mas y por ello pongo 5 en el constructor
       Prize prize5 = new Prize(3,1);
       unusedMonster.add(new Monster("El gorron en el umbral", 10 , badConsequence5, prize5));
       
        //Monstruo 6    ******************************************************************
       BadConsequence badConsequence6 = new BadConsequence("Pierdes la armadura visible.", 0 ,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
             new ArrayList(Arrays.asList())); 
       Prize prize6 = new Prize(3,1);
       unusedMonster.add(new Monster("H.P. Munchcraft", 6 , badConsequence6, prize6));
       
       //Monstruo 7    ******************************************************************
       BadConsequence badConsequence7 = new BadConsequence("Sientes bichos bajo la ropa. Descarta tu armadura visibl.e", 0 ,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
               new ArrayList(Arrays.asList())); 
       Prize prize7 = new Prize(1,1);
       unusedMonster.add(new Monster("Bichgooth", 2 , badConsequence7, prize7));
       
       //Monstruo 8    ******************************************************************
       BadConsequence badConsequence8 = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles.",5 ,3, 0 ); 
       Prize prize8 = new Prize(4,2);
       unusedMonster.add(new Monster("El rey de rosa", 13 , badConsequence8, prize8));
       
       //Monstruo 9    ******************************************************************
       BadConsequence badConsequence9 = new BadConsequence("Toses los pulmones y pierdes 2 niveles.",2 ,0, 0 ); 
       Prize prize9 = new Prize(1,1);
       unusedMonster.add(new Monster("Lo que redacta en las tinieblas", 2 , badConsequence9, prize9));
       
       //Monstruo 10    ******************************************************************
       BadConsequence badConsequence10 = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente. Estas muerto." ,true); 
       Prize prize10 = new Prize(2,1);
       unusedMonster.add(new Monster("Los hondos", 2 , badConsequence10, prize10));
       
       //Monstruo 11    ******************************************************************
       BadConsequence badConsequence11 = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos." ,2 ,2 ,0 ); 
       Prize prize11 = new Prize(2,1);
       unusedMonster.add(new Monster("Semillas Cthulhu", 4 , badConsequence11, prize11));
       
       //Monstruo 12    ******************************************************************
       BadConsequence badConsequence12 = new BadConsequence("Te intentas escaquear. Pierdes una mano visible." ,0 ,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)) , 
               new ArrayList(Arrays.asList())); 
       Prize prize12 = new Prize(2,1);
       unusedMonster.add(new Monster("Dameargo",1 , badConsequence12, prize12));
         
       //Monstruo 13    ******************************************************************
       BadConsequence badConsequence13 = new BadConsequence("Da mucho asquito. Pierdes 3 niveles." ,3 ,0 ,0 ); 
       Prize prize13 = new Prize(1,1);
       unusedMonster.add(new Monster("Pollipolipo volante",3 , badConsequence13, prize13));
       
       //Monstruo 14    ******************************************************************
       BadConsequence badConsequence14 = new BadConsequence("No le hace gracia que pronuncien mal su nombre. Estas muerto." ,true ); 
       Prize prize14 = new Prize(3,1);
       unusedMonster.add(new Monster("Yskhtihyssg-Goth",12 , badConsequence14, prize14));
       
       //Monstruo 15    ******************************************************************
       BadConsequence badConsequence15 = new BadConsequence("La familia te atrapa. Estas muerto." ,true ); 
       Prize prize15 = new Prize(4,1);
       unusedMonster.add(new Monster("Familia Feliz",1 , badConsequence15, prize15));
       
       //Monstruo 16    ******************************************************************
       BadConsequence badConsequence16 = new BadConsequence("La quinta directiva te atrapa y te obliga a perder 2 niveles y un tesoro de 2 manos visible." ,2 ,
            new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)), new ArrayList(Arrays.asList())); 
       Prize prize16 = new Prize(2,1);
       unusedMonster.add(new Monster("Robotggoth",8 , badConsequence16, prize16));
       
       //Monstruo 17    ******************************************************************
       BadConsequence badConsequence17 = new BadConsequence("Te asusta en la noche. Pierdes un casco visible" ,0 ,new ArrayList(Arrays.asList(TreasureKind.HELMET)),
               new ArrayList(Arrays.asList())); 
       Prize prize17 = new Prize(1,1);
       unusedMonster.add(new Monster("El espia",5 , badConsequence17, prize17));
       
       //Monstruo 18    ******************************************************************
       BadConsequence badConsequence18 = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles." ,2 ,5, 0); 
       Prize prize18 = new Prize(1,1);
       unusedMonster.add(new Monster("El lenguas" ,20 , badConsequence18, prize18));
       
       //Monstruo 19    ******************************************************************
       BadConsequence badConsequence19 = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 2 niveles y tus tesoros visibles de las manos." ,3 ,
               new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS,TreasureKind.ONEHAND,TreasureKind.ONEHAND)),new ArrayList(Arrays.asList()));
       Prize prize19 = new Prize(1,1);
       unusedMonster.add(new Monster("Bicéfalo" ,20 , badConsequence19, prize19));
    
}
private void shuffleTreasures(){
    Collections.shuffle(unusedTreasures);
    
}
private void shuffleMonsters(){
    Collections.shuffle(unusedMonster);
}

public Treasure nextTreasure(){
    
    if(unusedTreasures.isEmpty()){
        
        for(Treasure treasures : usedTreasures){
            unusedTreasures.add(treasures);
        }
        shuffleTreasures();
        
    }
    
    Treasure auxiliar = this.unusedTreasures.get(0);
    
    usedTreasures.add(auxiliar);
    unusedTreasures.remove(auxiliar);
    
    return auxiliar;
    
}
public Monster nextMonster(){
    
    if(unusedMonster.isEmpty()){
        
        for(Monster monster : usedMonster){
            unusedMonster.add(monster);
        }
        
        shuffleMonsters();
        
    }
    
    Monster auxiliar = this.unusedMonster.get(0);
    
    usedMonster.add(auxiliar);
    unusedMonster.remove(auxiliar);
    
    return auxiliar;
    
}
public void giveTreasureBack(Treasure t){
    this.usedTreasures.add(t);
}
public void giveMonsterBack(Monster m){
    this.usedMonster.add(m);
}
        
public void initCards(){
    this.initTreasureCardDeck();
    this.initMonsterCardDeck();
}
    
}
