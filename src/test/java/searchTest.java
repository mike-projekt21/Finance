import org.junit.Test;
import pages.AuthPage;

public class searchTest extends BaseTest{
    @Test
    public void testFindPayment() throws InterruptedException {
        String searchText = "new_test";
        int expectedPaymentSize = 1;

        AuthPage authPage = new AuthPage();

        authPage
                .auth()
                .searchTextInput(searchText)
                .assertPaymentCount(expectedPaymentSize);
    }
}
