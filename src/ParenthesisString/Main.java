package ParenthesisString;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;

		// T개의 테스트
		//System.out.println("테스트 갯수 입력 >>");
		T = sc.nextInt();
		String[] arr = new String[T];

		for (int i = 0; i < T; i++) {
			String str = sc.next();

			String temp = "";
			while (true) {
				temp = str.replace("()", "");

				if (str.equals(temp)) {
					break;
				}
				str = temp;
			}

			arr[i] = str;
			if (arr[i].equals("")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}


	}

}

