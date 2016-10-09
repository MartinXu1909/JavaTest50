package test50;

/**
 * @author Martin
 *【程序27】 SuShu.java
 * 题目：求100之内的素数
 *1.程序分析：判断素数的方法：用一个数分别去除2~sqrt(n)或者2~n/2,常用2~n/2，
 *因为一个数的一半的平方大于其本身是从5开始的，解方程：n/2的平方>n .如果能被整除， 
 *则表明此数不是素数，反之是素数。
 */
public class SuShu {

    /**
     * 判断n是不是质数
     * @param n
     * @return
     */
    public static boolean isPrimeNumber(int n){
        
        if(n == 2) return true;
        
        for(int i=2; i<=n/2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 0;
        for(int i=0; i<=100; i++){
            if(isPrimeNumber(i)){
                n++;
                System.out.print(i + ",");
            }
        }
        System.out.println("\n0-100之间有"+n+"个素数");
    }
}
/* 
0,1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,
0-100之间有27个素数
 */