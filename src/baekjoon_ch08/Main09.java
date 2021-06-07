package baekjoon_ch08;
// 1011 : Fly me to the Alpha Centauri
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main09 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		int x = 0;
		int y = 0;
		int count = 0;
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if(y-x < 3) {
				count = y - x;
			} else {
				
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
