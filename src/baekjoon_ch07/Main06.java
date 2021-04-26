package baekjoon_ch07;
// 1152 : 단어의 개수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// countTokens(); : 토큰의 개수 확인
		int count = st.countTokens();	
		sb.append(count);
		System.out.println(sb);
	}
}
