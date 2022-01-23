/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProducerWorkArea;

import Business.WorkQueue.CustomerCustomizedWorkRequest;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.enterprise.customerCareEnterprise;
import business.network.Network;
import business.organization.ManufacturingOrganization;
import business.organization.Organization;
import business.organization.StoreOrganization;
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
public class ProducerWorkRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProducerWorkRequestsJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ManufacturingOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    
    public ProducerWorkRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (ManufacturingOrganization) organization;
        this.userAccount = userAccount;
        this.business = business;
        
        populateDesignerWorkRequestTable();
        
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }
    
    public void populateDesignerWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) designerWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CustomerCustomizedWorkRequest) {
                Object[] row = new Object[5];
                CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) wr;
                row[0] = cw;
                row[1] = cw.getDesignerSender() == null ? null : cw.getDesignerSender().getEmployee().getName();
                row[2] = cw.getManufacturerReceiver() == null ? null : cw.getManufacturerReceiver().getEmployee().getName();
                row[3] = cw.getRequestDate();
                row[4] = cw.getStatus();
                model.addRow(row);
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

        enterpriseLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        designerWorkRequestJTable = new javax.swing.JTable();
        showroomRequestJButton = new javax.swing.JButton();
        assignToMeJButton1 = new javax.swing.JButton();
        requestInventoryJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 126, -1, 26));

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 98, 110, 18));

        orgValueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        orgValueLabel.setForeground(new java.awt.Color(102, 0, 51));
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 126, 220, 26));

        valueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 94, 220, 26));

        backJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 111, 38));

        designerWorkRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        designerWorkRequestJTable.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        designerWorkRequestJTable.setForeground(new java.awt.Color(102, 0, 51));
        designerWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Sender", "Receiver", "Request Date", "Status"
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
        jScrollPane1.setViewportView(designerWorkRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 850, 290));

        showroomRequestJButton.setBackground(new java.awt.Color(204, 204, 255));
        showroomRequestJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        showroomRequestJButton.setForeground(new java.awt.Color(102, 0, 51));
        showroomRequestJButton.setText("<< Send the Order to Online Store");
        showroomRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showroomRequestJButtonActionPerformed(evt);
            }
        });
        add(showroomRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 245, 370, 49));

        assignToMeJButton1.setBackground(new java.awt.Color(204, 204, 255));
        assignToMeJButton1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        assignToMeJButton1.setForeground(new java.awt.Color(102, 0, 51));
        assignToMeJButton1.setText("Accept Request");
        assignToMeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButton1ActionPerformed(evt);
            }
        });
        add(assignToMeJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 247, 164, 45));

        requestInventoryJButton.setBackground(new java.awt.Color(204, 204, 255));
        requestInventoryJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        requestInventoryJButton.setForeground(new java.awt.Color(102, 0, 51));
        requestInventoryJButton.setText("Request Inventory>>");
        requestInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestInventoryJButtonActionPerformed(evt);
            }
        });
        add(requestInventoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 245, 250, 49));

        refreshTestJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(102, 0, 51));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 140, 38));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel1.setText("The Cloth Factory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProducerWorkArea/approved.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 173, 178));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProducerWorkArea/excited.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 540, 199, 171));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void showroomRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showroomRequestJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = designerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) designerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Manufactured");
        request.setManufacturerSender(userAccount);
        request.setStoreReceiver(null);
        userAccount.getWorkQueue().getWorkRequestList().add(request);

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof customerCareEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof StoreOrganization) {

                            organization.getWorkQueue().getWorkRequestList().add(request);

                        }
                    }

                }
            }
        }
        populateDesignerWorkRequestTable();

        JOptionPane.showMessageDialog(null, "Order sent to Online Store", "Info", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_showroomRequestJButtonActionPerformed

    private void assignToMeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButton1ActionPerformed
        int selectedRow = designerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) designerWorkRequestJTable.getValueAt(selectedRow, 0);

        request.setManufacturerReceiver(userAccount);
        request.setStatus("Pending");

        populateDesignerWorkRequestTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_assignToMeJButton1ActionPerformed

    
    private void requestInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestInventoryJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestInventoryJPanel", new RequestInventoryJPanel(userProcessContainer, userAccount, enterprise, organization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestInventoryJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateDesignerWorkRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable designerWorkRequestJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestInventoryJButton;
    private javax.swing.JButton showroomRequestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
