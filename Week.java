package test50;

import java.util.Scanner;
/**
 * @author Martin
 *【程序26】Week.java
 * 题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。
 * 1.程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。
 */
public class Week {
    public static void main(String args[]) {
        System.out.println("请输入星期的英文单词的第一个字母来判断是星期几，按Enter键结束！");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        if (str.length() == 1) {
            char c = str.charAt(0);
            switch (c) {
                case 'm':
                case 'M':
                    System.out.println("星期一(Monday)");
                    break;
                case 't':
                case 'T':
                    System.out.println("由于星期二(Tuesday)和星期四(Thursday)英文单词的第一个字母相同，请输入第二个字母继续进行判断！");
                    str = s.next();
                    if (str.length() == 1) {
                        c = str.charAt(0);
                        if(c=='U'||c=='u'){
                            System.out.println("星期二(Tuesday)");
                            break;
                        }
                        else if(c=='H'||c=='h'){
                            System.out.println("星期四(Thursday)");
                            break;
                        }
                        else{
                            System.out.println("输入错误，程序结束！");
                            break;
                        }
                    }
                    else{
                        System.out.println("输入错误，程序结束！");
                        break;
                    }
                case 'W':
                case 'w':
                    System.out.println("星期三(Wednesday)");
                    break;
                case 'F':
                case 'f':
                    System.out.println("星期五(Friday)");
                    break;
                case 's':
                case 'S':
                    System.out.println("由于星期六(Saturday)和星期日(Sunday)英文单词的第一个字母，请输入第二个字母继续进行判断！");
                    str=s.next();
                    c=str.charAt(0);
                    if(str.length()==1){
                        if(c=='A'||c=='a'){
                            System.out.println("星期六(Saturday)");
                            break;
                        }
                        else if(c=='U'||c=='u'){
                            System.out.println("星期天(Sunday)");
                            break;
                        }
                    }
                    else{
                        System.out.println("输入错误，程序结束！");
                        break;
                    }
            }
        }
        else{
            System.out.println("输入错误，程序结束！");
        }
    }
}
/* 
请输入星期的英文单词的第一个字母来判断是星期几，按Enter键结束！
m
星期一(Monday)

请输入星期的英文单词的第一个字母来判断是星期几，按Enter键结束！
s
由于星期六(Saturday)和星期日(Sunday)英文单词的第一个字母，请输入第二个字母继续进行判断！
u
星期天(Sunday)
 */