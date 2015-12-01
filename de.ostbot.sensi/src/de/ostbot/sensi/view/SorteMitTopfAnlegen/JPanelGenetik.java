package de.ostbot.sensi.view.SorteMitTopfAnlegen;

import de.ostbot.sensi.control.Datenbankoperationen;
import java.util.List;

public class JPanelGenetik extends javax.swing.JPanel {

    public String getHerkunftsland() {
        String rueckgabe;
        rueckgabe = (String)jComboBoxHerkunftsland.getSelectedItem();
        return rueckgabe;
    }
    public int getIndica() {
        int rueckgabe;
        rueckgabe = (Integer)jSpinnerIndica.getValue();
        return rueckgabe;
    }
    public int getSativa() {
        int rueckgabe;
        rueckgabe = (Integer)jSpinnerSativa.getValue();
        return rueckgabe;
    }
    public String getSorte() {
        return jTextFieldSorte.getText();
    }
    
    public JPanelGenetik() {
        
        initComponents();
        Datenbankoperationen datenbankOperationen = new Datenbankoperationen();
        List<String> laenderListe = datenbankOperationen.getHerkunftslaender();
        int laengeLaenderListe = laenderListe.size();
        
        jComboBoxHerkunftsland.removeAllItems();
        for (int i = 0; i < laengeLaenderListe; i++) {
            jComboBoxHerkunftsland.addItem(laenderListe.get(i));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelSorte = new javax.swing.JLabel();
        jTextFieldSorte = new javax.swing.JTextField();
        jLabelIndica = new javax.swing.JLabel();
        jSpinnerIndica = new javax.swing.JSpinner();
        jLabelIndicaProzent = new javax.swing.JLabel();
        jLabelSativa = new javax.swing.JLabel();
        jSpinnerSativa = new javax.swing.JSpinner();
        jLabelSativaProzent = new javax.swing.JLabel();
        jLabelHerkunftsland = new javax.swing.JLabel();
        jComboBoxHerkunftsland = new javax.swing.JComboBox<>();
        jPanelFlagge = new javax.swing.JPanel();
        jPanelFenster = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelSorte.setText("Sorte:");

        jLabelIndica.setText("Indica:");

        jSpinnerIndica.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabelIndicaProzent.setText("%");

        jLabelSativa.setText("Sativa:");

        jSpinnerSativa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabelSativaProzent.setText("%");

        jLabelHerkunftsland.setText("Herkunftsland:");

        jPanelFlagge.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanelFlaggeLayout = new javax.swing.GroupLayout(jPanelFlagge);
        jPanelFlagge.setLayout(jPanelFlaggeLayout);
        jPanelFlaggeLayout.setHorizontalGroup(
            jPanelFlaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelFlaggeLayout.setVerticalGroup(
            jPanelFlaggeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelSorte))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelIndica)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerIndica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSativaProzent))
                            .addComponent(jTextFieldSorte, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHerkunftsland)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jLabelSativa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerSativa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelIndicaProzent))
                            .addComponent(jComboBoxHerkunftsland, 0, 115, Short.MAX_VALUE)
                            .addComponent(jPanelFlagge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSorte))
                .addGap(18, 18, 18)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerIndica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIndica)
                    .addComponent(jLabelSativaProzent))
                .addGap(18, 18, 18)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSativa)
                    .addComponent(jSpinnerSativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIndicaProzent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHerkunftsland)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxHerkunftsland, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFlagge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFensterLayout = new javax.swing.GroupLayout(jPanelFenster);
        jPanelFenster.setLayout(jPanelFensterLayout);
        jPanelFensterLayout.setHorizontalGroup(
            jPanelFensterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jPanelFensterLayout.setVerticalGroup(
            jPanelFensterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFenster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFenster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxHerkunftsland;
    private javax.swing.JLabel jLabelHerkunftsland;
    private javax.swing.JLabel jLabelIndica;
    private javax.swing.JLabel jLabelIndicaProzent;
    private javax.swing.JLabel jLabelSativa;
    private javax.swing.JLabel jLabelSativaProzent;
    private javax.swing.JLabel jLabelSorte;
    private javax.swing.JPanel jPanelFenster;
    private javax.swing.JPanel jPanelFlagge;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSpinner jSpinnerIndica;
    private javax.swing.JSpinner jSpinnerSativa;
    private javax.swing.JTextField jTextFieldSorte;
    // End of variables declaration//GEN-END:variables
}