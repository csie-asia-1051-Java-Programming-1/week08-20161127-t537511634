package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v = scn.nextInt();
		System.out.println(t2(v));

	}

	public static long t2(long v) {
		if(v>1){
			return t2(v/2)*10+v%2;
		}else{
			return v%2;
		}
	}

}