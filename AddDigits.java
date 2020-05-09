// Vikas Bhat
// Add digits till it becomes a single digit
// 28= 2+8->10->1+0->1


public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=28;
		System.out.println(addDigits(n));
		

	}
	
	public static int addDigits(int n) {
        	int ans=0;
        
        	while(n>9)
        	{
        		while(n>0)
        		{
        			int r=n%10;
        			ans+=r;
        			n=n/10;
                
        		}
        		n=ans;
        		ans=0;
        	}
        	return n;
        	
	}
				

}
