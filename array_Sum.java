// Vikas Bhat
// o(n) time Complexity
// o(1) space Complexity

public class array_Sum {
	public int[] runningSum(int[] nums) {

	    for(int i=1;i<nums.length;i++)
	    {
	        nums[i]=nums[i]+nums[i-1];
	    }
	    return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		array_Sum vik= new array_Sum();
		int[] arr= new int[]{1,2,3,4};
		System.out.println(vik.runningSum(arr));
		    

	}

}
