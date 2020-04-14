// Vikas Bhat
// Single Number
//O(n) time complexitys


public class SingleNumber {
	
	public static int check_single(int [] arr)
	{
		int temp= arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			temp= temp^ arr[i];
		}
		return temp;
	}
	
	public static void main(String[] args) 
	{
		int [] arr= {1,2,1,2,3,4,4,3};
		System.out.println(check_single(arr));
	}

}
