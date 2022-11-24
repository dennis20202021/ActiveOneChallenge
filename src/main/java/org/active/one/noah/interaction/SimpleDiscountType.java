package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class SimpleDiscountType extends ApplyDiscount {

    private final String itemNamed;

    private final String productType;

    private final Target discountTypeField;

    private final String text;

    private final Target discountList;

    private final Target discountOption;

    public SimpleDiscountType(String itemNamed, String productType, Target discountTypeField, String text,
                              Target discountList, Target discountOption) {
        this.itemNamed = itemNamed;
        this.productType = productType;
        this.discountTypeField = discountTypeField;
        this.text = text;
        this.discountList = discountList;
        this.discountOption = discountOption;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        applyItemDiscount(actor, itemNamed, productType, discountTypeField, text, discountList, discountOption);
    }

}
