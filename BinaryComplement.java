// Vikas Bhat
// Complement of decimal 
// 5-> 101 -> 010 -> 2
// O(n) time complexity 

public class BinaryComplement {
	public static char helper(char c)
	{
        return (c == '0') ? '1' : '0'; 

	}
	
	
	public static int dex_compliment(int num)
	{
		String s=Integer.toBinaryString(num);
        int len= s.length();
        String res="";
        for (int i = 0; i < len; i++) 
        { 
            res = res+ helper(s.charAt(i)); 
        } 
		
        int ans=Integer.parseInt(res,2);
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println(dex_compliment(num));

}
}
