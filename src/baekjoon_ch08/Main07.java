package baekjoon_ch08;
// 2839 : 설탕 배달
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main07 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());	// 배달하는 설탕의 양(kg)
		int result = 0;	// 배달하는 설탕 봉지 수
		
		while(true) {
			// 5의 배수인 경우
			if(n % 5 == 0) {	
				result = result + n / 5;
				break;
			}
			// 5의 배수가 아닌 경우
			n = n - 3;		// 3키로 빼고
			result++;		// 3키로 봉지 + 1
			
			if(n < 0) {
				result = -1;
				break;
			}
		}
		sb.append(result);
		System.out.println(sb);
	}
}
