package IO;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

class MyFilterInputStream extends BufferedInputStream {
    protected MyFilterInputStream(InputStream in) {
        super(in);
    }
    @Override
    public int read(byte b[], int off, int len) throws IOException {
        Objects.checkFromIndexSize(off, len, b.length);
        if (len == 0) {
            return 0;
        }
        int c = super.read();
        if (c == -1) {
            return -1;
        }
        // Change uppercase letter to lowercase letter
        b[off] = (byte) Character.toLowerCase((char) c);
        int i = 1;
        for (; i < len; i++) {
            c = read();
            if (c == -1) {
                break;
            }
            // Change uppercase letter to lowercase letter
            b[off + i] = (byte) Character.toLowerCase((char) c);
        }
        return i;
    }
}

public class TestInOutWrapper {
    public static void main(String[] args) throws Exception {
        Instant start = Instant.now();

        /* FileInputStream object is wrapped by myFilterInputStream.
            As you see, MyFilterInputStream is subclass of InputStream
        */ 
        InputStream is = new MyFilterInputStream(new FileInputStream("eec.txt"));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1204];
        System.out.print("Before read size equal: ");
        System.out.println(result.size());
        while (is.read(buffer, 0, 1024) >= 0) {
            result.write(buffer);
        }
        System.out.print("After read size equal: ");
        System.out.println(result.size());
        //System.out.println(result.toString("UTF-8"));

        Instant end = Instant.now();
        Duration tDuration = Duration.between(start, end);
        System.out.println(tDuration.toString());
    }
}
