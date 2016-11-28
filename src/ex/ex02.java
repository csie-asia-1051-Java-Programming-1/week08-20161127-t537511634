package ex;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v = scn.nextInt(),nu=scn.nextInt();
		t2(v,nu);

	}

	public static void t2(int v,int nu) {
		int t = 0,o=v;
		while (o > 0) {
			t++;
			o/=nu;
		}
		int n[] = new int[t];
		for (int i = t - 1; i >= 0; i--) {
			n[i] = v % nu;
			v /= nu;
		}
		for (int i = 0; i < t; i++) {
			System.out.print(n[i]);
		}
		System.out.println();
	}

}
