package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.ui.NoahReferralFormUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DeleteDefault {

    private DeleteDefault() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable item() {
        return Task.where("{0} deletes default item",
                WaitUntil.the(NoahReferralFormUI.DELETE_BUTTON, isCurrentlyVisible()),
                Click.on(NoahReferralFormUI.DELETE_BUTTON)
        );
    }

}
