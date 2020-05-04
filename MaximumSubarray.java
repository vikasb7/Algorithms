// Vikas Bhat
// Maximum Subarray
// {-2,1,-3,4,-1,2,1,-5,4} -> 4-1+2+1 -> 6, which is larger subarray sum
// O(n) time complexity 

public class MaximumSubarray {
	
	public static int max_subarr(int [] nums)
	{
        int res=nums[0];
        int larger=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            larger= Math.max(nums[i]+larger,nums[i]);
            res= Math.max(larger, res);
            
        }
        return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(max_subarr(a));

	}

}
