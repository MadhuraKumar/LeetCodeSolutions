package leet.algorithm;


public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray ref = new MergeSortedArray();
		int[] nums1 = {1,2,5,7, 0 ,0,0, 0};
		int[] nums2 = {3,4,6,8};
		ref.merge(nums1, 4 , nums2, nums2.length);
		}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int k = 0;

        for(int i = 0; i<nums1.length ; i++){
            if(nums1[i] < nums2[j]){
                continue;
             }
            else{
                for(k=m-1 ;k>= i; k--){
                    nums1[k+1] = nums1[k];
                }
                
                nums1[i] = nums2[j];
                j++;
                m++;
                
            }
        }


	}

}
