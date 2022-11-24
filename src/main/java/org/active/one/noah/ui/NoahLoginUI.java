package org.active.one.noah.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:active.one.noah.url")
public class NoahLoginUI extends PageObject {

    private static final String EMAIL_VALUE = "//input[@type='email']";

    private static final String PASSWORD_VALUE = "//input[@type='password']";

    private static final String LOGGING_BUTTON_VALUE = "//button[@type='submit']";

    public static final Target EMAIL_TARGET = Target.the("Email").locatedBy(EMAIL_VALUE);

    public static final Target PASSWORD_TARGET = Target.the("Password").locatedBy(PASSWORD_VALUE);

    public static final Target SUBMIT_BUTTON = Target.the("Submit Button").locatedBy(LOGGING_BUTTON_VALUE);

}
