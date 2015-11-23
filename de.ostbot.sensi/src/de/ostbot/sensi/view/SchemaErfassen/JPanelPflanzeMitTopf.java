package de.ostbot.sensi.view.SchemaErfassen;

public class JPanelPflanzeMitTopf extends javax.swing.JPanel {

    public JPanelPflanzeMitTopf() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelPflanzeMitTopfAuswaehlen = new javax.swing.JLabel();
        jComboBoxPflanze = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelPflanzeMitTopfAuswaehlen.setText("Pflanze mit Topf auswählen:");

        jComboBoxPflanze.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPflanze, 0, 180, Short.MAX_VALUE)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelPflanzeMitTopfAuswaehlen)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPflanzeMitTopfAuswaehlen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxPflanze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JComboBox<String> jComboBoxPflanze;
    private javax.swing.JLabel jLabelPflanzeMitTopfAuswaehlen;
    private javax.swing.JPanel jPanelHintergrund;
    // End of variables declaration//GEN-END:variables
}
