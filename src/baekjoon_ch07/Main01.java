package baekjoon_ch07;
// 11654 : 아스키 코드
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char a = (char) br.read();
		int b = (int) a;
		
		sb.append(b);
		System.out.println(sb);
	}
}
