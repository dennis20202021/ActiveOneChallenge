package org.active.one.noah.question;

import net.serenitybdd.screenplay.Question;
import org.active.one.noah.ui.NoahReferralUI;

public class ValidateSuccessfulMessage {

    private ValidateSuccessfulMessage() {
        throw new IllegalStateException("Utility class");
    }

    public static Question<String> referralCreated() {
        return actor -> NoahReferralUI.REFERRAL_CREATION_MESSAGE_SUCCESS.resolveFor(actor).waitUntilVisible()
                .getTextContent().trim();
    }

}
