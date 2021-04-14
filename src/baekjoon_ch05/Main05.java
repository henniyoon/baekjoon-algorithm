package baekjoon_ch05;
// 1546 : 평균
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());	// 시험 본 과목의 개수
		double score[] = new double[n];				// 시험 점수가 저장 될 배열
		double max = 0;								// 최고점!
		double sum = 0;								// 점수 조작 후 총 점수
		double avg = 0;								// 점수 조작 후 평균
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			if(score[i] > max) {
				max = score[i];
			}
		}
		// 점수 조작
		for(int i=0; i<n; i++) {
			score[i] = score[i]/max*100;
			sum += score[i];
		}
		avg = sum/n;
		sb.append(avg);
		System.out.println(sb);
	}
}
