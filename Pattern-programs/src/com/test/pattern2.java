package com.test;

public class pattern2 {

	public static void main(String[] args) {
		int count = 1;
		boolean k = true;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {

				if (j >= 6 - i && j <= 4 + i && k) {
					System.out.print(count++);
					k = false;
				} else {
					System.out.print(" ");
					k = true;
				}
			}
			System.out.println();
		}
	}

}
