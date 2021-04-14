package baekjoon_ch03;
// 10871 : X보다 작은 수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st, st2;
		st = new StringTokenizer(br.readLine());
		st2 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st2.nextToken()); 
			if(a[i] < x) {
				sb.append(a[i]).append(" ");
			}
		}
		br.close();
		System.out.println(sb);
	}
}
