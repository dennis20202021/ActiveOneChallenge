package org.active.one.noah.question;

import net.serenitybdd.screenplay.Question;
import org.active.one.noah.ui.NoahReferralFormUI;

public class TotalPriceVerification {

    private TotalPriceVerification() {
        throw new IllegalStateException("Utility class");
    }

    public static Question<String> item() {
        return actor -> NoahReferralFormUI.TOTAL.resolveFor(actor).waitUntilVisible().getTextContent();
    }

}
