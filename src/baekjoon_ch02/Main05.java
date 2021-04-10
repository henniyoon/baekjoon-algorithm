package baekjoon_ch02;
// 2884 : 알람 시계
import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int real = m - 45;
		if(real < 0) {
			real = real + 60;
			h--;
			if(h < 0) {
				h = h + 24;
			}
			System.out.print(h + " ");
			System.out.println(real);
		} else {
			System.out.print(h + " ");
			System.out.println(real);
		}
	}
}
