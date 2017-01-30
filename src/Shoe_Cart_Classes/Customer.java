
package Shoe_Cart_Classes;

import java.io.Serializable;
/**
 *
 * @author rajphull
 */
public class Customer extends Account implements Serializable
{
    /**
     * Constructs a Customer object
     * @param fullName a String representing the full name of the account holder
     * @param userName a String representing the user name of the account
     * @param password a String representing the password of the account
     * @param creditCard a String representing the credit card number on the account
     * @param ccvNumber a String representing the CCV number of the credit card on the account
     */
    public Customer(String fullName, String userName, String password, String creditCard, String ccvNumber) {
        super(fullName, userName, password, creditCard, ccvNumber);
        customersShoppingCart = new ShoppingCart();
    }
    
    /**
     * Creates a copy of a Customer object
     * @param copyCustomer 
     */
    public Customer(Customer copyCustomer) {
        super(copyCustomer);
        customersShoppingCart = new ShoppingCart(copyCustomer.customersShoppingCart);
    }
    
    /**
     * Returns the customers cart
     * @return a reference to the Customer cart
     */
    public ShoppingCart getShoppingCart() {
        return customersShoppingCart;
    }
    
    /**
     * A string representation of the  Customer object
     * @return a String containing all information about the Customer object
     */
    @Override
    public String toString() {
        String customerInfo = "Shopzilla Outlet Account" + "\n\nFull Name: " + super.getFullName() + "\nUser Name: " + super.getUserName() + 
                "\nPassword: " + super.getPassword() + "\nCredit Card Number: " + super.getCreditCard() + "\nCCV Number: " +
                super.getCCV() + "\nAccount Type:Customer\n\n" + super.getFullName() + "'s ShoppingCart\n\n" + customersShoppingCart.toString();
        
        return customerInfo;
    }
    
    /**
     * Checks to see if two Customer objects are the same
     * @param otherCustomer aCustomer object
     * @return returns true or false depending ifCustomer objects are equal or not
     */
    @Override
    public boolean equals(Object otherCustomer) {
        if(otherCustomer == null)
            return false;
        else if(getClass() != otherCustomer.getClass())
            return false;
        else {
           Customer checkCustomer = (Customer)otherCustomer;
            return (super.getFullName().equals(checkCustomer.getFullName()) && super.getUserName().equals(checkCustomer.getUserName()) && 
                    super.getPassword().equals(checkCustomer.getPassword()) && super.getCCV().equals(checkCustomer.getCCV()) &&
                    super.getCreditCard().equals(checkCustomer.getCreditCard()) && customersShoppingCart.equals(checkCustomer.customersShoppingCart));
        }
    }
    
    private final boolean accountType = false;
    private final ShoppingCart customersShoppingCart;
}
