package org.active.one.noah.interaction;

import org.active.one.noah.util.enums.GenericPaths;
import org.active.one.noah.util.excel.model.ReferralExcelData;

public abstract class DataBinding {

    protected DataBinding() {
        throw new IllegalStateException("Utility class");
    }

    protected static final ReferralExcelData REFERRAL = ReferralExcelData.getInstance();

    protected static final String EXCEL_REFERRAL_PATH = GenericPaths.PATH_TO_REFERRAL_DATA_EXCEL.getValue();

    protected static final String XML_FILE = GenericPaths.PATH_TO_XML_BEANS.getValue();

}
