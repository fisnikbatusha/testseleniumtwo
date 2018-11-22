import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllPostsPage {

    WebDriver driver;
    @FindBy(how = How.ID,id="the-list")
    WebElement postsContainer;
    @FindBy(how = How.ID,id = "post-search-input")
    WebElement searchPosts;
    @FindBy(how = How.ID,id = "cat")
    WebElement viewByCategories;
    @FindBy(how=How.LINK_TEXT, using="Add New")
    WebElement addNewPost;
    public AllPostsPage(WebDriver driver){
        this.driver = driver;
        driver.get("http://localhost/wordpress/wp-admin/edit.php");
    }
    public void createANewPost(String postTitle, String postDescription){
        addNewPost.click();
        AddNewPost addnewpostObject = PageFactory.initElements(driver,AddNewPost.class);
        addnewpostObject.addNewPost(postTitle,postDescription);
    }
    public void editAPost(String presentTitle, String newTitle, String description){
        List<WebElement> allPosts = postsContainer.findElements(By.className("row-title"));
        for (WebElement ele : allPosts){
            if (ele.getText().equals(presentTitle)){
                Actions builder = new Actions(driver);
                builder.moveToElement(ele);
                builder.click(driver.findElement(
                        By.cssSelector(".edit>a")));
                // Generate the composite action.
                Action compositeAction = builder.build();
                // Perform the composite action.
                compositeAction.perform();
                break;
            }
        }
        /*EditPost editPost
                = PageFactory.initElements(driver, EditPost.class);
        editPost.editPost(newTitle, description);*/
    }
    public void deleteAPost(String postTitle){ }
    public void filterAPostByCategory(String category){ }
    public void searchInPost(String searchText){ }
    public int getAllPostsCount(){return 0; }




}
