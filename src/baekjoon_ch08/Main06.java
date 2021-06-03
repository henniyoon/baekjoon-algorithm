package baekjoon_ch08;
// 2775 : 부녀회장이 될테야
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());	// 테스트 케이스
		int k;	// 층수
		int n;	// 호수
		int member[];	// k층 각 호에 사는 사람 수를 저장할 배열
		
		for(int i=0; i<t; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			// 0층 세팅
			member = new int[n];
			for(int j=0; j<member.length; j++) {
				member[j] = j+1;;
			}
			
			// k층 세팅
			for(int j=0; j<k; j++) {
				for(int m=1; m<member.length; m++) {
					member[m] = member[m-1] + member[m];
				}
			}
			sb.append(member[n-1]).append("\n");
		}
		System.out.println(sb);
		
	}
}
