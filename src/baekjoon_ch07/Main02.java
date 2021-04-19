package baekjoon_ch07;
// 11720 : 숫자의 합
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(str.substring(i,i+1));
		}
		sb.append(sum);
		System.out.println(sb);
	}
}
