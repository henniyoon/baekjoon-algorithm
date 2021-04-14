package baekjoon_ch03;
// 2741 : N 찍기
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main05 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i=1; i<=n; i++) {
			sb.append(i).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
