package ru.iopump.sample.web.pages;

import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PPage;

@PPage(value = "Главная страница", desc = "Тинькофф - Главная страница")
public class TinkoffMain extends TinkoffBasePage{



    public TinkoffMain(Browser browser) {
        super(browser);
    }
}
