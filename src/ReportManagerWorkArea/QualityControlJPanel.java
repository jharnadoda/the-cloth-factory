/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportManagerWorkArea;

import Business.WorkQueue.QualityControlWorkRequest;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.enterprise.productionEnterprise;
import business.enterprise.qualityControlEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.QualityControlOrganization;
import business.organization.ReportOrganization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalbhalerao
 */
public class QualityControlJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QualityControlJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Ecosystem business;
    private Organization organization;
    
    public QualityControlJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = (ReportOrganization) organization;
        this.account = account;
        this.enterprise = (productionEnterprise) enterprise;
        this.business = business;

        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
       
        populateRegulatoryTable();
    }

    
    public void populateRegulatoryTable() {
        DefaultTableModel model = (DefaultTableModel) regulatoryWorkRequestJTable.getModel();

        model.setRowCount(0);
        {
            for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof QualityControlWorkRequest) {
                    Object[] row = new Object[5];
                    QualityControlWorkRequest rwr = (QualityControlWorkRequest) wr;
                    row[0] = rwr;
                    row[1] = rwr.getSender().getEmployee().getName();
                    row[2] = rwr.getReceiver() == null ? null : rwr.getReceiver().getEmployee().getName();
                    row[3] = rwr.getRequestDate();
                    row[4] = rwr.getStatus();
                    model.addRow(row);

                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton7 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        regulatoryWorkRequestJTable = new javax.swing.JTable();
        enterpriseLabel4 = new javax.swing.JLabel();
        sendToRegulatoryJButton = new javax.swing.JButton();
        assignToMeJButton1 = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton7.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton7.setForeground(new java.awt.Color(102, 0, 51));
        backJButton7.setText("Back");
        backJButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton7ActionPerformed(evt);
            }
        });
        add(backJButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 90, 38));

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 64, 100, 30));

        enterpriseLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel2.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel2.setText("Organization:");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, -1, 26));

        orgValueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        orgValueLabel.setForeground(new java.awt.Color(102, 0, 51));
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 105, 106, 26));

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 67, 106, 26));

        regulatoryWorkRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        regulatoryWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestType", "Sender", "Receiver", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(regulatoryWorkRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 890, 90));

        enterpriseLabel4.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel4.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel4.setText("Regulatory Work Requests");
        add(enterpriseLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 137, 300, 30));

        sendToRegulatoryJButton.setBackground(new java.awt.Color(204, 204, 255));
        sendToRegulatoryJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        sendToRegulatoryJButton.setForeground(new java.awt.Color(102, 0, 51));
        sendToRegulatoryJButton.setText("Send Report to Regulatory");
        sendToRegulatoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToRegulatoryJButtonActionPerformed(evt);
            }
        });
        add(sendToRegulatoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 302, 390, 43));

        assignToMeJButton1.setBackground(new java.awt.Color(204, 204, 255));
        assignToMeJButton1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        assignToMeJButton1.setForeground(new java.awt.Color(102, 0, 51));
        assignToMeJButton1.setText("Accept Request");
        assignToMeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButton1ActionPerformed(evt);
            }
        });
        add(assignToMeJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 302, 390, 43));

        refreshJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(102, 0, 51));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1006, 6, 127, 40));

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel2.setText("The Cloth Factory");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 6, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ReportManagerWorkArea/regulatory (1).gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 388, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton7ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton7ActionPerformed

    private void sendToRegulatoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToRegulatoryJButtonActionPerformed

        int selectedRow = regulatoryWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //sending regulatory work request to regulatory with report
        QualityControlWorkRequest request = (QualityControlWorkRequest) regulatoryWorkRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Report Dispatched");

        account.getWorkQueue().getWorkRequestList().add(request);

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof qualityControlEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof QualityControlOrganization) {
                            organization.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Report sent to Quality Control", "Info", JOptionPane.INFORMATION_MESSAGE);

        populateRegulatoryTable();
    }//GEN-LAST:event_sendToRegulatoryJButtonActionPerformed

    private void assignToMeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButton1ActionPerformed
        int selectedRow = regulatoryWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        QualityControlWorkRequest request = (QualityControlWorkRequest) regulatoryWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");

        populateRegulatoryTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_assignToMeJButton1ActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRegulatoryTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton1;
    private javax.swing.JButton backJButton7;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable regulatoryWorkRequestJTable;
    private javax.swing.JButton sendToRegulatoryJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
