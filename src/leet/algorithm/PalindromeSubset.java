package leet.algorithm;

import java.util.HashMap;


public class PalindromeSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeSubset ref = new PalindromeSubset();
		int[] nums = {1,2,3,3,3,3,4,1};
		System.out.println(ref.paliSubset(nums));
	}
	
	public int paliSubset(int[] nums){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxLen = 0;
		boolean oddNumPresent = false;
		for(int i=0; i<nums.length; i++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i], 1);
			}
			else{
				map.put(nums[i], map.get(nums[i])+1);
			}
			
		}
		for(int x: map.values()){
			if(x%2 == 0){
				maxLen += x;
			}
			else{
				oddNumPresent = true;
			}
		}
		if(oddNumPresent){
			maxLen++;
		}
		return maxLen;
		
	}

}
