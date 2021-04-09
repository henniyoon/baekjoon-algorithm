package baekjoon_ch01;
// 1008 : A/B
import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		double result = (double)a/b;
		System.out.println(String.format("%.9f", result));
	}
}
