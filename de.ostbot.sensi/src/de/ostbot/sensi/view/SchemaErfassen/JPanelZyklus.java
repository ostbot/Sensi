package de.ostbot.sensi.view.SchemaErfassen;

import de.ostbot.sensi.control.Datenbankoperationen;
import java.util.ArrayList;
import java.util.List;

public class JPanelZyklus extends javax.swing.JPanel {

    public int getWoche() {
        int rueckgabe;
        rueckgabe = Integer.valueOf((String)jComboBoxWoche.getSelectedItem());
        return rueckgabe;
    }

    public String getPhase() {
        String rueckgabe;
        rueckgabe = (String)jComboBoxPhase.getSelectedItem();
        return rueckgabe;
    }

    public JPanelZyklus() {
        
        initComponents();
        int laenge;
        Datenbankoperationen datenbankOperationen;
        List<String> phasenListe;
        
        datenbankOperationen = new Datenbankoperationen();
        phasenListe = new ArrayList();
        
        laenge = datenbankOperationen.getPhasen().size();
        phasenListe = datenbankOperationen.getPhasen();
        
        jComboBoxPhase.removeAllItems();
        for (int i = 0; i < laenge; i++) {
            jComboBoxPhase.addItem(phasenListe.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelWoche = new javax.swing.JLabel();
        jComboBoxWoche = new javax.swing.JComboBox<>();
        jLabelPhase = new javax.swing.JLabel();
        jComboBoxPhase = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelWoche.setText("Woche:");

        jComboBoxWoche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", " " }));

        jLabelPhase.setText("Phase:");

        jComboBoxPhase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelWoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxWoche, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelPhase)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBoxPhase, 0, 125, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPhase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelWoche))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPhase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxWoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxPhase;
    private javax.swing.JComboBox<String> jComboBoxWoche;
    private javax.swing.JLabel jLabelPhase;
    private javax.swing.JLabel jLabelWoche;
    private javax.swing.JPanel jPanelHintergrund;
    // End of variables declaration//GEN-END:variables
}
