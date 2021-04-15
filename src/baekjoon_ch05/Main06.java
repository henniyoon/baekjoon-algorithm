package baekjoon_ch05;
// 8958 : OX퀴즈
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		String arr[] = new String[t];
	
		// 배열 생성
		for(int i=0; i<t; i++) {
			arr[i] = br.readLine();
		
			// 한 문자씩 검사
			int count = 0;
			int sum = 0;
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++; 
				} else {
					count = 0 ;
				}
				sum += count;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}	
}


