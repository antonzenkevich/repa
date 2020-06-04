package tests;

import org.junit.Test;

public class LoginTest3 extends SampleTest {

    @Test
    public void loginTest3 (){
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Нажимаем кнпоку сайн ин чтобы перейти на страницу логина:
        user.mainPage.clickOnSignInButton();
        // 3. Вводим почту:
        user.loginPage.fillEmailAddress(Helper.PropertiesHelper.INSTANCE.getProperties("email"));
        // Пропускаем ввод пароля
        // 4. Нажимаем кнопку сайн ин чтобы войти в мой аккаунт:
        user.loginPage.clickSignInLogin();
        // 5. Проверяем наличие алерта:
        user.loginPage.allertMessageIsDisplayed();
        // 6. Проверяем правильность сообщения в алерте:
        user.loginPage.allertMessageIsCorrect(Helper.PropertiesHelper.INSTANCE.getProperties("allertPassword"));
    }
}
