package Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChouShu {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=n*n;i++){
			int j=0;
		    if(i==1){
			  list.add(i);
			}else if(i%2==0||i%3==0||i%5==0){
				j=i%2;
				if(j%1==0){
			       list.add(i);
				}
			}
		}
		
		System.out.println(list.get(n-1));
		
	}

}
