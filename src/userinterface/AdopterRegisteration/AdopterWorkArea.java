/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdopterRegisteration;

import Business.Adopter.Adopter;
import Business.Adopter.AdpDirec;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdopterOrganization;
import Business.Organization.Organization;
import Business.UAcc.UAcc;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class AdopterWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UAcc account;
    Enterprise enterprise;
    EcoSystem business;
    AdpDirec adopterdirectory;
    AdopterOrganization adopterorganization;
    Adopter adopter;
    String bgcstatus,financestatus;
    ChildDirectory childdirectory;
    
    
    public AdopterWorkArea(JPanel userProcessContainer, UAcc account, Organization organization, Enterprise enterprise, EcoSystem business, AdpDirec adopterdirectory, ChildDirectory childdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.adopterdirectory = adopterdirectory;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        this.adopterorganization = (AdopterOrganization) organization;
        this.childdirectory = childdirectory;
        for (Adopter a : adopterdirectory.getAdoptersList()) {
            if (a.getUsername().equals(account.getUsername())) {
                adopter = a;
            }
        }
        valueLabel.setText(organization.getName());
        goToCheckStatusJPanel();

    }

   
    
    private void goToCheckStatusJPanel() {
        CheckStatusJPanel panel = new CheckStatusJPanel(rightSystemAdminPanel, account, adopterorganization, enterprise, business, adopterdirectory, adopter.getUserId(), childdirectory);
        rightSystemAdminPanel.add("CheckStatusJPanel", panel);
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
        Adopter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        checkyourstatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 204, 153));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 204, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adopter.setBackground(new java.awt.Color(255, 204, 153));
        Adopter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdopterMousePressed(evt);
            }
        });
        Adopter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        Adopter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 37, -1));

        checkyourstatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        checkyourstatus.setText("Check Your Status");
        checkyourstatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkyourstatusMousePressed(evt);
            }
        });
        Adopter.add(checkyourstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 225, 36));

        jPanel3.add(Adopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/couple-icon-5.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 190));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Hello");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 20));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void checkyourstatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkyourstatusMousePressed
        goToCheckStatusJPanel();
    }//GEN-LAST:event_checkyourstatusMousePressed

    private void AdopterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdopterMousePressed
        // TODO add your handling code here:
        goToCheckStatusJPanel();
    }//GEN-LAST:event_AdopterMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adopter;
    private javax.swing.JLabel checkyourstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
