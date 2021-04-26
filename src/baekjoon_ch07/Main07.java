package baekjoon_ch07;
// 2908 : 상수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main07 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		// 상근이 시점에서 거꾸로 읽기
		a = a.substring(2) + a.substring(1,2) + a.substring(0,1);
		b = b.substring(2) + b.substring(1,2) + b.substring(0,1);
		
		if(Integer.parseInt(a) > Integer.parseInt(b)) {
			sb.append(a);
		} else if(Integer.parseInt(a) < Integer.parseInt(b)) {
			sb.append(b);
		}
		System.out.println(sb);
	}
}
