package test50;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
/**
 * @author Martin
 *������12�� MoneyAward.java
 *��Ŀ����ҵ���ŵĽ������������ɡ�
 *����(I)���ڻ����10��Ԫʱ���������10%��
 *�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��
 *20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
 *40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 *60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
 *����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
 *�Ӽ������뵱������I����Ӧ���Ž��������� 
 *1.����������������������ֽ磬��λ��ע�ⶨ��ʱ��ѽ�����ɳ����͡�
 */
public class MoneyAward {
 
    public static double sumMoneyAward(double i){
        if(i <= 10){
            return i * 0.1;
        }else if(i < 20){
            return ((i - 10) * 0.075 + 1);
        }else if(i < 40){
            return (i - 20) * 0.05;
        }else if(i < 60){
            return (i - 40) * 0.03;
        }else if(i < 100){
            return (i - 60) * 0.015;
        }else{
            return (i - 100) * 0.001;
        }
    }
     
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double I = 0;
        try {
            System.out.println("�����뵱������I��(��λ����)");
            I = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }         
        System.out.println("��������:" + sumMoneyAward(I) + "��");
    }
}
/* 
�����뵱������I��(��λ����)
15
��������:1.375��
�����뵱������I��(��λ����)
5
��������:0.5��
�����뵱������I��(��λ����)
45
��������:0.15��
�����뵱������I��(��λ����)
110
��������:0.01��
 */