/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterCare.ChildCare;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Organization.ChildCareOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChildCareWorkRequest;
import Business.WorkQueue.MedicalHelpWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 12013
 */
public class ProcessAcquireChild extends javax.swing.JPanel {

    /**
     * Creates new form ProcessChildCareWorkRequest
     */
    JPanel userProcessContainer;
    ChildCareWorkRequest request;
    Child child;
    ChildDirectory childdirectory;
    ChildCareOrganization childCareOrganization;
    UserAccount account;
    EcoSystem business;

    public ProcessAcquireChild(JPanel userProcessContainer, Organization organization, ChildCareWorkRequest request, ChildDirectory childdirectory, Child child, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.childCareOrganization = (ChildCareOrganization) organization;
        this.request = request;
        this.business = business;
        this.child = child;
        this.account = account;
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
        txtRemarks = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Enter Remarks");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 123, 25));

        txtRemarks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 300, 127));

        submitBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        submitBtn.setText("Save");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 110, 33));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setText("PROCESS CHILD CARE REQUEST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 350, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diverse.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 910, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (txtRemarks.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the remarks");
            return;
        }
        String remarks = txtRemarks.getText();
        request.setMessage(remarks);
        request.setStatus("Acquired");
        child.setStatus("Acquired");
        child.setMedicalStatus(child.getMedicalStatus() + "\n" + "Medically Fit on date" + new Date());

        for (WorkRequest req : account.getWorkQueue().getWorkRequestList()) {
            if (request.getSender().getRole().equals(Role.RoleType.Pharmacist.getValue())) {
                if (req instanceof MedicalHelpWorkRequest) {
                    if (req.getChildId() == child.getChildId()) {
                        String result = ((MedicalHelpWorkRequest) req).getTestResult();
                        if (((MedicalHelpWorkRequest) req).getTestResult().equalsIgnoreCase("Under Examination")) {
                            ((MedicalHelpWorkRequest) req).setTestResult("test and medicine comepleted");
                        }
                    }
                }
            }
        }
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AcquireChild panel = (AcquireChild) component;
        panel.populateWorkRequest();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtRemarks;
    // End of variables declaration//GEN-END:variables
}
