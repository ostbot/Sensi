package de.ostbot.sensi.view.SchemaErfassen;

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
        jPanelAmTag = new javax.swing.JPanel();
        jSpinnerTemperaturAmTag = new javax.swing.JSpinner();
        jSpinnerLuftfeuchtigkeitAmTag = new javax.swing.JSpinner();
        jPanelLuftfeuchtigkeitAmTag1 = new de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelLuftfeuchtigkeitAmTag();
        jPanelTemperaturAmTag1 = new de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelTemperaturAmTag();
        jPanelInDerNacht = new javax.swing.JPanel();
        jSpinnerTemperaturInDerNacht = new javax.swing.JSpinner();
        jSpinnerLuftfeuchtigkeitInDerNacht = new javax.swing.JSpinner();
        jPanelTemperaturInDerNacht1 = new de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelTemperaturInDerNacht();
        jPanelLuftfeuchtigkeitInDerNacht2 = new de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelLuftfeuchtigkeitInDerNacht();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanelHintergrund.setLayout(new java.awt.GridLayout(2, 0));

        jSpinnerTemperaturAmTag.setModel(new javax.swing.SpinnerNumberModel(20.0d, 0.0d, 40.0d, 0.1d));

        jSpinnerLuftfeuchtigkeitAmTag.setModel(new javax.swing.SpinnerNumberModel(60, 40, 99, 1));

        javax.swing.GroupLayout jPanelLuftfeuchtigkeitAmTag1Layout = new javax.swing.GroupLayout(jPanelLuftfeuchtigkeitAmTag1);
        jPanelLuftfeuchtigkeitAmTag1.setLayout(jPanelLuftfeuchtigkeitAmTag1Layout);
        jPanelLuftfeuchtigkeitAmTag1Layout.setHorizontalGroup(
            jPanelLuftfeuchtigkeitAmTag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );
        jPanelLuftfeuchtigkeitAmTag1Layout.setVerticalGroup(
            jPanelLuftfeuchtigkeitAmTag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelTemperaturAmTag1Layout = new javax.swing.GroupLayout(jPanelTemperaturAmTag1);
        jPanelTemperaturAmTag1.setLayout(jPanelTemperaturAmTag1Layout);
        jPanelTemperaturAmTag1Layout.setHorizontalGroup(
            jPanelTemperaturAmTag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );
        jPanelTemperaturAmTag1Layout.setVerticalGroup(
            jPanelTemperaturAmTag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelAmTagLayout = new javax.swing.GroupLayout(jPanelAmTag);
        jPanelAmTag.setLayout(jPanelAmTagLayout);
        jPanelAmTagLayout.setHorizontalGroup(
            jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTemperaturAmTag1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerTemperaturAmTag))
                .addGap(18, 18, 18)
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLuftfeuchtigkeitAmTag1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerLuftfeuchtigkeitAmTag))
                .addContainerGap())
        );
        jPanelAmTagLayout.setVerticalGroup(
            jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerTemperaturAmTag)
                    .addComponent(jSpinnerLuftfeuchtigkeitAmTag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLuftfeuchtigkeitAmTag1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTemperaturAmTag1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanelAmTag);

        jSpinnerTemperaturInDerNacht.setModel(new javax.swing.SpinnerNumberModel(20.0d, 0.0d, 40.0d, 0.10000000149011612d));

        jSpinnerLuftfeuchtigkeitInDerNacht.setModel(new javax.swing.SpinnerNumberModel(60, 40, 99, 1));

        javax.swing.GroupLayout jPanelTemperaturInDerNacht1Layout = new javax.swing.GroupLayout(jPanelTemperaturInDerNacht1);
        jPanelTemperaturInDerNacht1.setLayout(jPanelTemperaturInDerNacht1Layout);
        jPanelTemperaturInDerNacht1Layout.setHorizontalGroup(
            jPanelTemperaturInDerNacht1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelTemperaturInDerNacht1Layout.setVerticalGroup(
            jPanelTemperaturInDerNacht1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelLuftfeuchtigkeitInDerNacht2Layout = new javax.swing.GroupLayout(jPanelLuftfeuchtigkeitInDerNacht2);
        jPanelLuftfeuchtigkeitInDerNacht2.setLayout(jPanelLuftfeuchtigkeitInDerNacht2Layout);
        jPanelLuftfeuchtigkeitInDerNacht2Layout.setHorizontalGroup(
            jPanelLuftfeuchtigkeitInDerNacht2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelLuftfeuchtigkeitInDerNacht2Layout.setVerticalGroup(
            jPanelLuftfeuchtigkeitInDerNacht2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelInDerNachtLayout = new javax.swing.GroupLayout(jPanelInDerNacht);
        jPanelInDerNacht.setLayout(jPanelInDerNachtLayout);
        jPanelInDerNachtLayout.setHorizontalGroup(
            jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTemperaturInDerNacht1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerTemperaturInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerLuftfeuchtigkeitInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jPanelLuftfeuchtigkeitInDerNacht2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInDerNachtLayout.setVerticalGroup(
            jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerTemperaturInDerNacht)
                    .addComponent(jSpinnerLuftfeuchtigkeitInDerNacht))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTemperaturInDerNacht1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLuftfeuchtigkeitInDerNacht2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanelInDerNacht);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
    private javax.swing.JPanel jPanelAmTag;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JPanel jPanelInDerNacht;
    private de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelLuftfeuchtigkeitAmTag jPanelLuftfeuchtigkeitAmTag1;
    private de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelLuftfeuchtigkeitInDerNacht jPanelLuftfeuchtigkeitInDerNacht2;
    private de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelTemperaturAmTag jPanelTemperaturAmTag1;
    private de.ostbot.sensi.view.SchemaErfassen.Bilder.JPanelTemperaturInDerNacht jPanelTemperaturInDerNacht1;
    private javax.swing.JSpinner jSpinnerLuftfeuchtigkeitAmTag;
    private javax.swing.JSpinner jSpinnerLuftfeuchtigkeitInDerNacht;
    private javax.swing.JSpinner jSpinnerTemperaturAmTag;
    private javax.swing.JSpinner jSpinnerTemperaturInDerNacht;
    // End of variables declaration//GEN-END:variables
}