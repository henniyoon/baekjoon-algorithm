package baekjoon_ch05;
// 2562 : 최대값
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[9];
		int max = 0;	// 최대값
		int count = 0;	// 몇 번째!
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i=0; i<9; i++) {
			if(max == arr[i]) {
				count = i+1; // 배열의 인덱스틑 0부터 시작하니까 +1
			}
		}
		sb.append(max).append("\n").append(count);
		System.out.println(sb);
	}
}
