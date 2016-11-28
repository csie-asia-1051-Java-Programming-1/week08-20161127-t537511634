package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v= scn.nextInt(),l=t2(v),n=0;
		while(l>0){
			if(l%10==1){
				n++;
			}
			l/=10;
		}
		System.out.println(n);

	}

	public static int t2(int v) {
		if(v>1){
			return t2(v/2)*10+v%2;
		}else{
			return v%2;
		}
	}

}