package org.active.one.noah.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class SimpleProduct extends SelectProduct{

    private final String itemName;

    private final String productType;

    private final Target targetButton;

    private final Target targetList;

    private final String text;

    private final Target targetSuggestionList;

    private final Target option;

    public SimpleProduct(String itemName, String productType, Target targetButton, Target targetList,
                         String text, Target targetSuggestionList, Target option) {
        super();
        this.itemName = itemName;
        this.productType = productType;
        this.targetButton = targetButton;
        this.targetList = targetList;
        this.text = text;
        this.targetSuggestionList = targetSuggestionList;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        addNewItem(actor, itemName, productType, targetButton, targetList, text, targetSuggestionList, option);
    }

}
