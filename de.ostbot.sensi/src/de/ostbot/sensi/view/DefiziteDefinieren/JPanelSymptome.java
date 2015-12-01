package de.ostbot.sensi.view.DefiziteDefinieren;

public class JPanelSymptome extends javax.swing.JPanel {

    public boolean getjCheckBoxKaelteSymptome() {
        boolean rueckgabe;
        rueckgabe = (Boolean)jCheckBoxKaelteSymptome.isSelected();
        return rueckgabe;
    }

    public boolean getjCheckBoxUeberwaessert() {
        boolean rueckgabe;
        rueckgabe = (Boolean)jCheckBoxKaelteSymptome.isSelected();
        return rueckgabe;
    }

    public boolean getjCheckBoxUnterwaessert() {
        boolean rueckgabe;
        rueckgabe = (Boolean)jCheckBoxUnterwaessert.isSelected();
        return rueckgabe;
    }

    public boolean getjCheckBoxWaermeSymptome() {
        boolean rueckgabe;
        rueckgabe = (Boolean)jCheckBoxWaermeSymptome.isSelected();
        return rueckgabe;
    }

    public JPanelSymptome() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jCheckBoxWaermeSymptome = new javax.swing.JCheckBox();
        jCheckBoxKaelteSymptome = new javax.swing.JCheckBox();
        jCheckBoxUeberwaessert = new javax.swing.JCheckBox();
        jCheckBoxUnterwaessert = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(153, 153, 153));

        jCheckBoxWaermeSymptome.setText("Wärme-Symptome");

        jCheckBoxKaelteSymptome.setText("Kälte-Symptome");

        jCheckBoxUeberwaessert.setText("Überwässert");

        jCheckBoxUnterwaessert.setText("Unterwässert");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxWaermeSymptome)
                    .addComponent(jCheckBoxUeberwaessert))
                .addGap(75, 75, 75)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxKaelteSymptome)
                    .addComponent(jCheckBoxUnterwaessert))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxWaermeSymptome)
                    .addComponent(jCheckBoxKaelteSymptome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxUeberwaessert)
                    .addComponent(jCheckBoxUnterwaessert))
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
    private javax.swing.JCheckBox jCheckBoxKaelteSymptome;
    private javax.swing.JCheckBox jCheckBoxUeberwaessert;
    private javax.swing.JCheckBox jCheckBoxUnterwaessert;
    private javax.swing.JCheckBox jCheckBoxWaermeSymptome;
    private javax.swing.JPanel jPanelHintergrund;
    // End of variables declaration//GEN-END:variables
}
