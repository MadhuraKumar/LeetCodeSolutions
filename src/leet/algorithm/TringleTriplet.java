package leet.algorithm;

import java.util.ArrayList;



public class TringleTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TringleTriplet ref = new TringleTriplet();
		int[] nums = {10,5,3,4,7,1};
		ref.tripletSeq(nums);

	}
	
	public void tripletSeq(int[] nums){
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i= 0; i<nums.length-2; i++){
			int j = i+1;
			int k = j+1;
			
			while(j<k && k<nums.length -1){
				if(((nums[i]+nums[j]) > nums[k]) &&
					((nums[j]+nums[k]) > nums[i])&&
					((nums[i]+nums[k]) > nums[j])){
					    ArrayList<Integer> l = new ArrayList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[k]);
						list.add(l);
						j++;
						k++;
					}
				else{
					j++;
					k++;
					
				}
			}
		}
		
		for(ArrayList<Integer> x: list){
			System.out.println(x.toString());
			
		}
	}

}
