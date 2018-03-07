package ru.iopump.sample.web.pages;

import org.openqa.selenium.support.FindBy;
import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PElement;
import ru.mk.pump.web.common.api.annotations.PPage;
import ru.mk.pump.web.elements.api.concrete.Button;
import ru.mk.pump.web.elements.api.concrete.Input;

@PPage(value = "Логин", desc = "Тинькофф - Страница логина", resource = TinkoffUrls.PATH_LOGIN)
public class TinkoffLogin extends TinkoffBasePage{

    @PElement("Логин")
    @FindBy(name = "login")
    private Input loginInput;

    @PElement("Пароль")
    @FindBy(name = "password")
    private Input passwordInput;

    @PElement("Войти")
    @FindBy(xpath = "//span[text()='Войти']/..")
    private Button loginButton;

    public TinkoffLogin(Browser browser) {
        super(browser);
    }
}
