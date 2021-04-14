package baekjoon_ch05;
// 10818 : 최소, 최대
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());	// 배열의 크기
		int arr[] = new int[t];						// 입력받은 크기의 배열 생성
		int max = -1000000;	// 최대값
		int min = 1000000;	// 최소값
		st = new StringTokenizer(br.readLine());	// StringTokenizer
	
		for(int i=0; i<t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	// 입력받은 수로 배열 생성
		}
		for(int i=0; i<t; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
	}
}
