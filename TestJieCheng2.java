package test50;
/**
 * @author Martin
 *【程序22】TestJieCheng2.java
 * 题目：利用递归方法求5!。 
 * 1.程序分析：递归公式：fn=fn_1*4!
 */
public class TestJieCheng2 {
/**
	 * 求n的阶乘
	 * @param n
	 * @return
	 */
	public static long jieCheng(int n){
		if(n == 1) return 1;
		else return jieCheng(n-1)*n;
	}
	
	public static void main(String[] args) {
		System.out.println(jieCheng(5));
	}
}
/* 
120
 */