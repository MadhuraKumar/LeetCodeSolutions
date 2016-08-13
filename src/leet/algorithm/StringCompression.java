package leet.algorithm;


import java.util.Scanner;


public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression ref = new StringCompression();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to compress : \n");
		String str = sc.nextLine();
		System.out.println("The compresses string is : " + ref.stringCompression(str)); 
		sc.close();
	}
	
	public String stringCompression(String str){
		String compress = "";
		//int i = 0;
		char val = str.charAt(0);
		int count = 1;
		for(int i=1; i<str.length(); i++){
			if(val == str.charAt(i)){
				count++;
			}
			else{
				compress += val + String.valueOf(count);
			    val = str.charAt(i);
			    count = 1;
			}
		}
		
		return compress + val + count;
	}

}
