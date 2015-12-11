package de.ostbot.sensi.view.DefiziteDefinieren;

public class JPanelSymptome extends javax.swing.JPanel {

    public boolean getKaelteSymptome() {
        boolean rueckgabe;
        rueckgabe = (Boolean)jCheckBoxKaelteSymptome.isSelected();
        return rueckgabe;
    }
    public boolean getUeberwaessert() {
        boolean rueckgabe;
        rueckgabe = (Boolean)jCheckBoxKaelteSymptome.isSelected();
        return rueckgabe;
    }
    public boolean getUnterwaessert() {
        boolean rueckgabe;
        rueckgabe = (Boolean)jCheckBoxUnterwaessert.isSelected();
        return rueckgabe;
    }
    public boolean getWaermeSymptome() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanelHintergrund = new javax.swing.JPanel();
        jPanelUeberwaessert = new javax.swing.JPanel();
        jCheckBoxUeberwaessert = new javax.swing.JCheckBox();
        jPanelWaermeSymptome = new javax.swing.JPanel();
        jCheckBoxWaermeSymptome = new javax.swing.JCheckBox();
        jPanelUnterwaessert = new javax.swing.JPanel();
        jCheckBoxUnterwaessert = new javax.swing.JCheckBox();
        jPanelKaelteSymptome = new javax.swing.JPanel();
        jCheckBoxKaelteSymptome = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(153, 153, 153));

        jPanelHintergrund.setLayout(new java.awt.GridLayout(2, 3));

        jCheckBoxUeberwaessert.setText("Überwässert");
        jCheckBoxUeberwaessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUeberwaessertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUeberwaessertLayout = new javax.swing.GroupLayout(jPanelUeberwaessert);
        jPanelUeberwaessert.setLayout(jPanelUeberwaessertLayout);
        jPanelUeberwaessertLayout.setHorizontalGroup(
            jPanelUeberwaessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxUeberwaessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelUeberwaessertLayout.setVerticalGroup(
            jPanelUeberwaessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxUeberwaessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHintergrund.add(jPanelUeberwaessert);

        jCheckBoxWaermeSymptome.setText("Wärme-Symptome");

        javax.swing.GroupLayout jPanelWaermeSymptomeLayout = new javax.swing.GroupLayout(jPanelWaermeSymptome);
        jPanelWaermeSymptome.setLayout(jPanelWaermeSymptomeLayout);
        jPanelWaermeSymptomeLayout.setHorizontalGroup(
            jPanelWaermeSymptomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxWaermeSymptome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelWaermeSymptomeLayout.setVerticalGroup(
            jPanelWaermeSymptomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxWaermeSymptome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHintergrund.add(jPanelWaermeSymptome);

        jCheckBoxUnterwaessert.setText("Unterwässert");

        javax.swing.GroupLayout jPanelUnterwaessertLayout = new javax.swing.GroupLayout(jPanelUnterwaessert);
        jPanelUnterwaessert.setLayout(jPanelUnterwaessertLayout);
        jPanelUnterwaessertLayout.setHorizontalGroup(
            jPanelUnterwaessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxUnterwaessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelUnterwaessertLayout.setVerticalGroup(
            jPanelUnterwaessertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxUnterwaessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHintergrund.add(jPanelUnterwaessert);

        jCheckBoxKaelteSymptome.setText("Kälte-Symptome");

        javax.swing.GroupLayout jPanelKaelteSymptomeLayout = new javax.swing.GroupLayout(jPanelKaelteSymptome);
        jPanelKaelteSymptome.setLayout(jPanelKaelteSymptomeLayout);
        jPanelKaelteSymptomeLayout.setHorizontalGroup(
            jPanelKaelteSymptomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxKaelteSymptome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelKaelteSymptomeLayout.setVerticalGroup(
            jPanelKaelteSymptomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBoxKaelteSymptome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHintergrund.add(jPanelKaelteSymptome);

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
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxUeberwaessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUeberwaessertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUeberwaessertActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxKaelteSymptome;
    private javax.swing.JCheckBox jCheckBoxUeberwaessert;
    private javax.swing.JCheckBox jCheckBoxUnterwaessert;
    private javax.swing.JCheckBox jCheckBoxWaermeSymptome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JPanel jPanelKaelteSymptome;
    private javax.swing.JPanel jPanelUeberwaessert;
    private javax.swing.JPanel jPanelUnterwaessert;
    private javax.swing.JPanel jPanelWaermeSymptome;
    // End of variables declaration//GEN-END:variables
}
