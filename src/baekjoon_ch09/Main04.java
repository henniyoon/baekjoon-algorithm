package baekjoon_ch09;
// 1929 : 소수 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {
    public static boolean[] prime;  // 소수를 체크할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        make_prime(M, N);

        for (int i = M; i <= N; i++) {
            if (prime[i] == false) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void make_prime(int m, int n) {
        // 소수가 아니면 true 소수이면 false 인 소수를 체크하는 배열
        prime = new boolean[n + 1]; // 0 ~ N
        prime[0] = prime[1] = true; // 0과 1은 소수가 아님

        if (n < 2) {    // n이 2미만이면 소수가 없으므로 바로 return
            return;
        }

        for (int i = m; i <= n; i++) {
            // 루트 n 이하의 자연수들로 나눠본다
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {       // 나누어 떨어지면
                    prime[i] = true;    // 소수가 아니다
                    break;  // 이미 체크된 배열이면 다음 반복문으로 skip
                }
            }
        }
    }
}
