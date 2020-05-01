// Vikas Bhat
// check if the given substring is present in a string
// s1= needle, s2= ee, the result will be 1


public class strStr {
	
	public static int checkStr(String s1, String s2)
	{
		return s1.indexOf(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "need";
		String s2="ee";
		System.out.println(checkStr(s1,s2));

	}

}
