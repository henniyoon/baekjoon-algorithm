package baekjoon_ch08;
// 1712 : 손익분기점
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//임대료, 제산세, 보험료, 급여 A만원의 고정 비용
// 재료비, 인건비 등 B만원의 가변 비용
// C*n > A + (B*n) : n = 손익분기점
public class Main01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());	// 고정비용
		int b = Integer.parseInt(st.nextToken());	// 가변비용
		int c = Integer.parseInt(st.nextToken());	// 노트북 가격
		int n;	// 몇 개를 팔아야 손익분기점이 되는지!
		
		if(b < c) {	
			n = a / (c-b) + 1;	// 간단한 수식..!
		} else {	// 손익분기점이 존재하지 않는 경우
			n = -1;
		}
		sb.append(n);
		System.out.println(n);
	}
}
