package leet.algorithm;

import java.util.Scanner;


public class ReverseArray {

		    public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("Enter n: ");
		        int n = sc.nextInt();
		        int arr[] = new int[n];
		        for(int i = 0; i<arr.length; i++){
		            arr[i] = sc.nextInt();
		        }
		        
		        int rev[] = new int[arr.length];
		        
		        for(int i= arr.length -1; i>= 0 ; i--){
		            
		            rev[i] = arr[arr.length -1 - i];
		        }
		        
		        for(int j = 0; j<rev.length ; j++){
		            System.out.print(rev[j]+ " ");
		        }
		    }

	}


