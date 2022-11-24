package org.active.one.noah.util.json;

public class LoginRequest extends ParseJSON {

    private static final String EMAIL = "email";

    private static final String PASSWD = "password";

    public static String enterEmail() {
        return getRootJSONData(EMAIL);
    }

    public static String enterPassword() {
        return getRootJSONData(PASSWD);
    }

}
