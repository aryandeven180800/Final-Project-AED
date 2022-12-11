/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterCare.ChildCare;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ChildCareOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author snehaswaroop
 */
public class ViewChildDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewChildDetails
     */
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;
    UserAccount account;
    ChildCareOrganization childCareOrganization;
    ChildDirectory childdirectory;
    Child child;
    EcoSystem business;
    AcquireChild panel;
    AdopterDirectory adopterdirectory;
    Adopter adopter;
    Role roler;
    Network network;
    
    public ViewChildDetails(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdopterDirectory adopterdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.childCareOrganization = (ChildCareOrganization) organization;
        this.childdirectory = childdirectory;
        this.adopterdirectory = adopterdirectory;
        this.enterprise = enterprise;
        for (Network net : business.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
        }
        populateChildTable();
    }

    public void populateChildTable() {
        DefaultTableModel table = (DefaultTableModel) tblChild.getModel();
        table.setRowCount(0);
        for (Child ch : childdirectory.getChildList()) {
            if (ch.getStatus().equalsIgnoreCase("Acquired") || ch.getStatus().startsWith("Adopted by")) {
                Object[] row = new Object[table.getColumnCount()];
                row[0] = ch;
                row[1] = ch.getName();
                row[2] = ch.getChildAge();
                row[3] = ch.getGender();
                row[4] = ch.getStatus();
                table.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        tblChildDetails = new javax.swing.JScrollPane();
        tblChild = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("VIEW CHILD DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 310, 20));

        tblChild.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblChild.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Child ID", "Name", "Age", "Gender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChild.setOpaque(false);
        tblChildDetails.setViewportView(tblChild);

        add(tblChildDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 850, 140));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnView.setText("View Child Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kids 2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 890, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblChild.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a child");
            return;
        }
        Child child = (Child) tblChild.getValueAt(selectedRow, 0);
        ViewCompleteChildDetails completeJapanel = new ViewCompleteChildDetails(userProcessContainer, account, organization, enterprise, business, childdirectory, child,true);
        this.userProcessContainer.add("ViewCompleteChildDetails", completeJapanel);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable tblChild;
    private javax.swing.JScrollPane tblChildDetails;
    // End of variables declaration//GEN-END:variables
}
