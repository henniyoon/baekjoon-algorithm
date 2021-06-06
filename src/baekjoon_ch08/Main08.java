package baekjoon_ch08;
// 10757 : 큰 수 A+B
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main08 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// BigInteger 선언
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
//		A.intValue();	// BigInteger 형 변환
//		A.compareTo(B);	// 두 수 비교 compareTo 맞으면 0 틀리면 -1
//		A.add(B);		// A + B
		sb.append(A.add(B));
		System.out.println(sb);
	}
}
