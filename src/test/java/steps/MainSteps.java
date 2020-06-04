package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MainPage;

// Наследуем сценарии от билблиотеки серенити:
public class MainSteps extends ScenarioSteps {

    // Обьявляем меин пейдж:
    private MainPage onPage;

    // Описываем методы для серенити
    // чтобы серенити мог добавить шаги в репорт при его генерации:
    @Step
    public void clickOnSignInButton() {
        onPage.clickOnSignInButton();
    }

    @Step
    public void openMainPage() {
        onPage.openMainPage();
    }

}
