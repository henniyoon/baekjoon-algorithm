package baekjoon_ch09;
// 9020 : 골드바흐의 추측
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main06 {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int n = 0;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            sb.append(plus_prime(n)).append("\n");
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

    public static String plus_prime(int n) {

        prime = new boolean[n + 1];
        make_prime();

        List<Integer> prime1 = new ArrayList<Integer>();
        List<Integer> prime2 = new ArrayList<Integer>();

        int cha = 0;
        int k = 10000;
        String result = null;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (!prime[i] && !prime[j]) {
                    if (i + j == n) {
                        prime1.add(i);
                        prime2.add(j);
                    }
                }
            }
        }
        for (int i = 0; i <= prime1.size() / 2; i++) {
            cha = prime2.get(i) - prime1.get(i);
            if (cha < k) {
                k = cha;
                result = prime2.get(i) + " " + prime1.get(i);

            } else if (cha > k) {
                return result;
            }
        }
        return result;
    }
}
