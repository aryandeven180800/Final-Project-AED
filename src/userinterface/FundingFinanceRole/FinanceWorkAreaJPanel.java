/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FundingFinanceRole;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationalHelpWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anushree_j
 */
public class FinanceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinanceWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    FinanceOrganization financeOrphanageOrganization;
    Enterprise enterprise;
    EcoSystem business;
    ChildDirectory childdirectory;
    
   
public FinanceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.financeOrphanageOrganization = (FinanceOrganization) organization;
        this.enterprise = enterprise;
        this.childdirectory = childdirectory;
        this.business = business;
        btnProcess.setEnabled(false);
        populateRequesttable();
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
        jTable1 = new javax.swing.JTable();
        btnAssigToMe = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Child ID", "Remarks", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 890, 160));

        btnAssigToMe.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnAssigToMe.setText("Assign To Me");
        btnAssigToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigToMeActionPerformed(evt);
            }
        });
        add(btnAssigToMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 133, 33));

        btnProcess.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 133, 33));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIEW FUND REQUESTS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/finance-png-20994.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 630, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        EducationalHelpWorkRequest req = (EducationalHelpWorkRequest) jTable1.getValueAt(selectedRow, 0);
        //if (req.getStatus().equalsIgnoreCase("Approved")) {
        if ("Approved".equalsIgnoreCase(req.getStatus())) {
            JOptionPane.showMessageDialog(null, "Request already processed.");
            return;
        }
        if (this.childdirectory != null && this.childdirectory.getChildList().size() > 0) {
            for (Child ch : this.childdirectory.getChildList()) {
                if (req.getChildId() == ch.getChildId()) {
                    ch.setFinancialHelp(true);
                    ch.setAmt(req.getAmt());
                    break;
                }
            }
        }
        req.setReceiver(account);
        req.setMessage("Send to donors");
        req.setStatus("Approved");
        JOptionPane.showMessageDialog(this, "Request is processed.");
        populateRequesttable();
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAssigToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigToMeActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        EducationalHelpWorkRequest req = (EducationalHelpWorkRequest) jTable1.getValueAt(selectedRow, 0);
        //if (req.getStatus().equalsIgnoreCase("Approved") || req.getStatus().equalsIgnoreCase("Assigned")) {
        if (("Approved".equalsIgnoreCase(req.getStatus())) || ("Assigned".equalsIgnoreCase(req.getStatus()))) {
            JOptionPane.showMessageDialog(null, "Request already processed.");
            return;
        }
        req.setReceiver(account);
        req.setStatus("Assigned");
        JOptionPane.showMessageDialog(this, "Request is assigned.");
        populateRequesttable();
        btnProcess.setEnabled(true);
    }//GEN-LAST:event_btnAssigToMeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssigToMe;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void populateRequesttable() {
        DefaultTableModel dtms = (DefaultTableModel) jTable1.getModel();
        dtms.setRowCount(0);
        for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
            if (req instanceof EducationalHelpWorkRequest) {
                Object[] row = new Object[dtms.getColumnCount()];
                row[0] = req;
                row[1] = req.getSender();
                row[2] = req.getReceiver();
                row[3] = req.getChildId();
                String remarks = ((EducationalHelpWorkRequest) req).getRemarks();
                row[4] = remarks;
                String result = ((EducationalHelpWorkRequest) req).getTestResult();
                row[5] = req.getStatus();
                dtms.addRow(row);
            }

        }

    }
}
