package baekjoon_ch07;
// 10809 : 알파벳 찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int[] arr = new int[26];	// 위치가 저장될 배열[알파벳 소문자 개수 26개]
		
		for(int i = 0; i < arr.length; i++) {	// 배열을 -1로 초기화 : 포함되지 않을 경우 -1이니까!
			arr[i] = -1;
		}
 
		String s = br.readLine();	// 문자열 입력 받기
 
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);	// i번째 문자 뽑기
			if(arr[ch - 'a'] == -1) {	// ch-'a'=> 문자코드 / arr 원소 값이 -1 인 경우에만 i로 설정!(처음 등장하는 위치 설정이니까요!)
				arr[ch - 'a'] = i;
			}
		}
	
		for(int a : arr) {	// 배열 출력
			sb.append(a).append(" ");
		}
		System.out.println(sb);
	}
}
