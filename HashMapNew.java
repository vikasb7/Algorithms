
//Create HahMap with following features:
// 1.insert, 2.add specific integer to the values, 3.add specific integer to the keys, 4. get
import java.util.*;
public class HashMapNew {
	
	public long createHashMap(String[] s,int[][]a)
	
	{
		HashMap<Integer,Integer> map= new HashMap<>();
		ArrayList<Integer> lis=new ArrayList<>();
		HashMap<Integer,Integer> fin_map= new HashMap<>();
		ArrayList<Integer> fin_is= new  ArrayList<>();
		long sum=0;
			
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=="insert")
			{
				map.put(a[i][0],a[i][1]);
				lis.add(a[i][0]);
				System.out.println(map);
				

			}
			
			else if(s[i]=="addToValue")
			{
				System.out.println(map);
				System.out.println(lis);
				for(int j=0;j<lis.size();j++)
				{
					map.put(lis.get(j),map.get(lis.get(j))+a[i][0]); 
					
				}
				
				
			}
			
			else if(s[i]=="addToKey") 
			{ 
				ArrayList<Integer> temp=new ArrayList<>();
				for(int k: lis)
				{
					System.out.println(map.get(k));
					fin_map.put(k+a[i][0],map.get(k));
					temp.add(k+a[i][0]);
					
				}
				
				map.clear(); 
				map=(HashMap<Integer, Integer>) fin_map.clone();
				lis.clear();
				
				for(int g:temp)
				{
					lis.add(g);
				} 
				
			}
			
			else if(s[i]=="get")
			{
					fin_is.add(map.get(a[i][0]));
		
				
			}
		}
		 
		System.out.println(map);
	
		for(int vi:fin_is)
		{
			sum+=(long) vi;
		}
		
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= new String[]{"insert", 
				 "insert", 
				 "addToKey", 
				 "addToKey", 
				 "addToKey", 
				 "insert", 
				 "addToValue", 
				 "addToKey", 
				 "addToKey", 
				 "get"};
		int[][] arr1=new int[][] {{-5,-2}, 
			 {2,4}, 
			 {-1}, 
			 {-3}, 
			 {1}, 
			 {3,-2}, 
			 {-4}, 
			 {-2}, 
			 {2}, 
			 {-8}}; 
		HashMapNew vik= new HashMapNew();
		System.out.println("The answer is: " + vik.createHashMap(arr, arr1));
		
	}

}
   