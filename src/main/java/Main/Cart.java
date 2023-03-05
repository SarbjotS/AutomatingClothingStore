package Main;

import java.util.LinkedList;

public class Cart implements Customer{

    public String Item;
    public String Size;
    public int Price;
    public String Colour;
    public Customer User;


    Cart(){}
    public Cart(String _item,String _size,int _price,String _colour, Customer _user){
        this.Item = _item;
        this.Size = _size;
        this.Price = _price;
        this.Colour = _colour;
        this.User = _user;
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

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public Customer getUser() {
        return User;
    }

    public void setUser(Customer user) {
        User = user;
    }
}