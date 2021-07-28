package baekjoon_ch09;
// 3009 : 네 번째 점
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main08 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x = 0;
        int y = 0;
        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        /**
         * 앞에꺼가 같은가? 다른게 x
         * 뒤에꺼가 같은가? 다른게 y
         */

        if (a[0] == a[1]) {
            x = a[2];
        } else if (a[0] == a[2]) {
            x = a[1];
        } else if (a[1] == a[2]) {
            x = a[0];
        }

        if (b[0] == b[1]) {
            y = b[2];
        } else if (b[0] == b[2]) {
            y = b[1];
        } else if (b[1] == b[2]) {
            y = b[0];
        }
        System.out.println(x + " " + y);
    }
}
