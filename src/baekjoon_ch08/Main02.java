package baekjoon_ch08;
// 2292 : 벌집
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main02 {
	public static void main(String[] args) throws Exception {
//		1번째 껍질 : 1
//		2번째 껍질 : 2 ~ 7		: 시작점 2
//		3번째 껍질 : 8 ~ 19		: 시작점 8 = 2 + 6 * 1
//		4번째 껍질 : 20 ~ 37	: 시작점 20 = 8 + 6 * 2
//		5번째 껍질 : 38 ~ 61	: 시작점 38 = 20 + 6 * 3
//		6번째 껍질 : 62 ~ 91	: 시작점 62 = 38 + 6 * 4
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		 
		int N = Integer.parseInt(br.readLine());
		int count = 1; // 껍질 수(최소 루트)
		int range = 2;	// 범위 (최솟값 기준) 
	
		if (N == 1) {
			count = 1;
		} else {
			while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복 
				range = range + (6 * count);
				count++;
			}
		}
		sb.append(count);
		System.out.print(sb);
	}
}