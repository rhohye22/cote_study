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

		// ��Ŭ���� ȣ����
		// a �� b �� ���� �������� r �̶��ϸ� (a > b), a�� b�� �ִ������� b �� r�� �ִ������� ���ٴ� ���� !

		// �ִ�����
		int max;
		// �ּҰ����
		int min;

		if (A < B) {
			int temp = A;
			A = B;
			B = temp;
		}

		// �ִ�����
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
		
		//�ּ� �����
		min = A*B/max;
		System.out.println(min);
	}

}
