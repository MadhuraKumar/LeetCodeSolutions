package leet.algorithm;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample ref = new Sample();
		ref.fun();  

	}
	
	public void fun()
	{
	   int arr[] = {7,5,6,3,4,1,2,9,11};
	   
	   for(int i=0; i<arr.length; i++){
		   for(int j= i+1; j<arr.length; j++){
			   if(arr[i] <arr[j]){
				   arr[i] = arr[j];
				   break;
			   }
		   }
	   }
	   
	   for(int i=0; i<arr.length; i++){
		   System.out.println(arr[i]);
	   }
	}

}
