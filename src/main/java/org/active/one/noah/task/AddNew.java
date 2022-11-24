package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.active.one.noah.interaction.DataBinding;
import org.active.one.noah.interaction.Product;
import org.active.one.noah.ui.NoahReferralFormUI;

public class AddNew extends DataBinding {

    private static final String PREFIX_CONSTANT = "//span[contains(text(), '";

    private static final String SUFFIX_CONSTANT = "')]/parent::div/parent::div/parent::div";

    private static final String PRODUCT_ITEM = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getAddProduct();

    private static final String SERVICE_ITEM = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getAddService();

    private static final String PLAN_ITEM = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getAddPlan();

    private static final String MAIN_PATTERN = ".+[A-z0-9]+\\s*(-)\\s";

    private static final String PRODUCT_ITEM_FORMATTED = PRODUCT_ITEM.replaceAll(MAIN_PATTERN, "");

    private static final String SERVICE_ITEM_FORMATTED = SERVICE_ITEM.replaceAll(MAIN_PATTERN, "");

    private static final String PLAN_ITEM_FORMATTED = PLAN_ITEM.replaceAll(MAIN_PATTERN, "");

    private static final String NEW_PLAN_ITEM_FORMATTED = PLAN_ITEM_FORMATTED.replaceAll("\\s*$", "");

    private static final String SELECT_PRODUCT_VALUE = PREFIX_CONSTANT + PRODUCT_ITEM_FORMATTED + SUFFIX_CONSTANT;

    private static final String SELECT_SERVICE_VALUE = PREFIX_CONSTANT + SERVICE_ITEM_FORMATTED + SUFFIX_CONSTANT;

    private static final String SELECT_PLAN_VALUE = PREFIX_CONSTANT + NEW_PLAN_ITEM_FORMATTED + SUFFIX_CONSTANT;

    private static final Target SELECT_RIGHT_PRODUCT_OPTION = Target.the("Select right product option")
            .locatedBy(SELECT_PRODUCT_VALUE);

    private static final Target SELECT_RIGHT_SERVICE_OPTION = Target.the("Select right service option")
            .locatedBy(SELECT_SERVICE_VALUE);

    private static final Target SELECT_RIGHT_PLAN_OPTION = Target.the("Select right plan service option")
            .locatedBy(SELECT_PLAN_VALUE);

    private AddNew() {
        super();
    }

    public static Performable item() {
        return Task.where("{0} add new item",
                addProductItem(),
                addServiceItem(),
                addPlanItem()
        );
    }

    private static Performable addProductItem() {

        String productType = "product";

        return Task.where("{0} add custom product item",
                Product.addCustomItem(PRODUCT_ITEM, productType, NoahReferralFormUI.ADD_PRODUCT_BUTTON,
                        NoahReferralFormUI.PRODUCT_FIELD, PRODUCT_ITEM_FORMATTED,
                        NoahReferralFormUI.SUGGESTED_PRODUCT_LIST, SELECT_RIGHT_PRODUCT_OPTION)
        );

    }

    private static Performable addServiceItem() {

        String productType = "service";

        return Task.where("{0} add custom service item",
                Product.addCustomItem(SERVICE_ITEM, productType, NoahReferralFormUI.ADD_SERVICE_BUTTON,
                        NoahReferralFormUI.SERVICE_FIELD, SERVICE_ITEM_FORMATTED,
                        NoahReferralFormUI.SUGGESTED_PRODUCT_LIST, SELECT_RIGHT_SERVICE_OPTION)
        );

    }

    private static Performable addPlanItem() {

        String productType = "plan";

        return Task.where("{0} add custom plan item",
                Product.addCustomItem(PLAN_ITEM, productType, NoahReferralFormUI.ADD_PLAN_BUTTON,
                        NoahReferralFormUI.PLAN_FIELD, NEW_PLAN_ITEM_FORMATTED,
                        NoahReferralFormUI.SUGGESTED_PRODUCT_LIST, SELECT_RIGHT_PLAN_OPTION)
        );

    }

}
