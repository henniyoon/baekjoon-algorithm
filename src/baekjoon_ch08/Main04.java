package baekjoon_ch08;
// 2869 : 달팽이는 올라가고 싶다 (시간 초과)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());	// 낮에 올라가는 거리 a 미터
		int b = Integer.parseInt(st.nextToken());;	// 밤에 자는 동안 미끄러지는 거리 b 미터
		int v = Integer.parseInt(st.nextToken());;	// 나무 막대의 높이 v 미터
		int n = 1;
		int height = a;	// 얼마나 올라갔는지 저장
		
		while(true) {
			if(height >= v) {	// 달팽이가 올라간 거리가 나무 막대의 높이와 같거나 그보다 크면
				break;
			} else {			// 달팽이가 올라간 거리가 나무 막대의 높이보다 낮으면
				height -= b;	// 밤에 자는 동안 b만큼 비끄러짐
				n++;			// 다음날
				height += a;	// 낮에 a만큼 올라감
			}
		}
		sb.append(n);
		System.out.println(sb);
	}
}
