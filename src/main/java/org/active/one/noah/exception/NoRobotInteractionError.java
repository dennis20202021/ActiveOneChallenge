package org.active.one.noah.exception;

import java.io.Serializable;

public class NoRobotInteractionError extends RuntimeException implements Serializable {

    private final String element;
    private final String fieldName;
    private final transient Object fieldValue;

    private static NoRobotInteractionError init;


    public NoRobotInteractionError(String element, String fieldName, Object fieldValue) {
        super( String.format(
                "%s interaction with '%s', could not be raised due to : '%s'",
                element, fieldName, fieldValue
        ));

        this.element = element;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public static NoRobotInteractionError getInstance(String element, String fieldName, Object fieldValue) {
        if (getInit() == null) {
            setInit(new NoRobotInteractionError(element, fieldName, fieldValue));
        }
        return getInit();
    }

    private static NoRobotInteractionError getInit() {
        return init;
    }

    private static void setInit(NoRobotInteractionError init) {
        NoRobotInteractionError.init = init;
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

}
