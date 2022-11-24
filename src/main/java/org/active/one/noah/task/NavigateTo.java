package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.active.one.noah.ui.NoahLoginUI;

public class NavigateTo {

    private NavigateTo() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable noahLoginHomePage() {
        return Task.where("{0} opens the Noah Login Home Page",
                Open.browserOn().the(NoahLoginUI.class)
        );
    }

}
