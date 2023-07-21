package BJ_10430;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// A B C
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int[] arr = new int[3];

		for (int i = 0; i < 3; i++) {
			int S = Integer.parseInt(st.nextToken());

			arr[i] = S;
		}
		int A = arr[0];
		int B = arr[1];
		int C = arr[2];

		bw.write(String.valueOf((A + B) % C)+"\n");
		bw.write(String.valueOf(((A % C) + (B % C)) % C)+"\n");
		bw.write(String.valueOf((A * B) % C)+"\n");
		bw.write(String.valueOf(((A % C) * (B % C)) % C)+"\n");
		bw.flush();

	}

}
