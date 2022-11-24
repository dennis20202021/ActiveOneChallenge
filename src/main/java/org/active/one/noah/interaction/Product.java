package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.targets.Target;

public class Product {

    private Product() {
        throw new IllegalStateException("Utility class");
    }

    public static SimpleProduct addCustomItem(String itemName, String productType, Target targetButton,
                                              Target targetList, String text, Target targetSuggestionList,
                                              Target option) {
        return new SimpleProduct(itemName, productType, targetButton, targetList, text, targetSuggestionList, option);
    }

}
