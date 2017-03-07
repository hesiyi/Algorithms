package Test;

import java.util.Scanner;

public class StringCount {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		int[] map=new int[10000];
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++){
			map[c[i]]++;
		}
		int count=0;
		for(int j=0;j<map.length;j++){
			if(map[j]>1){
				count++;
			}
		}
		System.out.println(str.length()-count);
	}

}
