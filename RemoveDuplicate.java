// Vikas Bhat
// This code finds the duplicates in an array and return the length of new array without any duplicates
// O(n) time complexity
// O(1) space complexity 



public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		int[] arr1= {0,0,1,1,1,2,2,3,3,4};
		System.out.print(remove_dup(arr1));
		

	}

	public static int remove_dup(int[] arr1) {
		// TODO Auto-generated method stub
		
		int i=0;
		
        for (int j = 1; j < arr1.length; j++) {
            
        	if (arr1[j] != arr1[i]) {
        		//System.out.println(++i);
            	arr1[++i] = arr1[j];
            }
        }
		return i+1;
		
		
	}


}
