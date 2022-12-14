/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Donor.DonorDirectory;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.UserRegisteration.SponsorRegistrationJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import userinterface.UserRegisteration.AdopterRegistrationJPanel;
;

/**
 *
 * @author LENOVO
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    Enterprise inEnterprise;
    Organization inOrganization;
    Network networkEmergency;
    private ChildDirectory childdirectory;
    private AdopterDirectory adopterdirectory;
    private DonorDirectory donorDirectory;
    

    public MainJFrame() {
        this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        UpperPanel.setVisible(false);
        this.setSize(1250, 800);
        //getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        adopterdirectory = system.getAdopterdirectory();
        childdirectory = system.getChilddirectory();
        donorDirectory = system.getDonorDirectory();

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
        UpperPanel = new javax.swing.JPanel();
        btnLogoutLabel = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        upperPanel = new javax.swing.JPanel();
        lblPic = new javax.swing.JLabel();
        UserPanel = new javax.swing.JPanel();
        lblUserPic = new javax.swing.JLabel();
        lblUserName = new javax.swing.JTextField();
        lblPwd = new javax.swing.JPanel();
        lblPwdPic = new javax.swing.JLabel();
        lblPasswrd = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        lblAdopt = new javax.swing.JLabel();
        lblSponsor = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        lblBottom = new javax.swing.JLabel();
        lblSupport = new javax.swing.JLabel();
        lblInfo = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        lblCancel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cc.jpeg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 23, 1338, 900));
        setMinimumSize(new java.awt.Dimension(1338, 900));
        setSize(new java.awt.Dimension(1338, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpperPanel.setBackground(new java.awt.Color(255, 255, 255));
        UpperPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        UpperPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        UpperPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnLogoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnLogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout2.png"))); // NOI18N
        btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMousePressed(evt);
            }
        });
        UpperPanel.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 60, 50));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackIcon.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackMousePressed(evt);
            }
        });
        UpperPanel.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, 50, 40));

        getContentPane().add(UpperPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setPreferredSize(new java.awt.Dimension(1338, 840));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1338, 1048));

        loginJPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 900));
        loginJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperPanel.setBackground(new java.awt.Color(255, 255, 255));
        upperPanel.setPreferredSize(new java.awt.Dimension(840, 554));

        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cc.jpeg"))); // NOI18N

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPanelLayout.createSequentialGroup()
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 1567, Short.MAX_VALUE)
                .addContainerGap())
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        loginJPanel.add(upperPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1340, 300));

        UserPanel.setBackground(new java.awt.Color(255, 255, 255));
        UserPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 153)));
        UserPanel.setPreferredSize(new java.awt.Dimension(302, 34));

        lblUserPic.setBackground(new java.awt.Color(255, 255, 255));
        lblUserPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        lblUserName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblUserName.setToolTipText("");
        lblUserName.setBorder(null);
        lblUserName.setCaretColor(new java.awt.Color(255, 255, 255));
        lblUserName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUserNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addComponent(lblUserPic, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUserPic, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(lblUserName)
        );

        loginJPanel.add(UserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 300, 40));

        lblPwd.setBackground(new java.awt.Color(255, 255, 255));
        lblPwd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 153)));
        lblPwd.setPreferredSize(new java.awt.Dimension(302, 34));

        lblPwdPic.setBackground(new java.awt.Color(255, 255, 255));
        lblPwdPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPwdPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pwdIcon.png"))); // NOI18N

        lblPasswrd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblPasswrd.setBorder(null);
        lblPasswrd.setCaretColor(new java.awt.Color(255, 255, 255));
        lblPasswrd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblPasswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPasswrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblPwdLayout = new javax.swing.GroupLayout(lblPwd);
        lblPwd.setLayout(lblPwdLayout);
        lblPwdLayout.setHorizontalGroup(
            lblPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPwdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPwdPic, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        lblPwdLayout.setVerticalGroup(
            lblPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPwdPic, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(lblPasswrd)
        );

        loginJPanel.add(lblPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, 300, 40));

        lblLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblLogin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");
        lblLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 153)));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLoginMousePressed(evt);
            }
        });
        loginJPanel.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 680, 300, 40));

        lblAdopt.setBackground(new java.awt.Color(255, 204, 153));
        lblAdopt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAdopt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdopt.setText("ADOPT A CHILD");
        lblAdopt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 153)));
        lblAdopt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAdoptMousePressed(evt);
            }
        });
        loginJPanel.add(lblAdopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, 150, 40));

        lblSponsor.setBackground(new java.awt.Color(255, 204, 153));
        lblSponsor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSponsor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSponsor.setText("SPONSOR A CHILD");
        lblSponsor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 153)));
        lblSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSponsorMousePressed(evt);
            }
        });
        loginJPanel.add(lblSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 160, 40));

        lblBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cc copy.jpeg"))); // NOI18N
        lblBottom.setText("jLabel5");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        loginJPanel.add(bottomPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 1340, 110));

        lblSupport.setFont(new java.awt.Font("SansSerif", 3, 20)); // NOI18N
        lblSupport.setForeground(new java.awt.Color(255, 0, 0));
        lblSupport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSupport.setText("Your support can change the life of a child");
        loginJPanel.add(lblSupport, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 450, 40));

        lblInfo.setBorder(null);
        lblInfo.setForeground(new java.awt.Color(255, 0, 255));

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jTextPane1.setText("\"The world may not change if you adopt a child but for that child, their world will change.\" ");
        lblInfo.setViewportView(jTextPane1);

        loginJPanel.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 720, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Together, we can make the world a better place for children everywhere");
        loginJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 760, 30));

        lblInfo1.setBorder(null);
        lblInfo1.setForeground(new java.awt.Color(255, 0, 255));

        jTextPane3.setEditable(false);
        jTextPane3.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jTextPane3.setText("\"When you sponsor a child, you're helping to ensure they can grow up healthy, learning and safe ??? no matter where they were born. Many children around the world aren???t getting the opportunity to reach their full potential. As a sponsor, you can help change that.\"");
        lblInfo1.setViewportView(jTextPane3);

        loginJPanel.add(lblInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 720, 100));

        lblCancel1.setBackground(new java.awt.Color(255, 255, 255));
        lblCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-16.png"))); // NOI18N
        lblCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCancel1MousePressed(evt);
            }
        });
        loginJPanel.add(lblCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 40, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/44480953_248901905791534_9111493881165250560_n.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        loginJPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 230, 180));

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMousePressed
        logout();
    }//GEN-LAST:event_btnLogoutLabelMousePressed

    private void lblUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUserNameActionPerformed

    private void lblPasswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPasswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPasswrdActionPerformed

    private void lblLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMousePressed
        // TODO add your handling code here:
        String userName = lblUserName.getText();
        char[] passwordCharArray = lblPasswrd.getPassword();
        String password = String.valueOf(passwordCharArray);

        userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        inEnterprise = null;
        inOrganization = null;
        networkEmergency = null;

        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    networkEmergency = network;
                    if (userAccount == null) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                networkEmergency = network;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            loginJPanel.setVisible(false);
            container.setVisible(true);
            UpperPanel.setVisible(true);
            btnLogoutLabel.setVisible(true);
            //btnBackLabel.setVisible(false);
            lblUserName.setText("");
            lblPasswrd.setText("");
            if (userAccount != null && userAccount.getRole() != null) {
            
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, childdirectory, adopterdirectory,donorDirectory));
            
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }
        }

    }//GEN-LAST:event_lblLoginMousePressed

    private void lblAdoptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdoptMousePressed
        // TODO add your handling code here:
        AdopterRegistrationJPanel panel = new AdopterRegistrationJPanel(container, system);
        //greetingUserLabel.setText("ADOPTER REGISTRATION FORM!!!");
        loginJPanel.setVisible(false);
        container.setVisible(true);
        UpperPanel.setVisible(true);
        btnLogoutLabel.setVisible(false);
        lblUserName.setText("");
        lblPasswrd.setText("");
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
            
    }//GEN-LAST:event_lblAdoptMousePressed

    private void lblSponsorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSponsorMousePressed
        // TODO add your handling code here:
        SponsorRegistrationJPanel panel = new SponsorRegistrationJPanel(container, system);
        //greetingUserLabel.setText("DONOR REGISTRATION FORM!!!");
        loginJPanel.setVisible(false);
        container.setVisible(true);
        UpperPanel.setVisible(true);
        btnLogoutLabel.setVisible(false);
        lblUserName.setText("");
        lblPasswrd.setText("");
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_lblSponsorMousePressed

    private void lblBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMousePressed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_lblBackMousePressed

    private void lblCancel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancel1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCancel1MousePressed

    private void logout() {
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        UpperPanel.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel btnLogoutLabel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel lblAdopt;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblCancel1;
    private javax.swing.JScrollPane lblInfo;
    private javax.swing.JScrollPane lblInfo1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPasswordField lblPasswrd;
    private javax.swing.JLabel lblPic;
    private javax.swing.JPanel lblPwd;
    private javax.swing.JLabel lblPwdPic;
    private javax.swing.JLabel lblSponsor;
    private javax.swing.JLabel lblSupport;
    private javax.swing.JTextField lblUserName;
    private javax.swing.JLabel lblUserPic;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables

}
