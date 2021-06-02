package baekjoon_ch08;
// 10250 : ACM 호텔
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());	// 테스트 케이스
		int h = 0;	// 층 수 height 
		int w = 0; 	// 방 개수 width
		int n = 0;	// 도착한 순서
		int x = 0;	// 손님 방 호수
		int y = 0;	// 손님 방 층
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			x = n / h + 1;
			y = n % h;
			
			sb.append(y * 100 + x).append("\n");
		}
		System.out.println(sb);
	}
}