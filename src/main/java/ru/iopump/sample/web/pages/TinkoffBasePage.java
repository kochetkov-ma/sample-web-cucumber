package ru.iopump.sample.web.pages;

import org.openqa.selenium.support.FindBy;
import ru.iopump.sample.web.components.MainMenu;
import ru.mk.pump.commons.reporter.Reporter;
import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PComponent;
import ru.mk.pump.web.common.api.annotations.PElement;
import ru.mk.pump.web.elements.api.concrete.Button;
import ru.mk.pump.web.elements.api.concrete.Link;
import ru.mk.pump.web.page.BasePage;

abstract class TinkoffBasePage extends BasePage{

    @PComponent("Главное меню")
    private MainMenu mainMenu;

    @PElement("Авторизация")
    @FindBy(xpath = "//span[text()='Войти']/..")
    private Button login;

    @PElement("Лого")
    @FindBy(xpath = "//span[@data-qa-file='TinkoffLogo']")
    private Button logo;

    @PElement("Частным лицам")
    @FindBy(xpath = "//a[text()='Частным лицам']")
    private Link privatePerson;

    @PElement("Частным лицам")
    @FindBy(xpath = "//a[text()='Бизнесу']")
    private Link businessPerson;

    public TinkoffBasePage(Browser browser) {
        super(browser);
    }

    @Override
    public String getBaseUrl() {
        return TinkoffUrls.MAIN;
    }
}
