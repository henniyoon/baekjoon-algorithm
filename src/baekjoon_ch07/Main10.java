package baekjoon_ch07;
// 1316 : 그룹 단어 체커
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	 
	public static void main(String[] args) throws Exception {
		int count = 0;	// 그룹단어의 개수를 저장할 변수
		int n = Integer.parseInt(br.readLine());	// 단어의 개수 n개 입력
 
		for (int i = 0; i < n; i++) {
			if (check()) {	// 그룹단어일 때 true
				count++;	// 그룹단어의 개수 +1
			}
		}
		sb.append(count);
		System.out.println(sb);
	}
 
	public static boolean check() throws Exception {
		boolean[] check = new boolean[26];	// 이전에 나온 적 있는 알파벳인지 저장할 배열
		String str = br.readLine();		// 단어 입력
		int prev = 0;	// 이전 알파벳을 아스키코드로 저장할 변수 (배열의 인덱스에서 사용하기 위해)
		
		for(int i = 0; i < str.length(); i++) {	
			int now = str.charAt(i);	// i번째 알파벳을 아스키코드로 저장 (배열의 인덱스에서 사용하기 위해)
			
			if (prev != now) {	// 현재 알파벳과 이전 알파벳이 같지 않을 때
				if (!check[now - 'a']) {	// false 이면 (이전에 나온 적 없는 알파벳일 때)
					check[now - 'a'] = true;	// true로 변경
					prev = now;					
				}
				else {	// check[now - 'a'] = true : 이전에 나온적 있는 알파벳이면
					return false;	// 그룹단어가 아니므로 false를 return
				}
			}
		} 
		return true;	// 그룹단어는 true를 return
	}
}
