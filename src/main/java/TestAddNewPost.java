import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestAddNewPost {
    public static void main(String[] args) {
        String username = "fisnikbatusha";
        String password = "password.1";
        System.setProperty("webdriver.chrome.driver","/Users/fisnikbatusha/tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Login to Admin portal
        AdminLoginPage loginPageOne = PageFactory.initElements(driver,AdminLoginPage.class);
        loginPageOne.login(username,password);
        // Go to AllPosts page
        //AllPostsPage pageOne = new AllPostsPage(driver);
        AllPostsPage pageOne = PageFactory.initElements(driver,AllPostsPage.class);
        pageOne.createANewPost("Titulli2","Asgja2");
    }
}