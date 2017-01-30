/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Classes;

import GUI_Classes.SignUp;
import Shoe_Cart_Classes.AccountList;
import Shoe_Cart_Classes.Customer;
import Shoe_Cart_Classes.Seller;
import Shoe_Cart_Classes.Session;
import javax.swing.JOptionPane;
/**
 *
 * @author Michael
 */
public class SignInScreen extends javax.swing.JFrame {

   /**
     * Constructs a LandingScreen object
     * @param _DataBase takes an AccountList object
     */
    public SignInScreen(AccountList _DataBase) {
        initComponents();
        sneakerDataBase = _DataBase;
        this.setLocationRelativeTo(null);
        this.setResizable(false);;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        signInButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Shoe Palace");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(118, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(passwordField))))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(signInButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInButton)
                    .addComponent(signUpButton))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // the two function calls to usernameField and passwordField
        // retrieve the strings from within the text fields and stores them in
        // the variables
        String usernameEntered = usernameField.getText();
        String passwordEntered = passwordField.getText();
        
        // This block of code essentially checks to see if the usernameEntered on the log in
        // screen exists in the database. If the username doesn't exist in the database, then
        // the program returns a dialog that tells the user to check for correct log in credentials.
        // If the username does exist in the in the database, then the password entered in the login screen
        // is checked against the password stored in the database for the username, if they match the depending
        // on what the users account type is, they either log in into an inventory screen, or the marketplace. 
        // If the password does not match the password in the database set for the username, the same dialog
        // mentioned above is displayed on screen again.
        if(sneakerDataBase.search(usernameEntered)) {
            if(passwordEntered.equals(sneakerDataBase.retrieve(usernameEntered).getPassword())) {
                if(sneakerDataBase.retrieve(usernameEntered).getClass() == Customer.class) {
                    Session newSession = new Session(usernameEntered);
                    JOptionPane.showMessageDialog(null, "Welcome: " + usernameEntered, "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    ItemsScreen customerPage = new ItemsScreen(sneakerDataBase, newSession);
                    customerPage.setVisible(true);

                }
                else if(sneakerDataBase.retrieve(usernameEntered).getClass() == Seller.class) {
                    Session newSession = new Session(usernameEntered);
                    JOptionPane.showMessageDialog(null, "Welcome: " + usernameEntered, "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    SellerInventoryScreen sellersInventory = new SellerInventoryScreen(sneakerDataBase, newSession);
                    sellersInventory.setVisible(true);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Please verify that the username and password are correct", "Incorrect Login", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please verify that the username and password are correct", "Incorrect Login", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
         // disposes complete of the LandinScreen
        this.dispose();
        // creates a new instance of the sign up screen
        SignUp createAccountScreen = new SignUp(sneakerDataBase);
        // sets window display onto the center of the screen
        createAccountScreen.setLocationRelativeTo(null);
        // makes the window visible on screen
        createAccountScreen.setVisible(true);
    }//GEN-LAST:event_signUpButtonActionPerformed

   
 // My variable declaration(s) for JFrame
    private final AccountList sneakerDataBase;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
