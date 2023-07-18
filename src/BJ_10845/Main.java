package BJ_10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Queue<Integer> queue = new LinkedList<Integer>();

		// 명령의 수N
		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();

			// push
			if (command.startsWith("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
			}

			// pop
			else if (command.startsWith("pop")) {
				// 큐에 아무것도 없을 경우
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.poll());
				}

			}
			// size
			else if (command.startsWith("size")) {
				System.out.println(queue.size());
			}

			// empty
			else if (command.startsWith("empty")) {
				if (queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}

			// front
			else if (command.startsWith("front")) {
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peek());
				}
			}

			// back
			else if (command.startsWith("back")) {
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.toArray()[queue.size()-1]);
				}
			}

		}

	}
}
