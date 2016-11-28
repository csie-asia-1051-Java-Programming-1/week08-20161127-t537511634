package ex;

/*
 * Topic: 寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個陣列的列與行:n1、m1、n2、m2,n1需等於m2");
		int n1 = scn.nextInt(), m1 = scn.nextInt(), n2 = scn.nextInt(), m2 = scn.nextInt();
		int[][] nm1 = new int[n1][m1];
		int nm2[][] = new int[n2][m2];
		int m1n2[][] = new int[m1][n2];
		int sum[][] = new int[n2][m1];
		System.out.println("請輸入數值");
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				nm1[j][i] = scn.nextInt();
			}
		}

		for (int i = 0; i < m2; i++) {
			for (int j = 0; j < n2; j++) {
				nm2[j][i] = scn.nextInt();
			}
		}
		for (int q = 0; q < n1; q++) {
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					sum[j][i] += nm1[q][i] * nm2[j][q];
				}
			}
		}for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n2; j++) {
				System.out.print(sum[j][i]+"\t");
			}
			System.out.println();
		}

	}

}
