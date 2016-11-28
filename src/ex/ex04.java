package ex;

/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(com.con(2,3,'+'));
		System.out.println(com.con(2,3,'-'));
		System.out.println(com.con(2,3,'*'));
		System.out.println(com.con(2,3,'/'));
		System.out.println(com.con(2,3,'^'));
		System.out.println(com.con(2,3,'#'));
	}

}
class com{
	public static float con(float n1,float n2,char op){
		float ans = 0.0f;
		switch(op){
		case'+':
			ans = n1 + n2;
			break;
		case'-':
			ans = n1 - n2;
			break;
		case'*':
			ans = n1 * n2;
			break;
		case'/':
			ans = n1 / n2;
			break;
		case'^':
			ans = (float) Math.pow(n1, n2);
			break;
		case'#':
			ans = (float) Math.pow(n1,-n2);
			break;
		}
		return ans;
	}
}
