package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.active.one.noah.interaction.Apply;
import org.active.one.noah.interaction.DataBinding;
import org.active.one.noah.interaction.Scroll;
import org.active.one.noah.ui.NoahReferralFormUI;

public class AddDiscountBy extends DataBinding {

    private static final String DISCOUNT_TYPE_PRODUCT = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountTypeProduct();

    private static final String DISCOUNT_VALUE_PRODUCT = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountValueProduct();

    private static final String DISCOUNT_TYPE_SERVICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountTypeService();

    private static final String DISCOUNT_VALUE_SERVICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountValueService();

    private static final String DISCOUNT_TYPE_PLAN = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountTypePlan();

    private static final String DISCOUNT_VALUE_PLAN = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountValuePlan();

    private static final String DISCOUNT_TYPE = "/following::label[contains(text(), 'Tipo de descuento')][1]/following::input[1]";

    private static final String CONSTANT_1 = "/following::span[contains(text(), '";

    private static final String CONSTANT_2 = "')][1]/parent::div/parent::div";

    private static final String DISCOUNT_PRODUCT_SELECTION = CONSTANT_1 + DISCOUNT_TYPE_PRODUCT + CONSTANT_2;

    private static final String DISCOUNT_PRODUCT = "//label[contains(text(), 'Producto')]" + DISCOUNT_TYPE +
            DISCOUNT_PRODUCT_SELECTION;

    private static final String DISCOUNT_SERVICE_SELECTION = CONSTANT_1 + DISCOUNT_TYPE_SERVICE + CONSTANT_2;

    private static final String DISCOUNT_SERVICE = "//label[contains(text(), 'Servicio')]" + DISCOUNT_TYPE +
            DISCOUNT_SERVICE_SELECTION;

    private static final String DISCOUNT_PLAN_SELECTION = CONSTANT_1 + DISCOUNT_TYPE_PLAN + CONSTANT_2;

    private static final String DISCOUNT_PLAN = "//label[contains(text(), 'Plan')]" + DISCOUNT_TYPE +
            DISCOUNT_PLAN_SELECTION;



    private AddDiscountBy() {
        super();
    }

    public static Performable valueOrPercentage() {
        return Task.where("{0} adds discounts by value or percentage if applicable",
                applyDiscountProduct(),
                Scroll.down(200),
                applyDiscountService(),
                Scroll.down(100),
                applyDiscountPlan()
        );
    }

    private static Performable applyDiscountProduct() {

        String productType = "product";

        Target product = Target.the("Product discount").locatedBy(DISCOUNT_PRODUCT);

        return Task.where("{0} apply discount to product if applicable",
                Apply.discountType(DISCOUNT_TYPE_PRODUCT, productType, NoahReferralFormUI.APPLY_PRODUCT_DISCOUNT_FIELD,
                        DISCOUNT_TYPE_PRODUCT, NoahReferralFormUI.LIST_PRODUCT_DISCOUNT,
                        product),
                Apply.discountValue(DISCOUNT_VALUE_PRODUCT, NoahReferralFormUI.PRODUCT_VALUE_FIELD,
                        DISCOUNT_VALUE_PRODUCT)
        );

    }

    private static Performable applyDiscountService() {

        String productType = "service";

        Target service = Target.the("Service discount").locatedBy(DISCOUNT_SERVICE);

        return Task.where("{0} apply discount to service if applicable",
                Apply.discountType(DISCOUNT_TYPE_SERVICE, productType, NoahReferralFormUI.APPLY_SERVICE_DISCOUNT_FIELD,
                        DISCOUNT_TYPE_SERVICE, NoahReferralFormUI.LIST_PRODUCT_DISCOUNT,
                        service),
                Apply.discountValue(DISCOUNT_VALUE_SERVICE, NoahReferralFormUI.SERVICE_VALUE_FIELD,
                        DISCOUNT_VALUE_SERVICE)
        );

    }

    private static Performable applyDiscountPlan() {

        String productType = "plan";

        Target plan = Target.the("Plan discount").locatedBy(DISCOUNT_PLAN);

        return Task.where("{0} apply discount to plan if applicable",
                Apply.discountType(DISCOUNT_TYPE_PLAN, productType, NoahReferralFormUI.APPLY_PLAN_DISCOUNT_FIELD,
                        DISCOUNT_TYPE_PLAN, NoahReferralFormUI.LIST_PRODUCT_DISCOUNT,
                        plan),
                Apply.discountValue(DISCOUNT_VALUE_PLAN, NoahReferralFormUI.PLAN_VALUE_FIELD,
                        DISCOUNT_VALUE_PLAN)
        );

    }

}
