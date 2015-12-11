package de.ostbot.sensi.view.DefiziteDefinieren;

public class JPanelMakroelemente extends javax.swing.JPanel {

    public int getStickstoff() {
        int rueckgabe;
        rueckgabe = Integer.parseInt(jLabelStickstoffAnzeige.getText());
        return rueckgabe;
    }
    public int getPhosphor() {
        int rueckgabe;
        rueckgabe = Integer.parseInt(jLabelPhosphorAnzeige.getText());
        return rueckgabe;
    }
    public int getKalium() {
        int rueckgabe;
        rueckgabe = Integer.parseInt(jLabelKaliumAnzeige.getText());
        return rueckgabe;
    }
    public int getKalzium() {
        int rueckgabe;
        rueckgabe = Integer.parseInt(jLabelKalziumAnzeige.getText());
        return rueckgabe;
    }
    public int getSchwefel() {
        int rueckgabe;
        rueckgabe = Integer.parseInt(jLabelSchwefelAnzeige.getText());
        return rueckgabe;
    }
    public int getMagnesium() {
        int rueckgabe;
        rueckgabe = Integer.parseInt(jLabelMagnesiumAnzeige.getText());
        return rueckgabe;
    }

    public JPanelMakroelemente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelStickstoff = new javax.swing.JLabel();
        jSliderStickstoff = new javax.swing.JSlider();
        jLabelStickstoffAnzeige = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelPhosphorAnzeige = new javax.swing.JLabel();
        jSliderPhosphor = new javax.swing.JSlider();
        jLabelPhosphor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSliderKalium = new javax.swing.JSlider();
        jLabelKaliumAnzeige = new javax.swing.JLabel();
        jLabelKalium = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelKalzium = new javax.swing.JLabel();
        jLabelKalziumAnzeige = new javax.swing.JLabel();
        jSliderKalzium = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        jSliderMagnesium = new javax.swing.JSlider();
        jLabelMagnesiumAnzeige = new javax.swing.JLabel();
        jLabelMagnesium = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelSchwefelAnzeige = new javax.swing.JLabel();
        jLabelSchwefel = new javax.swing.JLabel();
        jSliderSchwefel = new javax.swing.JSlider();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanelHintergrund.setLayout(new java.awt.GridLayout(6, 0, 0, -10));

        jLabelStickstoff.setText("Stickstoff:");

        jSliderStickstoff.setMaximum(10);
        jSliderStickstoff.setMinimum(-10);
        jSliderStickstoff.setValue(0);
        jSliderStickstoff.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStickstoffStateChanged(evt);
            }
        });

        jLabelStickstoffAnzeige.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStickstoff)
                .addGap(89, 89, 89)
                .addComponent(jSliderStickstoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStickstoffAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderStickstoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelStickstoff, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStickstoffAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel1);

        jLabelPhosphorAnzeige.setText("0");

        jSliderPhosphor.setMaximum(10);
        jSliderPhosphor.setMinimum(-10);
        jSliderPhosphor.setValue(0);
        jSliderPhosphor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderPhosphorStateChanged(evt);
            }
        });

        jLabelPhosphor.setText("Phosphor:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPhosphor)
                .addGap(89, 89, 89)
                .addComponent(jSliderPhosphor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPhosphorAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPhosphor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhosphorAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderPhosphor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel2);

        jSliderKalium.setMaximum(10);
        jSliderKalium.setMinimum(-10);
        jSliderKalium.setValue(0);
        jSliderKalium.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderKaliumStateChanged(evt);
            }
        });

        jLabelKaliumAnzeige.setText("0");

        jLabelKalium.setText("Kalium:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKalium)
                .addGap(104, 104, 104)
                .addComponent(jSliderKalium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKaliumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderKalium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelKalium, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKaliumAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel3);

        jLabelKalzium.setText("Kalzium:");

        jLabelKalziumAnzeige.setText("0");

        jSliderKalzium.setMaximum(10);
        jSliderKalzium.setMinimum(-10);
        jSliderKalzium.setValue(0);
        jSliderKalzium.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderKalziumStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKalzium)
                .addGap(99, 99, 99)
                .addComponent(jSliderKalzium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKalziumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSliderKalzium, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelKalziumAnzeige, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelKalzium, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel4);

        jSliderMagnesium.setMaximum(10);
        jSliderMagnesium.setMinimum(-10);
        jSliderMagnesium.setValue(0);
        jSliderMagnesium.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderMagnesiumStateChanged(evt);
            }
        });

        jLabelMagnesiumAnzeige.setText("0");

        jLabelMagnesium.setText("Magnesium:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMagnesium)
                .addGap(81, 81, 81)
                .addComponent(jSliderMagnesium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMagnesiumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMagnesium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderMagnesium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMagnesiumAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel5);

        jLabelSchwefelAnzeige.setText("0");

        jLabelSchwefel.setText("Schwefel:");

        jSliderSchwefel.setMaximum(10);
        jSliderSchwefel.setMinimum(-10);
        jSliderSchwefel.setValue(0);
        jSliderSchwefel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderSchwefelStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSchwefel)
                .addGap(91, 91, 91)
                .addComponent(jSliderSchwefel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSchwefelAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderSchwefel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSchwefel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSchwefelAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel6);

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

    private void jSliderStickstoffStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStickstoffStateChanged
        jLabelStickstoffAnzeige.setText(String.valueOf((jSliderStickstoff.getValue())));
    }//GEN-LAST:event_jSliderStickstoffStateChanged

    private void jSliderPhosphorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderPhosphorStateChanged
        jLabelPhosphorAnzeige.setText(String.valueOf((jSliderPhosphor.getValue())));
    }//GEN-LAST:event_jSliderPhosphorStateChanged

    private void jSliderKaliumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderKaliumStateChanged
        jLabelKaliumAnzeige.setText(String.valueOf((jSliderKalium.getValue())));
    }//GEN-LAST:event_jSliderKaliumStateChanged

    private void jSliderKalziumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderKalziumStateChanged
        jLabelKalziumAnzeige.setText(String.valueOf((jSliderKalzium.getValue())));
    }//GEN-LAST:event_jSliderKalziumStateChanged

    private void jSliderMagnesiumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderMagnesiumStateChanged
        jLabelMagnesiumAnzeige.setText(String.valueOf((jSliderMagnesium.getValue())));
    }//GEN-LAST:event_jSliderMagnesiumStateChanged

    private void jSliderSchwefelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderSchwefelStateChanged
        jLabelSchwefelAnzeige.setText(String.valueOf((jSliderSchwefel.getValue())));
    }//GEN-LAST:event_jSliderSchwefelStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelKalium;
    private javax.swing.JLabel jLabelKaliumAnzeige;
    private javax.swing.JLabel jLabelKalzium;
    private javax.swing.JLabel jLabelKalziumAnzeige;
    private javax.swing.JLabel jLabelMagnesium;
    private javax.swing.JLabel jLabelMagnesiumAnzeige;
    private javax.swing.JLabel jLabelPhosphor;
    private javax.swing.JLabel jLabelPhosphorAnzeige;
    private javax.swing.JLabel jLabelSchwefel;
    private javax.swing.JLabel jLabelSchwefelAnzeige;
    private javax.swing.JLabel jLabelStickstoff;
    private javax.swing.JLabel jLabelStickstoffAnzeige;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSlider jSliderKalium;
    private javax.swing.JSlider jSliderKalzium;
    private javax.swing.JSlider jSliderMagnesium;
    private javax.swing.JSlider jSliderPhosphor;
    private javax.swing.JSlider jSliderSchwefel;
    private javax.swing.JSlider jSliderStickstoff;
    // End of variables declaration//GEN-END:variables
}