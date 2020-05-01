// Vikas Bhat
// Length of last word in a given string
// "Hello World" -> 5


public class LengthLastWord {
	
public static int lengthOfLastWord(String s) {
		
		String[]arr=s.split(" ");
		
		if(arr.length==1)
		{
			return arr[0].length();
			
		}
		
		else if(arr.length>1)
		{
			return arr[arr.length-1].length();
		}
		
		else
		{
			return 0;
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello far  ";
		System.out.println(lengthOfLastWord(s));
		

		
	}

}
