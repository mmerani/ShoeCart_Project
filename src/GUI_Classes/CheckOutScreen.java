/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Classes;
import Shoe_Cart_Classes.AccountList;
import Shoe_Cart_Classes.Customer;
import Shoe_Cart_Classes.Product;
import Shoe_Cart_Classes.Seller;
import Shoe_Cart_Classes.Session;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Michael
 */
public class CheckOutScreen extends javax.swing.JFrame {

    /**
     * Constructs a CheckOutScreen object
     * @param _DataBase an AccountList object
     * @param currentSession a Session object
     */
    public CheckOutScreen(AccountList _DataBase, Session currentSession) {
        initComponents();
        sneakerDataBase = _DataBase;
        this.currentSession = currentSession;
        currentUser = (Customer)sneakerDataBase.retrieve(currentSession.getUserInSession());
        loadCartToScreen();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        completePurchaseButton = new javax.swing.JButton();
        deleteItemsButton = new javax.swing.JButton();
        updateQtyButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cartTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Checkout");

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Price", "Seller", "Qty in Cart", "Qty to Add", "Remove/Add"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        completePurchaseButton.setText("Complete Purchase");
        completePurchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completePurchaseButtonActionPerformed(evt);
            }
        });

        deleteItemsButton.setText("Delete Items");
        deleteItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemsButtonActionPerformed(evt);
            }
        });

        updateQtyButton.setText("Update Qty");
        updateQtyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateQtyButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Estimated Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(goBackButton)
                        .addGap(131, 131, 131)
                        .addComponent(completePurchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateQtyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completePurchaseButton)
                    .addComponent(deleteItemsButton)
                    .addComponent(updateQtyButton)
                    .addComponent(goBackButton)
                    .addComponent(jLabel2)
                    .addComponent(cartTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
         this.dispose();
       ItemsScreen buyersProductPage = new ItemsScreen(sneakerDataBase, currentSession);
        buyersProductPage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void completePurchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completePurchaseButtonActionPerformed
         // This essentially takes all the products in the shopping cart and calculates the total revenue
        // made from the sale, and it reflects the amount sold on the inventory of the seller. So if a seller 
        // had 100 items and the buyer got 20, the MArketPlace and inventory both show 80 items left.
        
        int i = 0;
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        
        if(cartTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No items in the cart!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(Product item : currentUser.getShoppingCart().getAllItems()) {
            Seller theSeller = (Seller)sneakerDataBase.retrieve((String)theCartTable.getValueAt(i, 3));
            String productID = (String)theCartTable.getValueAt(i, 1);
            Product product = theSeller.getList().getProductInstance(productID);
            double revenueMade = item.getQuantity() * item.getSellingPrice();
            theSeller.calculateRevenue(revenueMade);
            product.setQuantity(product.getQuantity() - item.getQuantity());
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Thank you for your transaction!", "Success", JOptionPane.INFORMATION_MESSAGE);
        deleteAllItemsFromCart();
        loadCartTotal();
    }//GEN-LAST:event_completePurchaseButtonActionPerformed

    private void deleteItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemsButtonActionPerformed
        // removes all the seleceted items from the cart
        
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel(); 
        
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);
            if(isChecked) {
                break;
            }
            else if(i == cartTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected to remove", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);

            if(isChecked) {
                String productID = (String)theCartTable.getValueAt(i, 1);
                currentUser.getShoppingCart().remove(productID);
                theCartTable.removeRow(i);
                i--;                
            }
        }
        
        loadCartTotal();
    }//GEN-LAST:event_deleteItemsButtonActionPerformed

    private void updateQtyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateQtyButtonActionPerformed
        // Refer to theItemsScreen addToCart function, very similar behavior
        
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        Seller theSeller; String productID; Product itemPurchased; Integer quantitySold;
        Product productToAdd; Product itemInCart = null; int itemLimit;
        
         if(cartTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no items", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);
            if(isChecked) {
                break;
            }
            else if(i == cartTable.getRowCount() - 1) {
                JOptionPane.showMessageDialog(null, "No items are selected in the cart", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
         for(int i = 0; i < cartTable.getRowCount(); i++) {
            boolean isChecked = (boolean)cartTable.getValueAt(i, 6);
            
            if(isChecked) {
                theSeller = (Seller)sneakerDataBase.retrieve((String)theCartTable.getValueAt(i, 3));
                productID = (String)theCartTable.getValueAt(i, 1);
                itemPurchased = theSeller.getList().getProductInstance(productID);
                quantitySold = (Integer)theCartTable.getValueAt(i, 5);
                itemLimit = itemStockCount.get(i);
                
                if(quantitySold > itemPurchased.getQuantity()) {
                    JOptionPane.showMessageDialog(null, "Cannot purchase more than whats in stock.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                if(quantitySold > itemLimit) {
                    JOptionPane.showMessageDialog(null, "Cannot purchase more than whats in stock.", "Error", JOptionPane.WARNING_MESSAGE);
                    
                     if(itemLimit == 0) {
                        JOptionPane.showMessageDialog(null, "Purchase limit has been reached for this item.", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    return;
                }
                
                if(quantitySold <= 0) {
                    if(quantitySold == 0)
                        JOptionPane.showMessageDialog(null, "You have no specified a quantity", "Error", JOptionPane.WARNING_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "You cannot purchase negative amounts", "Error", JOptionPane.WARNING_MESSAGE);
                    
                    return;
                }
                
                if(currentUser.getShoppingCart().search(productID)) {
                    itemInCart = currentUser.getShoppingCart().getProductInstance(productID);
                    itemInCart.setQuantity(itemInCart.getQuantity() + quantitySold);
                    itemLimit -= quantitySold;
                }
                
                itemStockCount.set(i, itemLimit);
                theCartTable.setValueAt(itemInCart.getQuantity(), i, 4);
                theCartTable.setValueAt(0, i, 5);
                JOptionPane.showMessageDialog(null, "Quantity added!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
         
         loadCartTotal();
    }//GEN-LAST:event_updateQtyButtonActionPerformed

    
       /**
     * Function that is called from within an ActionListener which reacts to the
     * logoutButton that is on the CheckOutScreen
     * @param evt takes an ActionEvent object
     */
    private void loadCartToScreen() {
        // loads the users cart onto the screen
        
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        ArrayList<Product> shoppingCart = currentUser.getShoppingCart().getAllItems();
        for(Product item : shoppingCart) {
            theCartTable.addRow(new Object[]{item.getName(), item.getID(), item.getSellingPrice(), item.getSeller(), 
                                             item.getQuantity(), 0, false});
        }
            
        loadCartTotal();
        itemStockCount = new ArrayList<>();
        for(int i = 0; i < cartTable.getRowCount(); i++) {
            String seller = (String)theCartTable.getValueAt(i, 3);
            Seller theSeller = (Seller)sneakerDataBase.retrieve(seller);
            String productID = (String)theCartTable.getValueAt(i, 1);
            Product theItem = theSeller.getList().getProductInstance(productID);
            int quantityLeft = theItem.getQuantity() - (Integer)theCartTable.getValueAt(i, 4);
            itemStockCount.add(quantityLeft);
        }
    }
    
    /**
     * resets all check boxes on the screen
     */
    private void resetCheckBoxes() {
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        for(int i = 0; i < theCartTable.getRowCount(); i++) {
            theCartTable.setValueAt(false, i, 6);
        }
    }
    
    /**
     * Calculates the cart total
     */
    private void loadCartTotal() {
        DecimalFormat df = new DecimalFormat("#.##");
        cartTotal.setText("$" + df.format(currentUser.getShoppingCart().calculateShoppingCartTotal()));
    }
    
    /**
     * this function removes all items from the shopping cart.
     * it is used with in the completePurchase Action event
     */
    private void deleteAllItemsFromCart() {
        DefaultTableModel theCartTable = (DefaultTableModel) cartTable.getModel();
        currentUser.getShoppingCart().clear();
        while(!(cartTable.getRowCount() == 0))
            theCartTable.removeRow(0);
    }
    
    // My variable declaration(s) for the jframe
    private final AccountList sneakerDataBase;
    private final Session currentSession;
    private final Customer currentUser;
    private ArrayList<Integer> itemStockCount;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField cartTotal;
    private javax.swing.JButton completePurchaseButton;
    private javax.swing.JButton deleteItemsButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateQtyButton;
    // End of variables declaration//GEN-END:variables
}
