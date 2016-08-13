package leet.algorithm;


public class AlphaToDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphaToDigit ref = new AlphaToDigit();
		String s = "AAA";
		System.out.println(ref.toDigit(s));
	}
	
	public int toDigit(String s) {
        int result= 0;
        int x = 0;
        
        for(int i =s.length() -1; i>= 0; i--){
        	char c = s.charAt(i);
            result += (int) Math.pow(26, x) * (c - 'A' + 1);
            x++;
        }
        
        return result;
    }

}
