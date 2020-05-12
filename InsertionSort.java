// Insertion Sort
// Best case: o(n)
// Worst case: o(n^2)
// Avg cases= o(n^2)

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int [] {25,30,15,2};
		
		for(int i=1;i<arr.length;i++)
		{
			
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && key<arr[j])
			{
				int temp= arr[j];
				 arr[j]= arr[j+1];
				arr[j+1]= temp;
				j--;
			}
		}
		
		for(int k:arr)
		{
			System.out.println(k);
		}
		


	}

}
