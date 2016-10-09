package test50;
/**
 * @author Martin
 *������30�� ArraySort.java
 *��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С� 
 *1. ���������ʹ�ö��ַ�
 */
public class ArraySort {
/**
	 * ��a�����n(���ַ�)
	 * @param a
	 * @param n
	 */
	public static int[] addNumber(int[] a, int n){
		int i=0, j=a.length-1;
		int cup = 0;
		if(a[j]<n) cup = j+1;
		else if(a[i]>n) cup = i;
		else{
			while(j-i>1){
				cup = (i + j) /2;
				if(n > a[cup]){//n�����м���
					i = cup;
				}else if(n < a[cup]){
					j = cup;
				}else{
					break;
				}
			}
			cup = j;
		}
		
		//����n
		int[] newa = new int[a.length+1];
		for(i=0,j=0; i<newa.length; i++){
			if(i == cup){
				newa[i] = n;
			}else{
				newa[i] = a[j];
				j++;
			}
		}
		return newa;
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2,3,5,6,7,9,12,16};//�Ѿ��ź��������
		a = addNumber(a, 10);
		printArray(a);
	}
}
/* 
2 3 5 6 7 9 10 12 16
 */