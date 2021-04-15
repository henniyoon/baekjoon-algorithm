package baekjoon_ch05;
// 4344 : 평균은 넘겠지
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main07 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int c = Integer.parseInt(br.readLine());	// 테스트 케이스
		double result = 0;
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());	// StringTokenizer
			int t = Integer.parseInt(st.nextToken());	// 학생의 수
			int score[] = new int[t];					// 점수 배열 생성
			double sum = 0;	// 점수의 총 합
			double avg = 0;	// 평균 점수
			for(int j=0; j<t; j++) {			
				score[j] = Integer.parseInt(st.nextToken());	// 배열에 점수 저장
				sum += score[j];	// 점수의 총 합 계산
			}
			avg = sum/t;	// 평균 점수 계산
			int count = 0;	// 평균 이상인 학생 수
			for(int j=0; j<t; j++) {
				if(score[j] > avg) {
					count++;
				}
			}
			result = (double)count/t*100;
			sb.append(String.format("%.3f", result)).append("%\n");
		}
		System.out.println(sb);
	}
}
