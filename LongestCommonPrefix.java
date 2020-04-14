// Vikas Bhat
// Longest Common Prefix



public class LongestCommonPrefix {

	public static String commonPrefix(String [] arr)
	{
		String strr= arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			while(arr[i].indexOf(strr)!=0)
			{
				strr=strr.substring(0,strr.length()-1);
			}
				
		}
		
		return strr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= {"flow","flush","fluke"};
		
		System.out.println(commonPrefix(arr));
	}

}
