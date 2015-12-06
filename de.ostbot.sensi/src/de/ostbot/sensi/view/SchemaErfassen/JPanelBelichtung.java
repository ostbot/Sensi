package de.ostbot.sensi.view.SchemaErfassen;

public class JPanelBelichtung extends javax.swing.JPanel {

    public double getFlaeche() {
        double rueckgabe;
        rueckgabe = (Double) jSpinnerFlaeche.getValue();
        return rueckgabe;
    }
    public int getLeistung() {
        int rueckgabe;
        rueckgabe = (Integer) jSpinnerLeistung.getValue();
        return rueckgabe;
    }

    public JPanelBelichtung() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelLeistung = new javax.swing.JLabel();
        jLabelFlaeche = new javax.swing.JLabel();
        jSpinnerLeistung = new javax.swing.JSpinner();
        jSpinnerFlaeche = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelLeistung.setText("Leistung (in Watt):");

        jLabelFlaeche.setText("Fläche (in m²):");

        jSpinnerLeistung.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jSpinnerFlaeche.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jSpinnerLeistung)
                        .addGap(38, 38, 38)
                        .addComponent(jSpinnerFlaeche)
                        .addGap(26, 26, 26))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelLeistung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFlaeche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLeistung)
                    .addComponent(jLabelFlaeche))
                .addGap(12, 12, 12)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerLeistung)
                    .addComponent(jSpinnerFlaeche))
                .addGap(16, 16, 16))
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
    private javax.swing.JLabel jLabelFlaeche;
    private javax.swing.JLabel jLabelLeistung;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSpinner jSpinnerFlaeche;
    private javax.swing.JSpinner jSpinnerLeistung;
    // End of variables declaration//GEN-END:variables
}