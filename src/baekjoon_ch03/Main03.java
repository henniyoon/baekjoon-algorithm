package baekjoon_ch03;
// 8393 : 합
import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
