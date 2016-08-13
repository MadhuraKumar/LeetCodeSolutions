package leet.algorithm;

import java.util.Scanner;


public class StringSentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSentenceReverse ref = new StringSentenceReverse();
		String rev = "";
		System.out.println("Enter the string to reverse \n");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		rev = ref.reverseSentence(str);
		System.out.println("Reverse sentence is : " + rev);
		sc.close();
		
	}
	
	public String reverseSentence(String str){
		String rev = "";
		String[] line = str.split(" ");
		for(int i=0; i<line.length; i++){
			rev = rev + " " + reverse(line[i]);
			//rev = rev + " " + line[i];
		}
			
		return rev;
	}
	
	public String reverse(String s)
	{
		String rev = "";
		for(int i=s.length()-1 ; i>=0 ; i--){
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
