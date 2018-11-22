import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewPost {
    WebDriver driver;
    /*
    public static WebElement newPostContentBody(WebDriver driver) {
        WebElement element = driver.findElement(By.id("content"));
        return element;
    }*/
    @FindBy(how=How.ID, using="content")
    WebElement newPostContentBody;
    @FindBy(how=How.ID, using="title")
    WebElement newPostTitle;
    @FindBy(how= How.ID, using="publish")
    WebElement newPostPublish;
    public AddNewPost(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getCurrentUrl());
    }
    /*public AddNewPost(){

    }*/

    public void addNewPost(String title, String descContent){
        /*this.newPostContentBody(driver).sendKeys(descContent);*/
        newPostContentBody.sendKeys(descContent);
        newPostTitle.click();
        newPostTitle.sendKeys(title);
        newPostPublish.click();
    }
}