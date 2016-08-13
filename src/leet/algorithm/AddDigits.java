package leet.algorithm;


public class AddDigits {
	public static void main(String args[]){
		AddDigits addDigits = new AddDigits();
		System.out.println(addDigits.addDigits(38));
	}
	 public int addDigits(int num) {
	    int sum=0;
	    String stringValueOf = String.valueOf(num);
	    for(int i=0; i<stringValueOf.length(); i++){
	        sum = sum + (stringValueOf.charAt(i)-'0');
	    }
	 
	    if(sum < 10){
	        return sum;
	    }else{
	        return addDigits(sum);
	    }
	 }
}
