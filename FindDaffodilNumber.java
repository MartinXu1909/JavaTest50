package test50;

/**
 * @author Martin
 *��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺 
 *153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
 *1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
 */
public class FindDaffodilNumber {

    public static boolean isDaffodNumber(int n){
        char[] ch = String.valueOf(n).toCharArray();
        int cup = 0;
        for(int i=0; i<ch.length; i++){
            cup = cup + (int)Math.pow(Integer.parseInt(String.valueOf(ch[i])), 3) ;
        }
        
        return (cup == n);
    }
    
    public static void main(String[] args) {
        for(int i=100; i<1000; i++){
            if(isDaffodNumber(i)){
                System.out.print(i + ",");
            }
        }
    }

}
/* 
153,370,371,407,
 */