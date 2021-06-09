package baekjoon_ch09;
// 1978 : 소수 찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int a = 0;	// 소수인지 확인할 수
		int n = Integer.parseInt(br.readLine());	// 확인할 수의 개수
		int count = 0;	// 소수의 개수
		st = new StringTokenizer(br.readLine());

		for(int i=0; i<n; i++) {
			a = Integer.parseInt(st.nextToken());	// 입력
			boolean b = true;	// 소수이면 true, 소수가 아니면 false
			if(a == 1) {	// 1은
				b = false;	// 소수가 아님
			} else {
				for(int j=2; j<a; j++) {	// 2에서 자기 자신까지 
					if(a % j == 0) 	// 나누어떨어지는 수가 있으면
						b = false;	// 소수가 아님
				}
			}
			if(b) { count++; }	// 소수의 개수
		}
		sb.append(count);
		System.out.println(sb);
	}
}
