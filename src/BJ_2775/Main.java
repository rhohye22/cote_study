package BJ_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bf.readLine());

		for (int i = 0; i < T; i++) {

			int k = Integer.parseInt(bf.readLine());
			int n = Integer.parseInt(bf.readLine());

			// [층][호], 1호 부터 있음
			int[][] apt = new int[k+1][n + 1];

			// 0층의 n호까지지 입력
			for (int j = 1; j <= n; j++) {
				apt[0][j] = j;
			}

			for(int x=1;x<=k;x++) {
				for(int y=1;y<=n;y++) {
					int sum = 0;
					for(int z=1;z<=y;z++) {
						sum += apt[x-1][z];
					}
					apt[x][y] = sum;
				}
			}
			System.out.println(apt[k][n]);
			
		}
	}

}
