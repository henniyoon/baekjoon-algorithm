package baekjoon_ch07;
// 5622 : 다이얼 - 제출 시 컴파일 에러 안 나게 수정
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main08_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();	// 할머니가 외운 단어
//		int num = 1;	// 알파벳에 해당하는 숫자
		int sec = 0;	// 최소 시간
		// 할머니가 외운 단어를 하나씩 숫자와 대조
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A': case 'B': case 'C':
//					num = 2;
					sec += 3;
					break;
				case 'D': case 'E': case 'F':
//					num = 3;
					sec += 4;
					break;
				case 'G': case 'H': case 'I':
//					num = 4;
					sec += 5;
					break;
				case 'J': case 'K': case 'L':
//					num = 5;
					sec += 6;
					break;
				case 'M': case 'N': case 'O':
//					num = 6;
					sec += 7;
					break;
				case 'P': case 'Q': case 'R': case 'S':
//					num = 7;
					sec += 8;
					break;
				case 'T': case 'U': case 'V':
//					num = 8;
					sec += 9;
					break;
				case 'W': case 'X': case 'Y': case 'Z':
//					num = 9;
					sec += 10;
					break;
			}
		}
		sb.append(sec);
		System.out.println(sb);
	}
}
