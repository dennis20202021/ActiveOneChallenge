package org.active.one.noah.question;

public class Operations {

    private static Operations init;

    private Operations() {}

    public static Operations getInstance() {
        if (getInit() == null) {
            setInit(new Operations());
        }
        return getInit();
    }

    private static Operations getInit() {
        return init;
    }

    private static void setInit(Operations init) {
        Operations.init = init;
    }

    public double productTotalCalculationByPercentage(String discountValue, String priceValue,
                                                       String taxValue, String quantityValue) {

        double discountByValue = Double.parseDouble(discountValue) / 100;

        double price = Double.parseDouble(priceValue);

        double tax = Double.parseDouble(taxValue);

        int quantity = Integer.parseInt(quantityValue);

        return ((quantity * (price + (price * tax))) - (quantity * (price + (price * tax)) * discountByValue));

    }

    public double productTotalCalculationByValue(String discountValue, String priceValue,
                                                         String taxValue, String quantityValue) {

        double discountByValue = Double.parseDouble(discountValue);

        double price = Double.parseDouble(priceValue);

        double tax = Double.parseDouble(taxValue);

        int quantity = Integer.parseInt(quantityValue);

        return ( ((price * quantity) + ((quantity * price) * tax)) - ((discountByValue * tax) + discountByValue) );

    }

    public double productTotalWithoutAnyDiscount(String priceValue, String taxValue, String quantityValue) {

        double price = Double.parseDouble(priceValue);

        double tax = Double.parseDouble(taxValue);

        int quantity = Integer.parseInt(quantityValue);

        return (quantity * (price + (price * tax)));

    }

}
