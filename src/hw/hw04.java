package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String n = scn.next();
		char v1[] = n.toCharArray();
		num.out(v1);

	}

}

class num {
	public static void out(char v1[]) {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < v1.length; i++) {
				switch (v1[i]) {
				case '1':
					if (j == 0) {
						System.out.print("     *");
					}
					if (j == 1) {
						System.out.print("     *");
					}
					if (j == 2) {
						System.out.print("     *");
					}
					if (j == 3) {
						System.out.print("     *");
					}
					if (j == 4) {
						System.out.print("     *");
					}

					break;
				case '2':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print("     *");
					}
					if (j == 2) {
						System.out.print(" *****");
					}
					if (j == 3) {
						System.out.print(" *    ");
					}
					if (j == 4) {
						System.out.print(" *****");
					}
					break;
				case '3':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print("     *");
					}
					if (j == 2) {
						System.out.print(" *****");
					}
					if (j == 3) {
						System.out.print("     *");
					}
					if (j == 4) {
						System.out.print(" *****");
					}
					break;
				case '4':
					if (j == 0) {
						System.out.print(" *   *");
					}
					if (j == 1) {
						System.out.print(" *   *");
					}
					if (j == 2) {
						System.out.print(" *****");
					}
					if (j == 3) {
						System.out.print("     *");
					}
					if (j == 4) {
						System.out.print("     *");
					}
					break;
				case '5':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print(" *    ");
					}
					if (j == 2) {
						System.out.print(" *****");
					}
					if (j == 3) {
						System.out.print("     *");
					}
					if (j == 4) {
						System.out.print(" *****");
					}
					break;
				case '6':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print(" *    ");
					}
					if (j == 2) {
						System.out.print(" *****");
					}
					if (j == 3) {
						System.out.print(" *   *");
					}
					if (j == 4) {
						System.out.print(" *****");
					}
					break;
				case '7':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print("     *");
					}
					if (j == 2) {
						System.out.print("     *");
					}
					if (j == 3) {
						System.out.print("     *");
					}
					if (j == 4) {
						System.out.print("     *");
					}
					break;
				case '8':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print(" *   *");
					}
					if (j == 2) {
						System.out.print(" *****");
					}
					if (j == 3) {
						System.out.print(" *   *");
					}
					if (j == 4) {
						System.out.print(" *****");
					}
					break;
				case '9':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print(" *   *");
					}
					if (j == 2) {
						System.out.print(" *****");
					}
					if (j == 3) {
						System.out.print("     *");
					}
					if (j == 4) {
						System.out.print("     *");
					}
					break;
				case '0':
					if (j == 0) {
						System.out.print(" *****");
					}
					if (j == 1) {
						System.out.print(" *   *");
					}
					if (j == 2) {
						System.out.print(" *   *");
					}
					if (j == 3) {
						System.out.print(" *   *");
					}
					if (j == 4) {
						System.out.print(" *****");
					}
					break;
				}
			}
			System.out.println();
		}
	}
}
