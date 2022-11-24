package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.targets.Target;

public class Apply {

    private Apply() {
        throw new IllegalStateException("Utility class");
    }

    public static SimpleDiscountType discountType(String itemNamed, String productType, Target discountTypeField,
                                                  String text, Target discountList, Target discountOption) {
        return new SimpleDiscountType(itemNamed, productType, discountTypeField, text, discountList, discountOption);
    }

    public static SimpleDiscountValue discountValue(String itemNamed, Target discountValueField, String text) {
        return new SimpleDiscountValue(itemNamed, discountValueField, text);
    }

}
