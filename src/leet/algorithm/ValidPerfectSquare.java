package leet.algorithm;

import java.util.Scanner;


public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPerfectSquare ref = new ValidPerfectSquare();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		System.out.println(ref.isPerfectSquare(num));

	}

	public boolean isPerfectSquare(int num) {
        int low =0;
        int high = num/2;
        while(low <= high){
            int mid = (low + high) / 2;
            int res = mid * mid;
            if(res == num){
                return true;
            }
            else if (res > num){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return false;
    }
}
