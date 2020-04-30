// Vikas Bhat
// remove element
// O(n) time complexity 
// O(1) space complexity


public class RemoveElement {

	 static  int del_element(int[] res, int v)
	{	
	        int count=0;
	        for(int i=0;i<res.length;i++)
	        {
	            if(res[i]!=v)
	            {
	            	res[count]=res[i];
	                count++;
	            }
	        }
	        
	        return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {1,2,2,1,2,3,4,2};
		int val= 2;
		System.out.println(del_element(arr,val));
		

	}

}
