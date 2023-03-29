package Main;

import com.beust.ah.A;
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

    public void showCart(Cart cart){

        for (Map.Entry<Integer, Cart> entry : cart.cart.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        cart.cart.forEach((key,value) -> System.out.println(key + " " + value.Price));
    }



    public Customer getUser() {
        return User;
    }

    public void setUser(Customer user) {
        User = user;
    }
}