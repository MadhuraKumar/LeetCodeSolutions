package leet.algorithm;

import java.util.ArrayList;
import java.util.Scanner;


public class ReverseStringVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringVowel ref = new ReverseStringVowel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String rev = ref.stringReverse(str);
		System.out.println("Reverse String is: " + rev);
			
		

	}
	
	private String stringReverse(String str){
		ArrayList<Character> vowel = new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		vowel.add('A');
		vowel.add('E');
		vowel.add('I');
		vowel.add('O');
		vowel.add('U');
		
		char[] arr = str.toCharArray();
		int i=0;
		int j= str.length()-1;
		
		while(i<j){
			if(!vowel.contains(arr[i])){
				i++;
				continue;
			}
			
			if(!vowel.contains(arr[j])){
				j--;
				continue;
			}
			
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		return new String(arr);
	}

}
