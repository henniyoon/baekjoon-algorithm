package baekjoon_ch03;
// 10871 : X보다 작은 수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main11 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st, st2;
		st = new StringTokenizer(br.readLine());
		st2 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st2.nextToken()); 
			if(a[i] < x) {
				bw.write(a[i] + " ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
