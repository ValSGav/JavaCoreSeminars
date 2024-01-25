package seminar5;

public class Main {
    public static void main(String[] args) {
        StreamFileWriter sfw = new StreamFileWriter("test_array_write.txt");
        sfw.writeArrayToFileStream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 77777});
    }
}
