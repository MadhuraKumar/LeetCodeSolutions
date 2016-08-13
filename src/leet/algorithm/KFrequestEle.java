package leet.algorithm;

import java.util.Arrays;


public class KFrequestEle {
	
	public static void main(String[] args){
		KFrequestEle ref =  new KFrequestEle();
		int[] arr = {1,2};
		int[] res = ref.topKFrequent(arr, 1);
		for(int i=0; i<res.length; i++){
			System.out.println(res[i]);
		}
	}
	
	    public int[] topKFrequent(int[] nums, int k) {
	        Arrays.sort(nums);
	        int[] arr = new int[k];
	        int[] res = new int[k];
	        //int min_count;
	        int count = 0;

	        if(nums.length == 1){
	            arr[0] = nums[0];
	            return arr;
	        }
	        
	        Arrays.fill(res, 0);
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]!=nums[i-1] && i != nums.length-1){
	                int freq = i+1;
	                if(count < k){
	                    arr[count] = nums[i];
	                    res[count] = freq;
	                    count += 1;
	                    }
	                
	                else{
	                    for(int j=0; j<res.length; j++){
	                        if(res[j] < freq){
	                        res[j] = freq;
	                        arr[j] = nums[i];
	                        break;
	                         }
	                    }
	                }
	                
	             }
	             else if(i == nums.length - 1){
	            	 if(count<k){
	                    arr[count] = nums[i];
	                    //break;
	            	 }
	            	 else{
	            		 return arr;
	            	 }
	               }
	          }
	        return arr;
	        
	    }
	}




