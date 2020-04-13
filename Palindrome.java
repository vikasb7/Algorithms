// Vikas Bhat
// Checks if the given integer is palindrome

public class Palindrome {

	public static boolean check_palindrome(int x)
	{
		int rev=0;
		int y=x;
		
		while(y!=0)
		{
			rev=rev*10+y%10;
			y=y/10;
		}
		
		return rev==x;
		
	}
	public static void main(String[] args) {
		int x=121;
		System.out.println(check_palindrome(x));

	}

}
