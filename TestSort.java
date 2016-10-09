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
 *������28�� TestSort.java
 * ��Ŀ����10������������
 * 1.���������ֱ��ʹ��java��Collections.sort()����������
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
			System.out.println("�������ݣ���:1,2,3,4,...,");
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
�������ݣ���:1,2,3,4,..., 
2,1,3,4,6,5,8,7,9,10,
false
1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 10.0
 */