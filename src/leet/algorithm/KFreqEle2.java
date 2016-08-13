package leet.algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class KFreqEle2 {

		public static void main(String[] args){
			KFreqEle2 ref =  new KFreqEle2();
			int[] arr = {1,1,2,2,3,3};
			ref.topKFrequent(arr, 2);
			/*for(int i=0; i<res.length; i++){
				System.out.println(res[i]);
			}*/
		}
		
		    public ArrayList<Integer> topKFrequent(int[] nums, int k) {
		    	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		    	ArrayList<ElementVal> list = new ArrayList<ElementVal>();
		    	ArrayList<Integer> res = new ArrayList<Integer>();
		    	for(int i=0; i<nums.length; i++){
		    		if(list.contains(new ElementVal(nums[i], 1))){
		    			list.get(list.indexOf(new ElementVal(nums[i], 1))).increment();
		    		}
		    		else{
		    			list.add(new ElementVal(nums[i], 1));
		    		}
		    	}
		    	
		    	
		    	Collections.sort(list);
		    	for(int j=0; j<k; j++){
		    		res.add(list.get(j).key);
		    	}
				return res;
		    	
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
			
			return this.count - obj.count;
			
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			
			return this.key ==((ElementVal)obj).key;
		}
		
		
		
	}
}
