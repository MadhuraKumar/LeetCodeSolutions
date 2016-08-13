package leet.algorithm;


public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray ref = new RotateArray();
		int[] nums = {1,2,3,4,5};
		int[] res = ref.rotate(nums, 2);
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		

	}
	 public int[] rotate(int[] nums, int k) {
	        for(int i=0; i<k; i++){
	            rotateByOne(nums);
	        }
	        
	        return nums;
	    }
	    
	    public void rotateByOne(int[] nums){
	        int i;
	        int n = nums.length-1;
	        int temp = nums[n];
	        for(i=n; i>0; i--){
	            nums[i] = nums[i-1];
	        }
	        nums[i] = temp;
	    }
}
