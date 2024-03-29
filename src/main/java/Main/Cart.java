//Store info re. cart
package Main;

import com.google.common.collect.Multimap;

import java.util.*;

public class Cart extends Customer{

    public static Cart MasterCart = new Cart();
    public Customer User;

    public HashMap<Integer, String> cart = new HashMap<>(10);
    private String Item;
    private String Size;
    private String Colour;
    private String Price;

    public String getShippingCost() {
        return ShippingCost;
    }

    public void setShippingCost(String shippingCost) {
        ShippingCost = shippingCost;
    }

    private String ShippingCost;


    private int NumberofItems = 0;

    public int getNumberofItems() {
        return NumberofItems;
    }

    public void setNumberofItems(int itemsInCart) {
        NumberofItems = itemsInCart;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }



    public Cart(){}

    public void emptyCart(){
        Item = "";
        Price = "";
        Colour = "";
        Size = "";
    }

    public void showCart(Customer NewCustomer){

        cart.forEach((key,value) ->  System.out.println("Customer ID: " +getCustomerID() + "\nCustomer email: "+ NewCustomer.getEmail() +
                "\nPrice: " + getPrice() + "\nSize: " + getSize() + "\nItem: " + getItem() + "\nColour: " + getColour()));
    }

    public HashMap<Integer, String> getCart() {
        return cart;
    }

    public void setCart(HashMap<Integer, String> cart) {
        this.cart = cart;
    }

    public Customer getUser() {
        return User;
    }



    public void setUser(Customer user) {
        User = user;
    }
}