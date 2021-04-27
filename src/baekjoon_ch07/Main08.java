package baekjoon_ch07;
// 5622 : 다이얼
// multiple case labels are not supported in -source 11
// JAVA 11에서는 지원하지 않는다.. 난 자바 15라서 되나봐요..
// + JAVA 12부터 지원하는 case에 복수의 값을 설정하는 기능!
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main08 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();	// 할머니가 외운 단어
//		int num = 1;	// 알파벳에 해당하는 숫자
		int sec = 0;	// 최소 시간
		// 할머니가 외운 단어를 하나씩 숫자와 대조
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A','B','C':
//					num = 2;
					sec += 3;
					break;
				case 'D','E','F':
//					num = 3;
					sec += 4;
					break;
				case 'G','H','I':
//					num = 4;
					sec += 5;
					break;
				case 'J','K','L':
//					num = 5;
					sec += 6;
					break;
				case 'M','N','O':
//					num = 6;
					sec += 7;
					break;
				case 'P','Q','R','S':
//					num = 7;
					sec += 8;
					break;
				case 'T','U','V':
//					num = 8;
					sec += 9;
					break;
				case 'W','X','Y','Z':
//					num = 9;
					sec += 10;
					break;
			}
		}
		sb.append(sec);
		System.out.println(sb);
	}
}
