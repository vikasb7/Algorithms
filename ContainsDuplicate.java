// Vikas Bhat
// Check if array contains duplicate values
// O(n) time complexity
import java.util.*; 
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int [] {1,2,2,3};
		System.out.println(ContainsDuplicate(arr));
	}

	private static boolean ContainsDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
	    
		for(int i=0;i<nums.length;i++)
		{
			set.add(nums[i]);
		}
	    
	    return set.size()!=nums.length;

	}

}
