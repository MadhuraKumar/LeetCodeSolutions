package leet.algorithm;

import java.util.HashMap;
import java.util.HashSet;


public class ArrItersection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrItersection2 ref = new ArrItersection2();
		int arr1[] = {1, 2, 2, 1};
		int arr2[] = {2, 2};
		int new_arr[] = ref.intersection(arr1, arr2);
		for(int i=0; i<new_arr.length; i++){
			System.out.println(new_arr[i]);
		}

	}
	
	public int[] intersection(int[] arr1, int[] arr2){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<arr1.length; i++){
			if(!map.containsKey(arr1[i])){
				map.put(arr1[i], 1);
			}
			else{
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}
		}
		
		for(int j=0; j<arr2.length; j++){
			if(map.containsKey(arr2[j])){
				if((map.get(arr2[j]) >= 1)){
					map.put(arr2[j], map.get(arr2[j]) - 1);
					set.add(arr2[j]);
				}
			}
		}
		
		int[] result = new int[set.size()];
		int k =0;
		for(int x : set){
			result[k++] = x;	
		}
		
		
		return result;
		
	}

}
