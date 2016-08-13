package leet.algorithm;

import java.util.Scanner;


public class PowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOfFour ref = new PowerOfFour();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		System.out.println(ref.powerOfFour(num));
			
		}
	
	private boolean powerOfFour(int num){
		
		if(num == 1){
			return true;
		}
		
		while (num > 0){
			int m = num%4;
			if(m==0){
				num = num/4;
				if(num == 1){
					return true;
				}
			}
			else{
				return false;
			}
		}
			return false;
		
	}

}
