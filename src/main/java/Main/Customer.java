package Main;

public class Customer {

    public int CustomerID = 0;
    public String Email = "";
    public String Password = "";



    Customer(){}
    public Customer(String email, String password, int _customerID) {
        Email = email;
        Password = password;
        CustomerID = _customerID;
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
