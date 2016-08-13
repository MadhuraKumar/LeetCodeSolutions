package leet.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class WordPatternMatch {

	public static void main(String[] args) {
		WordPatternMatch ref = new WordPatternMatch();
		System.out.println("Enter Pattern: ");
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println(ref.wordMatch(pattern ,str));

	}

	/* "abba" matches "dog cat cat dog"
	 * "aaaa" matches "dog dog dog dog"
	 * "abba" doesnt match "dog cat cat fish"
	 */
	private boolean wordMatch(String pattern, String str) {
		String [] arr = str.split(" ");
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		for(int i= 0; i<arr.length; i++){
			char character = pattern.charAt(i);
			String s = arr[i];
			if(map.containsKey(character)){
				if(!map.get(character).equals(s)){
					return false;
				}
			}
			else{
				if(map.containsValue(s)){
					return false;
				}
				
				map.put(character,  s);
			}
		}
		
		return true;
		
	}

}
