package de.ostbot.sensi.view.SchemaErfassen;

import de.ostbot.sensi.control.Datenbankoperationen;
import java.util.ArrayList;
import java.util.List;

public class JPanelDuenger extends javax.swing.JPanel {

    //Getter-CheckBox-Montag
    public boolean isMontag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxMontag.isSelected();
        return rueckgabe;
    }

    //Getter-CheckBox-Dienstag
    public boolean isDienstag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxDienstag.isSelected();
        return rueckgabe;
    }

    //Getter-CheckBox-Mittwoch
    public boolean isMittwoch() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxMittwoch.isSelected();
        return rueckgabe;
    }
    
    //Getter-CheckBox-Donnerstag
    public boolean isDonnerstag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxDonnerstag.isSelected();
        return rueckgabe;
    }

    //Getter-CheckBox-Freitag
    public boolean isFreitag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxFreitag.isSelected();
        return rueckgabe;
    }

    //Getter-CheckBox-Samstag
    public boolean isSamstag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxSamstag.isSelected();
        return rueckgabe;
    }

    //Getter-CheckBox-Sonntag
    public boolean isSonntag() {
        boolean rueckgabe;
        rueckgabe = (Boolean) jCheckBoxSonntag.isSelected();
        return rueckgabe;
    }

    //Getter-CheckBox-Dünger
    public String getDuenger() {
        String rueckgabe;
        rueckgabe = (String)jComboBoxDuenger.getSelectedItem();
        return rueckgabe;
    }

    //Getter-Spinner-Dünger
    public double getDuengerMilliliter() {
        double rueckgabe;
        rueckgabe = (Double)jSpinnerDuenger.getValue();
        return rueckgabe;
    }

    public JPanelDuenger() {
        
        initComponents();
        int laenge;
        Datenbankoperationen datenbankOperationen;
        List<String> duengerListe;
        
        datenbankOperationen = new Datenbankoperationen();
        duengerListe = new ArrayList();
        
        laenge = datenbankOperationen.getDuenger().size();
        duengerListe = datenbankOperationen.getDuenger();
        
        jComboBoxDuenger.removeAllItems();
        for (int i = 0; i < laenge; i++) {
            jComboBoxDuenger.addItem(duengerListe.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelDuenger = new javax.swing.JLabel();
        jComboBoxDuenger = new javax.swing.JComboBox<>();
        jSpinnerDuenger = new javax.swing.JSpinner();
        jLabelDuengerMilliliter = new javax.swing.JLabel();
        jCheckBoxMontag = new javax.swing.JCheckBox();
        jCheckBoxDienstag = new javax.swing.JCheckBox();
        jCheckBoxMittwoch = new javax.swing.JCheckBox();
        jCheckBoxDonnerstag = new javax.swing.JCheckBox();
        jCheckBoxFreitag = new javax.swing.JCheckBox();
        jCheckBoxSamstag = new javax.swing.JCheckBox();
        jCheckBoxSonntag = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelDuenger.setText("Dünger:");

        jComboBoxDuenger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSpinnerDuenger.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1000.0d, 0.1d));

        jLabelDuengerMilliliter.setText("ml");

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
                        .addComponent(jCheckBoxMontag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxDienstag, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxMittwoch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jCheckBoxDonnerstag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxFreitag, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxSamstag, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxSonntag, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDuenger)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addComponent(jComboBoxDuenger, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerDuenger, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDuengerMilliliter)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDuenger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDuenger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDuenger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuengerMilliliter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxMontag)
                    .addComponent(jCheckBoxDienstag)
                    .addComponent(jCheckBoxMittwoch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JComboBox<String> jComboBoxDuenger;
    private javax.swing.JLabel jLabelDuenger;
    private javax.swing.JLabel jLabelDuengerMilliliter;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSpinner jSpinnerDuenger;
    // End of variables declaration//GEN-END:variables
}