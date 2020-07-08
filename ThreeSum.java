// Vikas Bhat
// 3 sum
// a+b+c=0

import java.util.*;

public class ThreeSum {
	
	public	List<List<Integer>> threesom(int[] nums)
	{
List<List<Integer>> res= new LinkedList ();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
            int s=i+1;
            int e=nums.length-1;
            int sum=0-nums[i];
            
            while(e>s)
            {
                if(nums[s]+nums[e]==sum){
                    res.add(Arrays.asList(nums[i],nums[s],nums[e]));
                    while(s<e && nums[s]==nums[s+1]) 
                        s++;
                    while(s<e && nums[e]==nums[e-1])
                        e--;
                    e--;
                    s++;
                        
                    }
                else if(nums[s]+nums[e]>sum)
                    e--;
                else
                    s++;
                    
                    
            }
            
            
        }
        }
        
        return res;
		
	}
 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreeSum ans= new ThreeSum();
		int[] arr= new int[] {-2,0,0,2,2};

		System.out.println(ans.threesom(arr));
		
		
		
		
		

	}

}
