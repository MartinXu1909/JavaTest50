package test50;
/**
 * @author Martin
 *【程序42】 Test4_1.java
 *题目：809*??=800*??+9*??
 *其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。 
 * //题目错了！809x=800x+9x+1这样的方程无解。去掉那个1就有解了。
 */
public class Test4_1 {
public static void main(String[] args) {
		for(int i=10; i<100; i++){
			for(int j=10; j<100 && 8*j<100; j++){
				for(int l=10; l<100 && 9*l<1000; l++){
					if(809*i == 800*j + 9*l){
						System.out.println("809*"+i+" == 800*"+j+"+ 9*"+l);
						System.out.println("809*??后的结果" + i*809);
						return;
					}
				}
			}
		}
		System.out.println("没有符合的数");
	}
}
/* 
没有符合的数
 */