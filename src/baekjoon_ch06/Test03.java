package baekjoon_ch06;
// 1065 : 한수 (n부터 빼는 식으로 카운트)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(test(n));
	}
	
	// 1 이상 n 이하의 한수의 개수를 구하는 함수
	public static int test(int n) {
		int count = n;	// 한수의 개수
		if(n >= 100) {
			for(int i=100; i<=n; i++) {	// i가 한수인지 검사 (1의 자리 수와 10의 자리 수는 모두 한수이므로 제외)
				String num = Integer.toString(i);	// i를 문자로 변환
				
				if(Integer.parseInt(num) == 1000) { count--; }	// 1000은 한수가 아님
				else {
					// 기준이 될 차이값
					int cha =Integer.parseInt(num.substring(0,1)) - Integer.parseInt(num.substring(1,2));
	
					for(int j=1; j<num.length(); j++) {
						int n1 = Integer.parseInt(num.substring(j-1,j));
						int n2 = Integer.parseInt(num.substring(j,j+1));
						
						if(cha != (n1 - n2)) {	// 차이가 같지 않으면 == 한수가 아니면
							count--;	// 한수의 개수를 빼기
						}
					}
				}
			}
		}
		return count;
	}
}
