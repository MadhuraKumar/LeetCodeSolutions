package leet.algorithm;

import java.util.HashMap;


public class SubStringLen {

	public static void main(String[] args) {
		String str = "ABCGRETCABCG";
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i+2<str.length(); i++){
			String subStr = str.substring(i, i+3);
			if(!map.containsKey(subStr)){
				map.put(subStr, 1);
			}
			else{
				map.put(subStr, map.get(subStr) + 1);
			}
		}
		
		System.out.println(map.toString());
		
	}

}
