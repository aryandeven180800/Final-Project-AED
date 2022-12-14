/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyOrganisation;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shrey
 */
public class PharmacyWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private PharmacistOrganization pharmacistOrganization;
    private OrganizationDirectory directory;
    Enterprise enterprise;
    Child child;
    private UserAccount userAccount;
    ChildDirectory childDirectory;
    
    
    public PharmacyWorkArea(JPanel userProcessContainer, UserAccount account, PharmacistOrganization pharmacistOrganization, Enterprise enterprise ,EcoSystem ecosystem, ChildDirectory childDirectory) {
        initComponents();
        System.out.println("here");
        this.userProcessContainer=userProcessContainer;   
        this.userAccount = account;
        this.enterprise = enterprise;
        this.ecosystem=ecosystem;
        this.pharmacistOrganization = (PharmacistOrganization)pharmacistOrganization;
        this.enterprise = enterprise;
        this.childDirectory = childDirectory;
        this.userAccount = account;
        valueLabel.setText(pharmacistOrganization.getName());
        managePharmacyWorkAreaJPanel();
    }
    
    
    private void managePharmacyWorkAreaJPanel(){
        PharmacistJPanel panel = new PharmacistJPanel(rightSystemAdminPanel, userAccount, pharmacistOrganization, enterprise, ecosystem, childDirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel",panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
     }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        managePharmacyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PharmacyWorkArea = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(215, 81, 81));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 204, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managePharmacyPanel.setBackground(new java.awt.Color(255, 204, 153));
        managePharmacyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managePharmacyPanelMousePressed(evt);
            }
        });
        managePharmacyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 204, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        managePharmacyPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 37, -1));

        PharmacyWorkArea.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        PharmacyWorkArea.setText("Pharmacist Work Area");
        PharmacyWorkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PharmacyWorkAreaMousePressed(evt);
            }
        });
        managePharmacyPanel.add(PharmacyWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 225, 36));

        jPanel3.add(managePharmacyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pharGirl.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 200, 200));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 20));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacyWorkAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PharmacyWorkAreaMousePressed
        managePharmacyWorkAreaJPanel();
    }//GEN-LAST:event_PharmacyWorkAreaMousePressed

    private void managePharmacyPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyPanelMousePressed
        // TODO add your handling code here:
        managePharmacyWorkAreaJPanel();
    }//GEN-LAST:event_managePharmacyPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PharmacyWorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel managePharmacyPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
