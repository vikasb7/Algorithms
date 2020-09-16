// Vikas Bhat
// o(1) Space Complexity
// Remove vowels from string

public class RemoveVowels {


	    public String removeVowels(String S) {
	        
	        return S.replaceAll("[a,e,i,o,u]","");

	        
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveVowels vik=new RemoveVowels();
		String s="aeeeouuuveeeeeiaaaaakasss";
		System.out.println(vik.removeVowels(s));
	}

}
