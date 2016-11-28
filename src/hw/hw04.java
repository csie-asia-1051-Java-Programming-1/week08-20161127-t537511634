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
		char v1[]=n.toCharArray();
		num.out(v1);

		
	}

}
class num{
	public static void out(char v1[]){
		for(int i =0;i<v1.length;i++){
			switch(v1[i]){
			case'1':
					System.out.println("     *");
					System.out.println("     *");
					System.out.println("     *");
					System.out.println("     *");
					System.out.println("     *");
				
				break;
			case'2':
				System.out.println(" *****");
				System.out.println("     *");
				System.out.println(" *****");
				System.out.println(" *    ");
				System.out.println(" *****");		
				break;
			case'3':
				System.out.println(" *****");
				System.out.println("     *");
				System.out.println(" *****");
				System.out.println("     *");
				System.out.println(" *****");
				break;
			case'4':
				System.out.println(" *   *");
				System.out.println(" *   *");
				System.out.println(" *****");
				System.out.println("     *");
				System.out.println("     *");
				break;
			case'5':
				System.out.println(" *****");
				System.out.println(" *    ");
				System.out.println(" *****");
				System.out.println("     *");
				System.out.println(" *****");
				break;
			case'6':
				System.out.println(" *****");
				System.out.println(" *    ");
				System.out.println(" *****");
				System.out.println(" *   *");
				System.out.println(" *****");
				break;
			case'7':
				System.out.println(" *****");
				System.out.println("     *");
				System.out.println("     *");
				System.out.println("     *");
				System.out.println("     *");
				break;
			case'8':
				System.out.println(" *****");
				System.out.println(" *   *");
				System.out.println(" *****");
				System.out.println(" *   *");
				System.out.println(" *****");
				break;
			case'9':
				System.out.println(" *****");
				System.out.println(" *   *");
				System.out.println(" *****");
				System.out.println("     *");
				System.out.println("     *");
				break;
			case'0':
				System.out.println(" *****");
				System.out.println(" *   *");
				System.out.println(" *   *");
				System.out.println(" *   *");
				System.out.println(" *****");
				break;
			}
		}
	}
}
