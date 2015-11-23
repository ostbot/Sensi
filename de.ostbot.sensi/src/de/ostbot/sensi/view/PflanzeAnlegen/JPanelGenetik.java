package de.ostbot.sensi.view.PflanzeAnlegen;

public class JPanelGenetik extends javax.swing.JPanel {

    public JPanelGenetik() {
        initComponents();
    }

    //Getter-Combobox-Herkunftsland
    public String getHerkunftsland() {
        String rueckgabe;
        rueckgabe = (String)jComboBoxHerkunftsland.getSelectedItem();
        return rueckgabe;
    }

    //Getter-Spinner-Indica
    public int getIndica() {
        Integer rueckgabe;
        rueckgabe = (Integer)jSpinnerIndica.getValue();
        return rueckgabe;
    }

    //Getter-Spinner-Sativa
    public int getSativa() {
        Integer rueckgabe;
        rueckgabe = (Integer)jSpinnerSativa.getValue();
        return rueckgabe;
    }

    //Getter-TextField-Sorte
    public String getSorte() {
        return jTextFieldSorte.getText();
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
        jButtonSpeichern = new javax.swing.JButton();
        jButtonVerlassen = new javax.swing.JButton();
        jPanelFenster = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelSorte.setText("Sorte:");

        jLabelIndica.setText("Indica:");

        jLabelIndicaProzent.setText("%");

        jLabelSativa.setText("Sativa:");

        jLabelSativaProzent.setText("%");

        jLabelHerkunftsland.setText("Herkunftsland:");

        jComboBoxHerkunftsland.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonSpeichern.setText("Speichern");

        jButtonVerlassen.setText("Verlassen");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHerkunftsland)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelSativaProzent)
                                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonVerlassen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jButtonSpeichern, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxHerkunftsland, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIndicaProzent)))))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHintergrundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelSativa))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIndica)
                                    .addComponent(jLabelSorte))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerSativa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerIndica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSorte, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSorte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIndica)
                    .addComponent(jSpinnerIndica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIndicaProzent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerSativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSativa)
                    .addComponent(jLabelSativaProzent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHerkunftsland)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxHerkunftsland, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSpeichern)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerlassen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFenster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    private javax.swing.JButton jButtonSpeichern;
    private javax.swing.JButton jButtonVerlassen;
    private javax.swing.JComboBox<String> jComboBoxHerkunftsland;
    private javax.swing.JLabel jLabelHerkunftsland;
    private javax.swing.JLabel jLabelIndica;
    private javax.swing.JLabel jLabelIndicaProzent;
    private javax.swing.JLabel jLabelSativa;
    private javax.swing.JLabel jLabelSativaProzent;
    private javax.swing.JLabel jLabelSorte;
    private javax.swing.JPanel jPanelFenster;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSpinner jSpinnerIndica;
    private javax.swing.JSpinner jSpinnerSativa;
    private javax.swing.JTextField jTextFieldSorte;
    // End of variables declaration//GEN-END:variables
}