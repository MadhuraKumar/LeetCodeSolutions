package leet.algorithm;

import java.util.HashSet;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		RemoveDuplicates ref = new RemoveDuplicates();
		int[] arr = {1,2,3,3,4,4,5,6,7,1,3,4};
		ref.removeDup(arr);

	}
	
	public void removeDup(int[] arr){
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0; i<arr.length; i++){
			if(set.add(arr[i])){
				System.out.println(arr[i]);
			}
		}
		
	}

}
