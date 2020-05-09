// Vikas Bhat
// Check if the given integer is a perfect square 
// O(n) time complexity 

public class PerfectSquare {
	public static void main(String[] args) {	
		int n=36;
		System.out.println(perfectSq(n));
		
	}

	private static boolean perfectSq(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0 && n/i==i)
			{
				return true;
			}
			
		}
		
		return false;
		
	}

}
