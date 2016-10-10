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
 ������15��Sort.java
 * ��Ŀ��������������x,y,z���������������С���������
 * 1.��������������Զ����ϰ����������ʹ��List�����ܼ�ʵ�֡�
 */
public class Sort {
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
			System.out.println("�������ݣ���:1,2,3,4,");
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
�������ݣ���:1,2,3,4,
34,1,32423,54,656,767,56,4,
false
1.0 4.0 34.0 54.0 56.0 656.0 767.0 32423.0
 */