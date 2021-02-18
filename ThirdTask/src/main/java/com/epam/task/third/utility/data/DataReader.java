package com.epam.task.third.utility.data;

import java.io.FileNotFoundException;
import java.util.List;

public interface DataReader {
    List<String> readData(String filename) throws FileNotFoundException;
}
