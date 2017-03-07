package Test;

import java.util.ArrayList;
import java.util.Scanner;

//质数因子
public class Test1 {
	public static void main(String[] args) {
		Scanner scancer = new Scanner(System.in);
		int n = scancer.nextInt();
		//保存n的值,判断是否为质数
		int k=n;
		int m = n/2;
		//因子从2开始
		int i = 2;
		//存入因子
		ArrayList<Integer> list = new ArrayList<>();
		while (i <= m) {
			//保存一个因子,n的值变为n/i
			if (n % i == 0) {
				n = n / i;
				list.add(i);
			} else {
				i++;
			}

		}
		//如果为质数,则输出自己的值
		if (n == k) {
			System.out.print(n+" ");
		} else {
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
		}
	}
}
