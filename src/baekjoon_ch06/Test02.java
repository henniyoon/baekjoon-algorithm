package baekjoon_ch06;
// 4673 : 셀프 넘버
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		boolean[] check = new boolean[10001];	// 0은 안쓰지만 포함해서 0~10000까지 : 10001개
		for (int i = 1; i <= 10000; i++){
			int n = d(i);
	
			if(n <= 10000){	// 10000 이하의 생성자로 만들어진 수
				check[n] = true;	// true 로 저장
			}
		}
		for (int i = 1; i <= 10000; i++) {
			if (!check[i]) {	// 기본값이 false, 저장되지 않은 수들 : 셀프넘버
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
		
	public static int d(int n) {	// n을 생성자로 하는 d(n) 수열을 만드는 함수
		int sum = n;
		while(n != 0) {
			sum += n % 10;	// 일의 자리 수
			n = n/10;	// n을 10으로 나누어 이미 더한 일의 자리 수를 없애기
		}
		return sum;
	}
}    

