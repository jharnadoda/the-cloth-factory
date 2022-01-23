/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreManagerWorkArea;

import business.organization.StoreOrganization;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author saloni
 */
public class StoreManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private StoreOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    
    public StoreManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (StoreOrganization) organization;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.business = business;
        
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
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
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        btnCustomizedOrders = new javax.swing.JButton();
        btnOnlineOrders = new javax.swing.JButton();
        tblManuRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back ");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 119, 40));

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 77, 87, 26));

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 74, -1, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 106, -1, 26));

        orgValueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        orgValueLabel.setForeground(new java.awt.Color(102, 0, 51));
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 107, 87, 26));

        btnCustomizedOrders.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomizedOrders.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        btnCustomizedOrders.setForeground(new java.awt.Color(102, 0, 51));
        btnCustomizedOrders.setText("Customized Orders");
        btnCustomizedOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomizedOrdersActionPerformed(evt);
            }
        });
        add(btnCustomizedOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 380, 70));

        btnOnlineOrders.setBackground(new java.awt.Color(255, 255, 255));
        btnOnlineOrders.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        btnOnlineOrders.setForeground(new java.awt.Color(102, 0, 51));
        btnOnlineOrders.setText("Online Orders");
        btnOnlineOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnlineOrdersActionPerformed(evt);
            }
        });
        add(btnOnlineOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 380, 70));

        tblManuRequest.setBackground(new java.awt.Color(255, 255, 255));
        tblManuRequest.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        tblManuRequest.setForeground(new java.awt.Color(102, 0, 51));
        tblManuRequest.setText("Producer's Work Requests");
        tblManuRequest.setToolTipText("");
        tblManuRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblManuRequestActionPerformed(evt);
            }
        });
        add(tblManuRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 380, 70));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel1.setText("The Cloth Factory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StoreManagerWorkArea/work.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 343, 326));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnCustomizedOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomizedOrdersActionPerformed
        StorePersonalisedOrderWorkAreaJPanel vjp = new StorePersonalisedOrderWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("ShowroomCustomizedOrdersWorkAreaJPanel", vjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCustomizedOrdersActionPerformed

    private void btnOnlineOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnlineOrdersActionPerformed
        StoreOrdersWorkAreaJPanel vjp = new StoreOrdersWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("ShowroomOrdersWorkAreaJPanel", vjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOnlineOrdersActionPerformed

    private void tblManuRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblManuRequestActionPerformed
        ProducerWorkRequestsJPanel mjp = new ProducerWorkRequestsJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("ManufacturerWorkRequestsJPanel", mjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_tblManuRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCustomizedOrders;
    private javax.swing.JButton btnOnlineOrders;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton tblManuRequest;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}