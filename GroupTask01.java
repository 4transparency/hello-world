package my_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GroupTask01 {
	public static void main(String[] args) {
		// Q1
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if ((i % 2 != 0) && (i % 3 != 0)) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum);

		// Q2
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("[%d] + [%d] = 6", i, j);
					System.out.println();
				}
			}
		}

		// Q3
		int num2 = (int) (Math.random() * 10 % 3);
		int num3 = num2 + 1;
		String[] opt = { "가위", "바위", "보" };

		Scanner scan = new Scanner(System.in);
		String result;

		while (true) {
			System.out.println("===가위바위보 게임===");
			System.out.println("당신의 선택은 ?(1.가위  2.바위 3.보  0.종료)");
			int num = scan.nextInt();

			if (num == num3) {
				result = "비겼습니다.";
			} else if (num - num3 == 1 || num - num3 == -2) {
				result = "당신의 승리있니다.";

			} else {
				result = "당신의 패배입니다.";

			}
			System.out.printf("컴퓨터 : %s, 너는 : %s , %s", opt[num2], opt[num - 1], result);
			System.out.println();

			if (num == 0) {
				break;
			} else {
				System.out.println("1~3 사이의 정수를 입력하세요");

			}

		}
	}
}