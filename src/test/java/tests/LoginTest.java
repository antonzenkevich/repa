package tests;

import org.junit.Test;

public class LoginTest extends SampleTest {

    @Test
    public void loginTest (){
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Нажимаем кнпоку сайн ин чтобы перейти на страницу логина:
        user.mainPage.clickOnSignInButton();
        // 3. Вводим почту:
        user.loginPage.fillEmailAddress(Helper.PropertiesHelper.INSTANCE.getProperties("email"));
        // 4. Вводим пароль:
        user.loginPage.fillPassword(Helper.PropertiesHelper.INSTANCE.getProperties("password"));
        // 5. Нажимаем кнопку сайн ин чтобы войти в мой аккаунт:
        user.loginPage.clickSignInLogin();
        user.myAccountPage.clickOnWomenTab();
        user.myAccountPage.addToCartClick();
    }
}
