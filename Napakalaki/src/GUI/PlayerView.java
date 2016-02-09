/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.Napakalaki;
import NapakalakiGame.Player;
import NapakalakiGame.Treasure;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author saytes
 */
public class PlayerView extends javax.swing.JPanel {

    /**
     * Creates new form PlayerView
     */
    private Player playerModel;
    private Napakalaki napakalakiModel;
        
    public PlayerView() {
      /*  //Inicio estil 
        try {
            // Set cross-platform Java L&F (also called "Metal")
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } 
        catch (UnsupportedLookAndFeelException e) {
        // handle exception
        }*/
        //Fin inicio estilo
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        dead = new javax.swing.JLabel();
        canISteal = new javax.swing.JLabel();
        hidden = new javax.swing.JLabel();
        enemy = new javax.swing.JLabel();
        sectario = new javax.swing.JLabel();
        visible = new javax.swing.JLabel();
        ocultos = new javax.swing.JPanel();
        visibles = new javax.swing.JPanel();
        steal = new javax.swing.JButton();
        discardTreasures = new javax.swing.JButton();
        discardAll = new javax.swing.JButton();
        makeV = new javax.swing.JButton();
        pendingBadConsequenceView1 = new GUI.PendingBadConsequenceView();
        jLabel1 = new javax.swing.JLabel();

        name.setText("jLabel1");

        level.setText("jLabel1");

        dead.setText("jLabel1");

        canISteal.setText("jLabel1");

        hidden.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        hidden.setText("Tesoros Ocultos");

        enemy.setText("jLabel1");

        sectario.setText("Sectario O No");

        visible.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        visible.setText("Tesoros Visibles");

        ocultos.setBackground(new java.awt.Color(153, 255, 255));
        ocultos.setBorder(new javax.swing.border.MatteBorder(null));

        visibles.setBackground(new java.awt.Color(204, 255, 204));
        visibles.setBorder(new javax.swing.border.MatteBorder(null));

        steal.setText("Steal");
        steal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stealActionPerformed(evt);
            }
        });

        discardTreasures.setText("Discard");
        discardTreasures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardTreasuresActionPerformed(evt);
            }
        });

        discardAll.setText("Discard All");
        discardAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardAllActionPerformed(evt);
            }
        });

        makeV.setText("Make Visible");
        makeV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeVActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setText("Oponente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(canISteal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(enemy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(visible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hidden)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(dead, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(level)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(visibles, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(ocultos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(steal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(discardTreasures)
                        .addGap(35, 35, 35)
                        .addComponent(discardAll)
                        .addGap(46, 46, 46)
                        .addComponent(makeV))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pendingBadConsequenceView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(level)
                    .addComponent(dead))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sectario)
                        .addGap(73, 73, 73)
                        .addComponent(ocultos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visible)
                            .addComponent(hidden))
                        .addGap(29, 29, 29)
                        .addComponent(visibles, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pendingBadConsequenceView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(steal)
                    .addComponent(discardTreasures)
                    .addComponent(discardAll)
                    .addComponent(makeV))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canISteal)
                    .addComponent(enemy)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void makeVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeVActionPerformed
        
        ArrayList<Treasure> selHidden = getSelectedTreasures (visibles);
        napakalakiModel.makeTreasuresVisible (selHidden);
        setPlayer(napakalakiModel.getCurrentPlayer());
        
    }//GEN-LAST:event_makeVActionPerformed

    private void stealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stealActionPerformed
        playerModel.stealTreasure();
        setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_stealActionPerformed

    private void discardTreasuresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardTreasuresActionPerformed
        ArrayList<Treasure> selv = getSelectedTreasures (ocultos);
        ArrayList<Treasure> selh = getSelectedTreasures (visibles);
        napakalakiModel.discardVisibleTreasures(selv);
        napakalakiModel.discardHiddenTreasures(selh);
        setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_discardTreasuresActionPerformed

    private void discardAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardAllActionPerformed
        napakalakiModel.discardHiddenTreasures(playerModel.getHiddenTreasures());
        napakalakiModel.discardVisibleTreasures(playerModel.getVisibleTreasures());
        setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_discardAllActionPerformed

    public void setPlayer(Player p){
        playerModel = p;
        try{
        this.name.setText(p.getName());

        String puedes = "Puedes robar.";
        String muerto = "Estás muerto.";
        
        if (p.isDeath() == false){
           muerto = "Estás vivo";
        }
        if (p.canISteal() == false){
            puedes = "Ya has robado.";
        }
        
        
        this.canISteal.setText(puedes);
        this.dead.setText(muerto);
        this.enemy.setText(p.getEnemy().getName());
        this.level.setText(Integer.toString(p.getLevel()));
            
        this.fillTreasurePanel(ocultos, playerModel.getVisibleTreasures());
        this.fillTreasurePanel(visibles, playerModel.getHiddenTreasures());
        
        pendingBadConsequenceView1.setPending(p.getPendingBadConsequence());
        repaint();
        revalidate();
        
       }catch(Exception e){
            
        }
        
    }
    
    public void setNapakalaki(Napakalaki nuevo){
        napakalakiModel = nuevo;
    }
    
    private ArrayList<Treasure> getSelectedTreasures(JPanel aPanel) {
        // Se recorren los tesoros que contiene el panel,
        //almacenando en un vector aquellos que están seleccionados.
        //Finalmente se devuelve dicho vector.
        TreasureView tv;
        ArrayList<Treasure> output = new ArrayList();
        for (Component c : aPanel.getComponents()) {
        tv = (TreasureView) c;
        if ( tv.isSelected() )
        output.add ( tv.getTreasure() );
        }
        return output;
    }
    
    
    private void fillTreasurePanel (JPanel aPanel, ArrayList<Treasure> aList) {
    // Se elimina la información antigua, si la hubiera
        aPanel.removeAll();
        // Se recorre la lista de tesoros construyendo y añadiendo sus vistas
        //    al panel
        for (Treasure t : aList) {
            TreasureView aTreasureView = new TreasureView();
            aTreasureView.setTreasure (t);
            aTreasureView.setVisible (true);
            aPanel.add (aTreasureView);
        }
        // Se fuerza la actualización visual del panel
        aPanel.repaint();
        aPanel.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel canISteal;
    private javax.swing.JLabel dead;
    private javax.swing.JButton discardAll;
    private javax.swing.JButton discardTreasures;
    private javax.swing.JLabel enemy;
    private javax.swing.JLabel hidden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel level;
    private javax.swing.JButton makeV;
    private javax.swing.JLabel name;
    private javax.swing.JPanel ocultos;
    private GUI.PendingBadConsequenceView pendingBadConsequenceView1;
    private javax.swing.JLabel sectario;
    private javax.swing.JButton steal;
    private javax.swing.JLabel visible;
    private javax.swing.JPanel visibles;
    // End of variables declaration//GEN-END:variables
}
