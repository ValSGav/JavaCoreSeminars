package seminar5.homeWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class BackupDir {

    private final String dirName;

    public BackupDir(String dirName) {
        this.dirName = dirName;
    }


    public void makeBackupDirWithoutSubDir() throws IOException {
        makeBackupDir(dirName, ".backup", false);
    }

    public void makeBackupDirWithSubDir() throws IOException {
        makeBackupDir(dirName, ".backup", true);
    }

    private void makeBackupDir(String currentDir
            , String backupDir
            , boolean includeSubDir) throws IOException {

        Path backupDirPath = Path.of(backupDir);
        Path currentDirPath = Path.of(currentDir);

        if (!Files.exists(backupDirPath)) {
            Files.createDirectory(backupDirPath);
        }

        File parentDir = new File(new File(currentDir).getCanonicalPath());
        File[] filesInDir = parentDir.listFiles();

        if (parentDir.exists() && filesInDir.length > 0)
            for (File fileInDir : filesInDir) {
                if (fileInDir.isDirectory() && includeSubDir) {
                    makeBackupDir(fileInDir.getCanonicalPath()
                            , Paths.get(backupDirPath.toString(), fileInDir.getName()).toString()
                            , true);
                }
                ;
                if (fileInDir.isFile()) {
                    Path fileToCopy = Path.of(fileInDir.getCanonicalPath());
                    Files.copy(fileToCopy
                            , Paths.get(backupDirPath.toString(), fileInDir.getName())
                            , StandardCopyOption.REPLACE_EXISTING);
                }
            }
    }
}
