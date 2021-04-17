package baekjoon_ch06;
// 15596 : 정수 N개의 합
public class Test01 {
	
	static long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
