package baekjoon_ch09;
// 4948 : 베르트랑 공준
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            prime = new boolean[2 * n + 1];
            make_prime();
            sb.append(count_prime(n)).append("\n");
        }
        System.out.println(sb);
    }

    public static void make_prime() {

        prime[0] = prime[1] = true;

        if (prime.length <= 2) {
            return;
        }

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static int count_prime(int n) {

        int count = 0;

        for (int i = n + 1; i <= 2 * n; i++) {
            if (!prime[i]) {
                count++;
            }
        }
        return count;
    }
}
