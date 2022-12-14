/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Sponsor;

import Business.Adopter.AdopterDirectory;
import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.Donor.Donor;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anushree_j
 */
public class SponsorRequestTable extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    DonorOrganization donororganization;
    Donor donor;
    ChildDirectory childdirectory;
    DonorDirectory donorDirectory;

    public SponsorRequestTable(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory, ChildDirectory childdirectory, DonorDirectory donorDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        this.donororganization = (DonorOrganization) organization;
        this.childdirectory = childdirectory;
        this.donorDirectory = donorDirectory;
        for (Donor a : donorDirectory.getDonorsList()) {
            if (a.getUsername().equals(account.getUsername())) {
                donor = a;
            }
        }
        populateChildTable();
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
        childTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        childTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Child Id", "Child Name", "Gender", "Age", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(childTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 980, 137));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SPONSOR A CHILD");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 250, 50));

        btnPay.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnPay.setText("Pay With Card");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/happy.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 500, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        int selectedRow = childTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table");
            return;
        }
        Child ch = (Child) childTable.getValueAt(selectedRow, 0);
        PaymentPanel paymentJpanel = new PaymentPanel(userProcessContainer, account, donororganization, enterprise, business, childdirectory, ch, donor);
        this.userProcessContainer.add("PaymentPanel", paymentJpanel);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPayActionPerformed

    public void populateChildTable() {
        DefaultTableModel dtms = (DefaultTableModel) childTable.getModel();
        dtms.setRowCount(0);
        for (Child child : childdirectory.getChildList()) {
            if (child.isFinancialHelp()) {
                Object[] row = new Object[dtms.getColumnCount()];
                row[0] = child;
                row[1] = child.getName();
                row[2] = child.getGender();
                row[3] = child.getChildAge();
                row[4] = child.getAmt();
                dtms.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPay;
    private javax.swing.JTable childTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
