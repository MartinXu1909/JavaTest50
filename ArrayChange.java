package test50;
/**
 * @author Martin
 *������35�� ArrayChange.java
 *��Ŀ���������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
 */
public class ArrayChange {
public static void sort(int[] a){//����ð������
		int cup = 0;
		int l = a.length-1;
		for(int i=1; i<a.length-1; i++){
			if(a[i] > a[0]){
				cup = a[i];
				a[i] = a[0];
				a[0] = cup;
			}
			if(a[i] < a[l]){
				cup = a[i];
				a[i] = a[l];
				a[l] = cup;
			}
		}
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2,3,5,1,2,34,1,0,24};
		printArray(a);
		sort(a);
		printArray(a);
	}
}
/* 
2 3 5 1 2 34 1 0 24
34 24 3 2 2 5 1 1 0
 */