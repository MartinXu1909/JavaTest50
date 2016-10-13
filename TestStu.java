package test50;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Martin
 *������50��TestStu.java
 *��Ŀ�������ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ��������������ݣ�����ѧ���ţ����������ſγɼ��������� 
 *��ƽ���ɼ�����ԭ�е����ݺͼ������ƽ����������ڴ����ļ�"stud"�С�
 */
public class TestStu {
	public static void main(String[] args) {
		int n = 5;//����
		Scanner s = new Scanner(System.in);
		String[] num = new String[n];
		String[] name = new String[n];
		float[][] grade = new float[n][3];
		float[] ave = new float[n];
		//��������
		for(int i=0; i<n; i++){
			System.out.print("ѧ��:");
			num[i] = s.next();
			System.out.print("����:");
			name[i] = s.next();
			for(int j=0; j<3; j++){
				System.out.print("��"+(j+1)+"�ſγɼ�:");
				grade[i][j] = s.nextFloat();
			}
		}
		//��������
		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				ave[i] += grade[i][j];
			}
			ave[i] /= 3;
		}
		//д���ļ�
		try {
			FileWriter fw = new FileWriter(new File("d://stud.txt"));
			BufferedWriter bw  = new BufferedWriter(fw);
			for(int i=0; i<n; i++){
				bw.write("ѧ��:" + num[i] + "  ");
				bw.write("����:" + name[i] + "  ");
				bw.write("�ɼ�:{  ");
				for(int j=0; j<3; j++){
					bw.write(grade[i][j] + "  ");
				}
				bw.write("} ");
				bw.write("ƽ���ɼ�: " + ave[i]);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/* 
ѧ��:01  ����:zhangsan  �ɼ�:{  99.0  45.0  67.0  } ƽ���ɼ�: 70.333336
ѧ��:02  ����:lisi  �ɼ�:{  78.0  45.0  39.0  } ƽ���ɼ�: 54.0
ѧ��:03  ����:wangwu  �ɼ�:{  78.0  56.0  89.0  } ƽ���ɼ�: 74.333336
ѧ��:04  ����:zhaoliu  �ɼ�:{  78.0  20.0  67.0  } ƽ���ɼ�: 55.0
ѧ��:05  ����:xuqi  �ɼ�:{  67.0  34.0  87.0  } ƽ���ɼ�: 62.666668

 */
