package Main;

import com.google.common.collect.Multimap;

import java.util.*;

public class Cart extends Customer{


    public Customer User;

    public HashMap<Integer, Cart> cart = new HashMap<>(10);
    public String Item;
    public String Size;
    public String Colour;
    public int Price;
    private int i = 0;

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

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


    public Cart copy(){
        return new Cart(Item,Colour,Size,Price);
    }

    public Cart(String _item, String _colour, String _size, int _price){
        this.Item = _item;
        this.Colour = _colour;
        this.Size = _size;
        this.Price = _price;
    }

    public Cart(){}

    public void emptyCart(){
        Item = "";
        Price = 0;
        Colour = "";
        Size = "";
    }

    public void showCart(Customer NewCustomer){

        cart.forEach((key,value) ->  System.out.println("Customer ID: " +value.getCustomerID() + "\nCustomer email: "+ NewCustomer.getEmail() +
                "\nPrice: " + value.getPrice() + "\nSize: " + value.getSize() + "\nItem: " + value.getItem() + "\nColour: " + value.getColour()));
    }

    public HashMap<Integer, Cart> getCart() {
        return cart;
    }

    public void setCart(HashMap<Integer, Cart> cart) {
        this.cart = cart;
    }

    public Customer getUser() {
        return User;
    }

    public void setUser(Customer user) {
        User = user;
    }
}