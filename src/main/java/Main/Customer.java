package Main;

public class Customer {

    public int CustomerID = 0;
    public String Email = "";
    public String Password = "";
    public Cart cart;
    public int _customerID = 0;

    public String gender = "";


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





    Customer(){}
    public Customer(String email, String password, Cart _cart, String Gender) {
        Email = email;
        Password = password;
        CustomerID = _customerID;
        cart = _cart;
        gender = Gender;
        _customerID++;

    }

    public void updateCart(Cart c){
        cart = c;
    }
    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
