package leet.algorithm;

import java.util.Scanner;


public class MoveZeros {

	public static void main(String[] args) {
		MoveZeros ref = new MoveZeros();
		int[] arr = new int[5];
		System.out.println("Enter elements of the array :");{
			for(int i=0 ;i<arr.length; i++){
				Scanner sc = new Scanner(System.in);
				arr[i]= sc.nextInt();
			}
		}
		
		int new_arr[]= ref.move(arr);
		System.out.println("Elements after moving Zeros are:");
		for(int j=0; j<new_arr.length; j++){
			System.out.println(new_arr[j]);
		}

	}

	private int[] move(int[] arr) {
		int i= 0;
		int j= 0;
		
		while(j< arr.length){
			if(arr[j] ==0){
				j++;
			}
			else{
				arr[i] = arr[j];
				i++;
				j++;
			}
		}
		while(i<arr.length){
			arr[i] = 0;
			i++;
		}
		return arr;
	}

}
