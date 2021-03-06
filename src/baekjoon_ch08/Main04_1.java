package baekjoon_ch08;
// 2869 : 달팽이는 올라가고 싶다
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());	// 낮에 올라가는 거리 a 미터
		int b = Integer.parseInt(st.nextToken());;	// 밤에 자는 동안 미끄러지는 거리 b 미터
		int v = Integer.parseInt(st.nextToken());;	// 나무 막대의 높이 v 미터
		
		int day = (v - b) / (a - b);	// 높이 - 미끄러짐 / 올라감 - 미끄러짐
		if((v - b) % (a - b) != 0) { 	// 나머지가 0이 아닌 경우
			day++;	// 하루를 다 쓰지 않고 높이까지 도달했지만 그래도 + 1일
		}
		
		sb.append(day);
		System.out.println(sb);
	}
}
