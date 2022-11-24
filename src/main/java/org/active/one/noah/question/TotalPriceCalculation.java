package org.active.one.noah.question;

import org.active.one.noah.interaction.DataBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TotalPriceCalculation extends DataBinding {

    private static final Logger LOGGER = LoggerFactory.getLogger(TotalPriceCalculation.class);

    private static final Operations operations = Operations.getInstance();

    private static final String ADD_PRODUCT = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getAddProduct();

    private static final String PRODUCT_PRICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getProductPrice();

    private static final String DISCOUNT_TYPE_PRODUCT = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountTypeProduct();

    private static final String DISCOUNT_VALUE_PRODUCT = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountValueProduct();

    private static final String QUANTITY_PRODUCT = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getQuantityProduct();

    private static final String TAX_PRODUCT = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getTaxProduct();

    private static final String ADD_SERVICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getAddService();

    private static final String SERVICE_PRICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getServicePrice();

    private static final String DISCOUNT_TYPE_SERVICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountTypeService();

    private static final String DISCOUNT_VALUE_SERVICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountValueService();

    private static final String QUANTITY_SERVICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getQuantityService();

    private static final String TAX_SERVICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getTaxService();

    private static final String ADD_PLAN = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getAddPlan();

    private static final String PLAN_PRICE = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getPlanPrice();

    private static final String DISCOUNT_TYPE_PLAN = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountTypePlan();

    private static final String DISCOUNT_VALUE_PLAN = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getDiscountValuePlan();

    private static final String QUANTITY_PLAN = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getQuantityPlan();

    private static final String TAX_PLAN = REFERRAL.input(XML_FILE, EXCEL_REFERRAL_PATH, 0).getTaxPlan();

    private static final String PERCENTAGE = "Porcentaje";

    private static final String VALUE = "Valor";

    private static final String NOT_APPLICABLE = "No aplica";

    private static double totalPrice;

    private TotalPriceCalculation() {
        super();
    }

    public static double productTotalCalculation() {

        if (ADD_PRODUCT.equalsIgnoreCase("No")) {

            LOGGER.info("Product not added, so it's not possible to calculate price!");

            setTotalPrice(0.0);

        } else {

            if (DISCOUNT_TYPE_PRODUCT.equalsIgnoreCase(PERCENTAGE)) {

                setTotalPrice(operations.productTotalCalculationByPercentage(DISCOUNT_VALUE_PRODUCT, PRODUCT_PRICE,
                        TAX_PRODUCT, QUANTITY_PRODUCT));

                return getTotalPrice();

            } else if (DISCOUNT_TYPE_PRODUCT.equalsIgnoreCase(VALUE)) {

                setTotalPrice(operations.productTotalCalculationByValue(DISCOUNT_VALUE_PRODUCT, PRODUCT_PRICE,
                        TAX_PRODUCT, QUANTITY_PRODUCT));

                return getTotalPrice();

            } else if (DISCOUNT_TYPE_PRODUCT.equalsIgnoreCase(NOT_APPLICABLE)) {

                LOGGER.info("Product not applicable for discount");

                setTotalPrice(operations.productTotalWithoutAnyDiscount(PRODUCT_PRICE, TAX_PRODUCT, QUANTITY_PRODUCT));

                return getTotalPrice();

            }

        }

        return getTotalPrice();

    }

    public static double serviceTotalCalculation() {

        if (ADD_SERVICE.equalsIgnoreCase("No")) {

            LOGGER.info("Service not added, so it's not possible to calculate price!");

            setTotalPrice(0.0);

        } else {

            if (DISCOUNT_TYPE_SERVICE.equalsIgnoreCase(PERCENTAGE)) {

                setTotalPrice(operations.productTotalCalculationByPercentage(DISCOUNT_VALUE_SERVICE, SERVICE_PRICE,
                        TAX_SERVICE, QUANTITY_SERVICE));

                return getTotalPrice();

            } else if (DISCOUNT_TYPE_SERVICE.equalsIgnoreCase(VALUE)) {

                setTotalPrice(operations.productTotalCalculationByValue(DISCOUNT_VALUE_SERVICE, SERVICE_PRICE,
                        TAX_SERVICE, QUANTITY_SERVICE));

                return getTotalPrice();

            } else if (DISCOUNT_TYPE_SERVICE.equalsIgnoreCase(NOT_APPLICABLE)) {

                LOGGER.info("Service not applicable for discount");

                setTotalPrice(operations.productTotalWithoutAnyDiscount(SERVICE_PRICE, TAX_SERVICE, QUANTITY_SERVICE));

                return getTotalPrice();

            }

        }

        return getTotalPrice();

    }

    public static double planTotalCalculation() {

        if (ADD_PLAN.equalsIgnoreCase("No")) {

            LOGGER.info("Plan not added, so it's not possible to calculate price!");

            setTotalPrice(0.0);

        } else {

            if (DISCOUNT_TYPE_PLAN.equalsIgnoreCase(PERCENTAGE)) {

                setTotalPrice(operations.productTotalCalculationByPercentage(DISCOUNT_VALUE_PLAN, PLAN_PRICE,
                        TAX_PLAN, QUANTITY_PLAN));

                return getTotalPrice();

            } else if (DISCOUNT_TYPE_PLAN.equalsIgnoreCase(VALUE)) {

                setTotalPrice(operations.productTotalCalculationByValue(DISCOUNT_VALUE_PLAN, PLAN_PRICE,
                        TAX_PLAN, QUANTITY_PLAN));

                return getTotalPrice();

            } else if (DISCOUNT_TYPE_PLAN.equalsIgnoreCase(NOT_APPLICABLE)) {

                LOGGER.info("Plan not applicable for discount");

                setTotalPrice(operations.productTotalWithoutAnyDiscount(PLAN_PRICE, TAX_PLAN, QUANTITY_PLAN));

                return getTotalPrice();

            }

        }

        return getTotalPrice();

    }

    private static double getTotalPrice() {
        return totalPrice;
    }

    private static void setTotalPrice(double totalPrice) {
        TotalPriceCalculation.totalPrice = totalPrice;
    }

}
