package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.targets.Target;

public class Add {

    private Add() {
        throw new IllegalStateException("Utility class");
    }

    public static SimpleQuantity quantity(String itemName, String productType, Target quantityElement, String text) {
        return new SimpleQuantity(itemName, productType, quantityElement, text);
    }

}
