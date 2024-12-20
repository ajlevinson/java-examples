package io.ajlevinson.general;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericFunction<T> {

    private static final Logger LOGGER = LogManager.getLogger(GenericFunction.class);

    final <T> int printArray(T[] array) {
        int totalCount = 0;
        for(T t: array) {
            LOGGER.info("Value is: " + t);
            totalCount ++;
        }
        return totalCount;
    }
}
