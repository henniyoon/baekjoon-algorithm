package baekjoon_ch09;
// 2581 : 소수
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main02 {
	public static boolean[] prime;	// 소수를 체크할 배열
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int min = 0;	// 최솟값
		int sum = 0;	// 소수의 합
		
		make_prime(N);
		for(int i=M; i<=N; i++) {
			if(prime[i] == false) {	// 소수이면
				min = i;
				break;
			}
		}
		for(int i=M; i<=N; i++) {
			if(prime[i] == false) {
				sum += i;
			}
		}
		if(min == 0) {	// 범위 내에 소수가 없으면
			sb.append(-1);
		} else {		// 범위 내에 소수가 있으면
			sb.append(sum).append("\n").append(min).append("\n");
		}
		System.out.println(sb);
	}
 
	public static void make_prime(int n) {
		// 소수가 아니면 true 소수이면 false
		prime = new boolean[n + 1];	// 0 ~ n
 
		if(n < 2) {	// n이 2 미만이면 만들 소수가 없으므로 바로 return
			return;
		}
		prime[0] = prime[1] = true;
		// 제곱근 함수 : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(n); i++) {
			// 이미 체크된 배열이면 다음 반복문으로 skip
			if(prime[i] == true) {
				continue;
			}
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j = i*i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
	}
}
