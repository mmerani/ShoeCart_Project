package Shoe_Cart_Classes;
import java.io.Serializable;

/**
 *An abstract class that represents an Account object
 * @author rajphull
 */
public abstract class Account implements Serializable {
    /**
     * Constructs an Account object
     * @param fullName a full name for the account
     * @param userName a user name for the account
     * @param password a password for the account
     * @param creditCard a credit card number for the account
     * @param ccvNumber the credit card CCV number
     */
    public Account(String fullName, String userName, String password, 
                   String creditCard, String ccvNumber) {
       this.fullName = fullName;
       this.userName = userName;
       this.password = password;
       this.creditCard = creditCard;
       this.ccv = ccvNumber;
    }
    
    /**
     * Constructs a copy of an existing object
     * @param copyAccount Account object to copy
     */
    public Account(Account copyAccount) {
        fullName = copyAccount.fullName;
        userName = copyAccount.userName;
        password = copyAccount.password;
        creditCard = copyAccount.creditCard;
        ccv = copyAccount.ccv;
    }

    /**
     * Returns the full name of the account holder
     * @return a String representation of the Account holders name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Returns the user name of the Account object
     * @return a String representation of the Accounts user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Returns the password of the Account object
     * @return a String representation of the Accounts password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns the credit card number of the Account object
     * @return a String representation of the Accounts credit card number
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * Returns the CCV of the credit card associated with the Account object
     * @return a String representation of the Accounts credit card CCV number
     */
    public String getCCV() {
        return ccv;
    }

    /**
     * Sets a full name for the Account object
     * @param fullName the full name of the account holder
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Sets a user name for the Account object
     * @param userName the user name of the account holder
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Sets a password for the Account object
     * @param password a password for the Account object
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets a credit card number for the Account object
     * @param creditCard a credit card number for the Account object
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Sets a CCV number for the credit card on the Account Object
     * @param ccv a CCV number for the Account object
     */
    public void setCCV(String ccv) {
        this.ccv = ccv;
    }
    
    private String fullName;
    private String userName;
    private String password;
    private String creditCard;
    private String ccv;
}


