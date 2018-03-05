package ru.iopump.sample.web.pages;

import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PPage;

@PPage(value = "Кредит", desc = "Тинькофф - Страница кредита наличными", resource = TinkoffUrls.PATH_CREDIT)
public class TinkoffCredit extends TinkoffBasePage{

    public TinkoffCredit(Browser browser) {
        super(browser);
    }
}
