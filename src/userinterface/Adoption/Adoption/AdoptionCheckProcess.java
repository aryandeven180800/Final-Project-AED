/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Adoption.Adoption;

import Business.Adopter.Adopter;
import Business.Adopter.AdpDirec;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdopterOrganization;
import Business.Organization.AdoptionOrganization;
import Business.Organization.BackgroundAndCriminalCheckOrganization;
import Business.Organization.Organization;
import Business.UAcc.UAcc;
import Business.Utils.CommonMail;
import Business.WorkQueue.AdopterStatusCheckWorkRequest;
import Business.WorkQueue.AdoptionProcessWorkRequest;
import Business.WorkQueue.BGVProcessWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anushree_j
 */
public class AdoptionCheckProcess extends javax.swing.JPanel {

    /**
     * Creates new form AdoptionCheckProcess
     */
    
    JPanel userProcessContainer;
    UAcc account;
    Enterprise enterprise;
    EcoSystem business;
    AdpDirec adopterdirectory;
    AdoptionOrganization adoptionOrganization;
    Adopter adopter;
    AdoptionProcessWorkRequest adoptionWorkRequest;
    
    public AdoptionCheckProcess(JPanel userProcessContainer,UAcc account, Organization organization, Enterprise enterprise, EcoSystem business, AdpDirec adopterdirectory, AdoptionProcessWorkRequest adoptionWorkRequest, Adopter adopter) {
        initComponents();
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.adopterdirectory=adopterdirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.adoptionOrganization = (AdoptionOrganization)organization;
        this.adopter = adopter;
        this.adoptionWorkRequest = adoptionWorkRequest;
        populateWorkRequest();
        setUserDetailsField();
        textname.setEnabled(false);
        agetext.setEnabled(false);
        emailtext.setEnabled(false);
        incometext.setEnabled(false);
        maleclick.setEnabled(false);
        femaleclick.setEnabled(false);
        ssntext.setEnabled(false);
    }
    
    public void setUserDetailsField() {
        agetext.setText(String.valueOf(adopter.getAge()));
        emailtext.setText(adopter.getEmailId());
        incometext.setText(String.valueOf(adopter.getAnnualIncome()));
        textname.setText(adopter.getName());
        ssntext.setText(adopter.getSsn());
        if (adopter.getGender().equalsIgnoreCase("Male")) {
            maleclick.setSelected(true);
        } else {
            femaleclick.setSelected(true);
        }
    }

    public void populateWorkRequest() {

        DefaultTableModel model = (DefaultTableModel) tableforadpprocess.getModel();
        model.setRowCount(0);

        for (WorkRequest request : adoptionOrganization.getWorkQueue().getWorkRequestList()) {

            if (request instanceof AdoptionProcessWorkRequest) {
                if (request.getUserId() == adoptionWorkRequest.getUserId()) {
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = request;
                    row[1] = request.getName();
                    row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    row[3] = request.getUserId();
                    row[4] = request.getStatus();
                    model.addRow(row);
                }
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

        adoptionprocess = new javax.swing.JLabel();
        labelAdopDetailmain = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        agelabe = new javax.swing.JLabel();
        genlab = new javax.swing.JLabel();
        ssnlab = new javax.swing.JLabel();
        incomelab = new javax.swing.JLabel();
        emaillab = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        textname = new javax.swing.JTextField();
        agetext = new javax.swing.JTextField();
        ssntext = new javax.swing.JTextField();
        incometext = new javax.swing.JTextField();
        maleclick = new javax.swing.JRadioButton();
        femaleclick = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableforadpprocess = new javax.swing.JTable();
        buttonbcginitiate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblRefresh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adoptionprocess.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        adoptionprocess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adoptionprocess.setText("ADOPTION PROCESS");
        add(adoptionprocess, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 460, 30));

        labelAdopDetailmain.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        labelAdopDetailmain.setText("Adopter Details");
        add(labelAdopDetailmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 180, 20));

        namelabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namelabel.setText("Name");
        add(namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 20));

        agelabe.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        agelabe.setText("Age");
        add(agelabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 80, -1));

        genlab.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        genlab.setText("Gender");
        add(genlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 60, -1));

        ssnlab.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ssnlab.setText("SSN");
        add(ssnlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 50, 20));

        incomelab.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        incomelab.setText("Income");
        add(incomelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 70, -1));

        emaillab.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emaillab.setText("Email ID");
        add(emaillab, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 70, -1));

        emailtext.setEditable(false);
        add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 200, -1));

        textname.setEditable(false);
        add(textname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 210, -1));

        agetext.setEditable(false);
        add(agetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 210, 30));

        ssntext.setEditable(false);
        add(ssntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 200, -1));

        incometext.setEditable(false);
        add(incometext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 200, -1));

        maleclick.setText("Male");
        maleclick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleclickActionPerformed(evt);
            }
        });
        add(maleclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        femaleclick.setText("Female");
        add(femaleclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        tableforadpprocess.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tableforadpprocess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Name", "Receiver", "Adopter ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableforadpprocess);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 810, 110));

        buttonbcginitiate.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        buttonbcginitiate.setText("Initiate BGC");
        buttonbcginitiate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbcginitiateActionPerformed(evt);
            }
        });
        add(buttonbcginitiate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 150, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kids11.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 930, 510));

        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshBtn.png"))); // NOI18N
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshMousePressed(evt);
            }
        });
        add(lblRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 30, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void maleclickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleclickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleclickActionPerformed

    private void buttonbcginitiateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbcginitiateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableforadpprocess.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a workrequest");
            return;
        }

        Object receiverval = tableforadpprocess.getValueAt(selectedRow, 2);
        Object statusval = tableforadpprocess.getValueAt(selectedRow, 4);
        AdoptionProcessWorkRequest request = (AdoptionProcessWorkRequest) tableforadpprocess.getValueAt(selectedRow, 0);

        if ("Initialized BGC".equalsIgnoreCase(request.getStatus())) {
            JOptionPane.showMessageDialog(null, "BGC already initiated");
        } else {
            if (receiverval.equals(account.getUsername()) && "Pending with Adoption Organization".equals(statusval)) {
                request.setStatus("Initialized BGC");
                request.setSender(account);
                request.setUserId(adopter.getUserId());
                request.setName(adopter.getName());

                //populateWorkRequest();
                BGVProcessWorkRequest bgcreq = new BGVProcessWorkRequest();
                bgcreq.setMessage("Please initiate BGC");
                bgcreq.setStatus("Pending with BGC organization");
                bgcreq.setSender(account);
                bgcreq.setUserId(adopter.getUserId());
                bgcreq.setName(adopter.getName());

                Organization org = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof BackgroundAndCriminalCheckOrganization) {

                                org = organization;
                                break;
                            }
                        }
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(bgcreq);
                    account.getWorkQueue().getWorkRequestList().add(bgcreq);
                    business.getWorkQueue().getWorkRequestList().add(bgcreq);
                }

                AdopterStatusCheckWorkRequest wrk = new AdopterStatusCheckWorkRequest();
                wrk.setUserId(adopter.getUserId());
                wrk.setBgcStatus("Pending");
                wrk.setFinanceStatus("Pending");
                wrk.setMessage("BGC initialized");
                wrk.setName(adopter.getName());

                Organization org1 = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof AdopterOrganization) {
                                        if(adopter.getName().equalsIgnoreCase(organization.getName())){
                                org1 = organization;
                                break;
                                        }
                            }
                        }
                    }
                }

                if (org1 != null) {
                    org1.getWorkQueue().getWorkRequestList().add(wrk);
                    account.getWorkQueue().getWorkRequestList().add(wrk);
                    business.getWorkQueue().getWorkRequestList().add(wrk);
                }
                String subject = "Background check process initiated";
                String content = "Your background check process has been initiated and sent to respective team. You can check your status through your credentials. \nThank you.";
                CommonMail.sendEmailMessage(adopter.getEmailId(), subject, content);
                JOptionPane.showMessageDialog(null, "BGC check initialized successfully!");
            } else if (!receiverval.equals(account.getUsername())) {
                JOptionPane.showMessageDialog(null, "Please select the work request assigned to you to proceed");
            } else if (!"Pending with Adoption Organization".equals(statusval)) {
                JOptionPane.showMessageDialog(null, "The selected work request assigned to you is already processed");
            }
        }
    }//GEN-LAST:event_buttonbcginitiateActionPerformed

    private void lblRefreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMousePressed
        // TODO add your handling code here:
        populateWorkRequest();
    }//GEN-LAST:event_lblRefreshMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adoptionprocess;
    private javax.swing.JLabel agelabe;
    private javax.swing.JTextField agetext;
    private javax.swing.JButton buttonbcginitiate;
    private javax.swing.JLabel emaillab;
    private javax.swing.JTextField emailtext;
    private javax.swing.JRadioButton femaleclick;
    private javax.swing.JLabel genlab;
    private javax.swing.JLabel incomelab;
    private javax.swing.JTextField incometext;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAdopDetailmain;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JRadioButton maleclick;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel ssnlab;
    private javax.swing.JTextField ssntext;
    private javax.swing.JTable tableforadpprocess;
    private javax.swing.JTextField textname;
    // End of variables declaration//GEN-END:variables
}
