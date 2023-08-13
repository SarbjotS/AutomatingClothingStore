package Main;
import static Main.Cart.MasterCart;


public class CustomerSetup {
    public static String emailUsed = "sarbjotsingh424@gmail.com";
    public static String name = "Sarbjot Singh";
    public static String company = "YourCompanyNameHere";
    public static String city = "Auckland";
    public static String country = "New Zealand";
    public static String phoneNumber = "12345678";
    public static String zipCode = "1234";
    public static String streetAddress = "12 abc road";

    public static void setupCustomer(){
        Customer user = MasterCart.getUser();
        int space = name.indexOf(" ");
        user.setFirstName(name.substring(0,space));
        user.setLastName(name.substring(space+1));
        user.setCompanyName(company);
        user.setCountry(country);
        user.setPhoneNumber(phoneNumber);
        user.setZipCode(zipCode);
        user.setEmail(emailUsed);
        user.setCity(city);
        user.setAddress(streetAddress);
        MasterCart.setUser(user);



    }
}
