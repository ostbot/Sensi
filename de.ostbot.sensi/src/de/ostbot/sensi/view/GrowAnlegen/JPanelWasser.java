package de.ostbot.sensi.view.GrowAnlegen;

public class JPanelWasser extends javax.swing.JPanel {

    public double getPHWert() {
        double rueckgabe;
        rueckgabe = Double.parseDouble(jLabelPHWertAnzeige.getText());
        return rueckgabe;
    }
    public double getLiterProTag() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerLiterProTag.getValue());
        return rueckgabe;
    }

    public JPanelWasser() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelPHWert = new javax.swing.JLabel();
        jSliderPHWert = new javax.swing.JSlider();
        jLabelPHWertAnzeige = new javax.swing.JLabel();
        jLabelLiterProTag = new javax.swing.JLabel();
        jSpinnerLiterProTag = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelPHWert.setText("pH-Wert:");

        jSliderPHWert.setMaximum(140);
        jSliderPHWert.setValue(70);
        jSliderPHWert.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderPHWertStateChanged(evt);
            }
        });

        jLabelPHWertAnzeige.setText("7");

        jLabelLiterProTag.setText("Liter pro Tag:");

        jSpinnerLiterProTag.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 99.0d, 0.1d));

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jSliderPHWert, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPHWertAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPHWert)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSpinnerLiterProTag, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelLiterProTag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPHWert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPHWertAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderPHWert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLiterProTag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerLiterProTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSliderPHWertStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderPHWertStateChanged
        jLabelPHWertAnzeige.setText(String.valueOf((jSliderPHWert.getValue())/10.0));
    }//GEN-LAST:event_jSliderPHWertStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLiterProTag;
    private javax.swing.JLabel jLabelPHWert;
    private javax.swing.JLabel jLabelPHWertAnzeige;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSlider jSliderPHWert;
    private javax.swing.JSpinner jSpinnerLiterProTag;
    // End of variables declaration//GEN-END:variables
}