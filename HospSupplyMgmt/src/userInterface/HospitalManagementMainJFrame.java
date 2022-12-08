/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import CustomerSupportTeam.CustomerSupportTeam;
import DeliveryAgency.DeliveryAgency;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;

import userInterface.HospitalManagement.HospitalAdminWorkArea.HospitalAdminWorkAreaJPanel;
import userInterface.CustomerSupport.CustomerSupportAdminWorkArea.CustomerSupportTeamAdminWorkAreaJPanel;
import userInterface.MedSupWarehouseAdminWorkArea.MedSupWarehouseDatabase;
import HospitalManagement.Hospital.Hospital;


import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;

import HospitalManagement.DB4OUtil.HospitalManagementDB4OUtil;
import HospitalManagement.Hospital.HospitalDirectory;
import MedicalEquipmentWarehouse.MedSupWarehouse;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import userInterface.CustomerSupport.CustomerSupportMemberWorkArea.CustomerSupportMemberWorkAreaJPanel;
import userInterface.DeliveryAgency.DeliveryAgencyOrderDatabase;
import userInterface.HospitalManagement.AdministrativeWorkArea.MedSuppEquipPatient;
import userInterface.HospitalManagement.MedTechnicalWorkArea.MedTechnicalWorkAreaJPanel;
import userInterface.HospitalManagement.MedicalSuppliesWorkArea.MedSupAdminWorkAreaJPanel;
import userInterface.HospitalManagement.OperationalWorkArea.OperationalPatientEncounter;
import userInterface.MedSupWarehouseAdminWorkArea.MedSupWarehouseAdminWorkAreaJPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

public class HospitalManagementMainJFrame extends javax.swing.JFrame {

    /** 
     * Creates new form HospitalManagementMainJFrame
     */
    @SuppressWarnings("unchecked")
    private MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    public HospitalManagementDB4OUtil dB4OUtil = HospitalManagementDB4OUtil.getInstance();
    UserAccount userAccountLogin;

    public HospitalManagementMainJFrame() {
        initComponents();
        medicalServiceCentralisationEcoSystem = dB4OUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanelLogin = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        loginJOpenChatWindow = new javax.swing.JButton();
        jPanelWorkArea = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));

        jSplitPane1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanelLogin.setBackground(new java.awt.Color(29, 140, 195));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(200, 800));

        loginJButton.setBackground(new java.awt.Color(255, 255, 204));
        loginJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(0, 102, 102));
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Password");

        logoutJButton.setBackground(new java.awt.Color(255, 255, 204));
        logoutJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(0, 102, 102));
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        loginJOpenChatWindow.setBackground(new java.awt.Color(0, 102, 102));
        loginJOpenChatWindow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginJOpenChatWindow.setForeground(new java.awt.Color(255, 255, 204));
        loginJOpenChatWindow.setText("Chat with us");
        loginJOpenChatWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJOpenChatWindowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(loginJLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(loginJOpenChatWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(logoutJButton)
                .addGap(149, 149, 149)
                .addComponent(loginJLabel)
                .addGap(44, 44, 44)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(loginJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(loginJOpenChatWindow)
                .addGap(121, 121, 121))
        );

        jSplitPane1.setLeftComponent(jPanelLogin);

        jPanelWorkArea.setPreferredSize(new java.awt.Dimension(1181, 1080));
        jPanelWorkArea.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/SystemAdminWorkAreaJPanel.jpg"))); // NOI18N
        jLabel3.setMinimumSize(new java.awt.Dimension(1000, 800));
        jLabel3.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanelWorkArea.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(jPanelWorkArea);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String username = userNameJTextField.getText();
        String password = passwordField.getText();
        UserAccountDirectory userDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        if(userDirectory.authenticateUserLogin(username, password))
        {
            ArrayList<UserAccount> usersList = userDirectory.getUserAccountList();

            userAccountLogin = userDirectory.authenticateUser(username, password);
            logoutJButton.setEnabled(true); 
            userNameJTextField.setEnabled(false);
            passwordField.setEnabled(false);
            loginJButton.setEnabled(false);
//            System.out.println("userAccountLogin.getEmployee().getRole().toString(): "+userAccountLogin.getEmployee().getRole().toString());
//            if(userAccountLogin.getEmployee().getRole().toString().equals("HospitalManagement.Role.SystemAdminRole"))
            System.out.println("userAccount.getRole().toString(): "+userAccountLogin.getRole().toString());
            if(userAccountLogin.getRole().toString().equals("SystemAdmin"))
            {
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = new SystemAdminWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem);
                jPanelWorkArea.add("Sysadmin",systemAdminWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            
            else if(userAccountLogin.getRole().toString().equals("HospitalAdmin"))
            {
                Hospital hospital = userAccountLogin.getHospital();
                HospitalAdminWorkAreaJPanel hospitalAdminWorkAreaJPanel = new HospitalAdminWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem, hospital);
                jPanelWorkArea.add("hospitalAdminWorkAreaJPanel",hospitalAdminWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("Technician"))
            {
                Hospital hospital = userAccountLogin.getHospital();
                MedTechnicalWorkAreaJPanel medTechnicalWorkAreaJPanel = new MedTechnicalWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem, hospital);
                jPanelWorkArea.add("hospitalAdminWorkAreaJPanel",medTechnicalWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("CustomerSupportTeamAdmin"))
            {
                CustomerSupportTeam customerSupportTeam = userAccountLogin.getCustomerSupportTeam();
                CustomerSupportTeamAdminWorkAreaJPanel customerSupportTeamAdminWorkAreaJPanel = new CustomerSupportTeamAdminWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem, customerSupportTeam, userAccountLogin);
                jPanelWorkArea.add("customerSupportTeamAdminWorkAreaJPanel",customerSupportTeamAdminWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("CustomerSupportMember"))
            {
                CustomerSupportMemberWorkAreaJPanel customerSupportMemberWorkAreaJPanel = new CustomerSupportMemberWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem);
                jPanelWorkArea.add("customerSupportMemberWorkAreaJPanel",customerSupportMemberWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("MedSupWarehouseAdmin"))
            {
                MedSupWarehouse medSupWarehouse = userAccountLogin.getMedSupWarehouse();
                MedSupWarehouseAdminWorkAreaJPanel medSupWarehouseAdminWorkAreaJPanel = new MedSupWarehouseAdminWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem, medSupWarehouse);
                jPanelWorkArea.add("medSupWarehouseAdminWorkAreaJPanel",medSupWarehouseAdminWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("MedSupEquipAdmin"))
            {
                Hospital hospital = userAccountLogin.getHospital();
                MedSupAdminWorkAreaJPanel medSupAdminWorkAreaJPanel = new MedSupAdminWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem, hospital);
                jPanelWorkArea.add("medSupAdminWorkAreaJPanel",medSupAdminWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("DeliveryAgencyAdmin"))
            {
                DeliveryAgency deliveryAgency = userAccountLogin.getDeliveryAgency();
                DeliveryAgencyOrderDatabase deliveryAgencyOrderDatabase = new DeliveryAgencyOrderDatabase(jPanelWorkArea, medicalServiceCentralisationEcoSystem, deliveryAgency);
                jPanelWorkArea.add("DeliveryAgencyOrderDatabase",deliveryAgencyOrderDatabase);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("FrontDeskOperator"))
            {
                Hospital hospital = userAccountLogin.getHospital();
                MedSuppEquipPatient medSuppEquipPatient = new MedSuppEquipPatient(jPanelWorkArea, medicalServiceCentralisationEcoSystem, hospital);
                jPanelWorkArea.add("medSuppEquipPatient",medSuppEquipPatient);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            else if(userAccountLogin.getRole().toString().equals("Doctor"))
            {
                Hospital hospital = userAccountLogin.getHospital();
                OperationalPatientEncounter operationalPatientEncounter = new OperationalPatientEncounter(jPanelWorkArea);
                jPanelWorkArea.add("operationalPatinetEncounter",operationalPatientEncounter);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid credentials");
        }
      
       
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        jPanelWorkArea.removeAll();
        JPanel blankJP = new JPanel();
        jPanelWorkArea.add("blank", blankJP);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/HospitalMainJFrame.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanelWorkArea.add(jLabel3, "blank");
        CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
        crdLyt.next(jPanelWorkArea);
        
        dB4OUtil.storeSystem(medicalServiceCentralisationEcoSystem);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void loginJOpenChatWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJOpenChatWindowActionPerformed
        // TODO add your handling code here:
        ArrayList<String> user_input = new ArrayList<String>();
        JTextArea chatarea = new JTextArea();
        JTextField chatbox = new JTextField();
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setLayout(null);
        jframe.setSize(600, 600);
        jframe.setTitle("Alfred");
        jframe.add(chatarea);
        jframe.add(chatbox);
        
        //For chat area
        chatarea.setSize(500, 400);
        chatarea.setLocation(2,2);
        
        // for input area
        chatbox.setSize(540,30);
        chatbox.setLocation(2,500);
        
        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean chat_end = false;
                String gtext = chatbox.getText().toLowerCase();
                chatarea.append("YOU -> "+gtext+"\n");
                chatbox.setText("");
                String req_cat  = "";
                
                if(gtext.contains("hi")){
                    bot("Hi please help me with your name, phone number, email and pincode",chatarea);
                }
                
                if(gtext.contains("02215")){
                    String[] splitStr = gtext.split("\\s+");
                    user_input.add(splitStr[0]);
                    user_input.add(splitStr[1]);
                    user_input.add(splitStr[2]);
                    user_input.add(splitStr[3]);
                    bot("So how can I help you?",chatarea);
                }
                else if(gtext.contains("book") && gtext.contains("test")){
                    bot("Okay. Please tell me the test date.",chatarea);
                    req_cat = "MedicalTest";
                }
                else if(gtext.contains("equipment") || gtext.contains("order")){
                    bot("Okay. Please tell me the test date.",chatarea);
                    req_cat = "MedicalEquipment";
                }
                else if(gtext.contains("2021")){
//                    SimpleDateFormat formatter = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
//                    Date date = formatter.parse(gtext);
                    user_input.add(gtext);
                    if(req_cat.equals("MedicalTest")){
                        bot("Okay. What test do you want to do?",chatarea);
                    }
                    else{
                        bot("Okay. What equipment do you want to order?",chatarea);
                    }
                }
                else if(gtext.contains("blood")){
//                    SimpleDateFormat formatter = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
//                    Date date = formatter.parse(gtext);
                    user_input.add("MedicalTest");
                    user_input.add(gtext);
                    bot("A request has been raised. You'll receive an update shortly from the hospital.",chatarea);
                    CustomerSupportMemberWorkAreaJPanel customerSupportMemberWorkAreaJPanel = new CustomerSupportMemberWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem);
                    customerSupportMemberWorkAreaJPanel.raise_request(user_input);
                }  
                else if(gtext.contains("bed") || gtext.contains("oxygen")){
//                    SimpleDateFormat formatter = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
//                    Date date = formatter.parse(gtext);
                    user_input.add("MedicalEquipment");
                    user_input.add(gtext);
                    user_input.add("BOT");
                    bot("A request has been raised. You'll receive an update shortly from the hospital.",chatarea);
                    CustomerSupportMemberWorkAreaJPanel customerSupportMemberWorkAreaJPanel = new CustomerSupportMemberWorkAreaJPanel(jPanelWorkArea, medicalServiceCentralisationEcoSystem);
                    customerSupportMemberWorkAreaJPanel.raise_request(user_input);
                }  
            }
   
        });
        
    }//GEN-LAST:event_loginJOpenChatWindowActionPerformed
    private void bot(String bot_resp, JTextArea chatarea){
        chatarea.append("BOT ->"+bot_resp+"\n");
    }
    
    
    /**
     * 
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
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalManagementMainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelWorkArea;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton loginJOpenChatWindow;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
