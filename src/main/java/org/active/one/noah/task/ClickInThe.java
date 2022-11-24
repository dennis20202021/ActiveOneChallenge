package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.ui.NoahHomeUI;
import org.active.one.noah.ui.NoahReferralUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ClickInThe {

    private ClickInThe() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable optionToDeploy(String option) {
        return Task.where("{0} performs click in the '" + option + "' option",
                WaitUntil.the(NoahHomeUI.TRANSACTIONS_DROP_DOWN_LIST, isCurrentlyVisible())
                        .forNoMoreThan(30).seconds(),
                Click.on(NoahHomeUI.TRANSACTIONS_DROP_DOWN_LIST)
        );
    }

    public static Performable createReferralButton(String textButton) {
        return Task.where("{0} performs click '" + textButton + "' button",
                WaitUntil.the(NoahReferralUI.CREATE_REFERRAL_BUTTON, isCurrentlyVisible())
                        .forNoMoreThan(30).seconds(),
                JavaScriptClick.on(NoahReferralUI.CREATE_REFERRAL_BUTTON)
        );
    }

}
