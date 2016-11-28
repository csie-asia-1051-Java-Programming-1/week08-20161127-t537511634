package hw;

import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v = scn.nextInt(),nu = scn.nextInt();
		System.out.println(t2(v,nu));

	}

	public static int t2(int v,int nu) {
		if(v>1){
			return t2(v/nu,nu)*10+v%nu;
		}else{
			return v%nu;
		}
	}

}