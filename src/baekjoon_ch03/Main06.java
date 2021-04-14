package baekjoon_ch03;
// 2742 : 기찍 N
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>=1; i--) {
			sb.append(i).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
