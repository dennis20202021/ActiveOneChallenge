package org.active.one.noah.exception;

import java.io.Serializable;

public class FileNotFoundOrStreamingError extends RuntimeException implements Serializable {

    private final String element;
    private final String fieldName;
    private final transient Object fieldValue;

    private static FileNotFoundOrStreamingError init;

    private FileNotFoundOrStreamingError(String element, String fieldName, Object fieldValue) {
        super( String.format(
                "%s with type of '%s', so the file could not be found or a streaming error was thrown due to : '%s'",
                        element, fieldName, fieldValue
        ));
        this.element = element;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public static FileNotFoundOrStreamingError getInstance(String element, String fieldName, Object fieldValue) {
        if (getInit() == null) {
            setInit(new FileNotFoundOrStreamingError(element, fieldName, fieldValue));
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

    private static FileNotFoundOrStreamingError getInit() {
        return init;
    }

    private static void setInit(FileNotFoundOrStreamingError init) {
        FileNotFoundOrStreamingError.init = init;
    }
}
