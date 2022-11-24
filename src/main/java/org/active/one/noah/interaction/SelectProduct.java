package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public abstract class SelectProduct implements Interaction {

    private static final Logger LOGGER = LoggerFactory.getLogger(SelectProduct.class);


    protected void addNewItem(Actor actor, String itemName, String productType, Target targetButton,
                              Target targetList, String text, Target targetSuggestionList, Target option) {

        if (itemName.equalsIgnoreCase("No")) {

            LOGGER.info("{} does not want to add new {} item", actor.getName(), productType);
            LOGGER.info("So, {} item was not added!", productType);

        } else {

            actor.attemptsTo(
                    WaitUntil.the(targetButton, isCurrentlyVisible()),
                    Click.on(targetButton),
                    WaitUntil.the(targetList, isCurrentlyVisible()),
                    Click.on(targetList),
                    Enter.theValue(text).into(targetList)
                            .then(WaitUntil.the(targetSuggestionList, isCurrentlyVisible()))
                            .then(Click.on(option))
            );

        }

    }

}
