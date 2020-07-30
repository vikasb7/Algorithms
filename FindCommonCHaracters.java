//Vikas Bhat
// Find Common Characters
// 1) using Hashmaps
//  2) using arrays

import java.util.*;

public class FindCommonCHaracters {

	    public List<String> commonChars(String[] A) {
	        
	        List<String> res = new ArrayList<>();
	        
	        Map<Character, Integer> res_map = new HashMap<>();
	        
	        for(String s : A)
	        {
	            Map<Character, Integer> temp_map = new HashMap<>();
	            
	            for(char c : s.toCharArray())
	            	
	                temp_map.put(c, temp_map.getOrDefault(c,0)+1);

	            
	            if(res_map.isEmpty()){
	                 for(Character c : temp_map.keySet())
	                	 res_map.put(c, temp_map.get(c));
	            }
	            else{
	                for(Character c : res_map.keySet()){
	                    int nval = temp_map.getOrDefault(c,0);        
	                    res_map.put(c, Math.min(res_map.get(c),nval));
	                }
	            }
	        }
	        for(Character c : res_map.keySet()){
	            for(int i=1;i<=res_map.get(c);i++)
	                res.add(String.valueOf(c));
	        }
	        return res;
	    }
	    
	    public List<String> commonChars1(String[] a) {
	        
	        int[] temp1 = new int[26];
	        
	            for(char ch : a[0].toCharArray())
	                temp1[ch-'a']++;
	            
	        for(int i=1; i < a.length; i++)
	        {
	                int[] temp2 = new int[26];
	                
	                for(char ch : a[i].toCharArray())
	                {
	                    
	                    if(temp1[ch-'a'] > 0){
	                        temp2[ch-'a']++;
	                        temp1[ch-'a']--;
	                    }
	                }
	                temp1 = temp2;
	            }
	        
	            List<String> res = new LinkedList<>();
	        
	            for(int i=0; i < temp1.length; i++)
	                while(temp1[i]-- > 0)
	                   res.add(Character.toString((char)97+i));
	            
	        return res;
	        }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] v= new String[] {"bella","label","roller"};
		FindCommonCHaracters d=new FindCommonCHaracters();
		System.out.println(d.commonChars(v));
		System.out.println(d.commonChars1(v));

	}

}
