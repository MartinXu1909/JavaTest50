package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Martin
 *������6��GCDAndLCM.java������շת����� 
 *��Ŀ����������������m��n���������Լ������С�������� 
 *1.�������������շ������ 
 *2.շת�������������ԭ���������������Լ���������н�С������������������������Լ���� 
 *3.��С��������������֮���������Լ��
 */
public class GCDAndLCM {
    
    /**
     * ���Լ����ͨ��
     * @param m
     * @param n
     * @return ���Լ��
     */
    public static int getGCDNormal(int m, int n){//���Լ����ͨ��
        int i = (m > n ? n : m);
        
        for(; i>1; i--){
            if(m%i == 0 && n%i == 0)
                return i;
        }
        return 1;
    }
    
    /**
     * ���Լ��շת�����
     * @param m
     * @param n
     * @return ���Լ��
     */
    public static int getGCD(int m, int n){//���Լ��շת�����
        if(m%n == 0) return n;
        else return getGCD(n, m%n);//�ݹ�շת���
    }
    
    /**
     * ��С������
     * @param m
     * @param n
     * @return ��С������
     */
    public static int getLCM(int m, int n){
        return (m * n)/getGCD(m, n);//��С��������������֮���������Լ��
    }
    
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        int m = 0, n = 0;
        try {
            m = Integer.parseInt(buffer.readLine());
            n = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("��С������:" + getLCM(m, n));
        System.out.println("���Լ��:" + getGCD(m, n));
    }
}
/* 
136
8
��С������:136
���Լ��:8
 */