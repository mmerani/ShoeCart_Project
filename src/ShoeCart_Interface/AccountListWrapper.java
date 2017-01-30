package ShoeCart_Interface;

import Shoe_Cart_Classes.Account;


/**
 *An interface that "wraps" around an implementation of a DataBase
 * This interface is specific to DataBases that use the Account class
 * @author rajphull
 */
public interface AccountListWrapper {
    
    public void insert(Account data);
    public void remove(String userName);
    public Account retrieve(String userName);
    public boolean search(String userName);
    public int size();
}
