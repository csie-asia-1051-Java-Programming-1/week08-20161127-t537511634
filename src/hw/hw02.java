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
		int v = scn.nextInt(),nu = scn.nextInt(),to = scn.nextInt(),tr=0,c=0;
		System.out.println(t2(t10(v,nu,tr,c),to));
		System.out.println(t10(v,nu,tr,c));

	}

	public static int t2(int v,int to) {
		if(v>1){
			return t2(v/to,to)*10+v%to;
		}else{
			return v%to;
		}
	}	
	public static int t10(int v,int nu,int tr,int c) {
		tr = (int) (v%10*Math.pow(nu,c));
			return (v==0)?tr:tr+t10(v/10,nu,tr,c+=1);
	}
	}

