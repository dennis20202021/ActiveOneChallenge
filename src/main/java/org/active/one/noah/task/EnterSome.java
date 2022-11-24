package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.interaction.DataBinding;
import org.active.one.noah.interaction.Scroll;
import org.active.one.noah.ui.NoahReferralFormUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class EnterSome extends DataBinding {

    private static final String NOTES = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getNotes();

    private EnterSome() {
        super();
    }

    public static Performable notes() {
        return Task.where("{0} types some notes",
                Scroll.down(350),
                WaitUntil.the(NoahReferralFormUI.NOTES_FIELD, isCurrentlyVisible()),
                Enter.theValue(NOTES).into(NoahReferralFormUI.NOTES_FIELD)
        );
    }

}
