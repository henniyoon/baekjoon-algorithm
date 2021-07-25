package baekjoon_ch09;
// 9020 : 골드바흐의 추측
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_1 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        prime = new boolean[10001];
        make_prime();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int p = n / 2;
            int q = n / 2;

            while (true) {
                if (!prime[p] && !prime[q]) {
                    sb.append(p).append(" ").append(q).append("\n");
                    break;
                }
                p--;
                q++;
            }
        }
        System.out.println(sb);
    }

    public static void make_prime() {

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
