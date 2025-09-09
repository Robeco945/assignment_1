import java.io.FileReader;
import java.io.IOException;

public class ThrowExample {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // may throw IOException
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled IOException");
        }
    }
}
