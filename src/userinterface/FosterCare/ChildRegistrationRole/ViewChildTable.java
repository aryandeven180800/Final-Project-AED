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
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class ViewChildTable extends javax.swing.JPanel {

    /**
     * Creates new form ChildRegistrationWorkAreaPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    ChildRegistrationOrganization childRegistrationOrganization;
    Enterprise enterprise;
    Child child;
    ChildDirectory childdirectory;
    EcoSystem business;
    Network network;

    public ViewChildTable(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.childRegistrationOrganization = (ChildRegistrationOrganization) organization;
        this.business = business;
        this.childdirectory = childdirectory;
        this.enterprise = enterprise;
        for (Network net : business.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
        }
        poplulateTable();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNewChild = new javax.swing.JTable();
        btnViewChild = new javax.swing.JButton();
        btnDeleteChild = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNewChild.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblNewChild.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child Id", "Child Name", "Gender", "Age", "Status", "Medical Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNewChild);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 870, 210));

        btnViewChild.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnViewChild.setText("View Child Details");
        btnViewChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewChildActionPerformed(evt);
            }
        });
        add(btnViewChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 150, 33));

        btnDeleteChild.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteChild.setText("Delete Child");
        btnDeleteChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteChildActionPerformed(evt);
            }
        });
        add(btnDeleteChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 150, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transparentKids.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 480, 330));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VIEW CHILD RECORDS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 370, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewChildActionPerformed
        
        /*This set of code will take the UI to the vie child details*/
        int selectedRow = tblNewChild.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a child to view details");
            return;
        }
        child = (Child) tblNewChild.getValueAt(selectedRow, 0);
        ViewChildDetailsJPanel panel = new ViewChildDetailsJPanel(userProcessContainer, child);
        this.userProcessContainer.add("ViewChildDetailsJPanel", panel);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewChildActionPerformed

    private void btnDeleteChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteChildActionPerformed
        int selectedRow = tblNewChild.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a child to delete");
        }
        Child ch = (Child) tblNewChild.getValueAt(selectedRow, 0);
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the child?", "Alert", JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == 0) {
            childdirectory.removeChild(ch);
            List<Organization> list = new ArrayList<>();
            for (Network network : business.getNetworkList()) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (this.network.equals(network)) {
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof DoctorOrganization || organization instanceof PharmacistOrganization || organization instanceof LabOrganization) {
                                list.add(organization);
                            }
                        }
                    }
                }
            }
            for (Organization org : list) {
                org.getWorkQueue().delete(ch.getChildId());
            }
            account.getWorkQueue().delete(ch.getChildId());
            business.getWorkQueue().delete(ch.getChildId());
        }
        poplulateTable();
    }//GEN-LAST:event_btnDeleteChildActionPerformed

 
    public void poplulateTable() {
        DefaultTableModel dtms = (DefaultTableModel) tblNewChild.getModel();
        dtms.setRowCount(0);
        if (childdirectory != null && childdirectory.getChildList() != null && childdirectory.getChildList().size() > 0) {
            for (Child child : childdirectory.getChildList()) {
                Object[] row = new Object[dtms.getColumnCount()];
                row[0] = child;
                row[1] = child.getName();
                row[2] = child.getGender();
                row[3] = child.getChildAge();
                row[4] = child.getStatus();
                row[5] = child.getMedicalStatus();
                dtms.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteChild;
    private javax.swing.JButton btnViewChild;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNewChild;
    // End of variables declaration//GEN-END:variables
}
