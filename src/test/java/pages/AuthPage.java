package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends BasePage{

    @FindBy(xpath = "//input[@type = \"email\"]")
    WebElement inputLogin;
    @FindBy(xpath = "//input[@type = \"password\"]")
    WebElement inputPassword;
    @FindBy(xpath = "//button")
    WebElement authButton;
    public AuthPage() {
        PageFactory.initElements(driver, this);
    }
    public PaymentsPage auth(){
        inputLogin.sendKeys(config.login());
        inputPassword.sendKeys(config.password());
        authButton.click();
        return new PaymentsPage();
    }
}
