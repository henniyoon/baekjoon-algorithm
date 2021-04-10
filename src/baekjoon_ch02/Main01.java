package baekjoon_ch02;
//1330 : 두 수 비교하기
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else if(a == b) {
			System.out.println("==");
		}
	}
}
