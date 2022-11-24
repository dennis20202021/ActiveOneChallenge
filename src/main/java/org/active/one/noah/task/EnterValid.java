package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.active.one.noah.ui.NoahLoginUI;
import org.active.one.noah.util.json.LoginRequest;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class EnterValid {

    private EnterValid() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable credentials() {
        return Task.where("{0} types credentials correctly",
                WaitUntil.the(NoahLoginUI.EMAIL_TARGET, isCurrentlyVisible()),
                Enter.theValue(LoginRequest.enterEmail()).into(NoahLoginUI.EMAIL_TARGET),
                WaitUntil.the(NoahLoginUI.PASSWORD_TARGET, isCurrentlyVisible()),
                Enter.theValue(LoginRequest.enterPassword()).into(NoahLoginUI.PASSWORD_TARGET)
        );
    }

}
