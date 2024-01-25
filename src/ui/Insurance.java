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

public class Insurance extends javax.swing.JPanel {
    Product product;
    /**
     * Creates new form Insurance
     */
    public Insurance(Product product) {
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
        cityJLbl = new javax.swing.JLabel();
        stateJLbl = new javax.swing.JLabel();
        countryJLbl = new javax.swing.JLabel();
        insuranceIdTxtField = new javax.swing.JTextField();
        cityJTxtField = new javax.swing.JTextField();
        deductableJTxtField = new javax.swing.JTextField();
        textStatementTxtField = new javax.swing.JTextField();
        gpsLocationJLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        addJLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addJLbl.setText("INSURANCE");

        javax.swing.GroupLayout addLeftJPanelLayout = new javax.swing.GroupLayout(addLeftJPanel);
        addLeftJPanel.setLayout(addLeftJPanelLayout);
        addLeftJPanelLayout.setHorizontalGroup(
            addLeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addJLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        addLeftJPanelLayout.setVerticalGroup(
            addLeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLeftJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        cityJLbl.setText("Priminum");

        stateJLbl.setText("Deductable");

        countryJLbl.setText("Text Statement");

        insuranceIdTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceIdTxtFieldActionPerformed(evt);
            }
        });

        deductableJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductableJTxtFieldActionPerformed(evt);
            }
        });

        gpsLocationJLbl.setText("Insurance ID");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addRightJPanelLayout = new javax.swing.GroupLayout(addRightJPanel);
        addRightJPanel.setLayout(addRightJPanelLayout);
        addRightJPanelLayout.setHorizontalGroup(
            addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRightJPanelLayout.createSequentialGroup()
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addRightJPanelLayout.createSequentialGroup()
                        .addComponent(stateJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(deductableJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addRightJPanelLayout.createSequentialGroup()
                        .addComponent(cityJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addRightJPanelLayout.createSequentialGroup()
                        .addComponent(gpsLocationJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addRightJPanelLayout.createSequentialGroup()
                        .addComponent(countryJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textStatementTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(addRightJPanelLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addRightJPanelLayout.setVerticalGroup(
            addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRightJPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insuranceIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpsLocationJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityJTxtField))
                .addGap(28, 28, 28)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deductableJTxtField))
                .addGap(26, 26, 26)
                .addGroup(addRightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textStatementTxtField)
                    .addComponent(countryJLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
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
            .addComponent(addLeftJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addRightJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deductableJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductableJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deductableJTxtFieldActionPerformed

    private void insuranceIdTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceIdTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insuranceIdTxtFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        product.setInsuranceId(insuranceIdTxtField.getText());
        product.setPremium(insuranceIdTxtField.getText());
        product.setDeductable(deductableJTxtField.getText());
        product.setTextStatement(textStatementTxtField.getText());
        
        JOptionPane.showMessageDialog(this, "Person Details Saved");
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addJLbl;
    private javax.swing.JPanel addLeftJPanel;
    private javax.swing.JPanel addRightJPanel;
    private javax.swing.JLabel cityJLbl;
    private javax.swing.JTextField cityJTxtField;
    private javax.swing.JLabel countryJLbl;
    private javax.swing.JTextField deductableJTxtField;
    private javax.swing.JLabel gpsLocationJLbl;
    private javax.swing.JTextField insuranceIdTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel stateJLbl;
    private javax.swing.JTextField textStatementTxtField;
    // End of variables declaration//GEN-END:variables
}
