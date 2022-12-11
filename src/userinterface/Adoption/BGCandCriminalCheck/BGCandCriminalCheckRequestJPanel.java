/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Adoption.BGCandCriminalCheck;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BackgroundAndCriminalCheckOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BGVProcessWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BGCandCriminalCheckRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BGCandCriminalCheckRequestTable
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory adopterdirectory;
    BackgroundAndCriminalCheckOrganization bgcOrganization;
    Adopter adopter;
    
    public BGCandCriminalCheckRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.adopterdirectory=adopterdirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.bgcOrganization = (BackgroundAndCriminalCheckOrganization)organization;
        this.adopter = adopter; 
        populateWorkRequest();
    }
    
    public void populateWorkRequest() {

        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : bgcOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof BGVProcessWorkRequest) {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getUserId();
                row[4] = request.getName();
                row[5] = request.getStatus();
                dtm.addRow(row);
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

        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("BACKGROUND AND CRIMINAL CHECK REQUESTS");
        add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 511, -1));

        tblRequest.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "UserID", "Adopter Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 930, 170));

        btnAssign.setBackground(new java.awt.Color(255, 255, 255));
        btnAssign.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnAssign.setText("ASSIGN TO ME");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 160, 30));

        btnProcess.setBackground(new java.awt.Color(255, 255, 255));
        btnProcess.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnProcess.setText("PROCESS");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kids5.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 1040, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }
        Object receiverval = tblRequest.getValueAt(selectedRow, 2);
        Object statusval = tblRequest.getValueAt(selectedRow, 5);

        if ("Pending with BGC organization".equals(statusval) || receiverval == null) {
            WorkRequest re = (WorkRequest) tblRequest.getValueAt(selectedRow, 0);
            re.setReceiver(account);
            re.setStatus("BGC organization processing");
            JOptionPane.showMessageDialog(null, "Work request has been assigned to you");
            populateWorkRequest();
        } else {
            if ("Approved".equals(statusval) || "Denied".equals(statusval)) {
                JOptionPane.showMessageDialog(null, "Please select some other request,this work request is already processed");
            } else if (!receiverval.equals(account.getUsername())) {
                JOptionPane.showMessageDialog(null, "Work request is assigned to someone else");
            } else if (receiverval.equals(account.getUsername())) {
                JOptionPane.showMessageDialog(null, "Work request is already assigned to you");
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request");
            return;
        }
        WorkRequest req = (WorkRequest) tblRequest.getValueAt(selectedRow, 0);
        Object receiverval = tblRequest.getValueAt(selectedRow, 2);
        Object statusval = tblRequest.getValueAt(selectedRow, 5);
        for (Adopter a : adopterdirectory.getAdoptersList()) {
            if (a.getUserId() == req.getUserId()) {
                adopter = a;
            }
        }
        if (receiverval == null) {
            JOptionPane.showMessageDialog(null, "Please first assign it to yourself");
        } else {
            if (receiverval.equals(account.getUsername()) && statusval.equals("BGC organization processing")) {
                BGCandCriminalProcess panel = new BGCandCriminalProcess(userProcessContainer, account, bgcOrganization, enterprise, business, adopterdirectory, (BGVProcessWorkRequest) req, adopter);
                this.userProcessContainer.add("BackgroundAndCriminalCheckProcessRequestJPanel", panel);
                CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else if ("Approved".equals(statusval) || "Denied".equals(statusval)) {
                JOptionPane.showMessageDialog(null, "The selected work request is already processed");
            } else if (!receiverval.equals(account.getUsername())) {
                JOptionPane.showMessageDialog(null, "Please select the work request assigned to you to proceed");
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
}
