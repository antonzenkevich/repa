package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php?controller=my-account")

public class MyAccountPage extends BasePage {

    //// Локаторы:

    // Имя аккаунта:
    @FindBy (xpath = "//div[@class='header_user_info']/a/span")
    private WebElement myAccountName;
    //Кнопка сан аут:
    @FindBy(xpath = "//div/a[@class='logout']")
    private WebElement signOutButton;

    @FindBy(css = "a[title = 'Women']")
    private WebElement womenTab;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]")
    private WebElement moveToItem;

    @FindBy (css = "a[data-id-product = '1']")
    private WebElement addToCart;

    //// Драйвер:

    public MyAccountPage (WebDriver driver) {
        super(driver);
    }

    //// Методы:

    //Открытия страницы:
    public void openMyAccountPage() {
        open();
    }

    public void clickOnWomenTab() {
        element(womenTab).click();
    }

    //Проверяем правдивость кнопки аккаунта имени Аккаунта:
    public void myAccountNameIsTrue(String accountName){
        Assert.assertEquals(accountName,element(myAccountName).getText());
    }
    //Проверяем кнопку сайн аут:
    // Кнопка видна:
    public void signOutButtonIsVisible(){
        Assert.assertTrue(element(signOutButton).isVisible());
    }
    // На кнопку можно нажать
    public void signOutButtonIsClickable(){
        Assert.assertTrue(element(signOutButton).isClickable());
    }

    public void addToCartClick(){
        withAction().moveToElement(moveToItem).perform();
        element(addToCart).click();
    }
}