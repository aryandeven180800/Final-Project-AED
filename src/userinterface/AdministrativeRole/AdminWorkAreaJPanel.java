/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Adopter.AdpDirec;
import Business.Child.ChildDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.AdopterRoleAdmin.AdoptionUnitWorkRequestJPanel;
import userinterface.FundingRoleAdmin.FundingUnitWorkRequestJPanel;

/**
 *
 * @author LENOVO
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    Enterprise enterprise;
    Network network;
    UserAccount account;
    Organization organization;
    AdpDirec adopterdirectory;
    ChildDirectory childdirectory;
    DonorDirectory donorDirectory;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdpDirec adopterdirectory, DonorDirectory donorDirectory) {
        initComponents();
        System.out.println("here");
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
        this.adopterdirectory = adopterdirectory;
        this.childdirectory = childdirectory;
        this.donorDirectory = donorDirectory;
        manageRequestPanel.setVisible(false);
        if ("Adoption".equalsIgnoreCase(this.enterprise.getEnterpriseType().getValue()) || "Funding".equalsIgnoreCase(this.enterprise.getEnterpriseType().getValue())) {
            manageRequestPanel.setVisible(true);
        }
        valueLabel.setText(enterprise.getName());
        manageOrganisation();
    }

    private void manageOrganisation() {
        ManageOrganizationJPanel panel = new ManageOrganizationJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory(), enterprise);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageEmployee() {
        ManageEmployeeJPanel panel = new ManageEmployeeJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory());
        rightSystemAdminPanel.add("ManageEnterpriseJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);

    }

    private void manageUser() {
        ManageUserAccountJPanel panel = new ManageUserAccountJPanel(rightSystemAdminPanel, enterprise, business);
        rightSystemAdminPanel.add("ManageEnterpriseAdminJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageRequests() {
        if ("Adoption".equalsIgnoreCase(this.enterprise.getEnterpriseType().getValue())) {
            AdoptionUnitWorkRequestJPanel vOUWRJP = new AdoptionUnitWorkRequestJPanel(rightSystemAdminPanel, account, enterprise, business, adopterdirectory);
            rightSystemAdminPanel.add("manageOrganizationJPanel", vOUWRJP);
        } else if ("Funding".equalsIgnoreCase(this.enterprise.getEnterpriseType().getValue())) {
            FundingUnitWorkRequestJPanel vOUWRJP = new FundingUnitWorkRequestJPanel(rightSystemAdminPanel, account, enterprise, business, adopterdirectory, donorDirectory);
            rightSystemAdminPanel.add("manageOrganizationJPanel", vOUWRJP);
        }

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
        ManageOrg = new javax.swing.JPanel();
        ORGANIZATIONMAN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manageEmp = new javax.swing.JPanel();
        EMPLOYEEMAN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageUserPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        USERMAN = new javax.swing.JLabel();
        manageRequestPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        REQUESTMAN = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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

        ManageOrg.setBackground(new java.awt.Color(255, 204, 153));
        ManageOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageOrgMousePressed(evt);
            }
        });

        ORGANIZATIONMAN.setBackground(new java.awt.Color(255, 204, 153));
        ORGANIZATIONMAN.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ORGANIZATIONMAN.setText("Manage Organisation");
        ORGANIZATIONMAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ORGANIZATIONMANMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N

        javax.swing.GroupLayout ManageOrgLayout = new javax.swing.GroupLayout(ManageOrg);
        ManageOrg.setLayout(ManageOrgLayout);
        ManageOrgLayout.setHorizontalGroup(
            ManageOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageOrgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ORGANIZATIONMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ManageOrgLayout.setVerticalGroup(
            ManageOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageOrgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ORGANIZATIONMAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(ManageOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, -1));

        manageEmp.setBackground(new java.awt.Color(255, 204, 153));
        manageEmp.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmpMousePressed(evt);
            }
        });

        EMPLOYEEMAN.setBackground(new java.awt.Color(255, 204, 153));
        EMPLOYEEMAN.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        EMPLOYEEMAN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EMPLOYEEMAN.setText("Manage Employee");
        EMPLOYEEMAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EMPLOYEEMANMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/orgIcon.png"))); // NOI18N

        javax.swing.GroupLayout manageEmpLayout = new javax.swing.GroupLayout(manageEmp);
        manageEmp.setLayout(manageEmpLayout);
        manageEmpLayout.setHorizontalGroup(
            manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EMPLOYEEMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        manageEmpLayout.setVerticalGroup(
            manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EMPLOYEEMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 40));

        manageUserPanel.setBackground(new java.awt.Color(255, 204, 153));
        manageUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserPanelMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request.png"))); // NOI18N

        USERMAN.setBackground(new java.awt.Color(255, 204, 153));
        USERMAN.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        USERMAN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        USERMAN.setText("Manage User");
        USERMAN.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageUserPanelLayout = new javax.swing.GroupLayout(manageUserPanel);
        manageUserPanel.setLayout(manageUserPanelLayout);
        manageUserPanelLayout.setHorizontalGroup(
            manageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USERMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageUserPanelLayout.setVerticalGroup(
            manageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageUserPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(USERMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(manageUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 280, 40));

        manageRequestPanel.setBackground(new java.awt.Color(255, 204, 153));
        manageRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageRequestPanelMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statusIcon.png"))); // NOI18N

        REQUESTMAN.setBackground(new java.awt.Color(255, 204, 153));
        REQUESTMAN.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        REQUESTMAN.setText("Manage Request");
        REQUESTMAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                REQUESTMANMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageRequestPanelLayout = new javax.swing.GroupLayout(manageRequestPanel);
        manageRequestPanel.setLayout(manageRequestPanelLayout);
        manageRequestPanelLayout.setHorizontalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRequestPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REQUESTMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageRequestPanelLayout.setVerticalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRequestPanelLayout.createSequentialGroup()
                .addComponent(REQUESTMAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(manageRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(manageRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 280, 40));

        jLabel.setBackground(new java.awt.Color(153, 255, 153));
        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/systemadminlogo.png"))); // NOI18N
        jPanel3.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 190));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Enterprise");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 20));

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

    private void ORGANIZATIONMANMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ORGANIZATIONMANMousePressed
        manageOrganisation();
    }//GEN-LAST:event_ORGANIZATIONMANMousePressed

    private void ManageOrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageOrgMousePressed
        // TODO add your handling code here:
        manageOrganisation();
    }//GEN-LAST:event_ManageOrgMousePressed

    private void EMPLOYEEMANMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPLOYEEMANMousePressed
        manageEmployee();
    }//GEN-LAST:event_EMPLOYEEMANMousePressed

    private void manageEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmpMousePressed
        // TODO add your handling code here:
        manageEmployee();
    }//GEN-LAST:event_manageEmpMousePressed

    private void manageUserPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserPanelMousePressed
        manageUser();
    }//GEN-LAST:event_manageUserPanelMousePressed

    private void REQUESTMANMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REQUESTMANMousePressed
        // TODO add your handling code here:
        manageRequests();
    }//GEN-LAST:event_REQUESTMANMousePressed

    private void manageRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRequestPanelMousePressed
        // TODO add your handling code here:
        manageRequests();
    }//GEN-LAST:event_manageRequestPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EMPLOYEEMAN;
    private javax.swing.JPanel ManageOrg;
    private javax.swing.JLabel ORGANIZATIONMAN;
    private javax.swing.JLabel REQUESTMAN;
    private javax.swing.JLabel USERMAN;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel manageEmp;
    private javax.swing.JPanel manageRequestPanel;
    private javax.swing.JPanel manageUserPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
