package io.ajlevinson.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PrimeFunction {

    private static final Logger LOGGER = LogManager.getLogger(PrimeFunction.class);

    PrimeFunction() {
    }

    public List<Boolean> isPrime(int[] values) {
        List<Boolean> primeValidations = new ArrayList<>();
        for(int i = 0; i < values.length; i++) {
            LOGGER.debug("Calculating if " + values[i] + " is prime or not prime.");
            if(values[i] <= 1) {
                LOGGER.debug(values[i] + " is not prime.");
                primeValidations.add(false);
            } else {
                boolean isPrime = true;
                LOGGER.debug("Value is greater than 1, validating if it is prime: " + values[i]);
                for(int j = 2; j <= Math.sqrt(values[i]); j++) {
                    if(values[i]%j == 0) {
                        isPrime = false;
                        LOGGER.debug(values[i] + " is not prime.");
                        break;
                    }
                }
                primeValidations.add(isPrime);
            }
        }
        return primeValidations;
    }

}
