package baekjoon_ch03;
// 15552 : 빠른 A+B
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int arr[][] = new int[t][2];
		int sum[] = new int[t];
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<t; i++) {
			sum[i] = arr[i][0] +  arr[i][1];
			sb.append(sum[i]).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
