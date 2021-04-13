package baekjoon_ch04;
// 1110 : 더하기 사이클
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String a = br.readLine();	// 입력 받은 수 => 고정!
		String temp = a;			// 비교 할 수! (처음엔 입력 받은 수)
		String second = "1";
		int b = 0;
		int count = 0;				// 몇 번 반복했는지 저장할 변수
		
		while(true) {
			// 비교할 수가 한자리 수이고 이미 앞에 0이 붙어있지 않을 때!
			if(Integer.parseInt(temp) < 10 && Integer.parseInt(second) != 0) {
				temp = 0 + temp;	// 앞에 0을 붙여 두 자리 수로 만들기
			}
			String first = temp.substring(0,1);	// 첫번째 자리
			second = temp.substring(1,2);		// 두번째 자리
			b = Integer.parseInt(first) + Integer.parseInt(second);
			
			temp = second + b%10;
			count++;
//			System.out.println("first:" + first);
//			System.out.println("second:" + second);
//			System.out.println("b:" +b);
//			System.out.println("temp:" + temp);
//			System.out.println("count:" + count);
//			if(count == 60) break;
			// 입력 받은 수와 계산 한 수가 같아지면 반복문 나가기
			if(Integer.parseInt(a) == Integer.parseInt(temp)) break;
		}
		sb.append(count);
		System.out.println(sb);
	}
}
