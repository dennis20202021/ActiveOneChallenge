package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class SimpleDiscountValue extends ApplyDiscount {

    private final String itemNamed;

    private final Target discountValueField;

    private final String text;

    public SimpleDiscountValue(String itemNamed, Target discountValueField, String text) {
        this.itemNamed = itemNamed;
        this.discountValueField = discountValueField;
        this.text = text;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        addDiscountValue(actor, itemNamed, discountValueField, text);
    }

}
