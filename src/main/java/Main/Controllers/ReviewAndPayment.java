package Main.Controllers;

import Main.Elements.ReviewAndPaymentElements;
import Main.Elements.ShoppingCartElements;
import org.junit.Assert;

import static Main.Cart.MasterCart;

public class ReviewAndPayment {
    public static void VerifyBillingAddress() {
        Assert.assertTrue(ReviewAndPaymentElements.FirstNameExists(MasterCart.getUser().getFirstName()));
        Assert.assertTrue(ReviewAndPaymentElements.SurnameExists(MasterCart.getUser().getLastName()));
        Assert.assertTrue(ReviewAndPaymentElements.AddressExists(MasterCart.getUser().getAddress()));
        Assert.assertTrue(ReviewAndPaymentElements.CityExists(MasterCart.getUser().getCity()));
        Assert.assertTrue(ReviewAndPaymentElements.ZipCodeExists(MasterCart.getUser().getZipCode()));
        Assert.assertTrue(ReviewAndPaymentElements.CountryExists(MasterCart.getUser().getCountry()));
        Assert.assertTrue(ReviewAndPaymentElements.NumberExists(MasterCart.getUser().getPhoneNumber()));

    }


    public static void VerifyOrderSummary() {
    }
}
