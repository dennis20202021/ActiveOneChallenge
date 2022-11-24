package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class SimpleQuantity extends AddQuantity {

    private final String itemName;

    private final String productType;

    private final Target quantityElement;

    private final String text;

    public SimpleQuantity(String itemName, String productType, Target quantityElement, String text) {
        this.itemName = itemName;
        this.productType = productType;
        this.quantityElement = quantityElement;
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        addItemQuantity(actor, itemName, productType, quantityElement, text);
    }

}
