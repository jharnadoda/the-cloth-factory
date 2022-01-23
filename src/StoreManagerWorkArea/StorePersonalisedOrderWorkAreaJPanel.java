/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreManagerWorkArea;

import Business.WorkQueue.CustomerCustomizedWorkRequest;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.enterprise.productionEnterprise;
import business.network.Network;
import business.organization.DesignOrganization;
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
public class StorePersonalisedOrderWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StorePersonalisedOrderWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private StoreOrganization storeOrganization;
    private UserAccount userAccount;
    private Ecosystem business;
    
    public StorePersonalisedOrderWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.storeOrganization = (StoreOrganization) organization;
        this.userAccount = account;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        customerWorkRequestJTable = new javax.swing.JTable();
        enterpriseLabel4 = new javax.swing.JLabel();
        assignJButton = new javax.swing.JButton();
        requestDesignJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerWorkRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        customerWorkRequestJTable.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        customerWorkRequestJTable.setForeground(new java.awt.Color(102, 0, 51));
        customerWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(customerWorkRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 743, 163));

        enterpriseLabel4.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel4.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel4.setText("Customer Order Requests");
        add(enterpriseLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 243, 30));

        assignJButton.setBackground(new java.awt.Color(204, 204, 255));
        assignJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(102, 0, 51));
        assignJButton.setText("Accept Request");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 210, 43));

        requestDesignJButton.setBackground(new java.awt.Color(204, 204, 255));
        requestDesignJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        requestDesignJButton.setForeground(new java.awt.Color(102, 0, 51));
        requestDesignJButton.setText("Request Design Team>>");
        requestDesignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDesignJButtonActionPerformed(evt);
            }
        });
        add(requestDesignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 320, 43));

        refreshJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(102, 0, 51));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 13, 140, 49));

        backJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 17, 90, 40));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel1.setText("The Cloth Factory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StoreManagerWorkArea/cust.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 500, 363, 260));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StoreManagerWorkArea/cust.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 330, 213));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = customerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) customerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setStoreReceiver(userAccount);
        request.setStatus("Order Final");
        populateCustomerWorkRequestTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void requestDesignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDesignJButtonActionPerformed

        int selectedRow = customerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) customerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Design Order");
        request.setStoreSender(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(request);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof productionEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DesignOrganization) {
                            organization.getWorkQueue().getWorkRequestList().add(request);

                        }
                    }
                }
            }
        }
        populateCustomerWorkRequestTable();
        JOptionPane.showMessageDialog(null, "Order sent to design", "Info", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_requestDesignJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateCustomerWorkRequestTable();

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    public void populateCustomerWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) customerWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : storeOrganization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CustomerCustomizedWorkRequest) {
                Object[] row = new Object[5];
                CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) wr;
                row[0] = cw;
                row[1] = cw.getCustomerSender() == null ? null : cw.getCustomerSender().getEmployee().getName();
                row[2] = cw.getStoreReceiver() == null ? null : cw.getStoreReceiver().getEmployee().getName();
                row[3] = cw.getRequestDate();
                row[4] = cw.getStatus();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable customerWorkRequestJTable;
    private javax.swing.JLabel enterpriseLabel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton requestDesignJButton;
    // End of variables declaration//GEN-END:variables
}
