package de.ostbot.sensi.view.DefiziteDefinieren;

import de.ostbot.sensi.control.Datenbankoperationen;
import de.ostbot.sensi.model.Makroelemente;
import de.ostbot.sensi.model.Mikroelemente;
import de.ostbot.sensi.model.Symptome;

public class JFrameDefiziteDefinieren extends javax.swing.JFrame {

    public JFrameDefiziteDefinieren() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jButtonGrowAnlegen = new javax.swing.JButton();
        jButtonVerlassen = new javax.swing.JButton();
        jButtonZuruecksetzen = new javax.swing.JButton();
        jButtonHandbuch = new javax.swing.JButton();
        jPanelMakroelemente = new de.ostbot.sensi.view.DefiziteDefinieren.JPanelMakroelemente();
        jPanelMikroelemente = new de.ostbot.sensi.view.DefiziteDefinieren.JPanelMikroelemente();
        jButton1 = new javax.swing.JButton();
        jPanelSymptome = new de.ostbot.sensi.view.DefiziteDefinieren.JPanelSymptome();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHintergrund.setBackground(new java.awt.Color(204, 204, 204));

        jButtonGrowAnlegen.setText("Grow Anlegen");
        jButtonGrowAnlegen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGrowAnlegenMouseClicked(evt);
            }
        });

        jButtonVerlassen.setText("Verlassen");

        jButtonZuruecksetzen.setText("Zurücksetzen");

        jButtonHandbuch.setText("Handbuch");

        jButton1.setText("Platzhalter");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jButtonGrowAnlegen, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHandbuch, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonZuruecksetzen, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerlassen, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelMakroelemente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelSymptome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelMikroelemente, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jPanelMakroelemente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelSymptome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jPanelMikroelemente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerlassen)
                    .addComponent(jButton1)
                    .addComponent(jButtonZuruecksetzen)
                    .addComponent(jButtonHandbuch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGrowAnlegen))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGrowAnlegenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGrowAnlegenMouseClicked
        Datenbankoperationen datenbankOperationen = new Datenbankoperationen();
        int nMangel, pMangel, kMangel, sMangel, caMangel, mgMangel;
        int borMangel, eisenMangel, kupferMangel, manganMangel, molybdaenMangel, 
            chlorMangel, selenMangel, siliziumMangel, zinkMangel;
        boolean unterwaessert, ueberwaessert, waermeSymptome, kaelteSymptome;
        
        nMangel = jPanelMakroelemente.getStickstoff();
        pMangel = jPanelMakroelemente.getPhosphor();
        kMangel = jPanelMakroelemente.getKalium();
        caMangel = jPanelMakroelemente.getKalzium();
        mgMangel = jPanelMakroelemente.getMagnesium();
        sMangel = jPanelMakroelemente.getSchwefel();
        borMangel = jPanelMikroelemente.getBor();
        eisenMangel = jPanelMikroelemente.getEisen();
        kupferMangel = jPanelMikroelemente.getKupfer();
        manganMangel = jPanelMikroelemente.getMangan();
        molybdaenMangel = jPanelMikroelemente.getMolybdaen();
        chlorMangel = jPanelMikroelemente.getChlor();
        selenMangel = jPanelMikroelemente.getSelen();
        siliziumMangel = jPanelMikroelemente.getSilizium();
        zinkMangel = jPanelMikroelemente.getZink();
        unterwaessert = jPanelSymptome.getUnterwaessert();
        ueberwaessert = jPanelSymptome.getUeberwaessert();
        waermeSymptome = jPanelSymptome.getWaermeSymptome();
        kaelteSymptome = jPanelSymptome.getKaelteSymptome();
        
        Makroelemente makroelementeObject = new Makroelemente(nMangel, pMangel, kMangel, sMangel, caMangel, mgMangel);
        Mikroelemente mikroelementeObject = new Mikroelemente(borMangel, eisenMangel, kupferMangel, manganMangel, molybdaenMangel, chlorMangel, selenMangel, siliziumMangel, zinkMangel);
        Symptome symptomeObject = new Symptome(unterwaessert, ueberwaessert, waermeSymptome, kaelteSymptome);
        
        datenbankOperationen.makroelementeInDatenbankAnlegen(makroelementeObject);
        datenbankOperationen.mikroelementeInDatenbankAnlegen(mikroelementeObject);
        
        //datenbankOperationen.bodenfeuchtigkeitInDatenbankAnlegen(bodenfeuchtigkeitObject);
        //datenbankOperationen.growInDatenbankAnlegen(growObject);
    }//GEN-LAST:event_jButtonGrowAnlegenMouseClicked
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameDefiziteDefinieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDefiziteDefinieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDefiziteDefinieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDefiziteDefinieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameDefiziteDefinieren().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGrowAnlegen;
    private javax.swing.JButton jButtonHandbuch;
    private javax.swing.JButton jButtonVerlassen;
    private javax.swing.JButton jButtonZuruecksetzen;
    private javax.swing.JPanel jPanelHintergrund;
    private de.ostbot.sensi.view.DefiziteDefinieren.JPanelMakroelemente jPanelMakroelemente;
    private de.ostbot.sensi.view.DefiziteDefinieren.JPanelMikroelemente jPanelMikroelemente;
    private de.ostbot.sensi.view.DefiziteDefinieren.JPanelSymptome jPanelSymptome;
    // End of variables declaration//GEN-END:variables
}