package ru.iopump.sample.web.components;

import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.mk.pump.web.browsers.Browser;
import ru.mk.pump.web.common.api.annotations.PAction;
import ru.mk.pump.web.component.BaseComponent;
import ru.mk.pump.web.elements.api.concrete.Button;
import ru.mk.pump.web.elements.internal.interfaces.InternalElement;
import ru.mk.pump.web.page.api.Page;

public class MainMenu extends BaseComponent {

    @FindBy(xpath = "//span[@data-qa-file='MenuItem']")
    private List<Button> items;

    @FindBy(id = "mainDropdownMenu")
    private Button dropDownMenu;

    //region CONSTRUCTORS
    public MainMenu(By avatarBy, Page page) {
        super(avatarBy, page);
    }

    public MainMenu(By avatarBy, InternalElement parentElement) {
        super(avatarBy, parentElement);
    }

    public MainMenu(By avatarBy, Browser browser) {
        super(avatarBy, browser);
    }
    //endregion

    @PAction("выбрать")
    public void select(@Nullable String value) {
        if (dropDownMenu.isExists(100).result().isSuccess()) {
            dropDownMenu.click();
        }
        items.stream().filter(item -> StringUtils.equalsAnyIgnoreCase(item.getText(), value))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(String.format("Cannot find '%s' among visible menu items", value)))
            .click();
    }

}
