// Vikas Bhat
// Valid Parentheses


import java.io.*; 
import java.util.*; 

public class ValidParentheses {
	
	public static boolean checkvalid(String s)
	{
		
		if(s.length()%2!=0)
		{
			return false;
		}
		
		
		Stack<Character> st = new Stack<Character>();
		
		
		
		for(char c: s.toCharArray())
		{
			if(c == '(' || c =='{' || c =='[')
			{
				st.push(c);
				
			}
			
			else if(c==')' && !st.isEmpty() && st.peek()=='(')
			{
				st.pop();
				
			}
			
			else if(c=='}' && !st.isEmpty() && st.peek()=='{')
			{
				st.pop();
			}
			
			else if(c==']' && !st.isEmpty() && st.peek()=='[')
			{
				st.pop();
			}
				
		}
		
		return st.empty();
		
	}
	
	
	
	public static void main(String args[])
	{
		String s= "(]";
		System.out.println(checkvalid(s));
		
		
	}
}
