package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.interaction.DataBinding;
import org.active.one.noah.ui.NoahReferralFormUI;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class SelectId extends DataBinding {

    private static final String ID_TYPE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getIdType();

    private SelectId() {
        super();
    }

    public static Performable type() {

        return Task.where("{0} selects id type",
                WaitUntil.the(NoahReferralFormUI.DOC_TYPE_FIELD, isCurrentlyVisible()),
                Clear.field(NoahReferralFormUI.DOC_TYPE_FIELD),
                Enter.theValue(ID_TYPE).into(NoahReferralFormUI.DOC_TYPE_FIELD)
                        .thenHit(Keys.ENTER)
        );

    }

}
