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
        jSpinnerLuftfeuchtigkeitAmTag = new javax.swing.JSpinner();
        jPanelTemperaturAmTag = new javax.swing.JPanel();
        jLabelTemperaturAmTag = new javax.swing.JLabel();
        jPanelLuftfeuchtigkeitAmTag = new javax.swing.JPanel();
        jLabelLuftfeuchtigkeitAmTag = new javax.swing.JLabel();
        jSpinnerTemperaturAmTag = new javax.swing.JSpinner();
        jPanelInDerNacht = new javax.swing.JPanel();
        jSpinnerTemperaturInDerNacht = new javax.swing.JSpinner();
        jSpinnerLuftfeuchtigkeitInDerNacht = new javax.swing.JSpinner();
        jPanelTemperaturInDerNacht = new javax.swing.JPanel();
        jLabelTemperaturInDerNacht = new javax.swing.JLabel();
        jPanelLuftfeuchtigkeitInDerNacht = new javax.swing.JPanel();
        jLabelLuftfeuchtigkeitInDerNacht = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanelHintergrund.setLayout(new java.awt.GridLayout(2, 0));

        jSpinnerLuftfeuchtigkeitAmTag.setModel(new javax.swing.SpinnerNumberModel(60, 40, 99, 1));

        jLabelTemperaturAmTag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperaturAmTag.setText("°C tags");

        javax.swing.GroupLayout jPanelTemperaturAmTagLayout = new javax.swing.GroupLayout(jPanelTemperaturAmTag);
        jPanelTemperaturAmTag.setLayout(jPanelTemperaturAmTagLayout);
        jPanelTemperaturAmTagLayout.setHorizontalGroup(
            jPanelTemperaturAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemperaturAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTemperaturAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTemperaturAmTagLayout.setVerticalGroup(
            jPanelTemperaturAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemperaturAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTemperaturAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelLuftfeuchtigkeitAmTag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLuftfeuchtigkeitAmTag.setText("% tags");

        javax.swing.GroupLayout jPanelLuftfeuchtigkeitAmTagLayout = new javax.swing.GroupLayout(jPanelLuftfeuchtigkeitAmTag);
        jPanelLuftfeuchtigkeitAmTag.setLayout(jPanelLuftfeuchtigkeitAmTagLayout);
        jPanelLuftfeuchtigkeitAmTagLayout.setHorizontalGroup(
            jPanelLuftfeuchtigkeitAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLuftfeuchtigkeitAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLuftfeuchtigkeitAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLuftfeuchtigkeitAmTagLayout.setVerticalGroup(
            jPanelLuftfeuchtigkeitAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLuftfeuchtigkeitAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLuftfeuchtigkeitAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSpinnerTemperaturAmTag.setModel(new javax.swing.SpinnerNumberModel(20.0d, 0.0d, 40.0d, 0.1d));

        javax.swing.GroupLayout jPanelAmTagLayout = new javax.swing.GroupLayout(jPanelAmTag);
        jPanelAmTag.setLayout(jPanelAmTagLayout);
        jPanelAmTagLayout.setHorizontalGroup(
            jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTemperaturAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerTemperaturAmTag))
                .addGap(18, 18, 18)
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerLuftfeuchtigkeitAmTag)
                    .addComponent(jPanelLuftfeuchtigkeitAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAmTagLayout.setVerticalGroup(
            jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAmTagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerLuftfeuchtigkeitAmTag)
                    .addComponent(jSpinnerTemperaturAmTag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAmTagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLuftfeuchtigkeitAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTemperaturAmTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanelAmTag);

        jSpinnerTemperaturInDerNacht.setModel(new javax.swing.SpinnerNumberModel(20.0d, 0.0d, 40.0d, 0.10000000149011612d));

        jSpinnerLuftfeuchtigkeitInDerNacht.setModel(new javax.swing.SpinnerNumberModel(60, 40, 99, 1));

        jLabelTemperaturInDerNacht.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperaturInDerNacht.setText("°C nachts");

        javax.swing.GroupLayout jPanelTemperaturInDerNachtLayout = new javax.swing.GroupLayout(jPanelTemperaturInDerNacht);
        jPanelTemperaturInDerNacht.setLayout(jPanelTemperaturInDerNachtLayout);
        jPanelTemperaturInDerNachtLayout.setHorizontalGroup(
            jPanelTemperaturInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemperaturInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTemperaturInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTemperaturInDerNachtLayout.setVerticalGroup(
            jPanelTemperaturInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemperaturInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTemperaturInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelLuftfeuchtigkeitInDerNacht.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLuftfeuchtigkeitInDerNacht.setText("% nachts");

        javax.swing.GroupLayout jPanelLuftfeuchtigkeitInDerNachtLayout = new javax.swing.GroupLayout(jPanelLuftfeuchtigkeitInDerNacht);
        jPanelLuftfeuchtigkeitInDerNacht.setLayout(jPanelLuftfeuchtigkeitInDerNachtLayout);
        jPanelLuftfeuchtigkeitInDerNachtLayout.setHorizontalGroup(
            jPanelLuftfeuchtigkeitInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLuftfeuchtigkeitInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLuftfeuchtigkeitInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLuftfeuchtigkeitInDerNachtLayout.setVerticalGroup(
            jPanelLuftfeuchtigkeitInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLuftfeuchtigkeitInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLuftfeuchtigkeitInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelInDerNachtLayout = new javax.swing.GroupLayout(jPanelInDerNacht);
        jPanelInDerNacht.setLayout(jPanelInDerNachtLayout);
        jPanelInDerNachtLayout.setHorizontalGroup(
            jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerTemperaturInDerNacht)
                    .addComponent(jPanelTemperaturInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerLuftfeuchtigkeitInDerNacht)
                    .addComponent(jPanelLuftfeuchtigkeitInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInDerNachtLayout.setVerticalGroup(
            jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInDerNachtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerLuftfeuchtigkeitInDerNacht)
                    .addComponent(jSpinnerTemperaturInDerNacht))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInDerNachtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTemperaturInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLuftfeuchtigkeitInDerNacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanelInDerNacht);

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
    private javax.swing.JLabel jLabelLuftfeuchtigkeitAmTag;
    private javax.swing.JLabel jLabelLuftfeuchtigkeitInDerNacht;
    private javax.swing.JLabel jLabelTemperaturAmTag;
    private javax.swing.JLabel jLabelTemperaturInDerNacht;
    private javax.swing.JPanel jPanelAmTag;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JPanel jPanelInDerNacht;
    private javax.swing.JPanel jPanelLuftfeuchtigkeitAmTag;
    private javax.swing.JPanel jPanelLuftfeuchtigkeitInDerNacht;
    private javax.swing.JPanel jPanelTemperaturAmTag;
    private javax.swing.JPanel jPanelTemperaturInDerNacht;
    private javax.swing.JSpinner jSpinnerLuftfeuchtigkeitAmTag;
    private javax.swing.JSpinner jSpinnerLuftfeuchtigkeitInDerNacht;
    private javax.swing.JSpinner jSpinnerTemperaturAmTag;
    private javax.swing.JSpinner jSpinnerTemperaturInDerNacht;
    // End of variables declaration//GEN-END:variables
}