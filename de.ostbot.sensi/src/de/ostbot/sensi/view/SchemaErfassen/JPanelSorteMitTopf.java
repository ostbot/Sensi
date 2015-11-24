package de.ostbot.sensi.view.SchemaErfassen;

import de.ostbot.sensi.control.Datenbankoperationen;
import java.util.ArrayList;
import java.util.List;

public class JPanelSorteMitTopf extends javax.swing.JPanel {

    public String getjComboBoxPflanze() {
        String rueckgabe;
        rueckgabe = (String)jComboBoxSorte.getSelectedItem();
        return rueckgabe;
    }
    
    public JPanelSorteMitTopf() {
        
        initComponents();
        int laengeSortenListe, laengeTopfgroessenListe;
        Datenbankoperationen datenbankOperationen;
        List<String> sortenListe;
        List<String> topfgroessenListe;
        
        datenbankOperationen = new Datenbankoperationen();
        sortenListe = new ArrayList();
        topfgroessenListe = new ArrayList();
        
        laengeSortenListe = datenbankOperationen.getSorten().size();
        laengeTopfgroessenListe = datenbankOperationen.getTopfgroessen().size();
        sortenListe = datenbankOperationen.getSorten();
        topfgroessenListe = datenbankOperationen.getTopfgroessen();
        
        jComboBoxSorte.removeAllItems();
        jComboBoxTopf.removeAllItems();
        
        for (int i = 0; i < laengeSortenListe; i++) {
            jComboBoxSorte.addItem(sortenListe.get(i));
        } 
        for (int i = 0; i < laengeTopfgroessenListe; i++) {
            jComboBoxTopf.addItem(topfgroessenListe.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelPflanzeMitTopfAuswaehlen = new javax.swing.JLabel();
        jComboBoxSorte = new javax.swing.JComboBox<>();
        jComboBoxTopf = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelPflanzeMitTopfAuswaehlen.setText("Sorte mit Topf auswählen:");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jComboBoxSorte, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTopf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPflanzeMitTopfAuswaehlen))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPflanzeMitTopfAuswaehlen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTopf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSorte;
    private javax.swing.JComboBox<String> jComboBoxTopf;
    private javax.swing.JLabel jLabelPflanzeMitTopfAuswaehlen;
    private javax.swing.JPanel jPanelHintergrund;
    // End of variables declaration//GEN-END:variables
}
