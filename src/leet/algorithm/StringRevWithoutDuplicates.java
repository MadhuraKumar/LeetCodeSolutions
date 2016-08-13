package leet.algorithm;

import java.util.HashSet;
import java.util.Set;


public class StringRevWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRevWithoutDuplicates ref = new StringRevWithoutDuplicates();
		int[] arr = {1,2,3,4,4,5,5,6,7,8,8,9};
		
		int[] rev = ref.reverse(arr);
		
		for(int i=0; i< rev.length; i++)
		{
			System.out.println(rev[i]);
		}
		
		
	}
	
	public int[] reverse(int[] arr){
		int[] revArr = new int[arr.length];
		Set<Integer> set = new HashSet<Integer>();
		int newLength = revArr.length;
		int length = arr.length;
		System.out.println(length);
		
		for(int i=length-1; i>=0 ; i--){
			if(set.add(arr[i])){
				revArr[newLength-i-1] =  arr[i];
			}
			else{
				
				newLength--;
			}
		}
		return revArr;
	}

}
