package ru.iopump.sample.web.pages;

import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PPage;

@PPage(value = "Логин", desc = "Тинькофф - Страница логина", resource = TinkoffUrls.PATH_LOGIN)
public class TinkoffLogin extends TinkoffBasePage{

    public TinkoffLogin(Browser browser) {
        super(browser);
    }
}
