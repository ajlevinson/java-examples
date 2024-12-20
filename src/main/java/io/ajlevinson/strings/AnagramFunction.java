package io.ajlevinson.strings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class AnagramFunction {

    private static final Logger LOGGER = LogManager.getLogger(AnagramFunction.class);

    AnagramFunction() {
    }

    public boolean areAnagrams(String string1, String string2) {
        LOGGER.debug("Comparing " + string1 + " and " + string2 + " to see if they are anagrams");
        Map<Character, Integer> characterCount = new HashMap<>();

        for(char ch : string1.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }
        for(char ch : string2.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) - 1);
        }

        for(var pair : characterCount.entrySet()) {
            if(pair.getValue() != 0) {
                LOGGER.debug("The strings are not anagrams of one another, returning false.");
                return false;
            }
        }
        LOGGER.debug("The strings are anagrams of one another, returning true.");
        return true;
    }


}
