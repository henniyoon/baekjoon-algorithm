package baekjoon_ch07;
// 1152 : 단어의 개수
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main06_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 영어 대소문자와 띄어쓰기만으로 이루어진 문자열에 몇 개의 단어가 있을까?
		// trim(); : 문자열의 앞과 뒤에는 공백이 있을 수도 있으므로 문자열 앞뒤 공백 제거!
		String str = br.readLine().trim();	// 문자열 입력받기
		// split();
		String[] array = str.split(" ");	// 입력받은 문자열을 띄어쓰기를 기준으로 잘라서 배열에 넣기
		sb.append(array.length);
		if(array[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(sb);
		}
	}
}

// 놓친 것!
// 	1) 문자열 앞 뒤 공백 제거
//  2) 공백만 입력했을 경우 0으로 뜨게 할 것