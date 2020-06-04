package tests;

import org.junit.Test;

public class LoginTest2 extends SampleTest {

    @Test
    public void loginTest2 (){
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Нажимаем кнпоку сайн ин чтобы перейти на страницу логина:
        user.mainPage.clickOnSignInButton();
        // Пропускаем ввод почты:
        // 4. Вводим пароль:
        user.loginPage.fillPassword(Helper.PropertiesHelper.INSTANCE.getProperties("password"));
        // 5. Нажимаем кнопку сайн ин чтобы войти в мой аккаунт:
        user.loginPage.clickSignInLogin();
        // 5. Проверяем наличие алерта:
        user.loginPage.allertMessageIsDisplayed();
        // 6. Проверяем правильность сообщения в алерте:
        user.loginPage.allertMessageIsCorrect(Helper.PropertiesHelper.INSTANCE.getProperties("allertEmail"));
    }
}
