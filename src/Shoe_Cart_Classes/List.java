
package Shoe_Cart_Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rajphull
 */
public class List implements Serializable {
    /**
     * Constructs an List object
     */
    public List() {
        inventoryList = new ArrayList<>();
    }
    
    /**
     * Constructs a copy of an List object
     * @param copyList 
     */
    public List(List copyList) {
        inventoryList = new ArrayList<>(copyList.inventoryList);
    }
    
    /**
     * Adds an item to the list
     * @param item Product object to add to list
     */
    public void add(Product item) {
        inventoryList.add(item);
        listTotal += item.getQuantity() * item.getInvoicePrice();
    }
    
    /**
     * Removes an item from the list
     * @param anID String ID to locate proper item
     */
    public void remove(String anID) {
        for(Product item : inventoryList) {
            if(anID.equals(item.getID())) {
                inventoryList.remove(item);
                break;
            }
        }
    }
    
    /**
     * Clears out entire list
     */
    public void clear() {
        inventoryList.clear();
    }
    
    /**
     * Checks to see if the list is empty
     * @return true if list is empty, false otherwise
     */
    public boolean isEmpty() {
        return inventoryList.isEmpty();
    }
    
    /**
     * Retrieves a specified product in the Sellers list
     * @param anID a Product ID number
     * @return the Product specified via the ID number
     */
    public Product getProduct(String anID) {
        Product itemToGet = null;
        
        for(Product item : inventoryList) {
            if(item.getID().equals(anID)) {
                itemToGet = item;
                break;
            }
        }
        
        return new Product(itemToGet);
    }
    
    /**
     * Retrieves a specified product in the Sellers list
     * @param anID a Product ID Number
     * @return the Product specified via the ID Number (as a reference) 
     */
    public Product getProductInstance(String anID) {
        Product itemToGet = null;
        
        for(Product item : inventoryList) {
            if(item.getID().equals(anID)) {
                itemToGet = item;
                break;
            }
        }
        
        return itemToGet;
    }
    
    /**
     * Returns a list of all items in the list
     * @return an ArrayList of Product objects
     */
    public ArrayList<Product> getAllItems() {
        return new ArrayList<>(inventoryList);
    }
    
    /**
     * Adds incurred costs to the Sellers lifetime spending 
     * @param incurredCost an incurred cost of type double
     */
    public void addToLifeTimeListCosts(double incurredCost) {
        listTotal += incurredCost;
    }
    
    /**
     * Retrieves the total lifetime spending of the Seller on list
     * @return 
     */
    public double getLifeTimeListCosts() {
        return listTotal;
    }
    
    public void changeProductOwnerShip(String userName) {
        for(Product item : inventoryList) {
            item.setSeller(userName);
        }
    }
    
    /**
     * Returns a String representation of all Products in the list
     * @return a String representation of all the products found in the sellers list
     */
    public String toString() {
        String listOutput = "";
        
        for(Product item : inventoryList)
            listOutput += item.toString() + "\n\n";
        
        return listOutput;
    }
    
    /** 
     * Checks to see the equality of two List objects
     * @param otherList List object to compare
     * @return true if equal, otherwise false
     */
    public boolean equals(List otherList) {
        if(otherList == null)
            return false;
        else if(getClass() != otherList.getClass())
            return false;
        else {
            List checkList = (List)otherList;
            return (inventoryList.equals(checkList.inventoryList));
        }
    }
    
    private ArrayList<Product> inventoryList;
    private double listTotal;
}

