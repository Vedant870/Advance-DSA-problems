import java.io.*;
import java.util.*;

public class Main {
    private static final long[] DENOMS = buildDenoms();

    private static long[] buildDenoms() {
        long[] d = new long[17];
        long p = 10;
        for (int k = 1; k <= 17; k++) {
            d[k - 1] = p + 1;
            p *= 10;
        }
        return d;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        for (int tc = 0; tc < t; tc++) {
            long n = fs.nextLong();
            List<Long> xs = new ArrayList<>();

            for (int i = DENOMS.length - 1; i >= 0; i--) {
                long d = DENOMS[i];
                if (d > n) continue;
                if (n % d == 0) {
                    xs.add(n / d);
                }
            }

            out.append(xs.size()).append('\n');
            if (!xs.isEmpty()) {
                for (int i = 0; i < xs.size(); i++) {
                    if (i > 0) out.append(' ');
                    out.append(xs.get(i));
                }
                out.append('\n');
            }
        }
        System.out.print(out.toString());
    }

    private static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) { this.in = is; }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do { c = read(); } while (c <= ' ');
            int sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}
