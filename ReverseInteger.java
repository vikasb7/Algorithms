// Vikas Bhat
// Reverse Integer version 1 
// the code will not work if the given input size is not within the 32-bit signed integer range


public class ReverseInteger {
	
	public static int reverse(int n)
	{
		int sign= 1;
		
		if(n<0)
		{
			sign=-1;
			
		}
		
		long sum=0;
 
		while(n!=0)
		{
			sum= sum*10+n%10;
			if(sum>Integer.MAX_VALUE || sum< Integer.MIN_VALUE)
			{
				return 0;
				
			}
			
			
			
			n=n/10;
		}
		return (int) sum;
		
	}
	
	

	public static void main(String[] args) 
	
	{
		int n=1534236469;
		System.out.println(reverse(n));
		
		
		
	}
}
