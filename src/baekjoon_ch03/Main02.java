package baekjoon_ch03;
// 10950 : A+B - 3
import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int arr[][] = new int[t][2];
		int sum[] = new int[t];
		for(int i=0; i<t; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<t; i++) {
			sum[i] = arr[i][0] + arr[i][1];
			System.out.println(sum[i]);
		}
	}
}
