package IO;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.time.Duration;
import java.time.Instant;

public class TestInputStreamWrapper {
    public static void main(String[] args) throws Exception {
        Instant start = Instant.now();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("eec.txt"));
        int c;
        try {
            while ((c = bis.read()) != -1) {
                c = Character.toLowerCase((char)c);
                System.out.print((char)c);
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            bis.close();
        }
        Instant end = Instant.now();
        Duration tDuration = Duration.between(start, end);
        System.out.println(tDuration.toString());
    }
}