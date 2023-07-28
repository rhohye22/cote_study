package BJ_6588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

		       List<Integer> arr = new ArrayList<Integer>();

			int N = Integer.parseInt(bf.readLine());
			if (N == 0) {
				break;
			}

			// �Է°� �Ҽ��迭�����
			int cnt = 0;// ����� ����

			for (int i = 2; i <= N; i++) { // 2���� ����
				for (int j = 2; j <= i; j++) {
					if (i % j == 0) {
						cnt++;
					}
				}

				// ����� 1���϶� = �Ҽ� arr�� �ֱ�
				if (cnt == 1) {
					arr.add(i);
				}
				cnt = 0;
			}
			
			printSum(N,arr);


		}

	}
	
	
	static void printSum(int N, List<Integer> arr) {
		int temp = 0;
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) + arr.get(j) == N) {
					int n = arr.get(j) - arr.get(i);
					if (temp < n) {
						temp = n;
						System.out.println(N + " = " + arr.get(i) + " + " + arr.get(j));
					}
				}

			}
		}
	}

}
