package leet.algorithm;


public class StringNumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringNumCount ref = new StringNumCount();
		String str = "ItsOn 123, is 67 : hiring98";
		System.out.println(ref.countNum(str));

	}
	
	public int countNum(String str){
		int len = str.length() -1;
		int sum = 0;
		for(int i=0; i<=len; i++){
			if(isNum(str.charAt(i))){
				sum += Integer.parseInt(Character.toString(str.charAt(i)));
			}
		}
		
		return sum;
	}
	public boolean isNum(char c){
		if(c >= '0' && c <= '9'){
			return true;
		}
		return false;
		 
	}

}
