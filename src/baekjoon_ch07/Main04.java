package baekjoon_ch07;
// 2675 : 문자열 반복
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());	// 테스트 케이스의 개수 t
		int r = 0;	// 각 테스트 케이스의 반복 횟수 r
		String[] s;	// 문자열 s
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			s = new String[str.length()];	// 배열의 크기가 str의 크기인 문자열 생성!
			for(int j=0; j<str.length(); j++) {
				s[j] = str.substring(j,j+1);	// str 문자를 한 글자씩 배열에 저장
			}
			// 문자열 반복!
			for(int j=0; j<s.length; j++) {	// 문자열 s의 크기만큼
				for(int k=0; k<r; k++) {	// 각 테스트 케이스의 반복 횟수 r만큼
					sb.append(s[j]);		// 각각의 문자열 반복
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
