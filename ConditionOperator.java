package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Martin
 *������5�� ConditionOperator.java 
 *��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ�� 
 *1.���������(a>b)?a:b��������������Ļ������ӡ�
 */
public class ConditionOperator {

    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        int N = 0;
        try {
            N = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("ѧϰ�ɼ�Ϊ��" + ((N < 60) ? "C" : (N < 90) ? "B" : "A"));
    }

}
/* 
90
ѧϰ�ɼ�Ϊ��A
88
ѧϰ�ɼ�Ϊ��B
58
ѧϰ�ɼ�Ϊ��C
 */