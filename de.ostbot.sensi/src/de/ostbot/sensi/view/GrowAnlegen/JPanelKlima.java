package de.ostbot.sensi.view.GrowAnlegen;

public class JPanelKlima extends javax.swing.JPanel {

    public int getLuftfeuchtigkeitAmTag() {
        int rueckgabe;
        rueckgabe = (Integer)jSpinnerLuftfeuchtigkeitAmTag.getValue();
        return rueckgabe;
    }
    public int getLuftfeuchtigkeitInDerNacht() {
        int rueckgabe;
        rueckgabe = (Integer)jSpinnerLuftfeuchtigkeitInDerNacht.getValue();
        return rueckgabe;
    }
    public double getTemperaturAmTag() {
        double rueckgabe;
        rueckgabe = (Double)jSpinnerTemperaturAmTag.getValue();
        return rueckgabe;
    }
    public double getTemperaturInDerNacht() {
        double rueckgabe;
        rueckgabe = (Double)jSpinnerTemperaturInDerNacht.getValue();
        return rueckgabe;
    }
    
    public JPanelKlima() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelTemperaturAmTag = new javax.swing.JLabel();
        jSpinnerTemperaturAmTag = new javax.swing.JSpinner();
        jLabelCelsiusAmTag = new javax.swing.JLabel();
        jSpinnerLuftfeuchtigkeitAmTag = new javax.swing.JSpinner();
        jLabelProzentAmTag = new javax.swing.JLabel();
        jLabelTemperaturInDerNacht = new javax.swing.JLabel();
        jSpinnerTemperaturInDerNacht = new javax.swing.JSpinner();
        jLabelCelsiusInDerNacht = new javax.swing.JLabel();
        jSpinnerLuftfeuchtigkeitInDerNacht = new javax.swing.JSpinner();
        jLabelProzentInDerNacht = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelTemperaturAmTag.setText("@ Tag");

        jSpinnerTemperaturAmTag.setModel(new javax.swing.SpinnerNumberModel(20.0d, 0.0d, 40.0d, 0.1d));

        jLabelCelsiusAmTag.setText("°C");

        jSpinnerLuftfeuchtigkeitAmTag.setModel(new javax.swing.SpinnerNumberModel(60, 40, 99, 1));

        jLabelProzentAmTag.setText("%");

        jLabelTemperaturInDerNacht.setText("@ Nacht");

        jSpinnerTemperaturInDerNacht.setModel(new javax.swing.SpinnerNumberModel(20.0d, 0.0d, 40.0d, 0.10000000149011612d));

        jLabelCelsiusInDerNacht.setText("°C");

        jSpinnerLuftfeuchtigkeitInDerNacht.setModel(new javax.swing.SpinnerNumberModel(60, 40, 99, 1));

        jLabelProzentInDerNacht.setText("%");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelTemperaturAmTag)
                        .addGap(20, 20, 20)
                        .addComponent(jSpinnerTemperaturAmTag))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelTemperaturInDerNacht)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerTemperaturInDerNacht, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelCelsiusInDerNacht)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerLuftfeuchtigkeitInDerNacht))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelCelsiusAmTag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerLuftfeuchtigkeitAmTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProzentInDerNacht, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProzentAmTag))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerTemperaturAmTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelsiusAmTag)
                    .addComponent(jLabelTemperaturAmTag)
                    .addComponent(jSpinnerLuftfeuchtigkeitAmTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProzentAmTag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperaturInDerNacht)
                    .addComponent(jSpinnerTemperaturInDerNacht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelsiusInDerNacht)
                    .addComponent(jSpinnerLuftfeuchtigkeitInDerNacht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProzentInDerNacht))
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCelsiusAmTag;
    private javax.swing.JLabel jLabelCelsiusInDerNacht;
    private javax.swing.JLabel jLabelProzentAmTag;
    private javax.swing.JLabel jLabelProzentInDerNacht;
    private javax.swing.JLabel jLabelTemperaturAmTag;
    private javax.swing.JLabel jLabelTemperaturInDerNacht;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSpinner jSpinnerLuftfeuchtigkeitAmTag;
    private javax.swing.JSpinner jSpinnerLuftfeuchtigkeitInDerNacht;
    private javax.swing.JSpinner jSpinnerTemperaturAmTag;
    private javax.swing.JSpinner jSpinnerTemperaturInDerNacht;
    // End of variables declaration//GEN-END:variables
}