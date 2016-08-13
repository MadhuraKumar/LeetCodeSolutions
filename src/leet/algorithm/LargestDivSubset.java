package leet.algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;


public class LargestDivSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestDivSubset ref = new LargestDivSubset();
		int[] arr = {1,2,3};
		ArrayList<Integer> res= ref.largestDivisibleSubset(arr);
		for(int i : res){
			System.out.println(i);
		}

	}
	
	public ArrayList<Integer> largestDivisibleSubset(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        
        for(int i= 0; i<nums.length ; i++){
            //int s = nums[i];
            arr1.add(nums[i]);
            for(int j= 0; j<nums.length; j++){
                
                for(int k=0 ;k < arr1.size(); k++){
                 int res = arr1.get(k);
                 if(res != nums[j] && ((res % nums[j] ==0) || (nums[j] % res == 0))){
                	 continue;
                 }
                 
                }
                
               // arr1.add(nums[j]);
            }
        }
        return arr1;
	}
}


