package ru.gavriloff.reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public void addRecord(String record) throws IOException {
        try(FileWriter f = new FileWriter(fileName, true)){
            f.write(record);
        }
    }

}
