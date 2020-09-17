//Vikas Bhat
// o(N) time complexity 


public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        int s=0;

        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=nums[s];
                s++;
            }
            
            else
            {
                arr[i]=nums[n];
                n++;
            }
        }
        
        return arr;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar=new int[] {2,5,1,3,4,7};
		int n=3;
		ShuffleArray vik= new ShuffleArray();
		System.out.println(vik.shuffle(ar, n));
		

	}

}
