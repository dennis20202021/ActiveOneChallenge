package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.active.one.noah.interaction.Add;
import org.active.one.noah.interaction.DataBinding;
import org.active.one.noah.ui.NoahReferralFormUI;

public class AddItem extends DataBinding {

    private static final String PRODUCT_QUANTITY = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0)
            .getQuantityProduct();

    private static final String SERVICE_QUANTITY = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0)
            .getQuantityService();

    private static final String PLAN_QUANTITY = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0)
            .getQuantityPlan();

    private AddItem() {
        super();
    }

    public static Performable quantity() {
        return Task.where("{0} adds item quantity",
                addQuantityProduct(),
                addQuantityService(),
                addQuantityPlan()
        );
    }

    private static Performable addQuantityProduct() {

        String productType = "Product";

        return Task.where("{0} add quantity product if applicable",
                Add.quantity(PRODUCT_QUANTITY, productType, NoahReferralFormUI.ADD_QUANTITY_PRODUCT_FIELD,
                        PRODUCT_QUANTITY)
        );

    }

    private static Performable addQuantityService() {

        String productType = "Service";

        return Task.where("{0} add quantity service if applicable",
                Add.quantity(SERVICE_QUANTITY, productType, NoahReferralFormUI.ADD_QUANTITY_SERVICE_FIELD,
                        SERVICE_QUANTITY)
        );

    }

    private static Performable addQuantityPlan() {

        String productType = "Plan";

        return Task.where("{0} add quantity plan if applicable",
                Add.quantity(PLAN_QUANTITY, productType, NoahReferralFormUI.ADD_QUANTITY_PLAN_FIELD,
                        PLAN_QUANTITY)
        );

    }

}
