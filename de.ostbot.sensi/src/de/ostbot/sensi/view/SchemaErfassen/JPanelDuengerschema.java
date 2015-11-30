package de.ostbot.sensi.view.SchemaErfassen;

import javax.swing.JSpinner;

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
        rueckgabe = (Double)(jSpinnerEisen.getValue());
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
        rueckgabe = (Double)(jSpinnerMagnesium.getValue());
        return rueckgabe;
    }
    public double getPK() {
        double rueckgabe;
        rueckgabe = (Double)(jSpinnerPK.getValue());
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
        jSpinnerAccelerator = new javax.swing.JSpinner();
        jLabelAcceleratorMilliliter = new javax.swing.JLabel();
        jSpinnerRhizotonic = new javax.swing.JSpinner();
        jLabelRhizotonicMilliliter = new javax.swing.JLabel();
        jSpinnerTerraVega = new javax.swing.JSpinner();
        jLabelTerraVegaMilliliter = new javax.swing.JLabel();
        jSpinnerTerraFlores = new javax.swing.JSpinner();
        jLabelTerraFloresMilliliter = new javax.swing.JLabel();
        jSpinnerPK = new javax.swing.JSpinner();
        jLabelPKMilliliter = new javax.swing.JLabel();
        jSpinnerKalzium = new javax.swing.JSpinner();
        jLabelKalziumMilliliter = new javax.swing.JLabel();
        jLabelEisenMilliliter = new javax.swing.JLabel();
        jSpinnerEisen = new javax.swing.JSpinner();
        jSpinnerKalium = new javax.swing.JSpinner();
        jLabelKaliumMilliliter = new javax.swing.JLabel();
        jSpinnerPhosphor = new javax.swing.JSpinner();
        jLabelPhosphorMilliliter = new javax.swing.JLabel();
        jSpinnerStickstoff = new javax.swing.JSpinner();
        jLabelStickstoffMilliliter = new javax.swing.JLabel();
        jSpinnerFlush = new javax.swing.JSpinner();
        jLabelFlushMilliliter = new javax.swing.JLabel();
        jLabelStartMilliliter = new javax.swing.JLabel();
        jSpinnerStart = new javax.swing.JSpinner();
        jSpinnerCannazym = new javax.swing.JSpinner();
        jLabelCannazymMilliliter = new javax.swing.JLabel();
        jSpinnerTraceMix = new javax.swing.JSpinner();
        jLabelTraceMixMilliliter = new javax.swing.JLabel();
        jSpinnerMagnesium = new javax.swing.JSpinner();
        jLabelMagnesiumMilliliter = new javax.swing.JLabel();
        jLabelTerraVega = new javax.swing.JLabel();
        jLabelTerraFlores = new javax.swing.JLabel();
        jLabelPK = new javax.swing.JLabel();
        jLabelAccelerator = new javax.swing.JLabel();
        jLabelRhizotonic = new javax.swing.JLabel();
        jLabelStickstoff = new javax.swing.JLabel();
        jLabelPhosphor = new javax.swing.JLabel();
        jLabelKalium = new javax.swing.JLabel();
        jLabelEisen = new javax.swing.JLabel();
        jLabelKalzium = new javax.swing.JLabel();
        jLabelMagnesium = new javax.swing.JLabel();
        jLabelTraceMix = new javax.swing.JLabel();
        jLabelCannazym = new javax.swing.JLabel();
        jLabelStart = new javax.swing.JLabel();
        jLabelFlush = new javax.swing.JLabel();
        jCheckBoxMontag = new javax.swing.JCheckBox();
        jCheckBoxDienstag = new javax.swing.JCheckBox();
        jCheckBoxMittwoch = new javax.swing.JCheckBox();
        jCheckBoxDonnerstag = new javax.swing.JCheckBox();
        jCheckBoxFreitag = new javax.swing.JCheckBox();
        jCheckBoxSamstag = new javax.swing.JCheckBox();
        jCheckBoxSonntag = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(153, 153, 153));

        jSpinnerAccelerator.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelAcceleratorMilliliter.setText("ml");

        jSpinnerRhizotonic.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelRhizotonicMilliliter.setText("ml");

        jSpinnerTerraVega.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.10000000000000009d));

        jLabelTerraVegaMilliliter.setText("ml");

        jSpinnerTerraFlores.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelTerraFloresMilliliter.setText("ml");

        jSpinnerPK.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelPKMilliliter.setText("ml");

        jSpinnerKalzium.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelKalziumMilliliter.setText("ml");

        jLabelEisenMilliliter.setText("ml");

        jSpinnerEisen.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jSpinnerKalium.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelKaliumMilliliter.setText("ml");

        jSpinnerPhosphor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelPhosphorMilliliter.setText("ml");

        jSpinnerStickstoff.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelStickstoffMilliliter.setText("ml");

        jSpinnerFlush.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelFlushMilliliter.setText("ml");

        jLabelStartMilliliter.setText("ml");

        jSpinnerStart.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jSpinnerCannazym.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelCannazymMilliliter.setText("ml");

        jSpinnerTraceMix.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelTraceMixMilliliter.setText("ml");

        jSpinnerMagnesium.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelMagnesiumMilliliter.setText("ml");

        jLabelTerraVega.setText("Terra Vega:");

        jLabelTerraFlores.setText("Terra Flores:");

        jLabelPK.setText("PK 13/14:");

        jLabelAccelerator.setText("Accelerator:");

        jLabelRhizotonic.setText("Rhizotonic:");

        jLabelStickstoff.setText("Stickstoff:");

        jLabelPhosphor.setText("Phosphor:");

        jLabelKalium.setText("Kalium:");

        jLabelEisen.setText("Eisen:");

        jLabelKalzium.setText("Kalzium:");

        jLabelMagnesium.setText("Magnesium:");

        jLabelTraceMix.setText("Trace Mix:");

        jLabelCannazym.setText("Cannazym:");

        jLabelStart.setText("Start:");

        jLabelFlush.setText("Flush:");

        jCheckBoxMontag.setText("MO");

        jCheckBoxDienstag.setText("DI");

        jCheckBoxMittwoch.setText("MI");

        jCheckBoxDonnerstag.setText("DO");

        jCheckBoxFreitag.setText("FR");

        jCheckBoxSamstag.setText("SA");

        jCheckBoxSonntag.setText("SO");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jCheckBoxMontag, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxDienstag, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxMittwoch, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxDonnerstag, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxFreitag, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxSamstag, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxSonntag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTerraVega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTerraFlores, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabelPK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAccelerator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelRhizotonic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerTerraVega, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTerraVegaMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerTerraFlores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTerraFloresMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerPK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPKMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerAccelerator, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAcceleratorMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerRhizotonic, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRhizotonicMilliliter)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKalium, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStickstoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPhosphor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEisen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelKalzium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerStickstoff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStickstoffMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerPhosphor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPhosphorMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerKalium, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelKaliumMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerEisen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEisenMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerKalzium, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelKalziumMilliliter)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelTraceMix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCannazym, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addComponent(jLabelMagnesium, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFlush, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerMagnesium, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMagnesiumMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerTraceMix, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTraceMixMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerCannazym, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCannazymMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerStart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStartMilliliter))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSpinnerFlush, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFlushMilliliter)))))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerMagnesium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMagnesiumMilliliter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerTraceMix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTraceMixMilliliter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerCannazym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCannazymMilliliter)
                            .addComponent(jLabelCannazym))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStartMilliliter)
                            .addComponent(jLabelStart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerFlush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFlushMilliliter)
                            .addComponent(jLabelFlush)))
                    .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerStickstoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelStickstoffMilliliter)
                                .addComponent(jLabelStickstoff)
                                .addComponent(jLabelMagnesium))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerPhosphor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelPhosphorMilliliter)
                                .addComponent(jLabelTraceMix))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerKalium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelKaliumMilliliter)
                                .addComponent(jLabelKalium))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerEisen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEisenMilliliter)
                                .addComponent(jLabelEisen))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerKalzium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelKalziumMilliliter)
                                .addComponent(jLabelKalzium)))
                        .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerTerraVega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTerraVegaMilliliter)
                                .addComponent(jLabelTerraVega))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerTerraFlores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTerraFloresMilliliter)
                                .addComponent(jLabelTerraFlores)
                                .addComponent(jLabelPhosphor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelPKMilliliter)
                                .addComponent(jLabelPK))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerAccelerator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelAcceleratorMilliliter)
                                .addComponent(jLabelAccelerator))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerRhizotonic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelRhizotonicMilliliter)
                                .addComponent(jLabelRhizotonic)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxMontag)
                    .addComponent(jCheckBoxDienstag)
                    .addComponent(jCheckBoxMittwoch)
                    .addComponent(jCheckBoxDonnerstag)
                    .addComponent(jCheckBoxFreitag)
                    .addComponent(jCheckBoxSamstag)
                    .addComponent(jCheckBoxSonntag))
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
    private javax.swing.JCheckBox jCheckBoxDienstag;
    private javax.swing.JCheckBox jCheckBoxDonnerstag;
    private javax.swing.JCheckBox jCheckBoxFreitag;
    private javax.swing.JCheckBox jCheckBoxMittwoch;
    private javax.swing.JCheckBox jCheckBoxMontag;
    private javax.swing.JCheckBox jCheckBoxSamstag;
    private javax.swing.JCheckBox jCheckBoxSonntag;
    private javax.swing.JLabel jLabelAccelerator;
    private javax.swing.JLabel jLabelAcceleratorMilliliter;
    private javax.swing.JLabel jLabelCannazym;
    private javax.swing.JLabel jLabelCannazymMilliliter;
    private javax.swing.JLabel jLabelEisen;
    private javax.swing.JLabel jLabelEisenMilliliter;
    private javax.swing.JLabel jLabelFlush;
    private javax.swing.JLabel jLabelFlushMilliliter;
    private javax.swing.JLabel jLabelKalium;
    private javax.swing.JLabel jLabelKaliumMilliliter;
    private javax.swing.JLabel jLabelKalzium;
    private javax.swing.JLabel jLabelKalziumMilliliter;
    private javax.swing.JLabel jLabelMagnesium;
    private javax.swing.JLabel jLabelMagnesiumMilliliter;
    private javax.swing.JLabel jLabelPK;
    private javax.swing.JLabel jLabelPKMilliliter;
    private javax.swing.JLabel jLabelPhosphor;
    private javax.swing.JLabel jLabelPhosphorMilliliter;
    private javax.swing.JLabel jLabelRhizotonic;
    private javax.swing.JLabel jLabelRhizotonicMilliliter;
    private javax.swing.JLabel jLabelStart;
    private javax.swing.JLabel jLabelStartMilliliter;
    private javax.swing.JLabel jLabelStickstoff;
    private javax.swing.JLabel jLabelStickstoffMilliliter;
    private javax.swing.JLabel jLabelTerraFlores;
    private javax.swing.JLabel jLabelTerraFloresMilliliter;
    private javax.swing.JLabel jLabelTerraVega;
    private javax.swing.JLabel jLabelTerraVegaMilliliter;
    private javax.swing.JLabel jLabelTraceMix;
    private javax.swing.JLabel jLabelTraceMixMilliliter;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSpinner jSpinnerAccelerator;
    private javax.swing.JSpinner jSpinnerCannazym;
    private javax.swing.JSpinner jSpinnerEisen;
    private javax.swing.JSpinner jSpinnerFlush;
    private javax.swing.JSpinner jSpinnerKalium;
    private javax.swing.JSpinner jSpinnerKalzium;
    private javax.swing.JSpinner jSpinnerMagnesium;
    private javax.swing.JSpinner jSpinnerPK;
    private javax.swing.JSpinner jSpinnerPhosphor;
    private javax.swing.JSpinner jSpinnerRhizotonic;
    private javax.swing.JSpinner jSpinnerStart;
    private javax.swing.JSpinner jSpinnerStickstoff;
    private javax.swing.JSpinner jSpinnerTerraFlores;
    private javax.swing.JSpinner jSpinnerTerraVega;
    private javax.swing.JSpinner jSpinnerTraceMix;
    // End of variables declaration//GEN-END:variables
}