/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FundingRoleAdmin;

import Business.Adopter.AdopterDirectory;
import Business.Donor.Donor;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.DonorRole;
import Business.UserAccount.UserAccount;
import Business.Utils.CommonMail;
import Business.WorkQueue.DonorRegistrationRequest;
import Business.WorkQueue.DonorWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kunjan
 */
public class FundingUnitWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundingUnitWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    private OrganizationDirectory organizationDirectory;
    AdopterDirectory adopterdirectory;
    DonorDirectory donorDirectory;

    public FundingUnitWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system, AdopterDirectory adopterdirectory, DonorDirectory donorDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.business = system.getInstance();
        this.adopterdirectory = adopterdirectory;
        this.donorDirectory = donorDirectory;
        this.organizationDirectory = enterprise.getOrganizationDirectory();
        this.business = system.getInstance();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DonorRegistrationRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((DonorRegistrationRequest) workRequest).getName();
                row[2] = ((DonorRegistrationRequest) workRequest).getUserEmailId();
                row[3] = ((DonorRegistrationRequest) workRequest).getUserContact();
                row[4] = ((DonorRegistrationRequest) workRequest).getSsn();
                row[5] = ((DonorRegistrationRequest) workRequest).getStatus();
                model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRefresh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(25, 56, 82));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "UserName", "Name", "Email ID", "Contact", "SSN", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 870, 170));

        assignJButton.setBackground(new java.awt.Color(255, 255, 255));
        assignJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(25, 56, 82));
        assignJButton.setText("Assign To Me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        processJButton.setBackground(new java.awt.Color(255, 255, 255));
        processJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        processJButton.setForeground(new java.awt.Color(25, 56, 82));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 130, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE SPONSOR WORK REQUEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 41, 431, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employee.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 960, 620));

        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshBtn.png"))); // NOI18N
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshMousePressed(evt);
            }
        });
        add(lblRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 40, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            //if (request.getStatus().equalsIgnoreCase("Completed")) {
            if ("Completed".equalsIgnoreCase(request.getStatus())) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Pending");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request has successfully assigned");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to process.");
            return;
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        try {
            if (selectedRow >= 0) {
                DonorRegistrationRequest request = (DonorRegistrationRequest) workRequestJTable.getValueAt(selectedRow, 0);
                //if (request.getStatus().equalsIgnoreCase("Completed")) {
                if ("Completed".equalsIgnoreCase(request.getStatus())) {
                    JOptionPane.showMessageDialog(null, "Request already processed.");
                    return;
                }
                Organization org = organizationDirectory.createOrganization(request.getName(), Organization.Type.Donor);
                Employee emp = org.getEmployeeDirectory().createEmployee(request.getName());
                UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(request.getUserName(), request.getUserPassword(), emp, new DonorRole());
                Donor donor = new Donor();
                int uid = donorDirectory.getDonorsList().size() + 1;
                donor = this.donorDirectory.addDonor();
                donor.setAnnualIncome(Long.parseLong(request.getUserContact()));
                donor.setEmailId(request.getUserEmailId());
                donor.setName(request.getUserName());
                donor.setSsn(request.getSsn());
                donor.setUserId(uid);
                donor.setUsername(ua1.getUsername());
                DonorWorkRequest awr = new DonorWorkRequest();
                awr.setStatus("");
                awr.setMessage("Sponsor request");
                awr.setSender(ua1);
                awr.setUserId(donor.getUserId());
                awr.setName(donor.getName());
                request.setStatus("Completed");
                String subject = "Account activation";
                String content = "Dear Sponsor, your account has been activated. You may proceed with further process of funding. \n Thank you";
                CommonMail.sendEmailMessage(request.getUserEmailId(), subject, content);
                JOptionPane.showMessageDialog(null, "User account has been activated successfully");
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "Please select a request message to process.");
                return;
            }
        } catch (Exception e) {
            //System.out.println("Error");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void lblRefreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMousePressed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_lblRefreshMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
