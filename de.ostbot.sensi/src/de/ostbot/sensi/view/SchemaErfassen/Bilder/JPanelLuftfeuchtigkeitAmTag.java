package de.ostbot.sensi.view.SchemaErfassen.Bilder;

import de.ostbot.sensi.view.SchemaErfassen.JPanelKlima;
import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class JPanelLuftfeuchtigkeitAmTag extends javax.swing.JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        try {
            g.drawImage(ImageIO.read(JPanelKlima.class.getResourceAsStream("/de/ostbot/sensi/view/SchemaErfassen/Bilder/LuftfeuchtigkeitAmTag.png")), 0, 0, getWidth(), getHeight(), null);
        } catch (IOException ex) {
            Logger.getLogger(JPanelKlima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public JPanelLuftfeuchtigkeitAmTag() {
        initComponents();
        repaint();
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
