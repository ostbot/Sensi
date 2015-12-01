package de.ostbot.sensi.view.SorteMitTopfAnlegen;

import de.ostbot.sensi.control.Datenbankoperationen;
import java.util.List;

public class JPanelTopf extends javax.swing.JPanel {

    public String getSubstrat() {
        String rueckgabe;
        rueckgabe = (String)jComboBoxSubstrat.getSelectedItem();
        return rueckgabe;
    }
    public double getTopfgroesse() {
        String rueckgabe;
        rueckgabe = jTextFieldTopfgroesse.getText();
        return Double.parseDouble(rueckgabe.replace(",", "."));
    }
    
    public JPanelTopf() {
        
        initComponents();
        Datenbankoperationen datenbankOperationen = new Datenbankoperationen();
        List<String> substratListe = datenbankOperationen.getSubstrate();
        int laengeSubstraListe = substratListe.size();
        
        jComboBoxSubstrat.removeAllItems();
        for (int i = 0; i < laengeSubstraListe; i++) {
            jComboBoxSubstrat.addItem(substratListe.get(i));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelTopfGroesse = new javax.swing.JLabel();
        jTextFieldTopfgroesse = new javax.swing.JTextField();
        jLabelSubstratArt = new javax.swing.JLabel();
        jComboBoxSubstrat = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelTopfGroesse.setText("Topfgröße in Liter:");

        jLabelSubstratArt.setText("Substrat:");

        jComboBoxSubstrat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTopfGroesse)
                    .addComponent(jTextFieldTopfgroesse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelSubstratArt)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jComboBoxSubstrat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTopfGroesse)
                    .addComponent(jLabelSubstratArt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTopfgroesse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSubstrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSubstrat;
    private javax.swing.JLabel jLabelSubstratArt;
    private javax.swing.JLabel jLabelTopfGroesse;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JTextField jTextFieldTopfgroesse;
    // End of variables declaration//GEN-END:variables
}