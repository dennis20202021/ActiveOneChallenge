package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public abstract class ApplyDiscount implements Interaction {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplyDiscount.class);

    protected void applyItemDiscount(Actor actor, String itemNamed, String productType, Target discountTypeField,
                                     String text, Target discountList, Target discountOption) {

        if (itemNamed.equalsIgnoreCase("No aplica")) {

            LOGGER.info("{} does not want to apply discount to {} item", actor.getName(), productType);
            LOGGER.info("So, {} item is not applicable for discount!", productType);

        } else {

            actor.attemptsTo(
                    WaitUntil.the(discountTypeField, isCurrentlyVisible()),
                    Click.on(discountTypeField),
                    Enter.theValue(text).into(discountTypeField)
                            .then(WaitUntil.the(discountList, isCurrentlyVisible()))
                            .then(Click.on(discountOption))
            );

        }

    }

    protected void addDiscountValue(Actor actor, String itemNamed, Target discountValueField, String text) {

        if (itemNamed.equalsIgnoreCase("No aplica")) {

            LOGGER.info("{} did not select discount to apply previously", actor.getName());

        } else {

            actor.attemptsTo(
                    WaitUntil.the(discountValueField, isCurrentlyVisible()),
                    Click.on(discountValueField),
                    Enter.theValue(text).into(discountValueField)
            );

        }

    }

}
