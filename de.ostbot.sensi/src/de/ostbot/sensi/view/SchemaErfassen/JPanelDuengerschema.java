package de.ostbot.sensi.view.SchemaErfassen;

public class JPanelDuengerschema extends javax.swing.JPanel {

    public boolean isMontag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxMontag.isSelected();
        return rueckgabe;
    }
    public boolean isDienstag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxDienstag.isSelected();
        return rueckgabe;
    }
    public boolean isMittwoch() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxMittwoch.isSelected();
        return rueckgabe;
    }
    public boolean isDonnerstag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxDonnerstag.isSelected();
        return rueckgabe;
    }
    public boolean isFreitag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxFreitag.isSelected();
        return rueckgabe;
    }
    public boolean isSamstag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxSamstag.isSelected();
        return rueckgabe;
    }
    public boolean isSonntag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxSonntag.isSelected();
        return rueckgabe;
    }
    public double getEisen() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerMagnesium.getValue());
        return rueckgabe;
    }
    public double getFlush() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerFlush.getValue());
        return rueckgabe;
    }
    public double getKalium() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerKalium.getValue());
        return rueckgabe;
    }
    public double getKalzium() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerKalzium.getValue());
        return rueckgabe;
    }
    public double getMagnesium() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerEisen.getValue());
        return rueckgabe;
    }
    public double getPk() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerPk.getValue());
        return rueckgabe;
    }
    public double getPhosphor() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerPhosphor.getValue());
        return rueckgabe;
    }
    public double getRhizotonic() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerRhizotonic.getValue());
        return rueckgabe;
    }
    public double getStart() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerStart.getValue());
        return rueckgabe;
    }
    public double getAccelerator() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerAccelerator.getValue());
        return rueckgabe;
    }
    public double getCannazym() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerCannazym.getValue());
        return rueckgabe;
    }
    public double getStickstoff() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerStickstoff.getValue());
        return rueckgabe;
    }
    public double getTerraFlores() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerTerraFlores.getValue());
        return rueckgabe;
    }
    public double getTerraVega() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerTerraVega.getValue());
        return rueckgabe;
    }
    public double getTraceMix() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerTraceMix.getValue());
        return rueckgabe;
    }
    
    public JPanelDuengerschema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jPanelTerraVega = new javax.swing.JPanel();
        jLabelTerraVega = new javax.swing.JLabel();
        jSpinnerTerraVega = new javax.swing.JSpinner();
        jPanelStickstoff = new javax.swing.JPanel();
        jLabelStickstoff = new javax.swing.JLabel();
        jSpinnerStickstoff = new javax.swing.JSpinner();
        jPanelEisen = new javax.swing.JPanel();
        jLabelEisen = new javax.swing.JLabel();
        jSpinnerEisen = new javax.swing.JSpinner();
        jPanelMagnesium = new javax.swing.JPanel();
        jLabelMagnesium = new javax.swing.JLabel();
        jSpinnerMagnesium = new javax.swing.JSpinner();
        jPanelRhizotonic = new javax.swing.JPanel();
        jLabelRhizotonic = new javax.swing.JLabel();
        jSpinnerRhizotonic = new javax.swing.JSpinner();
        jPanelTerraFlores = new javax.swing.JPanel();
        jLabelTerraFlores = new javax.swing.JLabel();
        jSpinnerTerraFlores = new javax.swing.JSpinner();
        jPanelPhosphor = new javax.swing.JPanel();
        jLabelPhosphor = new javax.swing.JLabel();
        jSpinnerPhosphor = new javax.swing.JSpinner();
        jPanelKalzium = new javax.swing.JPanel();
        jLabelKalzium = new javax.swing.JLabel();
        jSpinnerKalzium = new javax.swing.JSpinner();
        jPanelTraceMix = new javax.swing.JPanel();
        jLabelTraceMix = new javax.swing.JLabel();
        jSpinnerTraceMix = new javax.swing.JSpinner();
        jPanelStart = new javax.swing.JPanel();
        jLabelStart = new javax.swing.JLabel();
        jSpinnerStart = new javax.swing.JSpinner();
        jPanelPk = new javax.swing.JPanel();
        jLabelPK = new javax.swing.JLabel();
        jSpinnerPk = new javax.swing.JSpinner();
        jPanelAccelerator = new javax.swing.JPanel();
        jLabelAccelerator = new javax.swing.JLabel();
        jSpinnerAccelerator = new javax.swing.JSpinner();
        jPanelCannazym = new javax.swing.JPanel();
        jLabelCannazym = new javax.swing.JLabel();
        jSpinnerCannazym = new javax.swing.JSpinner();
        jPanelFlush = new javax.swing.JPanel();
        jLabelFlush = new javax.swing.JLabel();
        jSpinnerFlush = new javax.swing.JSpinner();
        jPanelKalium = new javax.swing.JPanel();
        jLabelKalium = new javax.swing.JLabel();
        jSpinnerKalium = new javax.swing.JSpinner();
        jPanelFree = new javax.swing.JPanel();
        jPanelWochentage = new javax.swing.JPanel();
        jCheckBoxMontag = new javax.swing.JCheckBox();
        jCheckBoxDienstag = new javax.swing.JCheckBox();
        jCheckBoxDonnerstag = new javax.swing.JCheckBox();
        jCheckBoxMittwoch = new javax.swing.JCheckBox();
        jCheckBoxFreitag = new javax.swing.JCheckBox();
        jCheckBoxSamstag = new javax.swing.JCheckBox();
        jCheckBoxSonntag = new javax.swing.JCheckBox();
        jPanelPlatzhalter = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanelHintergrund.setLayout(new java.awt.GridLayout(4, 5, 0, -10));

        jLabelTerraVega.setText("Vegetation:");

        jSpinnerTerraVega.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.10000000000000009d));

        javax.swing.GroupLayout jPanelTerraVegaLayout = new javax.swing.GroupLayout(jPanelTerraVega);
        jPanelTerraVega.setLayout(jPanelTerraVegaLayout);
        jPanelTerraVegaLayout.setHorizontalGroup(
            jPanelTerraVegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerraVegaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTerraVegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTerraVega, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTerraVegaLayout.createSequentialGroup()
                        .addComponent(jSpinnerTerraVega)
                        .addGap(2, 2, 2)))
                .addGap(43, 43, 43))
        );
        jPanelTerraVegaLayout.setVerticalGroup(
            jPanelTerraVegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerraVegaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTerraVega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerTerraVega)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelTerraVega);

        jLabelStickstoff.setText("Stickstoff:");

        jSpinnerStickstoff.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelStickstoffLayout = new javax.swing.GroupLayout(jPanelStickstoff);
        jPanelStickstoff.setLayout(jPanelStickstoffLayout);
        jPanelStickstoffLayout.setHorizontalGroup(
            jPanelStickstoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStickstoffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStickstoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerStickstoff)
                    .addComponent(jLabelStickstoff, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanelStickstoffLayout.setVerticalGroup(
            jPanelStickstoffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStickstoffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStickstoff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerStickstoff)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelStickstoff);

        jLabelEisen.setText("Eisen:");

        jSpinnerEisen.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelEisenLayout = new javax.swing.GroupLayout(jPanelEisen);
        jPanelEisen.setLayout(jPanelEisenLayout);
        jPanelEisenLayout.setHorizontalGroup(
            jPanelEisenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEisenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEisenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEisen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerEisen))
                .addGap(45, 45, 45))
        );
        jPanelEisenLayout.setVerticalGroup(
            jPanelEisenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEisenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEisen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerEisen)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelEisen);

        jLabelMagnesium.setText("Magnesium:");

        jSpinnerMagnesium.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelMagnesiumLayout = new javax.swing.GroupLayout(jPanelMagnesium);
        jPanelMagnesium.setLayout(jPanelMagnesiumLayout);
        jPanelMagnesiumLayout.setHorizontalGroup(
            jPanelMagnesiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMagnesiumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMagnesiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerMagnesium)
                    .addComponent(jLabelMagnesium, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanelMagnesiumLayout.setVerticalGroup(
            jPanelMagnesiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMagnesiumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMagnesium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerMagnesium)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelMagnesium);

        jLabelRhizotonic.setText("Wurzelsaft:");

        jSpinnerRhizotonic.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelRhizotonicLayout = new javax.swing.GroupLayout(jPanelRhizotonic);
        jPanelRhizotonic.setLayout(jPanelRhizotonicLayout);
        jPanelRhizotonicLayout.setHorizontalGroup(
            jPanelRhizotonicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRhizotonicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRhizotonicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerRhizotonic)
                    .addComponent(jLabelRhizotonic, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanelRhizotonicLayout.setVerticalGroup(
            jPanelRhizotonicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRhizotonicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRhizotonic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerRhizotonic)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelRhizotonic);

        jLabelTerraFlores.setText("Frucht:");

        jSpinnerTerraFlores.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelTerraFloresLayout = new javax.swing.GroupLayout(jPanelTerraFlores);
        jPanelTerraFlores.setLayout(jPanelTerraFloresLayout);
        jPanelTerraFloresLayout.setHorizontalGroup(
            jPanelTerraFloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerraFloresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTerraFloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerTerraFlores)
                    .addComponent(jLabelTerraFlores, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanelTerraFloresLayout.setVerticalGroup(
            jPanelTerraFloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerraFloresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTerraFlores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerTerraFlores)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelTerraFlores);

        jLabelPhosphor.setText("Phosphor:");

        jSpinnerPhosphor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelPhosphorLayout = new javax.swing.GroupLayout(jPanelPhosphor);
        jPanelPhosphor.setLayout(jPanelPhosphorLayout);
        jPanelPhosphorLayout.setHorizontalGroup(
            jPanelPhosphorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhosphorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPhosphorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerPhosphor)
                    .addComponent(jLabelPhosphor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanelPhosphorLayout.setVerticalGroup(
            jPanelPhosphorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhosphorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPhosphor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerPhosphor)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelPhosphor);

        jLabelKalzium.setText("Kalzium:");

        jSpinnerKalzium.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelKalziumLayout = new javax.swing.GroupLayout(jPanelKalzium);
        jPanelKalzium.setLayout(jPanelKalziumLayout);
        jPanelKalziumLayout.setHorizontalGroup(
            jPanelKalziumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKalziumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKalziumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerKalzium)
                    .addComponent(jLabelKalzium, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanelKalziumLayout.setVerticalGroup(
            jPanelKalziumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKalziumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKalzium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerKalzium)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelKalzium);

        jLabelTraceMix.setText("ElementMix:");

        jSpinnerTraceMix.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelTraceMixLayout = new javax.swing.GroupLayout(jPanelTraceMix);
        jPanelTraceMix.setLayout(jPanelTraceMixLayout);
        jPanelTraceMixLayout.setHorizontalGroup(
            jPanelTraceMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTraceMixLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTraceMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerTraceMix)
                    .addComponent(jLabelTraceMix, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanelTraceMixLayout.setVerticalGroup(
            jPanelTraceMixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTraceMixLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTraceMix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerTraceMix)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelTraceMix);

        jLabelStart.setText("Start:");

        jSpinnerStart.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelStartLayout = new javax.swing.GroupLayout(jPanelStart);
        jPanelStart.setLayout(jPanelStartLayout);
        jPanelStartLayout.setHorizontalGroup(
            jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerStart)
                    .addComponent(jLabelStart, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanelStartLayout.setVerticalGroup(
            jPanelStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerStart)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelStart);

        jLabelPK.setText("P & K Extra:");

        jSpinnerPk.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelPkLayout = new javax.swing.GroupLayout(jPanelPk);
        jPanelPk.setLayout(jPanelPkLayout);
        jPanelPkLayout.setHorizontalGroup(
            jPanelPkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerPk)
                    .addComponent(jLabelPK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanelPkLayout.setVerticalGroup(
            jPanelPkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerPk)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelPk);

        jLabelAccelerator.setText("Booster:");

        jSpinnerAccelerator.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelAcceleratorLayout = new javax.swing.GroupLayout(jPanelAccelerator);
        jPanelAccelerator.setLayout(jPanelAcceleratorLayout);
        jPanelAcceleratorLayout.setHorizontalGroup(
            jPanelAcceleratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcceleratorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAcceleratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAccelerator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAccelerator))
                .addGap(45, 45, 45))
        );
        jPanelAcceleratorLayout.setVerticalGroup(
            jPanelAcceleratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcceleratorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAccelerator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerAccelerator)
                .addGap(30, 30, 30))
        );

        jPanelHintergrund.add(jPanelAccelerator);

        jLabelCannazym.setText("Enzyme:");

        jSpinnerCannazym.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelCannazymLayout = new javax.swing.GroupLayout(jPanelCannazym);
        jPanelCannazym.setLayout(jPanelCannazymLayout);
        jPanelCannazymLayout.setHorizontalGroup(
            jPanelCannazymLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCannazymLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCannazymLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerCannazym)
                    .addComponent(jLabelCannazym, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanelCannazymLayout.setVerticalGroup(
            jPanelCannazymLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCannazymLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCannazym)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerCannazym)
                .addGap(25, 25, 25))
        );

        jPanelHintergrund.add(jPanelCannazym);

        jLabelFlush.setText("Spülen:");

        jSpinnerFlush.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelFlushLayout = new javax.swing.GroupLayout(jPanelFlush);
        jPanelFlush.setLayout(jPanelFlushLayout);
        jPanelFlushLayout.setHorizontalGroup(
            jPanelFlushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFlushLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFlushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFlush, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerFlush))
                .addGap(45, 45, 45))
        );
        jPanelFlushLayout.setVerticalGroup(
            jPanelFlushLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFlushLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFlush)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerFlush)
                .addGap(25, 25, 25))
        );

        jPanelHintergrund.add(jPanelFlush);

        jLabelKalium.setText("Kalium:");

        jSpinnerKalium.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        javax.swing.GroupLayout jPanelKaliumLayout = new javax.swing.GroupLayout(jPanelKalium);
        jPanelKalium.setLayout(jPanelKaliumLayout);
        jPanelKaliumLayout.setHorizontalGroup(
            jPanelKaliumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKaliumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKaliumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKalium, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerKalium))
                .addGap(43, 43, 43))
        );
        jPanelKaliumLayout.setVerticalGroup(
            jPanelKaliumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKaliumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKalium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerKalium)
                .addGap(25, 25, 25))
        );

        jPanelHintergrund.add(jPanelKalium);

        jPanelFree.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanelFreeLayout = new javax.swing.GroupLayout(jPanelFree);
        jPanelFree.setLayout(jPanelFreeLayout);
        jPanelFreeLayout.setHorizontalGroup(
            jPanelFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        jPanelFreeLayout.setVerticalGroup(
            jPanelFreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        jPanelHintergrund.add(jPanelFree);

        jCheckBoxMontag.setText("MO");

        jCheckBoxDienstag.setText("DI");

        jCheckBoxDonnerstag.setText("DO");

        jCheckBoxMittwoch.setText("MI");

        jCheckBoxFreitag.setText("FR");

        jCheckBoxSamstag.setText("SA");

        jCheckBoxSonntag.setText("SO");

        javax.swing.GroupLayout jPanelWochentageLayout = new javax.swing.GroupLayout(jPanelWochentage);
        jPanelWochentage.setLayout(jPanelWochentageLayout);
        jPanelWochentageLayout.setHorizontalGroup(
            jPanelWochentageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWochentageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxMontag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxDienstag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxDonnerstag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxMittwoch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxFreitag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxSamstag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxSonntag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelWochentageLayout.setVerticalGroup(
            jPanelWochentageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWochentageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWochentageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxDienstag, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jCheckBoxMontag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jCheckBoxDonnerstag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCheckBoxMittwoch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCheckBoxFreitag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCheckBoxSamstag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCheckBoxSonntag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPlatzhalterLayout = new javax.swing.GroupLayout(jPanelPlatzhalter);
        jPanelPlatzhalter.setLayout(jPanelPlatzhalterLayout);
        jPanelPlatzhalterLayout.setHorizontalGroup(
            jPanelPlatzhalterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPlatzhalterLayout.setVerticalGroup(
            jPanelPlatzhalterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelWochentage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHintergrund, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPlatzhalter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelWochentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPlatzhalter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxDienstag;
    private javax.swing.JCheckBox jCheckBoxDonnerstag;
    private javax.swing.JCheckBox jCheckBoxFreitag;
    private javax.swing.JCheckBox jCheckBoxMittwoch;
    private javax.swing.JCheckBox jCheckBoxMontag;
    private javax.swing.JCheckBox jCheckBoxSamstag;
    private javax.swing.JCheckBox jCheckBoxSonntag;
    private javax.swing.JLabel jLabelAccelerator;
    private javax.swing.JLabel jLabelCannazym;
    private javax.swing.JLabel jLabelEisen;
    private javax.swing.JLabel jLabelFlush;
    private javax.swing.JLabel jLabelKalium;
    private javax.swing.JLabel jLabelKalzium;
    private javax.swing.JLabel jLabelMagnesium;
    private javax.swing.JLabel jLabelPK;
    private javax.swing.JLabel jLabelPhosphor;
    private javax.swing.JLabel jLabelRhizotonic;
    private javax.swing.JLabel jLabelStart;
    private javax.swing.JLabel jLabelStickstoff;
    private javax.swing.JLabel jLabelTerraFlores;
    private javax.swing.JLabel jLabelTerraVega;
    private javax.swing.JLabel jLabelTraceMix;
    private javax.swing.JPanel jPanelAccelerator;
    private javax.swing.JPanel jPanelCannazym;
    private javax.swing.JPanel jPanelEisen;
    private javax.swing.JPanel jPanelFlush;
    private javax.swing.JPanel jPanelFree;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JPanel jPanelKalium;
    private javax.swing.JPanel jPanelKalzium;
    private javax.swing.JPanel jPanelMagnesium;
    private javax.swing.JPanel jPanelPhosphor;
    private javax.swing.JPanel jPanelPk;
    private javax.swing.JPanel jPanelPlatzhalter;
    private javax.swing.JPanel jPanelRhizotonic;
    private javax.swing.JPanel jPanelStart;
    private javax.swing.JPanel jPanelStickstoff;
    private javax.swing.JPanel jPanelTerraFlores;
    private javax.swing.JPanel jPanelTerraVega;
    private javax.swing.JPanel jPanelTraceMix;
    private javax.swing.JPanel jPanelWochentage;
    private javax.swing.JSpinner jSpinnerAccelerator;
    private javax.swing.JSpinner jSpinnerCannazym;
    private javax.swing.JSpinner jSpinnerEisen;
    private javax.swing.JSpinner jSpinnerFlush;
    private javax.swing.JSpinner jSpinnerKalium;
    private javax.swing.JSpinner jSpinnerKalzium;
    private javax.swing.JSpinner jSpinnerMagnesium;
    private javax.swing.JSpinner jSpinnerPhosphor;
    private javax.swing.JSpinner jSpinnerPk;
    private javax.swing.JSpinner jSpinnerRhizotonic;
    private javax.swing.JSpinner jSpinnerStart;
    private javax.swing.JSpinner jSpinnerStickstoff;
    private javax.swing.JSpinner jSpinnerTerraFlores;
    private javax.swing.JSpinner jSpinnerTerraVega;
    private javax.swing.JSpinner jSpinnerTraceMix;
    // End of variables declaration//GEN-END:variables
}