package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Стандартный адрес:
@DefaultUrl("http://automationpractice.com/index.php")

// Наследуем бейз пейдж:
public class MainPage extends BasePage{

    //// Локаторы:

    // Аннтоация:
    // указываем локатор
    // в данном случае сss
    @FindBy(css = "a.login")
    // Указываем веб элемент и его название:
    private WebElement signInButton;

    //// Дравер:

    // Создается автоматом после наследования бейз пейджа:
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //// Методы:

    //Открытия страницы:
    public void openMainPage() {
        open();
    }

    // Нажатия кнопки указанного элемента:
    public void clickOnSignInButton() {
        element(signInButton).click();
    }

}
