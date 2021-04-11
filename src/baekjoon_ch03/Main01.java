package baekjoon_ch03;
// 2739 : 구구단
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
