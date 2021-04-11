package baekjoon_ch03;
// 2742 : 기찍 N
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>=1; i--) {
			bw.write(i + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
