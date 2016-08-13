package leet.algorithm;

import java.util.Scanner;


public class UniqueCharString {
       
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharString ref = new UniqueCharString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check for unique characters : \n");
		String str = sc.nextLine();
		if(ref.isUniqueString(str))
		  System.out.println("String is unique");
		else
		  System.out.println("String not unique");
		sc.close();
		
	}
	
	public boolean isUniqueString(String str){
		if(str.length() > 128)
		{
			return false;
		}
		
		boolean[] bool = new boolean[256];
		for(int i=0; i<str.length();i++){
			int val = str.charAt(i);
			
			if(bool[val]){
				return false;
			}
			bool[val] = true;
				
		}
		
		return true;
	}

}
