package com.epam.task.third.utility;

import java.util.regex.Pattern;

public class DataValidator {
    /* Correct string example:
    "x y z h r"
     */

        private static final String CORRECT_LINE = "^\\d\\s\\d\\s\\d\\s\\d\\s\\d$";

        public boolean isValid(String line) {
            boolean isValid = Pattern.matches(CORRECT_LINE, line);
            return isValid;
        }

}
