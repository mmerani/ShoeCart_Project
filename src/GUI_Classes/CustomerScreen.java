
package GUI_Classes;

import Shoe_Cart_Classes.Account;
import Shoe_Cart_Classes.AccountList;
import Shoe_Cart_Classes.Session;
import javax.swing.JOptionPane;

/**
 *
 * @author rajphull
 */
public class CustomerScreen extends javax.swing.JFrame {

   /**
     * Constructs a BuyerAccountScreen object
     * @param _DataBase
     * @param currentSession 
     */
    public CustomerScreen(AccountList _DataBase, Session currentSession) {
        initComponents();
        sneakerDataBase = _DataBase;
        this.currentSession = currentSession;
        currentUser = sneakerDataBase.retrieve(currentSession.getUserInSession());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        fillInAccountPage();
    }
    
     /**
     * This function retrieves the currentUsers account information
     * and stores it into the text fields that are displayed on the JFrame
     * to be seen
     */
    public void fillInAccountPage()
    {
        nameField.setText(currentUser.getFullName());
        usernameField.setText(currentUser.getUserName());
        passwordField.setText(currentUser.getPassword());
        creditcardField.setText(currentUser.getCreditCard());
        ccvField.setText(currentUser.getCCV());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        creditcardField = new javax.swing.JTextField();
        ccvField = new javax.swing.JTextField();
        accountTypeField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("My Account");

        jLabel2.setText("Name:");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        jLabel5.setText("Credit Card Number:");

        jLabel6.setText("CCV:");

        jLabel7.setText("Account Type:");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField)
                    .addComponent(creditcardField)
                    .addComponent(ccvField, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(nameField)
                    .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goBackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(creditcardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(goBackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
         // the if and else if statements are ran depending on the state of the 
        // edit-save button that is on the screen. When the screen first loads up
        // the button is currently in a false state, in which the button text shows
        // "Edit Account". If the button is clicked the state is changed from false
        // to true. This disables the return to inventory button and sale statistics
        // button that is on screen and allows the textfields to be changed.
        // When the button is in a false state the textfields are uneditable.
        // The same character length and username avaliability checks are in place
        // as the sign up screen. When the user decides to save any changes, the textfields
        // are overwritten with their new values, and the current user account information
        // is also changed (the actual object instance).
        
        if(!editState) {
            editState = true;
            goBackButton.setEnabled(false);
            editButton.setText("Save Changes");
            nameField.setEditable(true);
            passwordField.setEditable(true);
            creditcardField.setEditable(true);
            ccvField.setEditable(true);
        }
        else if(editState) {
            String[] allUserInput = new String[5];
            allUserInput[0] = nameField.getText().trim();
            allUserInput[2] = passwordField.getText().trim();
            allUserInput[3] = creditcardField.getText().trim();
            allUserInput[4] = ccvField.getText().trim();
        
            if(allUserInput[0].length() < 1) {
                JOptionPane.showMessageDialog(null, "Cannot leave full name field blank", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
            if(allUserInput[2].length() < 6) {
                JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
            if(allUserInput[3].length() < 16 || allUserInput[3].length() >= 17) {
                JOptionPane.showMessageDialog(null, "Incorrect Credit Card Length", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else {
                for(int i = 0; i < allUserInput[3].length(); i++) {
                    if(Character.isDigit(allUserInput[3].charAt(i))) {
                   
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "credit card number cannot contains characters or symbols", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }
        
            if(allUserInput[4].length() < 3 || allUserInput[4].length() >= 4) {
                JOptionPane.showMessageDialog(null, "CCV number has incorrect length", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            editState = false;
            currentUser.setFullName(allUserInput[0]);
            currentUser.setPassword(allUserInput[2]);
            currentUser.setCreditCard(allUserInput[3]);
            currentUser.setCCV(allUserInput[4]);
            
            editButton.setText("Edit Account");
            nameField.setEditable(false);
            passwordField.setEditable(false);
            creditcardField.setEditable(false);
            ccvField.setEditable(false);
            goBackButton.setEnabled(true);
            
            currentSession.setUserInSession(currentUser.getUserName());
            
            JOptionPane.showMessageDialog(null, "Changes were successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
         this.dispose();
        ItemsScreen backToProducts = new ItemsScreen(sneakerDataBase, currentSession);
        backToProducts.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

   
    private final AccountList sneakerDataBase;
    private final Account currentUser;
    private final Session currentSession;
    private boolean editState = false;  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountTypeField;
    private javax.swing.JTextField ccvField;
    private javax.swing.JTextField creditcardField;
    private javax.swing.JButton editButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
