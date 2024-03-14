package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class PaymentsPage extends BasePage{

    @FindBy(xpath = "//div[@class = \"input input--size-md input--state-flat\"]")
    WebElement searchField;
    @FindBy(xpath = "//div[@class = \"table table--is-responsive\"]")
    List <WebElement> paymentList;
    public PaymentsPage() {
        PageFactory.initElements(driver, this);
    }

    public PaymentsPage searchTextInput(String inputText){
        searchField.sendKeys(inputText);
        return this;
    }
    public PaymentsPage assertPaymentCount(int expectedPaymentSize){
        assertEquals("Количество найденных платежей совпадает", expectedPaymentSize, paymentList.size());
        return this;
    }
}

