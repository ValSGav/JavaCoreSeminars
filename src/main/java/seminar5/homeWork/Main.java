package seminar5.homeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String testDir = "c:\\temp\\test_backup";
        String testFile = "tic_tac_toe.txt";
        /*Написать функцию, создающую резервную копию всех файлов
        в директории(без поддиректорий) во вновь созданную папку ./backup
        */
        try {
            BackupDir backuper = new BackupDir(testDir);
            backuper.makeBackupDirWithoutSubDir();
            //backuper.makeBackupDirWithSubDir();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


         /*Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
        и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
        где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом,
        3 – резервное значение. Такое предположение позволит хранить в одном числе
        типа int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли
        три байта.
        00000000 00000001 00000010 00000011 - 2 бита на каждое состояние
        */

        byte[] array = new byte[]{1, 0, 2
                , 0, 0, 0
                , 1, 3, 2};

        try{
            TicTacToeByteWriter tTTWriter = new TicTacToeByteWriter(testFile);
            tTTWriter.writeTicTacToeToFileThreeByte(array);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }


    }


}


