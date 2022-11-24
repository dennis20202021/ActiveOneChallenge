package org.active.one.noah.exception;

import java.io.Serializable;

public class ParsingError extends RuntimeException implements Serializable {

    private final String element;
    private final String fieldName;
    private final transient Object fieldValue;

    private static ParsingError init;

    private ParsingError(String element, String fieldName, Object fieldValue) {
        super(String.format("%s called '%s' could not be parsed correctly due to : '%s'", element, fieldName, fieldValue));
        this.element = element;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public static ParsingError getInstance(String element, String fieldName, Object fieldValue) {
        if (getInit() == null) {
            setInit(new ParsingError(element, fieldName, fieldValue));
        }
        return getInit();
    }

    public String getElement() {
        return element;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    private static ParsingError getInit() {
        return init;
    }

    private static void setInit(ParsingError init) {
        ParsingError.init = init;
    }

}
