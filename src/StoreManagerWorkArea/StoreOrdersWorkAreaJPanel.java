/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreManagerWorkArea;

import Business.WorkQueue.OrderOnlineWorkRequest;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.CustomerOrganization;
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
 * @author saloni
 */
public class StoreOrdersWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreOrdersWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private StoreOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    
    public StoreOrdersWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (StoreOrganization) organization;
        this.userAccount = account;
        this.business = business;
        
        populateStoreTable();
        
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
        
    }
        
        public void populateStoreTable() {
        DefaultTableModel model = (DefaultTableModel) tblworkRequest.getModel();

        model.setRowCount(0);
        {
            for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof OrderOnlineWorkRequest) {
                    Object[] row = new Object[5];
                    OrderOnlineWorkRequest oas = (OrderOnlineWorkRequest) wr;
                    row[0] = oas;
                    row[1] = oas.getSender().getEmployee().getName();
                    row[2] = oas.getReceiver() == null ? null : oas.getReceiver().getEmployee().getName();
                    row[3] = oas.getRequestDate();
                    row[4] = oas.getStatus();
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

        backJButton = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        btnSendToCustomer = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        enterpriseLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblworkRequest = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 15, 90, 40));

        btnAccept.setBackground(new java.awt.Color(204, 204, 255));
        btnAccept.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(102, 0, 51));
        btnAccept.setText("Accept Request");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, 40));

        btnSendToCustomer.setBackground(new java.awt.Color(204, 204, 255));
        btnSendToCustomer.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        btnSendToCustomer.setForeground(new java.awt.Color(102, 0, 51));
        btnSendToCustomer.setText("Send Confirmation to Customer");
        btnSendToCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendToCustomerActionPerformed(evt);
            }
        });
        add(btnSendToCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, -1, 43));

        refreshJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(102, 0, 51));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 140, 40));

        enterpriseLabel3.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        enterpriseLabel3.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel3.setText("Store Order Requests");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 290, 30));

        tblworkRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblworkRequest.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        tblworkRequest.setForeground(new java.awt.Color(102, 0, 51));
        tblworkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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
        jScrollPane2.setViewportView(tblworkRequest);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 820, 170));

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 99, 113, 18));

        valueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 95, 230, 26));

        orgValueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        orgValueLabel.setForeground(new java.awt.Color(102, 0, 51));
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 127, 220, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 127, -1, 26));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel1.setText("The Cloth Factory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int selectedRow = tblworkRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        OrderOnlineWorkRequest request = (OrderOnlineWorkRequest) tblworkRequest.getValueAt(selectedRow, 0);

        request.setReceiver(userAccount);
        request.setStatus("Pending");

        populateStoreTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnSendToCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendToCustomerActionPerformed

        int selectedRow = tblworkRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        OrderOnlineWorkRequest request = (OrderOnlineWorkRequest) tblworkRequest.getValueAt(selectedRow, 0);

        request.setStatus("Order Processed");
        request.setSender(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof CustomerOrganization) {
                organization.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        JOptionPane.showMessageDialog(null, "Order sent to Customer", "Info", JOptionPane.INFORMATION_MESSAGE);

        populateStoreTable();
    }//GEN-LAST:event_btnSendToCustomerActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateStoreTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnSendToCustomer;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblworkRequest;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}