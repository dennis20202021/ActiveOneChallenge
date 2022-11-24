package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.interaction.DataBinding;
import org.active.one.noah.ui.NoahReferralFormUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class SelectPayment extends DataBinding {

    private static final String PAYMENT_WAY = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getPaymentWay();

    private SelectPayment() {
        super();
    }

    public static Performable way() {

        return Task.where("{0} selects payment way",
                WaitUntil.the(NoahReferralFormUI.PAYMENT_WAY_FIELD, isCurrentlyVisible()),
                Click.on(NoahReferralFormUI.PAYMENT_WAY_FIELD),
                Enter.theValue(PAYMENT_WAY).into(NoahReferralFormUI.PAYMENT_WAY_FIELD)
                        .then(WaitUntil.the(NoahReferralFormUI.PAYMENT_LIST_FIELD, isCurrentlyVisible()))
                        .then(Click.on(NoahReferralFormUI.SUGGESTED_PAYMENT_OPTION))
        );

    }

}
