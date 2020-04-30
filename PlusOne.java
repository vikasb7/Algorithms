// Vikas Bhat
// Add one
// [1,2,3] -> [1,2,4] as 123+1=124


public class PlusOne {
	
	public static int [] addone(int[] res)
	{
		for(int i=res.length-1;i>=0;i--)
		{
			if(res[i]<9)
			{
				res[i]++;
				return res;
			
			}
			res[i]=0;
		
		}
	
	int[] arr= new int[res.length+1];
	arr[0]=1;
	return arr;
	}
	
public static void main(String args)
{
	int[] arr = new int []{1,2,3,4};
	addone(arr);
	
}

}
