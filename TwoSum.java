//Vikas Bhat
// O(n) running time


import java.util.HashMap;

public class TwoSum {
	
	public static int[] twoSum(int[] arr, int target) {
		    int[] ans = new int[2];
		    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		    for (int i = 0; i < arr.length; i++) {
		        if (map.containsKey(target - arr[i])) {
		        	ans[1] = i;
		        	ans[0] = map.get(target - arr[i]);
		            return ans;
		        }
		        map.put(arr[i], i);
		    }
		    return ans;
		}
	
	public static void main(String args[])
	{
		
		int target=9;
		int[] arr= {2,7,11,15};
		twoSum(arr,target);	
	}


}
