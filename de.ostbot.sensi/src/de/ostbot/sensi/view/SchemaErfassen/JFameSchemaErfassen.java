package de.ostbot.sensi.view.SchemaErfassen;

import de.ostbot.sensi.control.Datenbankoperationen;
import de.ostbot.sensi.model.Schema;

public class JFameSchemaErfassen extends javax.swing.JFrame {

    public JFameSchemaErfassen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jPanelSorteMitTopf = new de.ostbot.sensi.view.SchemaErfassen.JPanelSorteMitTopf();
        jPanelBelichtung = new de.ostbot.sensi.view.SchemaErfassen.JPanelBelichtung();
        jPanelZyklus = new de.ostbot.sensi.view.SchemaErfassen.JPanelZyklus();
        jPanelDuengerschema = new de.ostbot.sensi.view.SchemaErfassen.JPanelDuengerschema();
        jPanelWasser = new de.ostbot.sensi.view.SchemaErfassen.JPanelWasser();
        jPanelKlima = new de.ostbot.sensi.view.SchemaErfassen.JPanelKlima();
        jButtonDefiziteDefinieren = new javax.swing.JButton();
        jButtonVerlassen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHintergrund.setBackground(new java.awt.Color(204, 204, 204));

        jButtonDefiziteDefinieren.setText("Defizite definieren");
        jButtonDefiziteDefinieren.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDefiziteDefinierenMouseClicked(evt);
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
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jPanelSorteMitTopf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelKlima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jPanelBelichtung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelZyklus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jButtonDefiziteDefinieren, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVerlassen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelDuengerschema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanelWasser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelKlima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSorteMitTopf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBelichtung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelZyklus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelWasser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDuengerschema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDefiziteDefinieren)
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

    private void jButtonDefiziteDefinierenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDefiziteDefinierenMouseClicked
        
        String sorte, substrat, phase;
        int leistung, woche, luftfeuchtigkeitAmTag, luftfeuchtigkeitInDerNacht;
        double topfgroesse, flaeche, pHWert, literProTag, temperaturAmTag, temperaturInderNacht;
        double terraVegaMilliliter, terraFloresMilliliter, monoTracemixMilliliter, 
                  monoStickstoffMilliliter, monoPhosphorMilliliter, monoKaliumMilliliter, 
                  monoMagnesiumMilliliter, monoKalizumMilliliter, monoEisenMilliliter, 
                  startMilliliter, flushMilliliter, acceleratorMilliliter, pkMilliliter, 
                  rhizotonicMilliliter, cannazymMilliliter;
        boolean montag, dienstag, mittwoch, donnerstag, freitag, samstag, sonntag;
        String[] bestandteileTopfgroesseMitSubstrat;
        Schema schemaObject; //Objekt vom Typ 'schema' erstellen
        Datenbankoperationen datenbankOperationen; //Objekt vom Typ 'Datenbankoperationen' erstellen
        
        sorte = jPanelSorteMitTopf.getPflanze();
        bestandteileTopfgroesseMitSubstrat = jPanelSorteMitTopf.getTopfgroesseMitSubstrat().split("L"); //'xy,xyL (substrat)' wird geteilt
        topfgroesse = Double.valueOf(bestandteileTopfgroesseMitSubstrat[0]); //nehme mir 'xy,xy'
        substrat = bestandteileTopfgroesseMitSubstrat[1]; //nehme mir '(substrat)'
        substrat = substrat.replace("(", ""); //entferne '('
        substrat = substrat.replace(")", ""); //entferne ')'
        substrat = substrat.trim(); //entferne alle Leerzeichen (' substrat' -> 'substrat')
        
        temperaturAmTag = Math.round(jPanelKlima.getTemperaturAmTag()*100)/100.0; //gerundet
        temperaturInderNacht = Math.round(jPanelKlima.getTemperaturInDerNacht()*100)/100.0; //gerundet
        luftfeuchtigkeitAmTag = jPanelKlima.getLuftfeuchtigkeitAmTag();
        luftfeuchtigkeitInDerNacht = jPanelKlima.getLuftfeuchtigkeitInDerNacht();
        
        leistung = jPanelBelichtung.getLeistung();
        flaeche = Math.round(jPanelBelichtung.getFlaeche()*100)/100.0; //gerundet
        
        woche = jPanelZyklus.getWoche();
        phase = jPanelZyklus.getPhase();
        
        montag = jPanelDuengerschema.isMontag();
        dienstag = jPanelDuengerschema.isDienstag();
        mittwoch = jPanelDuengerschema.isMittwoch();
        donnerstag = jPanelDuengerschema.isDonnerstag();
        freitag = jPanelDuengerschema.isFreitag();
        samstag = jPanelDuengerschema.isSamstag();
        sonntag = jPanelDuengerschema.isSonntag();
        pHWert = jPanelWasser.getPHWert();
        literProTag = Math.round(jPanelWasser.getLiterProTag()*100)/100.0;
        terraVegaMilliliter = Math.round(jPanelDuengerschema.getTerraVega())/100.0;
        terraFloresMilliliter = Math.round(jPanelDuengerschema.getTerraFlores())/100.0;
        monoTracemixMilliliter = Math.round(jPanelDuengerschema.getTraceMix())/100.0; 
        monoStickstoffMilliliter = Math.round(jPanelDuengerschema.getStickstoff())/100.0;
        monoPhosphorMilliliter = Math.round(jPanelDuengerschema.getPhosphor())/100.0;
        monoKaliumMilliliter = Math.round(jPanelDuengerschema.getKalium())/100.0;
        monoMagnesiumMilliliter = Math.round(jPanelDuengerschema.getMagnesium())/100.0; 
        monoKalizumMilliliter = Math.round(jPanelDuengerschema.getKalzium())/100.0;
        monoEisenMilliliter = Math.round(jPanelDuengerschema.getEisen())/100.0;
        startMilliliter = Math.round(jPanelDuengerschema.getStart())/100.0;
        flushMilliliter = Math.round(jPanelDuengerschema.getFlush())/100.0;
        acceleratorMilliliter = Math.round(jPanelDuengerschema.getAccelerator())/100.0; 
        pkMilliliter = Math.round(jPanelDuengerschema.getPk())/100.0;
        rhizotonicMilliliter = Math.round(jPanelDuengerschema.getRhizotonic())/100.0;
        cannazymMilliliter = Math.round(jPanelDuengerschema.getCannazym())/100.0;
        
        schemaObject  = new Schema(sorte, substrat, phase, leistung, woche, luftfeuchtigkeitAmTag, 
                                   luftfeuchtigkeitInDerNacht, topfgroesse, flaeche, pHWert, literProTag, 
                                   terraVegaMilliliter, terraFloresMilliliter, monoTracemixMilliliter, 
                                   monoStickstoffMilliliter, monoPhosphorMilliliter, monoKaliumMilliliter, 
                                   monoMagnesiumMilliliter, monoKalizumMilliliter, monoEisenMilliliter, 
                                   startMilliliter, flushMilliliter, acceleratorMilliliter, pkMilliliter, 
                                   rhizotonicMilliliter, cannazymMilliliter, temperaturAmTag, 
                                   temperaturInderNacht, montag, dienstag, mittwoch, donnerstag, 
                                   freitag, samstag, sonntag);
        
        datenbankOperationen = new Datenbankoperationen();
        datenbankOperationen.statusInDatenbankAnlegen(schemaObject);
        datenbankOperationen.umgebungInDatenbankAnlegen(schemaObject);
    }//GEN-LAST:event_jButtonDefiziteDefinierenMouseClicked
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
            java.util.logging.Logger.getLogger(JFameSchemaErfassen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFameSchemaErfassen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFameSchemaErfassen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFameSchemaErfassen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFameSchemaErfassen().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDefiziteDefinieren;
    private javax.swing.JButton jButtonVerlassen;
    private de.ostbot.sensi.view.SchemaErfassen.JPanelBelichtung jPanelBelichtung;
    private de.ostbot.sensi.view.SchemaErfassen.JPanelDuengerschema jPanelDuengerschema;
    private javax.swing.JPanel jPanelHintergrund;
    private de.ostbot.sensi.view.SchemaErfassen.JPanelKlima jPanelKlima;
    private de.ostbot.sensi.view.SchemaErfassen.JPanelSorteMitTopf jPanelSorteMitTopf;
    private de.ostbot.sensi.view.SchemaErfassen.JPanelWasser jPanelWasser;
    private de.ostbot.sensi.view.SchemaErfassen.JPanelZyklus jPanelZyklus;
    // End of variables declaration//GEN-END:variables
}