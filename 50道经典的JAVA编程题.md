【程序1】 TestRabbit.java<br> 
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？<br>
1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....<br>
[TestRabbit.java](JavaTest50/TestRabbit.java)<br>
【程序2】 FindPrimeNumber.java <br>
题目：判断101-200之间有多少个素数，并输出所有素数。 <br>
1.程序分析：判断素数的方法：用一个数分别去除2~sqrt(n)或者2~n/2,常用2~n/2，因为一个数的一半的平方大于其本身是从5开始的，解方程：n/2的平方>n .如果能被整除，则表明此数不是素数，反之是素数。<br>
[FindPrimeNumber.java](JavaTest50/FindPrimeNumber.java)<br>
【程序3】FindDaffodilNumber.java <br>
题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 <br>
1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。<br>
[FindDaffodilNumber.java](JavaTest50/FindDaffodilNumber.java)<br>
【程序4】Explode.java <br>
题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 <br>
程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成： <br>
*(1)运用两层循环。 <br>
*(2)外循环得到2~n之间的所有质数，内循环将n循环除以质数，知道不能整除。 <br>
*(3)要是内循环n等于1了就说明n被完全整除了。<br>
[Explode.java](JavaTest50/Explode.java)<br>
【程序5】 ConditionOperator.java <br>
题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。<br>
1.程序分析：(a>b)?a:b这是条件运算符的基本例子。<br>
[ConditionOperator.java](JavaTest50/ConditionOperator.java)<br>
【程序6】GCDAndLCM.java <br>
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。<br> 
*1.程序分析：利用辗除法。 <br>
*2.辗转相除法基于如下原理：两个整数的最大公约数等于其中较小的数和两数的相除余数的最大公约数。<br> 
*3.最小公倍数等于两数之积除以最大公约数<br>
[GCDAndLCM.java](JavaTest50/GCDAndLCM.java)<br>
【程序7】 StChar.java <br>
题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 <br>
1.程序分析：利用循环,使用Map存储数据.其实完全可以使用4个变量来解决,这边舍近求远复习下Map啦<br>
[StChar.java](JavaTest50/StChar.java)<br>
【程序8】 TestAdd.java <br>
题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 <br>
1.程序分析：关键是计算出每一项的值。<br>
[TestAdd.java](JavaTest50/TestAdd.java)<br>
【程序9】 WanShu.java <br>
题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。
[WanShu.java](JavaTest50/WanShu.java)<br>
【程序10】TestBall.java <br>
题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
[TestBall.java](JavaTest50/TestBall.java)<br>



