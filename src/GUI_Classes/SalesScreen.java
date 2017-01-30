/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Classes;
import Shoe_Cart_Classes.AccountList;
import Shoe_Cart_Classes.Seller;
import Shoe_Cart_Classes.Session;
/**
 *
 * @author Michael
 */
public class SalesScreen extends javax.swing.JFrame {

    /**
     * Constructs a SellerStatisticsScreen 
     * @param _DataBase takes an AccountDataBase object
     * @param currentSession takes a Session object
     */
    public SalesScreen(AccountList _DataBase, Session currentSession) {
        initComponents();
        sneakerDataBase = _DataBase;
        // retrieves and stores the user currently in session in the variable
        currentUser = (Seller)sneakerDataBase.retrieve(currentSession.getUserInSession());
        // the remaining code in this function displays and loads the sellers
        // statistics onto the screen
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setTextFields();
        loadStatistics();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        costField = new javax.swing.JTextField();
        revenueField = new javax.swing.JTextField();
        profitsField = new javax.swing.JTextField();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Sales");

        jLabel2.setText("Costs");

        jLabel3.setText("Revenue");

        jLabel4.setText("Profits");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(costField)
                                .addComponent(revenueField)
                                .addComponent(profitsField, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(revenueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(profitsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:this,
    }//GEN-LAST:event_goBackButtonActionPerformed

     /**
     * Function gets the sellers life time inventory costs. revenue and profit made
     * and loads it onto the text fields displayed on the screen
     */
    private void loadStatistics() {
        costField.setText("$" + Double.toString(currentUser.getList(). getLifeTimeListCosts()));
        revenueField.setText("$" + Double.toString(currentUser.getRevenue()));
        profitsField.setText("$" + Double.toString(currentUser.calculateProfit()));
    }
    
    /**
     * Set's the text fields on screen to "$0.00"
     */
    private void setTextFields() {
        costField.setText("$0.00");
        revenueField.setText("$0.00");
        profitsField.setText("$0.00");
    }
    private final AccountList sneakerDataBase;
    private final Seller currentUser;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField profitsField;
    private javax.swing.JTextField revenueField;
    // End of variables declaration//GEN-END:variables
}
