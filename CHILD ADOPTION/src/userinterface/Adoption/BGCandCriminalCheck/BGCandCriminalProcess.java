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
import Business.Network.Network;
import Business.Organization.BackgroundAndCriminalCheckOrganization;
import Business.Organization.FinanceCheckOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Utils.CommonMail;
import Business.WorkQueue.AdopterStatusCheckWorkRequest;
import Business.WorkQueue.BGVProcessWorkRequest;
import Business.WorkQueue.FinanceCheckProcessWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BGCandCriminalProcess extends javax.swing.JPanel {

    /**
     * Creates new form BGCandCriminalProcess
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory adopterdirectory;
    BackgroundAndCriminalCheckOrganization bgcOrganization;
    Adopter adopter;
    BGVProcessWorkRequest bgcWorkRequest;
    
    public BGCandCriminalProcess(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory, BGVProcessWorkRequest bgcWorkRequest, Adopter adopter) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.adopterdirectory=adopterdirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.bgcOrganization = (BackgroundAndCriminalCheckOrganization)organization;
        this.bgcWorkRequest = bgcWorkRequest;
        this.adopter = adopter;
        populateWorkRequest();
        setUserDetailsField();
        
        txtName.setEnabled(false);
        txtAge.setEnabled(false);
        txtSSN.setEnabled(false);
        rdbMale.setEnabled(false);
        rdbFemale.setEnabled(false);
        txtIncome.setEnabled(false);
        txtEmail.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtIncome = new javax.swing.JTextField();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        lblRemarks = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        btnDeny = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("BACKGROUND AND CRIMINAL CHECK PROCESS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("ADOPTER DETAILS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 150, 20));

        lblEmail.setText("Email ID");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 90, 20));

        lblName.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, 20));

        lblAge.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 110, 20));

        lblSSN.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSSN.setText("SSN");
        add(lblSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 110, 20));

        lblGender.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 110, 20));

        lblIncome.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblIncome.setText("Income");
        add(lblIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 90, 20));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 180, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 190, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 190, -1));
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 190, -1));
        add(txtIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 180, 30));

        rdbMale.setText("Male");
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 70, -1));

        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        tblRequest.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Adopter ID", "Adopter Name", "Status"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 850, 160));

        lblRemarks.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblRemarks.setText("Remarks");
        add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 90, -1));

        txtRemarks.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtRemarks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 210, 70));

        btnApprove.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 140, -1));

        btnDeny.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnDeny.setText("Deny");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });
        add(btnDeny, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 830, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the request to proceed.");
            return;
        }

        Object statusval = tblRequest.getValueAt(selectedRow, 5);
        Object receiverval = tblRequest.getValueAt(selectedRow, 2);

        if ("Approved".equals(statusval) || "Denied".equals(statusval)) {
            JOptionPane.showMessageDialog(null, "Request already processed");
        } else {

            if (receiverval.equals(account.getUsername())) {

                BGVProcessWorkRequest request = (BGVProcessWorkRequest) tblRequest.getValueAt(selectedRow, 0);
                request.setStatus("Approved");
                request.setComment(txtRemarks.getText());
                request.setUserId(adopter.getUserId());
                request.setBgcStatus("Approved");
                populateWorkRequest();
                FinanceCheckProcessWorkRequest fcwreq = new FinanceCheckProcessWorkRequest();
                fcwreq.setMessage("Please initiate Finance check");
                fcwreq.setStatus("Pending with Finance organization");
                fcwreq.setSender(account);
                fcwreq.setUserId(adopter.getUserId());
                fcwreq.setName(adopter.getName());

                Organization org = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof FinanceCheckOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(fcwreq);
                    account.getWorkQueue().getWorkRequestList().add(fcwreq);
                    business.getWorkQueue().getWorkRequestList().add(fcwreq);
                }

                for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
                    if (req.getUserId() == adopter.getUserId()) {
                        if (req instanceof AdopterStatusCheckWorkRequest) {
                            ((AdopterStatusCheckWorkRequest) req).setFinanceStatus("Pending");
                            ((AdopterStatusCheckWorkRequest) req).setBgcStatus("Approved");
                            ((AdopterStatusCheckWorkRequest) req).setMessage("Finance check initialized");
                        }
                    }
                }
                String subject = "Background Check Approved";
                String content = "Your background check has been completed and approved. The request is further sent to Finance check team .You can confirm your status through portal. \nThank you";
                CommonMail.sendEmailMessage(adopter.getEmailId(), subject, content);
                JOptionPane.showMessageDialog(null, "Finance check initialized successfully!");

            } else {
                JOptionPane.showMessageDialog(null, "Please select work request assigned to you");
            }
            txtRemarks.setText("");
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the request to proceed.");
            return;
        }

        Object statusval = tblRequest.getValueAt(selectedRow, 5);
        Object receiverval = tblRequest.getValueAt(selectedRow, 2);
        if ("Approved".equals(statusval) || "Denied".equals(statusval)) {
            JOptionPane.showMessageDialog(null, "Request already processed");
        } else {
            if (receiverval.equals(account.getUsername())) {

                BGVProcessWorkRequest request = (BGVProcessWorkRequest) tblRequest.getValueAt(selectedRow, 0);

                request.setStatus("Denied");
                request.setComment(txtRemarks.getText());
                request.setSender(account);
                request.setUserId(adopter.getUserId());
                request.setBgcStatus("Denied");
                populateWorkRequest();

                for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
                    if (req.getUserId() == adopter.getUserId()) {
                        if (req instanceof AdopterStatusCheckWorkRequest) {
                            if (((AdopterStatusCheckWorkRequest) req).getFinanceStatus().equals("Pending")) {
                                ((AdopterStatusCheckWorkRequest) req).setFinanceStatus("Cancelled");
                                ((AdopterStatusCheckWorkRequest) req).setBgcStatus("Denied");
                                ((AdopterStatusCheckWorkRequest) req).setMessage("BGC Failed.Request cancelled");

                            }
                        }
                    }
                }
                String subject = "Background Verification failed";
                String content = "We are sorry to inform you that your background check has been failed and cannot proceed with adoption procedure .You can confirm your status through portal. \nThank you";
                CommonMail.sendEmailMessage(adopter.getEmailId(), subject, content);
                JOptionPane.showMessageDialog(null, "Background check denied. Adopt request cancelled");
            } else {
                JOptionPane.showMessageDialog(null, "Please select work request assigned to you");
            }
            txtRemarks.setText("");
        }
    }//GEN-LAST:event_btnDenyActionPerformed
    
    public void populateWorkRequest() {

        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : bgcOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof BGVProcessWorkRequest) {
                if (request.getUserId() == bgcWorkRequest.getUserId()) {
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
    }

    public void setUserDetailsField() {
        txtAge.setText(String.valueOf(adopter.getAge()));
        txtEmail.setText(adopter.getEmailId());
        txtIncome.setText(String.valueOf(adopter.getAnnualIncome()));
        txtName.setText(adopter.getName());
        txtSSN.setText(adopter.getSsn());
        if (adopter.getGender().equalsIgnoreCase("male")) {
            rdbMale.setSelected(true);
        } else {
            rdbFemale.setSelected(true);
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDeny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
