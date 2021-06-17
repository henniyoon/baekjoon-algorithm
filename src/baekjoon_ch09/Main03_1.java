package baekjoon_ch09;
// 11653 : 소인수분해
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main03_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int m = N;
		
		if(N == 1) {
			sb.append("");
		} else {
			for(int i=2; i<=N; i++) {
				while(m % i == 0) {
					m = m / i;
					sb.append(i).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
