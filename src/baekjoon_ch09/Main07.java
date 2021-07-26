package baekjoon_ch09;
// 1085 : 직사각형에서 탈출
/**
 * 직사각형의 경계선 라인
 * (0,0) ~ (w,0)
 * (0,0) ~ (0,h)
 * (w,0) ~ (w,h)
 * (0,h) ~ (w,h)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main07 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int d = 0;

        if (x >= w && y >= h) {         // (x,y) - (w,h)
            d = (int) Math.sqrt((x - w) * (x - w) + (y - h) * (y - h));

        } else if (x >= w && y < h) {   // x - w
            d = x - w;

        } else if (x < w && y >= h) {   // y - h
            d = y - h;

        } else if (x < w && y < h) {    // x, y, w - x, h - y 중 최솟값
            if (x <= y && x <= w - x && x <= h - y) {
                d = x;
            } else if (y <= x && y <= w - x && y <= h - y) {
                d = y;
            } else if (w - x <= x && w - x <= y && w - x <= h - y) {
                d = w - x;
            } else if (h - y <= x && h - y <= y && h - y <= w - x) {
                d = h - y;
            }
        }
        System.out.println(d);
    }
}
