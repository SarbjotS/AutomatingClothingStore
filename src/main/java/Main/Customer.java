//Store info about customer
package Main;

public class Customer {

    private int CustomerID = 0;
    private String Email = "";
    private String Password = "";
    private Cart cart;
    private int _customerID = 0;
    private String gender = "";
    private String firstName;
    private String lastName;
    private String companyName;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    private String streetAddress;
    private String Country;
    private String phoneNumber;
    private String ZipCode;

    public String getShippingCost() {
        return ShippingCost;
    }

    public void setShippingCost(String shippingCost) {
        ShippingCost = shippingCost;
    }

    private  String ShippingCost;


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
