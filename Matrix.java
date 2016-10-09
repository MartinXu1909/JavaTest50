package test50;
/**
 * @author Martin
 *【程序29】 Matrix.java
 * 题目：求一个n*n矩阵对角线元素之和
 * 1.程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
 */
public class Matrix {
	/**
	 * for循环控制输入二维数组,再将a[i][i]累加后输出
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