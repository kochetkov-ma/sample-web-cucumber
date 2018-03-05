package ru.iopump.sample.web.pages;

import ru.iopump.sample.web.components.MainMenu;
import ru.mk.pump.commons.reporter.Reporter;
import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PComponent;
import ru.mk.pump.web.page.BasePage;

abstract class TinkoffBasePage extends BasePage{

    @PComponent("Главное меню")
    private MainMenu mainMenu;

    public TinkoffBasePage(Browser browser) {
        super(browser);
    }

    @Override
    public String getBaseUrl() {
        return TinkoffUrls.MAIN;
    }
}
