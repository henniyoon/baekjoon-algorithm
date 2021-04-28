package baekjoon_ch07;
// 2941 : 크로아티아 알파벳
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main09 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 아래 목록에 없는 알파벳은 한 글자씩 센다.
		String[] str = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String s = br.readLine();	// 검사할 단어 입력
		int count = 0;	// 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어졌는지 저장 할 변수
		
		// 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져있는지 검사
		for(int i=0; i<s.length(); i++) {
			switch(s.substring(i, i+1)) {
				case "c":	// c로 시작할 경우
					// 인덱스 범위를 초과하지 않고 "c=" 또는 "c-"이면 , 
					if(i <= s.length()-2 && 
							(s.substring(i,i+2).equals(str[0]) || s.substring(i,i+2).equals(str[1]))) {
						i++;		// 다음 자리로 넘어가기
						count++;	// + 단어 1개
					} else {		// 아니면 
						count++;	// + 단어 1개만
					}
					break;
				case "d":	// d로 시작할 경우
					// 인덱스 범위를 초과하지 않고 "dz="이면 
					if(i <= s.length()-3 && 
							(s.substring(i,i+3).equals(str[2]))) {
						i += 2;		// 다다음 자리로 넘어가기
						count++;	// + 단어 1개
					// 인덱스 범위를 초과하지 않고 "d-"이면
					} else if(i <= s.length()-2 && 
							(s.substring(i,i+2).equals(str[3]))) {
						i++;		// 다음 자리로 넘어가기
						count++;	// + 단어 1개
					} else {		// 아니면
						count++;	// + 단어 1개만
					}
					break;
				case "l": case "n":	// l 또는 n으로 시작할 경우
					// 인덱스 범위를 초과하지 않고 "lj" 또는 "nj"이면
					if(i <= s.length()-2 && 
							(s.substring(i,i+2).equals(str[4]) || s.substring(i,i+2).equals(str[5]))) {
						i++;		// 다음 자리로 넘어가기
						count++;	// + 단어 1개
					} else {		// 아니면
						count++;	// + 단어 1개만
					}
					break;
				case "s": case "z":	// s 또는 z로 시작할 경우
					// 인덱스 범위를 초과하지 않고 "s=" 또는 "z="이면
					if(i <= s.length()-2 && 
							(s.substring(i,i+2).equals(str[6]) || s.substring(i,i+2).equals(str[7]))) {
						i++;		// 다음 자리로 넘어가기
						count++;	// + 단어 1개
					} else {		// 아니면
						count++;	// + 단어 1개만
					}
					break;
				default:		// 해당 조건 없을 경우 
					count++;	// + 단어 1개만
					break;
			}
		}
		sb.append(count);
		System.out.println(sb);
	}
}