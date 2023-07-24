package BJ_2609;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		// 유클리드 호제법
		// a 를 b 로 나눈 나머지를 r 이라하면 (a > b), a와 b의 최대공약수는 b 와 r의 최대공약수와 같다는 성질 !

		// 최대공약수
		int max;
		// 최소공배수
		int min;

		if (A < B) {
			int temp = A;
			A = B;
			B = temp;
		}

		// 최대공약수
		int a = A;
		int b = B;
		while (true) {
			int r = a % b;
			if (r == 0) {
				max = b;
				break;
			} else {
				a=b;
				b=r;

			}
		}
		System.out.println(max);
		
		//최소 공배수
		min = A*B/max;
		System.out.println(min);
	}

}
