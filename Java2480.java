package BaekJoon;

import java.util.Scanner;

public class Java2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a==b&&a==c&&b==c) {
			System.out.println(10000+(a*1000));  
			
		} 
		else if(a==b||a==c) {
			System.out.println(1000+(a*100));  
		}
		else if(b==c){
			System.out.println(1000+(a*100));  
		}
		else {
			System.out.println((Math.max(a, Math.max(b,c)*100)));  
		}

	}

}
