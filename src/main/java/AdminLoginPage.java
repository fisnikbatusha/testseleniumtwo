import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminLoginPage {
    WebDriver driver;
    @FindBy(how=How.ID,id="user_login")
    WebElement email;
    @FindBy(how=How.ID,id="user_pass")
    WebElement pwd;
    @FindBy(how=How.ID,id="wp-submit")
    WebElement submit;

    public AdminLoginPage(WebDriver driver){
        this.driver = driver;
        driver.get("http://localhost/wordpress/wp-admin");
    }
    public void login(String username,String password){
        email.sendKeys(username);
        pwd.sendKeys(password);
        submit.click();
    }
}