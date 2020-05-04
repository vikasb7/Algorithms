// Vikas Bhat
// Happy Number using recursion
//Input: 19
//Output: true
//Explanation: 
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1

import java.util.*; 
public class HappyNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;


		System.out.println(happyNumber(num));
		
	}

	private static boolean happyNumber(int num) {
		int s=0;
		int ans=0;
		Set<Integer> set = new HashSet<Integer>();
		return helper(num,s,ans,set);
		


		// TODO Auto-generated method stub
		
	}

	public static boolean helper(int num, int s, int ans, Set<Integer> set) {
		// TODO Auto-generated method stub
		if(num==1)
		{
			return true;
		}
		else if(num<0)
		{
			return false;
		}
		while(num>0)
		{
			s= num%10;
			ans+=Math.pow(s,2);
			num=num/10;
		}
		
		if(set.contains(ans))
		{
			return false;
		}
		set.add(ans);
		//System.out.println(ans);
		return helper(ans,0,0,set);
		
		
	}

}
