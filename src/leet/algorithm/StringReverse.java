package leet.algorithm;

import java.util.Scanner;


public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse ref = new StringReverse();
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse : \n");
		String str = sc.nextLine();
		
		rev = ref.reverseString(str);
		System.out.println("The reverse string is : " + rev);
		
		if(str.equals(rev))
		{
			System.out.println("String is a palindrome\n");
		}
		else 
			System.out.println("String not a palindrome\n");
		sc.close();
	}
	
	public String reverseString(String str){
		
		String rev = "";
		int length;
		
		length = str.length();
		
		for(int i = length - 1; i>=0; i--){
			rev = rev + str.charAt(i);
		}
	
		return rev;
	}

}
