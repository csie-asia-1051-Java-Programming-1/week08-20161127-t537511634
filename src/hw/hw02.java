package hw;

import java.util.Scanner;

/*
 * Topic: 撠��憿�撥��隞亙��10隞乩���車�摮頂蝯梯��� (敹�蝙���艘)
 * Date: 2016/11/21
 * Author: 105021029 瘙芸�筒
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v = scn.nextInt(),nu = scn.nextInt(),to = scn.nextInt();
		System.out.println(t2(v,nu,to));

	}

	public static int t2(int v,int nu,int to) {
		if(v>1){
			return t2(v/nu,nu,to)*10+v%nu;
		}else{
			return v%nu;
		}
	}

}