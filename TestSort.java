package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Martin
 *【程序28】 TestSort.java
 * 题目：对10个数进行排序。
 * 1.程序分析：直接使用java的Collections.sort()方法。。。
 */
public class TestSort {
public static List<Double> readDouble(String str, String sp){
		List<Double> l = new ArrayList<Double>();
		int j = 0;
		for(int i=0; i<str.length(); i++){
			if(str.substring(i, i+1).equalsIgnoreCase(sp) ){
				l.add(Double.parseDouble(str.substring(j, i)));
				j = i + 1;
			}
		}
		return l;
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Double> l = null;
		try {
			System.out.println("输入数据，如:1,2,3,4,...,");
			l = readDouble(br.readLine(), ",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(l.isEmpty());
		Collections.sort(l);
		Iterator<Double> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
	}
}
/*
输入数据，如:1,2,3,4,..., 
2,1,3,4,6,5,8,7,9,10,
false
1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 10.0
 */