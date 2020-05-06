//Vikas Bhat
// Majority Element 
// O(n) Time Complexity

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= new int []{2,2,1,1,2,2};
		
		System.out.println(major_element(arr));
	}

	private static int major_element(int[] arr){
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map= new HashMap<>();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				count=map.get(arr[i])+1;
			}
			else
			{
				count=1;
			}
			if(count> arr.length/2)
			{
				return arr[i];
			}
			map.put(arr[i], count);
		}
		return -1;
		
	}
	


}
