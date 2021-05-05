package baekjoon_ch06;
// 1065 : 한수 (0부터 더하는 식으로 카운트)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(test(n));
	}
	
	// 1 이상 n 이하의 수들 중 한수의 개수를 구하는 함수
	public static int test(int n) {
		int count = 0;	// 한수의 개수
		
		if(n < 100) {
			return n;	// 100 미만의 수는 모두 한수이다
			
		} else {
			count = 99; // 1에서 99까지 모든 수는 함수이다
			if(n == 1000) {
				n = 999;	// 1000은 한수가 아닌데 자릿수가 하나 더 많기 때문에 예외처리
			}
			
			for(int i = 100; i <= n; i++) {	// i가 한수인지 검사 (1의 자리 수와 10의 자리 수는 모두 한수이므로 제외)
				int hun = i / 100;			// 백의 자리수
				int ten = (i / 10) % 10;	// 십의 자리수
				int one = i % 10;			// 일의 자리수
				
				if((hun - ten) == (ten - one)) {	// 각 자리수의 차이가 같으면 (= 등차수열을 이루면)
					count++;
				}
			}
		}
		return count;
	}
}
