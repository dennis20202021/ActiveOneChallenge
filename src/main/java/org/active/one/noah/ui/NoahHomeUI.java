package org.active.one.noah.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class NoahHomeUI extends PageObject {

    private static final String TRANSACTIONS_VALUE = "//div[contains(text(), 'Transacciones')]/parent::div";

    private static final String SUB_MENU_VALUES = "//div[contains(text(), 'Transacciones')]/following::div[2]/a";

    private static final String REFERRAL_VALUE = "//div[contains(text(), 'Remisiones')]/parent::a";

    public static final Target TRANSACTIONS_DROP_DOWN_LIST = Target.the("Transactions").locatedBy(TRANSACTIONS_VALUE);

    public static final Target SUB_MENUS_LIST = Target.the("Submenus list").locatedBy(SUB_MENU_VALUES);

    public static final Target REFERRAL_OPTION = Target.the("Referral").locatedBy(REFERRAL_VALUE);

    public static List<WebElementFacade> getListOfSubmenuItems(Actor actor) {
        return SUB_MENUS_LIST.resolveAllFor(actor);
    }

}
