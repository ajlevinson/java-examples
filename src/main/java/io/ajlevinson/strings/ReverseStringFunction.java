package io.ajlevinson.strings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReverseStringFunction {

    private static final Logger LOGGER = LogManager.getLogger(ReverseStringFunction.class);

    public ReverseStringFunction() {
    }

    public String reverseString(String input) {
        LOGGER.debug("The input is: " + input);
        String result = "";
        char character;
        for(int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            result = character + result;
        }
        return result;
    }
}


