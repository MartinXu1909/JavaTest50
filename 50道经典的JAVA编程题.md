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
题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？<br>
[TestBall.java](JavaTest50/TestBall.java)<br>
【程序11】 TestTN.java <br>
题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ <br>
1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。<br>
[TestTN.java](JavaTest50/TestTN.java)<br>
【程序12】 MoneyAward.java <br>
题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？<br> 
1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。<br>
[MoneyAward.java](JavaTest50/MoneyAward.java)<br>
【程序13】FindNumber.java <br>
题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？ <br>
1.程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。请看具体分析：<br>
[FindNumber.java](JavaTest50/FindNumber.java)<br>
【程序14】 TestDay.java <br>
题目：输入某年某月某日，判断这一天是这一年的第几天？<br> 
1.程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。<br>
[TestDay.java](JavaTest50/TestDay.java)<br>
【程序15】Sort.java <br>
题目：输入三个整数x,y,z，请把这三个数由小到大输出。 <br>
1.程序分析：舍近求远，练习容器，可以使用List容器很简单实现。<br>
[Sort.java](JavaTest50/Sort.java)<br>
【程序16】Nine.java <br>
题目：输出9*9口诀。 <br>
1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。<br>
[Nine.java](JavaTest50/Nine.java)<br>
【程序17】MonkeyEatPeach.java <br>
题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 <br>
1.程序分析：采取逆向思维的方法，从后往前推断(递归)<br>
[MonkeyEatPeach.java](JavaTest50/MonkeyEatPeach.java)<br>
【程序18】 Prog.java <br>
题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
[Prog.java](JavaTest50/Prog.java)<br>
【程序19】LingXing.java <br>
题目：打印出如下图案（菱形）<br> 
<br>
   *
  ***
 *****
*******
 *****
  ***
   *
 <br>
1.程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。<br>
[LingXing.java](JavaTest50/LingXing.java)<br>
【程序20】TestAdd2.java<br>
题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。<br>
1.程序分析：请抓住分子与分母的变化规律。<br>
[TestAdd2.java](JavaTest50/TestAdd2.java)<br>




