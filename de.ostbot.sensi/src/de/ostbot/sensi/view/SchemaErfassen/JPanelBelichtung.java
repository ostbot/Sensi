package de.ostbot.sensi.view.SchemaErfassen;

public class JPanelBelichtung extends javax.swing.JPanel {

    //Getter-Spinner-Fläche
    public double getFlaeche() {
        double rueckgabe;
        rueckgabe = (Double) jSpinnerFlaeche.getValue();
        return rueckgabe;
    }

    //Getter-Spinner-Leistung
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
        jSpinnerLeistung = new javax.swing.JSpinner();
        jLabelWatt = new javax.swing.JLabel();
        jLabelFlaeche = new javax.swing.JLabel();
        jSpinnerFlaeche = new javax.swing.JSpinner();
        jLabelQuadratmeter = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelLeistung.setText("Leistung:");

        jSpinnerLeistung.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));

        jLabelWatt.setText("Watt");

        jLabelFlaeche.setText("Fläche:");

        jSpinnerFlaeche.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.01d));

        jLabelQuadratmeter.setText("m²");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLeistung)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jSpinnerLeistung, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelWatt)))
                .addGap(18, 18, 18)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jSpinnerFlaeche, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelQuadratmeter))
                    .addComponent(jLabelFlaeche))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelFlaeche)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelLeistung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerLeistung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWatt)
                            .addComponent(jSpinnerFlaeche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuadratmeter))
                        .addGap(0, 17, Short.MAX_VALUE))))
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
    private javax.swing.JLabel jLabelQuadratmeter;
    private javax.swing.JLabel jLabelWatt;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSpinner jSpinnerFlaeche;
    private javax.swing.JSpinner jSpinnerLeistung;
    // End of variables declaration//GEN-END:variables
}