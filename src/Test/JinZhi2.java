package Test;

import java.util.Scanner;

public class JinZhi2 {
		    public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);
		  
		        while(sc.hasNext()){
		            String str = sc.nextLine();
		            System.out.println(Integer.parseInt(str.substring(2),16));
		        }
		    }
}