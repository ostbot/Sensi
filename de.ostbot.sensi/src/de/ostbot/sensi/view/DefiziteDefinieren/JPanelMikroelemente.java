package de.ostbot.sensi.view.DefiziteDefinieren;

public class JPanelMikroelemente extends javax.swing.JPanel {

    public int getBor() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderBor.getValue();
        return rueckgabe;
    }
    public int getChlor() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderChlor.getValue();
        return rueckgabe;
    }
    public int getEisen() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderEisen.getValue();
        return rueckgabe;
    }
    public int getKupfer() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderKupfer.getValue();
        return rueckgabe;
    }
    public int getMangan() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderMangan.getValue();
        return rueckgabe;
    }
    public int getMolybdaen() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderMolybdaen.getValue();
        return rueckgabe;
    }
    public int getSelen() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderSelen.getValue();
        return rueckgabe;
    }
    public int getSilizium() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderSilizium.getValue();
        return rueckgabe;
    }
    public int getZink() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderZink.getValue();
        return rueckgabe;
    }
    
    public JPanelMikroelemente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelBor = new javax.swing.JLabel();
        jLabelBorAnzeige = new javax.swing.JLabel();
        jSliderBor = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        jLabelChlor = new javax.swing.JLabel();
        jLabelChlorAnzeige = new javax.swing.JLabel();
        jSliderChlor = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        jLabelEisenAnzeige = new javax.swing.JLabel();
        jLabelEisen = new javax.swing.JLabel();
        jSliderEisen = new javax.swing.JSlider();
        jPanel4 = new javax.swing.JPanel();
        jSliderKupfer = new javax.swing.JSlider();
        jLabelKupfer = new javax.swing.JLabel();
        jLabelKupferAnzeige = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelManganAnzeige = new javax.swing.JLabel();
        jSliderMangan = new javax.swing.JSlider();
        jLabelMangan = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelMolybdaenAnzeige = new javax.swing.JLabel();
        jLabelMolybdaen = new javax.swing.JLabel();
        jSliderMolybdaen = new javax.swing.JSlider();
        jPanel7 = new javax.swing.JPanel();
        jLabelSelenAnzeige = new javax.swing.JLabel();
        jLabelSelen = new javax.swing.JLabel();
        jSliderSelen = new javax.swing.JSlider();
        jPanel8 = new javax.swing.JPanel();
        jLabelSilizium = new javax.swing.JLabel();
        jSliderSilizium = new javax.swing.JSlider();
        jLabelSiliziumAnzeige = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jSliderZink = new javax.swing.JSlider();
        jLabelZinkAnzeige = new javax.swing.JLabel();
        jLabelZink = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanelHintergrund.setLayout(new java.awt.GridLayout(9, 0, 0, -10));

        jLabelBor.setText("Bor");

        jLabelBorAnzeige.setText("0");

        jSliderBor.setMaximum(10);
        jSliderBor.setMinimum(-10);
        jSliderBor.setValue(0);
        jSliderBor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBorStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBor)
                .addGap(108, 108, 108)
                .addComponent(jSliderBor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBorAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderBor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBorAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel1);

        jLabelChlor.setText("Chlor");

        jLabelChlorAnzeige.setText("0");

        jSliderChlor.setMaximum(10);
        jSliderChlor.setMinimum(-10);
        jSliderChlor.setValue(0);
        jSliderChlor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderChlorStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelChlor)
                .addGap(99, 99, 99)
                .addComponent(jSliderChlor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelChlorAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelChlor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderChlor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelChlorAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel2);

        jLabelEisenAnzeige.setText("0");

        jLabelEisen.setText("Eisen");

        jSliderEisen.setMaximum(10);
        jSliderEisen.setMinimum(-10);
        jSliderEisen.setValue(0);
        jSliderEisen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderEisenStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEisen)
                .addGap(99, 99, 99)
                .addComponent(jSliderEisen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEisenAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderEisen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEisen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEisenAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel3);

        jSliderKupfer.setMaximum(10);
        jSliderKupfer.setMinimum(-10);
        jSliderKupfer.setValue(0);
        jSliderKupfer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderKupferStateChanged(evt);
            }
        });

        jLabelKupfer.setText("Kupfer");

        jLabelKupferAnzeige.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKupfer)
                .addGap(92, 92, 92)
                .addComponent(jSliderKupfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKupferAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKupfer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderKupfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelKupferAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel4);

        jLabelManganAnzeige.setText("0");

        jSliderMangan.setMaximum(10);
        jSliderMangan.setMinimum(-10);
        jSliderMangan.setValue(0);
        jSliderMangan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderManganStateChanged(evt);
            }
        });

        jLabelMangan.setText("Mangan");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMangan)
                .addGap(86, 86, 86)
                .addComponent(jSliderMangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelManganAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMangan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderMangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelManganAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel5);

        jLabelMolybdaenAnzeige.setText("0");

        jLabelMolybdaen.setText("Molybdän");

        jSliderMolybdaen.setMaximum(10);
        jSliderMolybdaen.setMinimum(-10);
        jSliderMolybdaen.setValue(0);
        jSliderMolybdaen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderMolybdaenStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMolybdaen)
                .addGap(78, 78, 78)
                .addComponent(jSliderMolybdaen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMolybdaenAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMolybdaen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderMolybdaen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMolybdaenAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel6);

        jLabelSelenAnzeige.setText("0");

        jLabelSelen.setText("Selen");

        jSliderSelen.setMaximum(10);
        jSliderSelen.setMinimum(-10);
        jSliderSelen.setValue(0);
        jSliderSelen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderSelenStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSelen)
                .addGap(98, 98, 98)
                .addComponent(jSliderSelen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSelenAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSelen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderSelen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSelenAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel7);

        jLabelSilizium.setText("Silizium");

        jSliderSilizium.setMaximum(10);
        jSliderSilizium.setMinimum(-10);
        jSliderSilizium.setValue(0);
        jSliderSilizium.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderSiliziumStateChanged(evt);
            }
        });

        jLabelSiliziumAnzeige.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSilizium)
                .addGap(91, 91, 91)
                .addComponent(jSliderSilizium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSiliziumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderSilizium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSilizium, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSiliziumAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel8);

        jSliderZink.setMaximum(10);
        jSliderZink.setMinimum(-10);
        jSliderZink.setValue(0);
        jSliderZink.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderZinkStateChanged(evt);
            }
        });

        jLabelZinkAnzeige.setText("0");

        jLabelZink.setText("Zink");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelZink)
                .addGap(105, 105, 105)
                .addComponent(jSliderZink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelZinkAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelZink, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderZink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelZinkAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelHintergrund.add(jPanel9);

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

    private void jSliderBorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBorStateChanged
        jLabelBorAnzeige.setText(String.valueOf((jSliderBor.getValue())));
    }//GEN-LAST:event_jSliderBorStateChanged

    private void jSliderChlorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderChlorStateChanged
        jLabelChlorAnzeige.setText(String.valueOf((jSliderChlor.getValue())));
    }//GEN-LAST:event_jSliderChlorStateChanged

    private void jSliderEisenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderEisenStateChanged
        jLabelEisenAnzeige.setText(String.valueOf((jSliderEisen.getValue())));
    }//GEN-LAST:event_jSliderEisenStateChanged

    private void jSliderKupferStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderKupferStateChanged
        jLabelKupferAnzeige.setText(String.valueOf((jSliderKupfer.getValue())));
    }//GEN-LAST:event_jSliderKupferStateChanged

    private void jSliderManganStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderManganStateChanged
        jLabelManganAnzeige.setText(String.valueOf((jSliderMangan.getValue())));
    }//GEN-LAST:event_jSliderManganStateChanged

    private void jSliderMolybdaenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderMolybdaenStateChanged
        jLabelMolybdaenAnzeige.setText(String.valueOf((jSliderMolybdaen.getValue())));
    }//GEN-LAST:event_jSliderMolybdaenStateChanged

    private void jSliderSelenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderSelenStateChanged
        jLabelSelenAnzeige.setText(String.valueOf((jSliderSelen.getValue())));
    }//GEN-LAST:event_jSliderSelenStateChanged

    private void jSliderSiliziumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderSiliziumStateChanged
        jLabelSiliziumAnzeige.setText(String.valueOf((jSliderSilizium.getValue())));
    }//GEN-LAST:event_jSliderSiliziumStateChanged

    private void jSliderZinkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderZinkStateChanged
        jLabelZinkAnzeige.setText(String.valueOf((jSliderZink.getValue())));
    }//GEN-LAST:event_jSliderZinkStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBor;
    private javax.swing.JLabel jLabelBorAnzeige;
    private javax.swing.JLabel jLabelChlor;
    private javax.swing.JLabel jLabelChlorAnzeige;
    private javax.swing.JLabel jLabelEisen;
    private javax.swing.JLabel jLabelEisenAnzeige;
    private javax.swing.JLabel jLabelKupfer;
    private javax.swing.JLabel jLabelKupferAnzeige;
    private javax.swing.JLabel jLabelMangan;
    private javax.swing.JLabel jLabelManganAnzeige;
    private javax.swing.JLabel jLabelMolybdaen;
    private javax.swing.JLabel jLabelMolybdaenAnzeige;
    private javax.swing.JLabel jLabelSelen;
    private javax.swing.JLabel jLabelSelenAnzeige;
    private javax.swing.JLabel jLabelSilizium;
    private javax.swing.JLabel jLabelSiliziumAnzeige;
    private javax.swing.JLabel jLabelZink;
    private javax.swing.JLabel jLabelZinkAnzeige;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSlider jSliderBor;
    private javax.swing.JSlider jSliderChlor;
    private javax.swing.JSlider jSliderEisen;
    private javax.swing.JSlider jSliderKupfer;
    private javax.swing.JSlider jSliderMangan;
    private javax.swing.JSlider jSliderMolybdaen;
    private javax.swing.JSlider jSliderSelen;
    private javax.swing.JSlider jSliderSilizium;
    private javax.swing.JSlider jSliderZink;
    // End of variables declaration//GEN-END:variables
}
