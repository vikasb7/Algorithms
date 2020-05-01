// Vikas Bhat
// Check if the given string is Palindrome


public class PalindriomeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A man, a plan, a canal -- Panama";
		System.out.println(checkPal(str));
	}

	private static boolean checkPal(String str) {
		// TODO Auto-generated method stub
		String m= str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		char[] s= m.toCharArray();
		String ans1="";	
		
		for(int i=s.length-1;i>=0;i--)
		{
			ans1+=s[i];
		}
		
		if(ans1.indexOf(m)==0)
		{
			return true;
		}
		return false;
	}
}
