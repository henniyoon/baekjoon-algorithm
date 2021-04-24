package baekjoon_ch07;
// 1157 : 단어 공부
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main05 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();	// 단어 입력
		char ch;	// 입력받은 단어의 알파벳 하나 하나를 저장할 변수
		int alpha[] = new int[26];	// 알파벳 A~Z까지 몇 개가 있는지 저장할 배열 / 개수 26개!
		int max = 0;	// 최대값을 저장할 변수
		char ch_max = 0;	// 제일 많이 나온 알파벳을 저장할 변수
		int max_idx = 0;	// 배열의 최대값이 저장된 인덱스
		
		for(int i=0; i<str.length(); i++) {	// 입력받은 단어의 알파벳을 하나 하나 검사하기
			ch = str.charAt(i);
			
			// A의 문자코드 65 a의 문자코드 97 차이 32!
			if((int)ch >= 97) {	// 소문자이면
				ch = (char)(ch-32);	// 대문자로 바꾸기
			}
			alpha[ch-'A'] += 1;	// 같은 알파벳이 등장 할 때마다 해당 배열값을 1씩 증가
		}
		
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i] > max)	{
				max = alpha[i];
				ch_max = (char) (i+'A');
			}
			max_idx = ch_max-'A';
		}
		
		// 배열중에 최대값이 저장된 배열을 제외하고 최대값과 같은 게 또 있으면 ? 로 출력
		for(int i=0; i<max_idx; i++) {
			if(alpha[max_idx] == alpha[i]) {
				ch_max = '?';
			}
		}
		for(int i=max_idx+1; i<alpha.length; i++) {
			if(alpha[max_idx] == alpha[i]) {
				ch_max = '?';
			}
		}
		
		sb.append(ch_max);
		System.out.println(sb);
	}
}
