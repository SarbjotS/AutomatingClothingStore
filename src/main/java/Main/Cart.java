package Main;

import com.beust.ah.A;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cart extends Customer{

    //public String Item;
    //public String Size;
    //public int Price;
    //public String Colour;
    public Customer User;

    public HashMap<Integer, Cart> cart;
    public ArrayList <String> Item;
    public ArrayList <String> Size;
    public ArrayList <String> Colour;
    public ArrayList <Integer> Price;
    private int i = 0;

    public void setItem(String item) {
        Item.add(item);
    }

    public void setSize(String size) {
        Size.add(size);
    }

    public void setColour(String colour) {
        Colour.add(colour);
    }

    public void setPrice(Integer price) {
        Price.add(price);
    }

    public Cart(){

        cart = new HashMap<Integer, Cart>(10);
        Item = new ArrayList<>(10);
        Size = new ArrayList<>(10);
        Colour = new ArrayList<>(10);
        Price = new ArrayList<>(10);


    }


    public void emptyCart(){
        Item.clear();
        Size.clear();
        Colour.clear();
        Price.clear();

    }



    public Customer getUser() {
        return User;
    }

    public void setUser(Customer user) {
        User = user;
    }
}