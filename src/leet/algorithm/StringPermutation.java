package leet.algorithm;


import java.util.Scanner;
import java.util.Arrays;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutation ref = new StringPermutation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string :");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string:");
		String str2 = sc.nextLine();
		if(ref.permutation(str1, str2)){
			System.out.println("String1 is a permutation of string 2");
		}
		else
			System.out.println("String1 is not a permutation of string 2");
		sc.close();
	}
	
	public String sort(String str1){
		char[] first = str1.toCharArray();
		Arrays.sort(first);
		return new String(first);
	}
	
	public boolean permutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		else if(sort(str1).equals(sort(str2))){
			return true;
		}
		return true;
		
		
	}

}
