package de.ostbot.sensi.view.PflanzeMitTopfAnlegen;

import de.ostbot.sensi.control.Datenbankoperationen;
import de.ostbot.sensi.model.PflanzeMitTopf;

public class JFramePflanzeMitTopfAnlegen extends javax.swing.JFrame {

    public JFramePflanzeMitTopfAnlegen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jButtonSpeichern = new javax.swing.JButton();
        jButtonVerlassen = new javax.swing.JButton();
        jPanelGenetik = new de.ostbot.sensi.view.PflanzeMitTopfAnlegen.JPanelGenetik();
        jPanelTopf = new de.ostbot.sensi.view.PflanzeMitTopfAnlegen.JPanelTopf();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHintergrund.setBackground(new java.awt.Color(204, 204, 204));

        jButtonSpeichern.setText("Speichern");
        jButtonSpeichern.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSpeichernMouseClicked(evt);
            }
        });

        jButtonVerlassen.setText("Verlassen");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGenetik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                            .addComponent(jButtonSpeichern, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVerlassen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanelTopf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGenetik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTopf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSpeichern)
                    .addComponent(jButtonVerlassen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private void jButtonSpeichernMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSpeichernMouseClicked

        String sorte, herkunftsland, substrat;
        int indica, sativa;
        double topfgroesse;
        PflanzeMitTopf pflanzeMitTopf; //Objekt vom Typ 'PflanzeMitTopf' erstellen
        Datenbankoperationen datenbankoperationenObject;

        sorte = jPanelGenetik.getSorte();
        herkunftsland = jPanelGenetik.getHerkunftsland();
        if ((jPanelGenetik.getIndica() + jPanelGenetik.getSativa()) != 100) {
            System.err.println("Falsches Gewicht in der Genetik!");
        } 
        else {
            if (jPanelTopf.getTopfgroesse() > 499.99) {
                System.err.println("Unmögliche Topfgröße!");
            } 
            else {
            indica = jPanelGenetik.getIndica();
            sativa = jPanelGenetik.getSativa();
            substrat = jPanelTopf.getSubstrat();
            topfgroesse = jPanelTopf.getTopfgroesse();
            pflanzeMitTopf = new PflanzeMitTopf(sorte, herkunftsland, indica, sativa, substrat, topfgroesse);

            datenbankoperationenObject = new Datenbankoperationen();
            datenbankoperationenObject.pflanzeMitTopfInDatenbankAnlegen(pflanzeMitTopf);
            }
        }
    }//GEN-LAST:event_jButtonSpeichernMouseClicked
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
            java.util.logging.Logger.getLogger(JFramePflanzeMitTopfAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePflanzeMitTopfAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePflanzeMitTopfAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePflanzeMitTopfAnlegen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFramePflanzeMitTopfAnlegen().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSpeichern;
    private javax.swing.JButton jButtonVerlassen;
    private de.ostbot.sensi.view.PflanzeMitTopfAnlegen.JPanelGenetik jPanelGenetik;
    private javax.swing.JPanel jPanelHintergrund;
    private de.ostbot.sensi.view.PflanzeMitTopfAnlegen.JPanelTopf jPanelTopf;
    // End of variables declaration//GEN-END:variables
}