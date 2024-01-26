package Helpers;

import java.io.*;
import java.util.LinkedList;

public class FileReaderHelper {

    public LinkedList<String> ReadFromFile(String fileName) throws IOException {
        LinkedList<String> lines = new LinkedList<>();
        File file = new File(fileName);
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String row;
        while((row = bufferedReader.readLine()) != null)
        {
            lines.add(row);
        }
        return lines;
    }
}
