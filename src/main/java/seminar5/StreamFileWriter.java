package seminar5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamFileWriter {
    private final String name;

    public StreamFileWriter(String name) {
        this.name = name;
    }

    public boolean writeArrayToFileStream(int[] array) throws RuntimeException{

        try(
        FileOutputStream fs = new FileOutputStream(name)){
            for (int i: array) {
                fs.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;

        return false;
    }
}
