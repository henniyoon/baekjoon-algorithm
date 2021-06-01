package baekjoon_ch08;
// 1193 : 분수찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main03_1 {
	public static void main(String[] args) throws Exception, Exception {
//		1/1 -> 						// 홀수일 때 큰 수부터 시작
//		1/2 -> 2/1 -> 				// 짝수일 때 작은 수부터 시작
//		3/1 -> 2/2 -> 1/3 -> 		// 홀수일 때 큰 수부터 시작
//		1/4 -> 2/3 -> 3/2 -> 4/1 ->	// 짝수일 때 작은 수부터 시작
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int x = Integer.parseInt(br.readLine());	// 몇 번째 분수를 찾을건지 입력
		int n = 0;	// 
		int m = x;	// 
		int count = 0;	// 
		
		int a = 0, b = 0;	// 행, 열
		
		for(int i=1; i<=m; i++) {
			m = m - i;
			count++;
		}
		
		n = count + 1;
		
		if(n % 2 != 0) {	// 홀수일 때
			if(m == 0) {
				a = count;
				b = 1;
			} else {
				a = count + 1 - (m - 1);
				b = m;
			}
		} else {	// 짝수일 때
			if(m == 0) {
				a = 1;
				b = count;
			} else {
				a = m;
				b = count + 1 - (m-1);
			}
		}
		sb.append(a).append("/").append(b);
//		sb.append("\n");
//		sb.append("count : ").append(count).append("\n").append("m : ").append(m);
		System.out.println(sb);
	} 
}

