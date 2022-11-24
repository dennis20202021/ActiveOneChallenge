package org.active.one.noah.task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.ui.NoahHomeUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectOneOption {

    private static final Logger logger = LoggerFactory.getLogger(SelectOneOption.class);

    private SelectOneOption() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable fromSubmenuTransactionsList(Actor actor, String submenu) {

        WaitUntil.the(NoahHomeUI.SUB_MENUS_LIST, isCurrentlyEnabled()).forNoMoreThan(30).seconds();

        List<WebElementFacade> menuList = NoahHomeUI.getListOfSubmenuItems(actor);

        int count = 0;

        for (WebElementFacade webElementFacade : menuList) {
            count++;
            logger.info("Item #{} => {}\n", count, webElementFacade.getTextContent());
        }

        return Task.where("{0} performs click in the submenu '" + submenu + "' option",
                WaitUntil.the(NoahHomeUI.REFERRAL_OPTION, isCurrentlyVisible()),
                Click.on(NoahHomeUI.REFERRAL_OPTION)
        );
    }

}
