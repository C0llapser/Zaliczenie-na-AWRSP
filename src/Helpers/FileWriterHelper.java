package Helpers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class FileWriterHelper {

    public boolean doFileExist(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            return false;
        }
        return true;
    }

    public void writDataToFile(String fileName, List<String> dataToSave) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        for (String data : dataToSave) {
            fileWriter.write(data+ "\r\n");
        }
        fileWriter.close();
    }
}
