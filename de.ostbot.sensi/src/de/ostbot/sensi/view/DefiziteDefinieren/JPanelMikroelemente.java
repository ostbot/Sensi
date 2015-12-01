package de.ostbot.sensi.view.DefiziteDefinieren;

public class JPanelMikroelemente extends javax.swing.JPanel {

    public int getjSliderBor() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderBor.getValue();
        return rueckgabe;
    }

    public int getjSliderChlor() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderChlor.getValue();
        return rueckgabe;
    }

    public int getjSliderEisen() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderEisen.getValue();
        return rueckgabe;
    }

    public int getjSliderKupfer() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderKupfer.getValue();
        return rueckgabe;
    }

    public int getjSliderMangan() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderMangan.getValue();
        return rueckgabe;
    }

    public int getjSliderMolybdaen() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderMolybdaen.getValue();
        return rueckgabe;
    }

    public int getjSliderSelen() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderSelen.getValue();
        return rueckgabe;
    }

    public int getjSliderSilizium() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderSilizium.getValue();
        return rueckgabe;
    }

    public int getjSliderZink() {
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
        jLabelMikroelemente = new javax.swing.JLabel();
        jLabelBor = new javax.swing.JLabel();
        jLabelChlor = new javax.swing.JLabel();
        jSliderChlor = new javax.swing.JSlider();
        jLabelChlorAnzeige = new javax.swing.JLabel();
        jLabelEisen = new javax.swing.JLabel();
        jSliderEisen = new javax.swing.JSlider();
        jLabelEisenAnzeige = new javax.swing.JLabel();
        jLabelKupfer = new javax.swing.JLabel();
        jSliderKupfer = new javax.swing.JSlider();
        jLabelKupferAnzeige = new javax.swing.JLabel();
        jLabelMangan = new javax.swing.JLabel();
        jSliderMangan = new javax.swing.JSlider();
        jLabelManganAnzeige = new javax.swing.JLabel();
        jLabelMolybdaen = new javax.swing.JLabel();
        jSliderMolybdaen = new javax.swing.JSlider();
        jLabelMolybdaenAnzeige = new javax.swing.JLabel();
        jLabelSelen = new javax.swing.JLabel();
        jSliderSelen = new javax.swing.JSlider();
        jLabelSelenAnzeige = new javax.swing.JLabel();
        jLabelSilizium = new javax.swing.JLabel();
        jSliderSilizium = new javax.swing.JSlider();
        jLabelSiliziumAnzeige = new javax.swing.JLabel();
        jLabelZink = new javax.swing.JLabel();
        jSliderZink = new javax.swing.JSlider();
        jLabelZinkAnzeige = new javax.swing.JLabel();
        jSliderBor = new javax.swing.JSlider();
        jLabelBorAnzeige = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelMikroelemente.setText("Mikroelemente:");

        jLabelBor.setText("Bor");

        jLabelChlor.setText("Chlor");

        jLabelChlorAnzeige.setText("0");

        jLabelEisen.setText("Eisen");

        jLabelEisenAnzeige.setText("0");

        jLabelKupfer.setText("Kupfer");

        jLabelKupferAnzeige.setText("0");

        jLabelMangan.setText("Mangan");

        jLabelManganAnzeige.setText("0");

        jLabelMolybdaen.setText("Molybdän");

        jLabelMolybdaenAnzeige.setText("0");

        jLabelSelen.setText("Selen");

        jLabelSelenAnzeige.setText("0");

        jLabelSilizium.setText("Silizium");

        jLabelSiliziumAnzeige.setText("0");

        jLabelZink.setText("Zink");

        jLabelZinkAnzeige.setText("0");

        jLabelBorAnzeige.setText("0");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelMikroelemente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jLabelBor)
                                .addGap(48, 48, 48)
                                .addComponent(jSliderBor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSelen)
                                    .addComponent(jLabelSilizium)
                                    .addComponent(jLabelZink))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEisen)
                                    .addComponent(jLabelKupfer)
                                    .addComponent(jLabelMangan)
                                    .addComponent(jLabelMolybdaen)
                                    .addComponent(jLabelChlor))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSliderChlor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderEisen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderKupfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderMangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderMolybdaen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderSelen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderSilizium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSliderZink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelKupferAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jLabelEisenAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelChlorAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelManganAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMolybdaenAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSelenAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSiliziumAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelZinkAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBorAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMikroelemente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderBor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelChlor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderChlor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderEisen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEisen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKupfer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderKupfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMangan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderMangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMolybdaen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderMolybdaen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSelen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderSelen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderSilizium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSilizium, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelZink, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSliderZink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jLabelBorAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelChlorAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEisenAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelKupferAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelManganAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMolybdaenAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSelenAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSiliziumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelZinkAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private javax.swing.JLabel jLabelMikroelemente;
    private javax.swing.JLabel jLabelMolybdaen;
    private javax.swing.JLabel jLabelMolybdaenAnzeige;
    private javax.swing.JLabel jLabelSelen;
    private javax.swing.JLabel jLabelSelenAnzeige;
    private javax.swing.JLabel jLabelSilizium;
    private javax.swing.JLabel jLabelSiliziumAnzeige;
    private javax.swing.JLabel jLabelZink;
    private javax.swing.JLabel jLabelZinkAnzeige;
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
