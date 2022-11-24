package org.active.one.noah.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.active.one.noah.question.TotalPriceCalculation;
import org.active.one.noah.question.TotalPriceVerification;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class VerifyTotal {

    static final double TOTAL = TotalPriceCalculation.productTotalCalculation() +
            TotalPriceCalculation.serviceTotalCalculation() + TotalPriceCalculation.planTotalCalculation();

    static final String PATTERN = "[.]";

    static final String TOTAL_2 = String.valueOf(TOTAL).replaceAll(PATTERN, ",");

    static final int SIZE = TOTAL_2.length();

    static final String EXPECTED_CONDITION = String.valueOf(getNumberFormatted());

    static StringBuilder formatNumber;

    private VerifyTotal() {
        throw new IllegalStateException("Utility class");
    }

    public static StringBuilder getFormatNumber() {
        return formatNumber;
    }

    public static void setFormatNumber(StringBuilder formatNumber) {
        VerifyTotal.formatNumber = formatNumber;
    }

    private static StringBuilder getNumberFormatted() {

        if (SIZE == 3) {

            setFormatNumber(
                    new StringBuilder(TOTAL_2)
                            .insert(0, "$").insert(1, " ").insert(5, "0")
            );

            return getFormatNumber();

        } else if (SIZE == 4) {

            setFormatNumber(
                    new StringBuilder(TOTAL_2)
                            .insert(0, "$").insert(1, " ").insert(6, "0")
            );

            return getFormatNumber();

        } else if (SIZE == 5) {

            setFormatNumber(
                    new StringBuilder(TOTAL_2)
                            .insert(0, "$").insert(1, " ").insert(7, "0")
            );

            return getFormatNumber();

        } else if (SIZE == 6) {

            setFormatNumber(
                    new StringBuilder(TOTAL_2)
                            .insert(0, "$").insert(1, " ").insert(3, ".").insert(8, "0")
            );

            return getFormatNumber();

        } else if (SIZE == 7) {

            setFormatNumber(
                    new StringBuilder(TOTAL_2)
                            .insert(0, "$").insert(1, " ").insert(4, ".").insert(9, "0")
            );

            return getFormatNumber();

        } else if (SIZE == 8) {

            setFormatNumber(
                    new StringBuilder(TOTAL_2)
                            .insert(0, "$").insert(1, " ").insert(5, ".").insert(11, "0")
            );

            return getFormatNumber();

        } else if (SIZE == 9) {

            setFormatNumber(
                    new StringBuilder(TOTAL_2)
                            .insert(0, "$").insert(1, " ").insert(3, ".")
                            .insert(7, ".").insert(12, "0")
            );

            return getFormatNumber();

        }

        return getFormatNumber();

    }

    public static Performable itemsPrice() {
        return Task.where("{0} verifies total item",
                (actor -> actor.should(seeThat(TotalPriceVerification.item(), equalToIgnoringCase(EXPECTED_CONDITION))))
        );
    }
}
