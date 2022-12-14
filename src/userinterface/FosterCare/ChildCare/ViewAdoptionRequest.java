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
import Business.Utils.CommonMail;
import Business.WorkQueue.AdopterStatusCheckWorkRequest;
import Business.WorkQueue.ChildCareAdoptionWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class ViewAdoptionRequest extends javax.swing.JPanel {

    /**
     * Creates new form ViewAdoptionRequest
     */
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;
    UserAccount account;
    ChildCareOrganization childCareOrganization;
    ChildDirectory childdirectory;
    Child child;
    EcoSystem business;
    AdopterDirectory adopterdirectory;
    Adopter adopter;
    Role roler;
    Network network;
    
    
    public ViewAdoptionRequest(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdopterDirectory adopterdirectory) {
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
        populateWorkRequest();
    }
    
    public void populateWorkRequest(){
        DefaultTableModel dtms = (DefaultTableModel) tblReq.getModel();
        dtms.setRowCount(0);
        for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
            if (req instanceof ChildCareAdoptionWorkRequest) {
                Object[] row = new Object[dtms.getColumnCount()];
                row[0] = req;
                row[1] = req.getChildId();
                row[2] = req.getChildName();
                row[3] = ((ChildCareAdoptionWorkRequest) req).getAdopterName();
                row[4] = req.getStatus();
                dtms.addRow(row);
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
        tblAdoptionReq = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW ADOPTION REQUEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 287, 32));

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Child ID", "Child Name", "Adopter Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdoptionReq.setViewportView(tblReq);

        add(tblAdoptionReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 708, 140));

        btnProcess.setBackground(new java.awt.Color(255, 255, 255));
        btnProcess.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 130, -1));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adp.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 730, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReq.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        ChildCareAdoptionWorkRequest req = (ChildCareAdoptionWorkRequest) tblReq.getValueAt(selectedRow, 0);
         
        if ("Approved".equalsIgnoreCase(req.getStatus())) {
            JOptionPane.showMessageDialog(null, "Request already completed.");
            return;
        } else {
            req.setStatus("Approved");
            populateWorkRequest();
            String name="";
            for (Child ch : childdirectory.getChildList()) {
                if (ch.getChildId() == req.getChildId()) {
                    name= ch.getName();
                    ch.setStatus("Adopted by " + req.getAdopterName());
                }
            }
             for (WorkRequest wreq : business.getWorkQueue().getWorkRequestList()) {
                   
                        if (wreq instanceof AdopterStatusCheckWorkRequest) {
                             if (wreq.getUserId() == req.getUserId()) {
                            ((AdopterStatusCheckWorkRequest) wreq).setFinanceStatus("Approved");
                            ((AdopterStatusCheckWorkRequest) wreq).setBgcStatus("Approved");
                             ((AdopterStatusCheckWorkRequest) wreq).setChildCareStatus("Processed");
                           
                        }
                    }
                }
            String subject = "Congratulations! Your adoption request is approved";
            String content = "We are happy to inform you that your adoption request has been approved. We are sure that " +name+ " will witness loving attention from you.";
            CommonMail.sendEmailMessage(req.getEmailId(), subject, content);
            JOptionPane.showMessageDialog(null, "Child Adopted");
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateWorkRequest();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane tblAdoptionReq;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}
