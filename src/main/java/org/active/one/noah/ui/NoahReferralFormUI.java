package org.active.one.noah.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NoahReferralFormUI extends PageObject {

    // ---------------------- Values ------------------------ //

    private static final String CONSTANT = "//div[contains(@class, '";

    private static final String DOC_TYPE_VALUE = "//label[contains(text(), 'Tipo de documento')]/following::input[1]";

    private static final String CUSTOMER_VALUE = "//label[contains(text(), 'Cliente')]/following::input[1]";

    private static final String CUSTOMER_LIST_CLASS = "v-menu__content theme--light menuable__content__active v-autocomplete__content";

    private static final String CUSTOMER_LIST_VALUE = CONSTANT + CUSTOMER_LIST_CLASS + "')]";

    private static final String SUGGESTED_VALUE = CUSTOMER_LIST_VALUE + "/div/div";

    private static final String PAYMENT_WAY_VALUE = "//label[contains(text(), 'Forma de pago')]/following::input[1]";

    private static final String PAYMENT_LIST_CLASS = "v-menu__content theme--light menuable__content__active v-autocomplete__content";

    private static final String PAYMENT_LIST_VALUE = CONSTANT + PAYMENT_LIST_CLASS + "')]";

    private static final String SUGGESTED_PAYMENT_VALUE = PAYMENT_LIST_VALUE + "/div/div";

    private static final String NOTES_VALUE = "//label[contains(text(), 'Notas')]/following::textarea";

    private static final String DELETE_VALUE = "//i[@class='v-icon notranslate mdi mdi-delete theme--dark']/parent::span/parent::button";

    private static final String ADD_PRODUCT_VALUE = "//span[contains(text(), 'Agregar producto')]/parent::button";

    private static final String PRODUCT_LIST_VALUE = "//label[contains(text(), 'Producto')]/following::input[1]";

    private static final String PRODUCT_CLASS = "v-menu__content theme--light menuable__content__active v-autocomplete__content";

    private static final String SUGGESTED_PRODUCT_LIST_VALUE = CONSTANT + PRODUCT_CLASS + "')]";

    private static final String ADD_SERVICE_VALUE = "//span[contains(text(), 'Agregar servicio')]/parent::button";

    private static final String SERVICE_LIST_VALUE = "//label[contains(text(), 'Servicio')]/following::input[1]";

    private static final String ADD_PLAN_VALUE = "//span[contains(text(), 'Agregar plan')]/parent::button";

    private static final String PLAN_LIST_VALUE = "//label[contains(text(), 'Plan')]/following::input[1]";

    private static final String ADD_QUANTITY_PRODUCT_VALUE =
            "//label[contains(text(), 'Producto')]/following::label[contains(text(), 'Cantidad')][1]/following::input[1]";

    private static final String ADD_QUANTITY_SERVICE_VALUE =
            "//label[contains(text(), 'Servicio')]/following::label[contains(text(), 'Cantidad')][1]/following::input[1]";

    private static final String ADD_QUANTITY_PLAN_VALUE =
            "//label[contains(text(), 'Plan')]/following::label[contains(text(), 'Cantidad')][1]/following::input[1]";

    private static final String APPLY_PRODUCT_DISCOUNT =
            "//label[contains(text(), 'Producto')]/following::label[contains(text(), 'Tipo de descuento')][1]/following::input[1]";

    private static final String APPLY_SERVICE_DISCOUNT =
            "//label[contains(text(), 'Servicio')]/following::label[contains(text(), 'Tipo de descuento')][1]/following::input[1]";

    private static final String APPLY_PLAN_DISCOUNT =
            "//label[contains(text(), 'Plan')]/following::label[contains(text(), 'Tipo de descuento')][1]/following::input[1]";

    private static final String LIST_DISCOUNT_CLASS = "v-menu__content theme--light menuable__content__active v-autocomplete__content";

    private static final String PRODUCT_DISCOUNT_LIST_VALUE = CONSTANT + LIST_DISCOUNT_CLASS + "')]";

    private static final String PRODUCT_DISCOUNT_VALUE =
            "//label[contains(text(), 'Producto')]/following::label[contains(text(), 'Tipo de descuento')][1]/following::input[1]/following::div[13]/input";

    private static final String SERVICE_DISCOUNT_VALUE =
            "//label[contains(text(), 'Servicio')]/following::label[contains(text(), 'Tipo de descuento')][1]/following::input[1]/following::div[13]/input";

    private static final String PLAN_DISCOUNT_VALUE =
            "//label[contains(text(), 'Plan')]/following::label[contains(text(), 'Tipo de descuento')][1]/following::input[1]/following::div[13]/input";

    private static final String TOTAL_BUYING =
            "//*[contains(text(), 'Total:')]/parent::td/following::td[1]/span";

    private static final String SAVE_VALUE = "//*[contains(text(), 'Guardar')]/parent::button";

    private static final String SAVE_OPTION_LIST_VALUE =
            "//*[contains(@class, 'v-menu__content theme--light menuable__content__active')]";

    private static final String SAVE_OPTION_VALUE =
            SAVE_OPTION_LIST_VALUE + "/div/div/div[1]";


    // ---------------------- Fields ------------------------ //

    public static final Target DOC_TYPE_FIELD = Target.the("Document type").locatedBy(DOC_TYPE_VALUE);

    public static final Target CUSTOMER_FIELD = Target.the("Customer").locatedBy(CUSTOMER_VALUE);

    public static final Target CUSTOMER_LIST_FIELD = Target.the("Customer list").locatedBy(CUSTOMER_LIST_VALUE);

    public static final Target SUGGESTED_OPTION = Target.the("Suggested option").locatedBy(SUGGESTED_VALUE);

    public static final Target PAYMENT_WAY_FIELD = Target.the("Payment way").locatedBy(PAYMENT_WAY_VALUE);

    public static final Target PAYMENT_LIST_FIELD = Target.the("Payment list").locatedBy(PAYMENT_LIST_VALUE);

    public static final Target SUGGESTED_PAYMENT_OPTION = Target.the("Suggested payment option").locatedBy(SUGGESTED_PAYMENT_VALUE);

    public static final Target NOTES_FIELD = Target.the("Notes").locatedBy(NOTES_VALUE);

    public static final Target DELETE_BUTTON = Target.the("Delete").locatedBy(DELETE_VALUE);

    public static final Target ADD_PRODUCT_BUTTON = Target.the("Add product").locatedBy(ADD_PRODUCT_VALUE);

    public static final Target PRODUCT_FIELD = Target.the("Product").locatedBy(PRODUCT_LIST_VALUE);

    public static final Target SUGGESTED_PRODUCT_LIST = Target.the("Suggested products").locatedBy(SUGGESTED_PRODUCT_LIST_VALUE);

    public static final Target ADD_SERVICE_BUTTON = Target.the("Add service").locatedBy(ADD_SERVICE_VALUE);

    public static final Target SERVICE_FIELD = Target.the("Service").locatedBy(SERVICE_LIST_VALUE);

    public static final Target ADD_PLAN_BUTTON = Target.the("Add plan").locatedBy(ADD_PLAN_VALUE);

    public static final Target PLAN_FIELD = Target.the("Plan").locatedBy(PLAN_LIST_VALUE);

    public static final Target ADD_QUANTITY_PRODUCT_FIELD =
            Target.the("Product quantity").locatedBy(ADD_QUANTITY_PRODUCT_VALUE);

    public static final Target ADD_QUANTITY_SERVICE_FIELD =
            Target.the("Service quantity").locatedBy(ADD_QUANTITY_SERVICE_VALUE);

    public static final Target ADD_QUANTITY_PLAN_FIELD =
            Target.the("Plan quantity").locatedBy(ADD_QUANTITY_PLAN_VALUE);

    public static final Target APPLY_PRODUCT_DISCOUNT_FIELD =
            Target.the("Product discount").locatedBy(APPLY_PRODUCT_DISCOUNT);

    public static final Target APPLY_SERVICE_DISCOUNT_FIELD =
            Target.the("Service discount").locatedBy(APPLY_SERVICE_DISCOUNT);

    public static final Target APPLY_PLAN_DISCOUNT_FIELD =
            Target.the("Plan discount").locatedBy(APPLY_PLAN_DISCOUNT);

    public static final Target LIST_PRODUCT_DISCOUNT =
            Target.the("List discount").locatedBy(PRODUCT_DISCOUNT_LIST_VALUE);

    public static final Target PRODUCT_VALUE_FIELD =
            Target.the("Product value").locatedBy(PRODUCT_DISCOUNT_VALUE);

    public static final Target SERVICE_VALUE_FIELD =
            Target.the("Service value").locatedBy(SERVICE_DISCOUNT_VALUE);

    public static final Target PLAN_VALUE_FIELD =
            Target.the("Plan value").locatedBy(PLAN_DISCOUNT_VALUE);

    public static final Target TOTAL = Target.the("Total buying").locatedBy(TOTAL_BUYING);

    public static final Target SAVE_BUTTON = Target.the("Save button").locatedBy(SAVE_VALUE);

    public static final Target SAVE_OPTION_LIST = Target.the("Save option list").locatedBy(SAVE_OPTION_LIST_VALUE);

    public static final Target SAVE_OPTION = Target.the("Save option").locatedBy(SAVE_OPTION_VALUE);

}