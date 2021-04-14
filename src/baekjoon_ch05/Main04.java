package baekjoon_ch05;
// 3052 : 나머지
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// HashSet - 중복 값 제거
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		sb.append(h.size());
		System.out.println(sb);
	}
}
