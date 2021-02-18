package com.epam.task.third.logic;

import com.epam.task.third.utility.data.DataReader;
import com.epam.task.third.utility.data.FileReaderImplementation;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class ReaderTest {
    private final DataReader dataReader = new FileReaderImplementation();
    @Test
    public void testReadFromEmptyFile() throws FileNotFoundException {
        //
        String filename = "./src/test/resources/correctempty";
        //
        List<String> actual = dataReader.readData(filename);
        // then
        Assert.assertEquals("[]", actual);

    }

    @Test
    public void testReadFromCorrectFile() throws FileNotFoundException {
        //
        String filename = "./src/test/resources/correct";
        //
        List<String> actual = dataReader.readData(filename);
        //
        Assert.assertEquals("1 1 1 1 1", actual);
    }
}
