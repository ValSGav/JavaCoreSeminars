package seminar5.homeWork;

import java.io.FileOutputStream;
import java.io.IOException;

public class TicTacToeByteWriter {
    private final String fileName;

    public TicTacToeByteWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writeTicTacToeToFileThreeByte(byte[] array) throws IOException{
        try (FileOutputStream fs = new FileOutputStream(fileName)) {
            for (int i = 0; i < 3; i++) {
                byte row = 0;
                for (int j = 0; j < 3; j++)
                    row += (byte) array[i * 3 + j] << (j * 2); //сдвигаем на +2 бита каждое число строки
                fs.write(row);
            }
            fs.flush();
        } catch (IOException e) {
           throw new IOException(e.getCause());
        }
    }
}
