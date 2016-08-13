package leet.algorithm;


public class DigiststoAlpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigiststoAlpa ref = new DigiststoAlpa();
		int  i  = 53;
		System.out.println(ref.IntToLetters(i));

	}
	
	public char convert(int i){
		String digits = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] ch = digits.toCharArray();
		
		if(i <= 26){
			return ch[i-1];
		}
		return 0;
	}
	
	public String IntToLetters(int value)
	{
	    String result = "";
	    while (--value >= 0)
	    {
	        result = (char)('A' + value % 26 ) + result;
	        value /= 26;
	    }
	    return result;
	}

}
