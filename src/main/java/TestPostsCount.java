import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestPostsCount {
    public static void main(String... args){
        System.setProperty("webdriver.chrome.driver","/Users/fisnikbatusha/tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Login to Admin portal
        driver.get("http://localhost/wordpress/wp-admin");
        WebElement email =
                driver.findElement(By.id("user_login"));
        WebElement pwd =
                driver.findElement(By.id("user_pass"));
        WebElement submit = driver.findElement(By.id("wp-submit"));
                email.sendKeys("fisnikbatusha");
        pwd.sendKeys("password.1");
        submit.click();
        // Count the number of posts.
        driver.get("http://localhost/wordpress/wp-admin/edit.php");
                WebElement postsContainer = driver.findElement(By.id("the-list"));
                        List postsList = postsContainer.findElements(By.
                                tagName("tr"));
        System.out.println(postsList.size());
    }
}
