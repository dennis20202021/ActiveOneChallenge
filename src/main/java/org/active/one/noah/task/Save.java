package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.interaction.Scroll;
import org.active.one.noah.ui.NoahReferralFormUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Save {

    private Save() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable information() {
        return Task.where("{0} performs click on save button",
                Scroll.down(350),
                WaitUntil.the(NoahReferralFormUI.SAVE_BUTTON, isCurrentlyVisible()),
                Click.on(NoahReferralFormUI.SAVE_BUTTON),
                WaitUntil.the(NoahReferralFormUI.SAVE_OPTION_LIST, isCurrentlyVisible()),
                Click.on(NoahReferralFormUI.SAVE_OPTION)
        );
    }

}
