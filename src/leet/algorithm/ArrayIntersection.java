package leet.algorithm;

import java.util.ArrayList;
import java.util.HashSet;


public class ArrayIntersection {

	public static void main(String[] args) {
			ArrayIntersection ref = new ArrayIntersection();
			int arr1[] = {1, 2, 3, 4};
			int arr2[] = {3, 4, 5, 6};
			int new_arr[] = ref.intersection(arr1, arr2);
			for(int i=0; i<new_arr.length; i++){
				System.out.println(new_arr[i]);
			}
			

	}
	
	public int[] intersection(int[] arr1, int[] arr2){
		HashSet<Integer> aSet = new HashSet<Integer>();
		ArrayList<Integer> intersect = new ArrayList<Integer>();
		
		for(int i : arr1){
			if(!aSet.contains(i)){
				aSet.add(i);
			}
		}
		
		for(int j : arr2){
			if(aSet.contains(j)){
				intersect.add(j);
			}
		}
		
		int result[] = new int[intersect.size()];
		int k = 0;
		for(int x : intersect){
			result[k++] = x;
		}
		
		return result;
	}

}
