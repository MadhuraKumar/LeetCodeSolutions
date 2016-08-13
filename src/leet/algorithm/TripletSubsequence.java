package leet.algorithm;

public class TripletSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripletSubsequence ref = new TripletSubsequence();
		int[] nums = {5,1,5,5,2,5,4};
		System.out.println(ref.increasingTriplet(nums));

	}
	
	public boolean increasingTriplet(int[] nums) {
		 if(nums == null || nums.length < 2){
	            return false;
	        }
	        
	        for(int i = 0; i<=nums.length - 3; i++){
	            int j= i+1;
	            int k= nums.length - 1;
	            
	            while(j<k){
	                if(nums[i]<nums[j]){
	                    if(nums[j]<nums[k]){
	                        return true;
	                    }
	                    else{
	                        k--;
	                    }
	                    
	                }
	                else{
	                    j++;
	                }
	                
	            }
	        }
	        
	        return false;
	        
	    }

}
