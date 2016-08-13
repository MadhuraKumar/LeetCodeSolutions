package leet.algorithm;

import java.util.Scanner;

public class ReverseNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumberCount	ref = new ReverseNumberCount();
		System.out.println("Enter the number :");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(ref.reverseNumber(num));
	}  
	
	
	public int reverseNumber(int num){
		int count = 0;
		for(int i=1; i<num; i++){
			if(reverse(i)){
				count ++;
			}
		
		}
		return count;
		
		
		
	}
	
	public boolean reverse(int n){
		int rev = 0;
		int num = n;
		
		while(num!= 0){
			rev = (rev * 10) + (num%10);
			num = num/10;
		}
		
		int revNum = rev + n;
		while (revNum != 0){
			if((revNum % 10) % 2 == 0){
				return false;
			}
			revNum = revNum /10;
		}
		return true;
	}
 
}
