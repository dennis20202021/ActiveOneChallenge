package org.active.one.noah.util.enums;

public enum GenericPaths {

    PATH_TO_JSON_FILE(
            System.getProperty("user.home") + "\\Documents\\Deliverable\\DataSupplies\\Access.json"
    ),
    PATH_TO_REFERRAL_DATA_EXCEL(
            System.getProperty("user.home") + "\\Documents\\Deliverable\\DataSupplies\\RemisionData.xlsx"
    ),
    PATH_TO_XML_BEANS(
            "src/main/resources/ReferralMapping.xml"
    );

    private final String value;

    GenericPaths(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
