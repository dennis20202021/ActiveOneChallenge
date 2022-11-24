package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.interaction.DataBinding;
import org.active.one.noah.ui.NoahReferralFormUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class SelectCustomer extends DataBinding {

    private static final String CUSTOMER = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getCustomer();

    private static final String PATTERN = "\\W*[A-z]";

    private static final String CUSTOMER_FORMATTED = CUSTOMER.replaceAll(PATTERN, "");

    private SelectCustomer() {
        super();
    }

    public static Performable name() {

        return Task.where("{0} selects customer",
                WaitUntil.the(NoahReferralFormUI.CUSTOMER_FIELD, isCurrentlyVisible()),
                Enter.theValue(CUSTOMER_FORMATTED).into(NoahReferralFormUI.CUSTOMER_FIELD)
                        .then(WaitUntil.the(NoahReferralFormUI.CUSTOMER_LIST_FIELD, isCurrentlyVisible()))
                        .then(Click.on(NoahReferralFormUI.SUGGESTED_OPTION))
        );

    }

}
