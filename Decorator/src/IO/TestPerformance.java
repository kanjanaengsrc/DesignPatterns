package IO;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class TestPerformance {
    public static void main(String[] args) throws IOException {
        Instant start = Instant.now();
        InputStream is = null;
        // FileInputStream is = new FileInputStream("eec.txt");
        File file = new File("eec.txt");
        try {
            is = new FileInputStream(file);

            int[] fileArr = new int[(int) file.length()];

            for (int i = 0, temp = 0; (temp = is.read()) != -1; i++) {
                fileArr[i] = temp;
            }
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            is.close();
        }
        Instant end = Instant.now();
        Duration timeE = Duration.between(start, end);
        System.out.println(timeE);
    }
}