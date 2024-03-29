/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.Product; 

/**
 *
 * @author deshna
 */
public class Address extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel1
     */
        Product product;
    
    public Address(Product product) {
        initComponents();
        this.product=product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addLeftJPanel = new javax.swing.JPanel();
        addJLbl = new javax.swing.JLabel();
        addRightJPanel = new javax.swing.JPanel();
        gpsLocationJLbl = new javax.swing.JLabel();
        cityJLbl = new javax.swing.JLabel();
        stateJLbl = new javax.swing.JLabel();
        countryJLbl = new javax.swing.JLabel();
        pincodeJLbl = new javax.swing.JLabel();
        gpsLocationTxtField = new javax.swing.JTextField();
        cityJTxtField = new javax.swing.JTextField();
        stateJTxtField = new javax.swing.JTextField();
        countryTxtField = new javax.swing.JTextField();
        pincodeTxtField = new javax.swing.JTextField();
        saveJButton1 = new javax.swing.JButton();

        addJLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addJLbl.setText("ADDRESS");

        javax.swing.GroupLayout addLeftJPanelLayout = new javax.swing.GroupLayout(addLeftJPanel);
        addLeftJPanel.setLayout(addLeftJPanelLayout);
        addLeftJPanelLayout.setHorizontalGroup(
            addLeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addJLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        addLeftJPanelLayout.setVerticalGroup(
            addLeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLeftJPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(addJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        gpsLocationJLbl.setText("GPS Location");

        cityJLbl.setText("City ");

        stateJLbl.setText("State");

        countryJLbl.setText("Country");

        pincodeJLbl.setText("Pincode");

        gpsLocationTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpsLocationTxtFieldActionPerformed(evt);
            }
        });

        stateJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJTxtFieldActionPerformed(evt);
            }
        });

        countryTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryTxtFieldActionPerformed(evt);
            }
        });

        pincodeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincodeTxtFieldActionPerformed(evt);
            }
        });

        saveJButton1.setText("Save");
        saveJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addRightJPanelLayout = new javax.swing.GroupLayout(addRightJPanel);
        addRightJPanel.setLayout(addRightJPanelLayout);
        addRightJPanelLayout.setHorizontalGroup(
            addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRightJPanelLayout.createSequentialGroup()
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(addRightJPanelLayout.createSequentialGroup()
                            .addComponent(stateJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(stateJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addRightJPanelLayout.createSequentialGroup()
                            .addComponent(cityJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(cityJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addRightJPanelLayout.createSequentialGroup()
                            .addComponent(gpsLocationJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(gpsLocationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addRightJPanelLayout.createSequentialGroup()
                            .addComponent(countryJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(countryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addRightJPanelLayout.createSequentialGroup()
                            .addComponent(pincodeJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(pincodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addRightJPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(saveJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addRightJPanelLayout.setVerticalGroup(
            addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRightJPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpsLocationJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpsLocationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pincodeJLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(pincodeTxtField))
                .addGap(18, 18, 18)
                .addComponent(saveJButton1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addLeftJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addRightJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addLeftJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRightJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gpsLocationTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpsLocationTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpsLocationTxtFieldActionPerformed

    private void stateJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateJTxtFieldActionPerformed

    private void pincodeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincodeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pincodeTxtFieldActionPerformed

    private void saveJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButton1ActionPerformed
        // TODO add your handling code here:
        
        product.setGpsLocation(gpsLocationTxtField.getText());
        product.setCity(cityJTxtField.getText());
        product.setState(stateJTxtField.getText());
        product.setCountry(countryTxtField.getText());
        product.setPinCode(pincodeTxtField.getText());
        
        JOptionPane.showMessageDialog(this, "Person Details Saved");
        
    }//GEN-LAST:event_saveJButton1ActionPerformed

    private void countryTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addJLbl;
    private javax.swing.JPanel addLeftJPanel;
    private javax.swing.JPanel addRightJPanel;
    private javax.swing.JLabel cityJLbl;
    private javax.swing.JTextField cityJTxtField;
    private javax.swing.JLabel countryJLbl;
    private javax.swing.JTextField countryTxtField;
    private javax.swing.JLabel gpsLocationJLbl;
    private javax.swing.JTextField gpsLocationTxtField;
    private javax.swing.JLabel pincodeJLbl;
    private javax.swing.JTextField pincodeTxtField;
    private javax.swing.JButton saveJButton1;
    private javax.swing.JLabel stateJLbl;
    private javax.swing.JTextField stateJTxtField;
    // End of variables declaration//GEN-END:variables
}
