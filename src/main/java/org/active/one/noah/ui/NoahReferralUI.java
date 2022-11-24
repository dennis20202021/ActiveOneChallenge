package org.active.one.noah.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NoahReferralUI extends PageObject {

    private static final String CREATE_REFERRAL_VALUE = "//a[contains(@href, '/ingresos/remisiones/nuevo')]";

    private static final String REFERRAL_CREATION_VALUE = "//*[contains(text(), 'El registro fue creado exitosamente')]";

    public static final Target CREATE_REFERRAL_BUTTON = Target.the("Create referral").locatedBy(CREATE_REFERRAL_VALUE);

    public static final Target REFERRAL_CREATION_MESSAGE_SUCCESS =
            Target.the("Creation message successful").locatedBy(REFERRAL_CREATION_VALUE);

}
