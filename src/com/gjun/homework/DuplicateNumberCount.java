package com.gjun.homework;

public class DuplicateNumberCount {

	public static void main(String[] args) {

		// 計算非重複的數字個數 8
		// 8,6,5,9,7,2,0,456
		int[] numbers = new int[] { 8, 6, 6, 5, 9, 6, 5, 7, 2, 0, 0, 5, 456 };

		int count = duplicateNumberCount(numbers);
		System.out.printf("非重複的數字個數有%d個", count);
	}

	public static int duplicateNumberCount(int[] numbers) {

		long[] ans = new long[numbers.length];// 用來存放非重複的數字

		for (int i = 0; i < ans.length; i++) {// 將初始時設為Integer範圍外的數值
			ans[i] = Integer.MAX_VALUE;
			ans[i]++;
		}

		int count = 0;

		for (int i = 0; i < numbers.length; i++) {

			boolean ctrl = true;

			for (int j = 0; j < ans.length; j++) {

				if (ans[j] == numbers[i]) {// 比對ans陣列中有無重複值
					ctrl = false;
				}

			}

			if (ctrl) {// 如果無重複就將值放入ans陣列中
				ans[count] = numbers[i];
				count++;
			}

		}

		for (int i = 0; i < count; i++) {
			if (i != count - 1) {
				System.out.print(ans[i] + ",");
			} else {
				System.out.print(ans[i]);
			}
		}
		System.out.println();

		return count;
	}

}
