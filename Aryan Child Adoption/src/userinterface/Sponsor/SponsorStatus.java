/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Sponsor;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.Donor.Donor;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonorWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author snehaswaroop
 */
public class SponsorStatus extends javax.swing.JPanel {

    /**
     * Creates new form DonorStatus
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    DonorOrganization donororganization;
    Donor donor;
    ChildDirectory childdirectory;
    DonorDirectory donorDirectory;
    
    public SponsorStatus(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory, ChildDirectory childdirectory, DonorDirectory donorDirectory) {
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
        populateWorkRequestTable();
    }
    
    public void populateWorkRequestTable(){
        DefaultTableModel table = (DefaultTableModel) workReqTable.getModel();
        table.setRowCount(0);
        for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
            if (req instanceof DonorWorkRequest) {
                DonorWorkRequest request = (DonorWorkRequest) req;
                req.setReceiver(account);
                if (request.getUserName().equalsIgnoreCase(account.getUsername())) {
                    Object[] row = new Object[table.getColumnCount()];
                    row[0] = req;
                    row[1] = req.getReceiver();
                    row[2] = req.getChildId();
                    row[3] = req.getChildName();
                    row[4] = ((DonorWorkRequest) req).getAmount();
                    row[5] = req.getStatus();
                    table.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workReqTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAYMENT STATUS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 380, 30));

        workReqTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        workReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Reciever", "Child ID", "Child Name", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workReqTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 910, 137));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccard.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 740, 480));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workReqTable;
    // End of variables declaration//GEN-END:variables
}
