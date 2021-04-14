package baekjoon_ch05;
//2577 : 숫자의 개수
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String mul = Integer.toString(a * b * c);	// 17037300
		String[] arr = mul.split("");
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		for(int i=0; i<arr.length; i++) { // 개못생김.... 다른 방법....
			if(arr[i].equals("0")) {
				zero++;
			} else if(arr[i].equals("1")) {
				one++;
			} else if(arr[i].equals("2")) {
				two++;
			} else if(arr[i].equals("3")) {
				three++;
			} else if(arr[i].equals("4")) {
				four++;
			} else if(arr[i].equals("5")) {
				five++;
			} else if(arr[i].equals("6")) {
				six++;
			} else if(arr[i].equals("7")) {
				seven++;
			} else if(arr[i].equals("8")) {
				eight++;
			} else if(arr[i].equals("9")) {
				nine++;
			}
		}
		sb.append(zero).append("\n");
		sb.append(one).append("\n");
		sb.append(two).append("\n");
		sb.append(three).append("\n");
		sb.append(four).append("\n");
		sb.append(five).append("\n");
		sb.append(six).append("\n");
		sb.append(seven).append("\n");
		sb.append(eight).append("\n");
		sb.append(nine);
		
		System.out.println(sb);
	}
}
