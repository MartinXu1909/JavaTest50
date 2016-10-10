package test50;
/**
 * @author Martin
 *������31�� ArrayConverse.java
 *��Ŀ����һ���������������
 *1.����������õ�һ�������һ��������
 */
public class ArrayConverse {
public static void arrayConverse(int[] a){
		int cup=0;
		for(int i=0,j=a.length-1; i<j; i++,j--){
			cup = a[i];
			a[i] = a[j];
			a[j] = cup;
		}
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		printArray(a);
		arrayConverse(a);
		printArray(a);
	}
}
/* 
1 2 3 4 5
5 4 3 2 1
 */