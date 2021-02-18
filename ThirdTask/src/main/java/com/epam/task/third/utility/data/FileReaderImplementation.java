package com.epam.task.third.utility.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderImplementation implements DataReader{

    public List<String> readData(String filename)  {
        List<String> linesRead = new ArrayList<>();
        try (
                Reader reader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String lineRead = bufferedReader.readLine();
            while (lineRead != null) {
                linesRead.add(lineRead);
                lineRead = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        return linesRead;
    }
}
