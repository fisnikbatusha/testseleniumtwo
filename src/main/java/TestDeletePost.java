import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDeletePost {
    public static void main(String[] args) {
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
// Go to a All Posts page
        driver.get("http://localhost/wordpress/wp-admin/edit.php");
                // Click on the post to be deleted
                WebElement post = driver.findElement(By.linkText("My First Post"));
                        post.click();
        // Delete Post
        WebElement publish = driver.findElement(By.linkText("Move to Trash"));
                publish.click();
    }
}
