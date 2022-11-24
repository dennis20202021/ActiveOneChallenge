package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.ui.NoahLoginUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LoginInTo {

    private LoginInTo() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable noahHomePage(String textElement) {
        return Task.where("{0} performs click on '" + textElement + "' button to login",
                WaitUntil.the(NoahLoginUI.SUBMIT_BUTTON, isClickable()),
                Click.on(NoahLoginUI.SUBMIT_BUTTON)
        );
    }
}
