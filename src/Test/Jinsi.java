package Test;

import java.util.Scanner;

public class Jinsi {
	//近似值
	public static void main(String []args){
		Scanner scanner=new Scanner(System.in);
		double i=scanner.nextDouble();
		
		
		//向下转型,都转为小数点前面的那个整数
		int j=(int)i;
		if((i-j>=0.5)&&(i-j)<1){
			System.out.println(++j);
		}else{
			System.out.println(j);
		}
	}
}
