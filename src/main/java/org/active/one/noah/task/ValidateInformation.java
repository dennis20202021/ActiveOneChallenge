package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.active.one.noah.question.ValidateSuccessfulMessage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ValidateInformation {

    private static final String EXPECTED_CONDITION = "El registro fue creado exitosamente";

    private ValidateInformation() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable created() {
        return Task.where("{0} validates information successfully created",
                (actor -> actor.should(seeThat(ValidateSuccessfulMessage.referralCreated(), equalToIgnoringCase(EXPECTED_CONDITION))))
        );
    }

}
