package baekjoon_ch05;
//2577 : 숫자의 개수 (수정)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main03_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String mul = Integer.toString(a * b * c);	// 17037300
		String[] arr = mul.split("");	// mul을 한 글자씩 잘라서 저장할 배열
		int[] num = new int[10];	// 0~9 까지 숫자가 몇 번 쓰였는지 저장할 배열
		
		// arr 배열에서 0~9까지 숫자가 몇 번씩 쓰였는지 num 배열에 저장 
		for(int i=0; i<arr.length; i++) { 
			num[Integer.parseInt(arr[i])] += 1;
		}
		// num 배열 출력
		for(int i=0; i<num.length; i++)	{
			sb.append(num[i]).append("\n");
		}
		System.out.println(sb);
	}
}
