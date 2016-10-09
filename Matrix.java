package test50;
/**
 * @author Martin
 *������29�� Matrix.java
 * ��Ŀ����һ��n*n����Խ���Ԫ��֮��
 * 1.�������������˫��forѭ�����������ά���飬�ٽ�a[i][i]�ۼӺ������
 */
public class Matrix {
	/**
	 * forѭ�����������ά����,�ٽ�a[i][i]�ۼӺ����
	 *@param i
	 *@param j
	 *@param sum
	 *@return sum
	 */
    public int getSum(int a[][]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }
	public static void main(String args[]){
        int arr[][]={{1,2,3,4},{4,5,6,6},{7,8,9,7},{9,10,11,12}};
        Matrix m=new Matrix();        
        System.out.println(m.getSum(arr));
    }
}
/* 
27
 */