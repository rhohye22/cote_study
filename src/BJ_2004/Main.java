package BJ_2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		String C = String.valueOf(combination(n, r));

		int cnt = 0;
		char[] arr = C.toCharArray();
		for (int i = C.length() - 1; i >= 0; i--) {
			if (arr[i] - '0' == 0) {
				cnt++;
			} else {
				break;
			}
		}

		System.out.println(cnt);

	}

//팩토리얼
	public static BigInteger factorial(int a) {
		BigInteger R = new BigInteger("1");
		for (int i = a; i > 0; i--) {
			R = R.multiply(BigInteger.valueOf(i));
		}
		return R;
	}

//순열
	public static BigInteger permutation(int n, int r) {
		return factorial(n).divide(factorial(n - r));
	}

//조합
	public static int combination(int n, int r) {
		return permutation(n, r).divide(factorial(r)).intValue();
	}

}
