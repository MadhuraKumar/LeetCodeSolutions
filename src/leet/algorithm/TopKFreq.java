package leet.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class TopKFreq {

			public static void main(String[] args){
				TopKFreq ref =  new TopKFreq();
				int[] arr = {1,1,1,2,2,3,3};
				ref.topKFrequent(arr, 2);
				/*for(int i=0; i<res.length; i++){
					System.out.println(res[i]);
				}*/
			}
			
			    public void topKFrequent(int[] nums, int k) {
			    	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
			    	ArrayList<ElementVal> list = new ArrayList<ElementVal>();
			    	for(int i=0; i<nums.length; i++){
			    		if(map.containsKey(nums[i])){
			    			map.put(nums[i], map.get(nums[i]) + 1);
			    		}
			    		else{
			    			map.put(nums[i], 1);
			    		}
			    	}
			    	
			    	for(int key : map.keySet()){
			    		list.add(new ElementVal(key, map.get(key)));
			    	}
			    	
			    	Collections.sort(list);
			    	for(int j=0; j<k; j++){
			    		System.out.println(list.get(j).key);
			    	}
					//return nums;
			    	
			    }
			    

		public class ElementVal implements Comparable<ElementVal>{
			int key;
			int count;
			
			public void increment(){
				this.count++;
				
			}
			
			public ElementVal(int key, int count){
				this.key = key;
				this.count = count;
			}
			
			public int getKey() {
				return key;
			}
			public void setKey(int key) {
				this.key = key;
			}
			public int getCount() {
				return count;
			}
			public void setCount(int count) {
				this.count = count;
			}
			
			@Override
			public int compareTo(ElementVal obj){
				
				return obj.count - this.count;
				
			}

			@Override
			public boolean equals(Object obj) {
				// TODO Auto-generated method stub
				
				return this.key ==((ElementVal)obj).key;
			}
			
			
			
		}
	}

