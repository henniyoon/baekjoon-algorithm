package baekjoon_ch08;
// 1011 : Fly me to the Alpha Centauri
/*
 * 1		// 1
 * --------------
 * 11		// 2
 * --------------
 * 111		// 3
 * 121		// 4
 * --------------
 * 1211		// 5
 * 1221		// 6
 * --------------
 * 12211	// 7
 * 12221	// 8
 * 12321	// 9
 * --------------
 * 123211	// 10
 * 123221	// 11
 * 123321	// 12
 * --------------
 * 1233211	// 13
 * 1233221	// 14
 * 1233321	// 15
 * 1234321	// 16
 * --------------
 * 12343211	// 17
 * 12343221	// 18
 * 12343321	// 19
 * 12344321	// 20
 * --------------
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main09 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());	// test case
		int x = 0;	// 현재 위치 x
		int y = 0;	// 목표 위치 y
		int d = 0;	// 거리 (y-x)
		int count;	// 최소한의 공간이동 장치 작동 횟수
		
		for(int i=0; i<t; i++) {
			count = 1;
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			d = y - x;
			
			for(int j=2; (int)j/2<d; j++) {
				d = d - (int) j / 2;
				count++;
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
