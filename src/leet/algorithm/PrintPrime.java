package leet.algorithm;

import java.util.Scanner;


public class PrintPrime {
	
	public static void main(String[] args){
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=num; i++){
			int count = 0;
			for(int j=2; j<=i/2; j++){
				if(i%j == 0){
					count = 1;
					break;
				}
				
			}
			if (count == 0)
				System.out.println(i);
			
		}
	sc.close();	
	}
	

}
