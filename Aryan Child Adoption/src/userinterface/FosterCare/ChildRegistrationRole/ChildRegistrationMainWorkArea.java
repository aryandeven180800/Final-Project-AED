/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterCare.ChildRegistrationRole;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ChildRegistrationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class ChildRegistrationMainWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    ChildRegistrationOrganization childRegistrationOrganization;
    Enterprise enterprise;
    Child child;
    ChildDirectory childdirectory;
    EcoSystem business;
    Network network;

    public ChildRegistrationMainWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.childRegistrationOrganization = (ChildRegistrationOrganization) organization;
        this.business = business;
        this.childdirectory = childdirectory;
        this.enterprise = enterprise;
        valueLabel.setText(organization.getName());
        childRegistrationArea();
    }

    private void childRegistrationArea() {
        RegisterNewChildJPanel panel = new RegisterNewChildJPanel(rightSystemAdminPanel, childdirectory, account, enterprise, business, childRegistrationOrganization);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
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
        LabNetworkPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        childRegistration = new javax.swing.JLabel();
        lblViewChild = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        view = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 204, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabNetworkPanel.setBackground(new java.awt.Color(255, 204, 153));
        LabNetworkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabNetworkPanelMousePressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N

        childRegistration.setBackground(new java.awt.Color(255, 204, 204));
        childRegistration.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        childRegistration.setText("Child Registration Area");
        childRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                childRegistrationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout LabNetworkPanelLayout = new javax.swing.GroupLayout(LabNetworkPanel);
        LabNetworkPanel.setLayout(LabNetworkPanelLayout);
        LabNetworkPanelLayout.setHorizontalGroup(
            LabNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(childRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LabNetworkPanelLayout.setVerticalGroup(
            LabNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LabNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(childRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(LabNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, -1));

        lblViewChild.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblViewChild.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblViewChild.setText("View Child Records");
        lblViewChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewChildMousePressed(evt);
            }
        });
        jPanel3.add(lblViewChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 230, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 0));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manager.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 180));
        jPanel3.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statusIcon.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Organization");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 110, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, 20));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void childRegistrationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_childRegistrationMousePressed
        childRegistrationArea();
    }//GEN-LAST:event_childRegistrationMousePressed

    private void LabNetworkPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabNetworkPanelMousePressed
        // TODO add your handling code here:
        childRegistrationArea();
    }//GEN-LAST:event_LabNetworkPanelMousePressed

    private void lblViewChildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewChildMousePressed
        // TODO add your handling code here:
        ViewChildTable panel = new ViewChildTable(rightSystemAdminPanel, account, childRegistrationOrganization, enterprise, business, childdirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_lblViewChildMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabNetworkPanel;
    private javax.swing.JLabel childRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblViewChild;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
