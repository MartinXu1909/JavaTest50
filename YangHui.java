package test50;
/**
 * @author Martin
 *������33��YangHui.java
 *��Ŀ����ӡ����������Σ�Ҫ���ӡ��6������ͼ��
 *1.���������
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1
 */
public class YangHui {
	
	/**
	 * �õ�������ǵ�����
	 * @param n
	 * @return
	 */
	public static int[][] getArray(int n){
		int[][] a = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				if(j == 0 || j == i){
					a[i][j] = 1;
				}else{
					a[i][j] = a[i-1][j-1] + a[i-1][j];
				}
			}
		}
		return a;
	}
	
	/**
	 * ��ӡ����������
	 * @param a
	 */
	public static void print(int[][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length-i-1; j++){
				System.out.print(" ");
			}
			for(int j=0; j<a[i].length && a[i][j]>0; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		print(getArray(6));
	}
}
/* 
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1

 */