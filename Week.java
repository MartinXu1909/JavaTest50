package test50;

import java.util.Scanner;
/**
 * @author Martin
 *������26��Week.java
 * ��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ��������� �жϵڶ�����ĸ��
 * 1.�����������������ȽϺã������һ����ĸһ�������ж����������if����жϵڶ�����ĸ��
 */
public class Week {
    public static void main(String args[]) {
        System.out.println("���������ڵ�Ӣ�ĵ��ʵĵ�һ����ĸ���ж������ڼ�����Enter��������");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        if (str.length() == 1) {
            char c = str.charAt(0);
            switch (c) {
                case 'm':
                case 'M':
                    System.out.println("����һ(Monday)");
                    break;
                case 't':
                case 'T':
                    System.out.println("�������ڶ�(Tuesday)��������(Thursday)Ӣ�ĵ��ʵĵ�һ����ĸ��ͬ��������ڶ�����ĸ���������жϣ�");
                    str = s.next();
                    if (str.length() == 1) {
                        c = str.charAt(0);
                        if(c=='U'||c=='u'){
                            System.out.println("���ڶ�(Tuesday)");
                            break;
                        }
                        else if(c=='H'||c=='h'){
                            System.out.println("������(Thursday)");
                            break;
                        }
                        else{
                            System.out.println("������󣬳��������");
                            break;
                        }
                    }
                    else{
                        System.out.println("������󣬳��������");
                        break;
                    }
                case 'W':
                case 'w':
                    System.out.println("������(Wednesday)");
                    break;
                case 'F':
                case 'f':
                    System.out.println("������(Friday)");
                    break;
                case 's':
                case 'S':
                    System.out.println("����������(Saturday)��������(Sunday)Ӣ�ĵ��ʵĵ�һ����ĸ��������ڶ�����ĸ���������жϣ�");
                    str=s.next();
                    c=str.charAt(0);
                    if(str.length()==1){
                        if(c=='A'||c=='a'){
                            System.out.println("������(Saturday)");
                            break;
                        }
                        else if(c=='U'||c=='u'){
                            System.out.println("������(Sunday)");
                            break;
                        }
                    }
                    else{
                        System.out.println("������󣬳��������");
                        break;
                    }
            }
        }
        else{
            System.out.println("������󣬳��������");
        }
    }
}
/* 
���������ڵ�Ӣ�ĵ��ʵĵ�һ����ĸ���ж������ڼ�����Enter��������
m
����һ(Monday)

���������ڵ�Ӣ�ĵ��ʵĵ�һ����ĸ���ж������ڼ�����Enter��������
s
����������(Saturday)��������(Sunday)Ӣ�ĵ��ʵĵ�һ����ĸ��������ڶ�����ĸ���������жϣ�
u
������(Sunday)
 */