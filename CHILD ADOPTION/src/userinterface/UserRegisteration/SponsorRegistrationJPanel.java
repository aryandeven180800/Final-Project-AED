/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRegisteration;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Network.Network;
import Business.Utils.CommonMail;
import Business.Utils.ValidationHelper;
import Business.WorkQueue.WorkQueue;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.WorkQueue.DonorRegistrationRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/**
 *
 * @author anushree_j
 */
public class SponsorRegistrationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private ActionListener eventListener;
    private boolean emailValid;
    private boolean contactValid;
    private boolean userUnique;
    private boolean income;
    private boolean age;
    private boolean ssn;
    /**
     * Creates new form UserRegistrationJPanel
     */
    public SponsorRegistrationJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        usernameExistsMessage.setVisible(false);
        emailValidate.setVisible(false);
        ageValidate.setVisible(false);
        SSNValidate.setVisible(false);
        numValidate.setVisible(false);
        IncomeValidate.setVisible(false);
        userNameTick.setVisible(false);
        emailTick.setVisible(false);
        ageTick.setVisible(false);
        ssnTick.setVisible(false);
        numTick.setVisible(false);
        IncomeTick.setVisible(false);
        populateNetworkComboBox();
    }
    
    public void populateNetworkComboBox() {
        cmbCity.removeAllItems();
        for (Network network : system.getNetworkList()) {
            cmbCity.addItem(network);
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
        lblName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPwd = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        lblssn = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        usernameExistsMessage = new javax.swing.JLabel();
        IncomeValidate = new javax.swing.JLabel();
        emailTick = new javax.swing.JLabel();
        IncomeTick = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        lblStreet2 = new javax.swing.JLabel();
        txtAdd2 = new javax.swing.JTextField();
        lblStreet1 = new javax.swing.JLabel();
        txtAdd1 = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        lblAnnual = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        ageTick = new javax.swing.JLabel();
        userNameTick = new javax.swing.JLabel();
        ssnTick = new javax.swing.JLabel();
        numTick = new javax.swing.JLabel();
        emailValidate = new javax.swing.JLabel();
        ageValidate = new javax.swing.JLabel();
        SSNValidate = new javax.swing.JLabel();
        numValidate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1338, 900));
        setPreferredSize(new java.awt.Dimension(1338, 900));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SPONSORER REGISTRATION FORM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 30, 470, -1));

        lblName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(25, 56, 82));
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        txtUserName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(25, 56, 82));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 220, 40));

        lblUserName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(25, 56, 82));
        lblUserName.setText("Username");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        txtName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(25, 56, 82));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 220, 40));

        txtPwd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtPwd.setForeground(new java.awt.Color(25, 56, 82));
        txtPwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPwdKeyTyped(evt);
            }
        });
        add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 220, 40));

        lblPwd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblPwd.setForeground(new java.awt.Color(25, 56, 82));
        lblPwd.setText("Password");
        add(lblPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 62, 20));

        lblEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(25, 56, 82));
        lblEmail.setText("Email Id");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, 20));

        txtAge.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtAge.setForeground(new java.awt.Color(25, 56, 82));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 455, 220, 40));

        txtSSN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtSSN.setForeground(new java.awt.Color(25, 56, 82));
        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });
        txtSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSSNKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSSNKeyTyped(evt);
            }
        });
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 230, 40));

        lblssn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblssn.setForeground(new java.awt.Color(25, 56, 82));
        lblssn.setText("SSN");
        add(lblssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));

        lblContact.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblContact.setForeground(new java.awt.Color(25, 56, 82));
        lblContact.setText("Contact No");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, 30));

        txtContact.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtContact.setForeground(new java.awt.Color(25, 56, 82));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 240, 40));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(25, 56, 82));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 160, -1));

        usernameExistsMessage.setForeground(new java.awt.Color(255, 0, 0));
        usernameExistsMessage.setText("Username already exists");
        add(usernameExistsMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        IncomeValidate.setForeground(new java.awt.Color(255, 0, 0));
        IncomeValidate.setText("Enter numeric value");
        add(IncomeValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 560, 140, -1));

        emailTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(emailTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        IncomeTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(IncomeTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 550, -1, -1));

        lblAge.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 50, -1));

        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(25, 56, 82));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 220, 40));

        lblGender.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, -1));

        rdbMale.setText("Male");
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        lblStreet2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblStreet2.setText("Street Address 2");
        add(lblStreet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, -1, -1));
        add(txtAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 230, 40));

        lblStreet1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblStreet1.setText("Street Address 1");
        add(lblStreet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 120, 20));
        add(txtAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 230, 40));

        lblcity.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblcity.setText("City");
        add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 70, 20));

        add(cmbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 230, 30));

        lblAnnual.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblAnnual.setText("Annual Income");
        add(lblAnnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, 130, -1));

        txtIncome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIncomeKeyReleased(evt);
            }
        });
        add(txtIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 240, 40));

        ageTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(ageTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        userNameTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(userNameTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        ssnTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(ssnTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, -1, -1));

        numTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(numTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 460, -1, -1));

        emailValidate.setForeground(new java.awt.Color(255, 0, 0));
        emailValidate.setText("Email format incorrect");
        add(emailValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        ageValidate.setForeground(new java.awt.Color(255, 0, 0));
        ageValidate.setText("Enter numeric value");
        add(ageValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 140, -1));

        SSNValidate.setForeground(new java.awt.Color(255, 0, 0));
        SSNValidate.setText("Enter valid SSN");
        add(SSNValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 310, 140, -1));

        numValidate.setForeground(new java.awt.Color(255, 0, 0));
        numValidate.setText("Phone format incorrect");
        add(numValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 470, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sponsor.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 1110, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Network network = (Network) cmbCity.getSelectedItem();
        if (txtName.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPwd.getText().isEmpty() || txtEmail.getText().isEmpty()
                || txtSSN.getText().isEmpty() || txtAge.getText().isEmpty()
                || (!rdbMale.isSelected() && !rdbFemale.isSelected())
                || txtIncome.getText().isEmpty()
                || txtAdd1.getText().isEmpty() || txtAdd2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } else if (emailValid && userUnique && contactValid && income && age && ssn) {
            DonorRegistrationRequest registrationRequest = new DonorRegistrationRequest();
            String gender = "";
            if (rdbMale.isSelected()) {
                gender = "Male";
            } else if (rdbFemale.isSelected()) {
                gender = "Female";
            }
            registrationRequest.setName(txtName.getText());
            registrationRequest.setUserName(txtUserName.getText());
            registrationRequest.setUserPassword(txtPwd.getText());
            registrationRequest.setUserEmailId(txtEmail.getText());
            registrationRequest.setGender(gender);
            registrationRequest.setNetwork(network);
            registrationRequest.setSsn(txtSSN.getText());
            registrationRequest.setAddress1(txtAdd1.getText());
            registrationRequest.setAddress2(txtAdd2.getText());
            registrationRequest.setUserContact(txtContact.getText());
            registrationRequest.setStatus("Request access");
            registrationRequest.setAnnualIncome(txtIncome.getText());
            String subject = "Sponsorer Registeration";
            String content = "Thank you for registering with us. Your account will be activated within 24 hours. We will keep you posted with your status.";
            CommonMail.sendEmailMessage(txtEmail.getText(), subject, content);
            for (Network network1 : system.getNetworkList()) {
                for (Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Funding) {
                        if (enterprise.getWorkQueue() == null) {
                            enterprise.setWorkQueue(new WorkQueue());
                        }
                        enterprise.getWorkQueue().getWorkRequestList().add(registrationRequest);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "You have been registered succesfully");
            txtUserName.setText("");
            txtName.setText("");
            txtPwd.setText("");
            txtEmail.setText("");
            txtSSN.setText("");
            txtIncome.setText("");
            txtAge.setText("");
            txtAdd1.setText("");
            txtAdd2.setText("");
            txtContact.setText("");
            rdbFemale.setSelected(false);
            rdbMale.setSelected(false);
            usernameExistsMessage.setVisible(false);
            emailValidate.setVisible(false);
            ageValidate.setVisible(false);
            SSNValidate.setVisible(false);
            numValidate.setVisible(false);
            IncomeValidate.setVisible(false);
            userNameTick.setVisible(false);
            ageTick.setVisible(false);
            emailTick.setVisible(false);
            ssnTick.setVisible(false);
            IncomeTick.setVisible(false);
            numTick.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        // TODO add your handling code here:
        txtUserName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtUserName.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPwdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwdKeyTyped
        // TODO add your handling code here:
        txtPwd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtPwd.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtPwdKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtSSNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyTyped
        // TODO add your handling code here:
        txtSSN.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtSSN.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSSNKeyTyped

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if (!system.checkIfUserIsUnique(txtName.getText())) {
            usernameExistsMessage.setVisible(true);
            IncomeTick.setVisible(false);
            userUnique = false;
        } else {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtName.setForeground(Color.BLACK);
            usernameExistsMessage.setVisible(false);
            IncomeTick.setVisible(true);
            userUnique = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    IncomeTick.setVisible(false);
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }
    }//GEN-LAST:event_txtNameKeyReleased


    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        txtContact.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isValidContactNo(txtContact.getText())) {
                    numValidate.setVisible(true);
                    numTick.setVisible(false);
                    contactValid = false;
                } else {
                    numValidate.setVisible(false);
                    numTick.setVisible(true);
                    contactValid = true;
                }
            }
        });
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactKeyPressed

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        txtEmail.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isValidEmailId(txtEmail.getText())) {
                    emailValidate.setVisible(true);
                    emailTick.setVisible(false);
                    emailValid = false;
                } else {
                    emailValidate.setVisible(false);
                    emailTick.setVisible(true);
                    emailValid = true;
                }
            }
        });
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        txtUserName.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!system.checkIfUserIsUnique(txtUserName.getText())) {
                    usernameExistsMessage.setVisible(true);
                    userNameTick.setVisible(false);
                    userUnique = false;
                } else {
                    usernameExistsMessage.setVisible(false);
                    userNameTick.setVisible(true);
                    userUnique = true;
                }
            }
        });
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtIncomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIncomeKeyReleased
        // TODO add your handling code here:
        txtIncome.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isNumeric(txtIncome.getText())) {
                    IncomeValidate.setVisible(true);
                    IncomeTick.setVisible(false);
                    income = false;
                } else {
                    IncomeValidate.setVisible(false);
                    IncomeTick.setVisible(true);
                    income = true;
                }
            }
        });
    }//GEN-LAST:event_txtIncomeKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        txtAge.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isNumeric(txtAge.getText())) {
                    ageValidate.setVisible(true);
                    ageTick.setVisible(false);
                    age = false;
                } else {
                    ageTick.setVisible(true);
                    ageValidate.setVisible(false);
                    age = true;
                }
            }
        });
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtSSNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyReleased
        // TODO add your handling code here:
        txtSSN.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isValidSSN(txtSSN.getText())) {
                    SSNValidate.setVisible(true);
                    ssnTick.setVisible(false);
                    ssn = false;
                } else {
                    ssnTick.setVisible(true);
                    SSNValidate.setVisible(false);
                    ssn = true;
                }
            }
        });
    }//GEN-LAST:event_txtSSNKeyReleased

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IncomeTick;
    private javax.swing.JLabel IncomeValidate;
    private javax.swing.JLabel SSNValidate;
    private javax.swing.JLabel ageTick;
    private javax.swing.JLabel ageValidate;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<Network> cmbCity;
    private javax.swing.JLabel emailTick;
    private javax.swing.JLabel emailValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAnnual;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblStreet1;
    private javax.swing.JLabel lblStreet2;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblssn;
    private javax.swing.JLabel numTick;
    private javax.swing.JLabel numValidate;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JLabel ssnTick;
    private javax.swing.JTextField txtAdd1;
    private javax.swing.JTextField txtAdd2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel userNameTick;
    private javax.swing.JLabel usernameExistsMessage;
    // End of variables declaration//GEN-END:variables
}
