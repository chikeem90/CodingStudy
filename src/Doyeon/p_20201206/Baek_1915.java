package Doyeon.p_20201206;

import java.util.Scanner;

/**
 *
 */
public class Baek_1915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n+1][m+1];
        int[][] d = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            char[] num = sc.next().toCharArray();
            for (int j = 1; j <= m; j++) {
                map[i][j] = num[j-1] - '0';
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == 1) {
                    d[i][j] = Math.min(d[i-1][j], Math.min(d[i][j-1], d[i-1][j-1])) + 1;
                    result = Math.max(result, d[i][j]);
                }
            }
        }
        System.out.println(result*result);
    }
}