package ru.iopump.sample.web.pages;

import java.util.Optional;
import org.openqa.selenium.support.FindBy;
import ru.iopump.sample.web.components.MainMenu;
import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PPage;
import ru.mk.pump.web.elements.api.Element;

@PPage(value = "Кредит наличными", desc = "Тинькофф - Страница кредита наличными", resource = TinkoffUrls.PATH_CREDIT)
public class TinkoffCredit extends TinkoffBasePage {

    @FindBy(xpath = "//a[text()='Кредит наличными']")
    private MainMenu title;

    public TinkoffCredit(Browser browser) {
        super(browser);
    }

    @Override
    public Optional<Element> getTitle() {
        return Optional.of(title);
    }
}