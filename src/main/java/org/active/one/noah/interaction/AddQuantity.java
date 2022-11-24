package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public abstract class AddQuantity implements Interaction {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddQuantity.class);

    protected void addItemQuantity(Actor actor, String itemName, String productType, Target quantityElement,
                                   String text) {

        if (itemName.equalsIgnoreCase("No aplica")) {

            LOGGER.info("{} is not applicable to add quantity", productType);

        } else {

            actor.attemptsTo(
                    WaitUntil.the(quantityElement, isCurrentlyVisible()),
                    Clear.field(quantityElement),
                    Enter.theValue(text).into(quantityElement)
            );

        }

    }
}
