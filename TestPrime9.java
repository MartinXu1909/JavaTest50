package test50;

import java.util.*;
/**
 *【程序45】TestPrime9.java
 * 题目：判断一个素数能被几个9整除
 * 题目错了吧？能被9整除的就不是素数了！所以改成整数了。
 */
public class TestPrime9 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = s.nextInt();
		int tmp = num;
		int count = 0;
		for(int i = 0 ; tmp%9 == 0 ;){
			tmp = tmp/9;
			count ++;
			}
		System.out.println(num+"能够被"+count+"个9整除。");
	}
}
/* 
请输入一个整数：63
63能够被1个9整除。

请输入一个整数：81
81能够被2个9整除。

请输入一个整数：9999
9999能够被1个9整除。
 */