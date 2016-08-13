package leet.algorithm;

import java.util.HashMap;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

/**
* Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

public class IsAnagram {
	/**
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
		// return if length is not same
	    if(s.length()!=t.length())
	        return false;
	 
	    // Loop over first string and increment array counter
	    int[] arr = new int[26];
	    for(int i=0; i<s.length(); i++){
	        char c1 = s.charAt(i);
	        arr[c1-'a']++;
	    }
	 
	    // Check the second string for count
	    for(int i=0; i<s.length(); i++){
	        char c2 = t.charAt(i);
	        if(arr[c2-'a'] == 0){
	            return false;
	        }else{
	            arr[c2-'a']--;
	        }
	    }
	 
	    // If everything is not set to 0 return false
	    for(int i=0; i<26; i++){
	        if(arr[i]!=0){
	            return false;
	        }
	    }
	 
	    // else default to true
	    return true;
	}
	/**
	 * A different version for the same problem.
	 * @param string1
	 * @param string2
	 * @return
	 */
	public boolean isAnagram1(String string1, String string2) {
	    if(string1.length()!=string2.length())
	        return false;
	 
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();    
	 
	    for(int i=0; i<string1.length(); i++){
	        char c1 = string1.charAt(i);
	        if(map.containsKey(c1)){
	            map.put(c1, map.get(c1)+1);
	        }else{
	            map.put(c1,1);
	        }
	    }
	 
	    for(int i=0; i<string1.length(); i++){
	        char c2 = string2.charAt(i);
	        if(map.containsKey(c2)){
	            if(map.get(c2)==1){
	                map.remove(c2);
	            }else{
	                map.put(c2, map.get(c2)-1);
	            }
	        }else{
	            return false;
	        }    
	    }
	 
	    if(map.size()>0)
	        return false;
	 
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAnagram ref = new IsAnagram();
		System.out.println("Enter string 1: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Enter String 2: ");
		String str2 = sc.nextLine();
		System.out.println(ref.isAnagram(str1, str2));
		Assert.assertEquals(true, ref.isAnagram(str1, str2));

	}
	
	
	@Test
	public void testAnagram(){
		IsAnagram ref = new IsAnagram();
		Assert.assertEquals(true, ref.isAnagram("abc", "abc"));
		Assert.assertEquals(false, ref.isAnagram("abccba", "abc"));
	}
}
