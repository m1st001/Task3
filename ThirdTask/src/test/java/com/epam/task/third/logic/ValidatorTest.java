package com.epam.task.third.logic;

import org.junit.Assert;
import org.junit.Test;
import com.epam.task.third.utility.DataValidator;

public class ValidatorTest {
    DataValidator dataValidator = new DataValidator();

    @Test
    public void testShouldOnlyValidateCorrectLines(){
        //
        String line = "1 1 1 1 1";
        //
        boolean actual = dataValidator.isValid(line);
        //
        Assert.assertTrue(actual);

    }

    @Test
    public void testShouldNotValidateEmptyLine(){
        //
        String line = "";
        //
        boolean actual = dataValidator.isValid(line);
        //
        Assert.assertFalse(actual);
    }
}
