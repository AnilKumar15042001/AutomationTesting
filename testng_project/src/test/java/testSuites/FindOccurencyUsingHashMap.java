package testSuites;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindOccurencyUsingHashMap {

	public static void main(String[] args) {
		
		int[] arr={1,1,1,3,2,2,2,2,0,0,0};
		HashMap<Integer,Integer> map=new HashMap();
		int count=1;
		for(int ar:arr)
		{
			if(!map.containsKey(ar))
			{
				map.put(ar, count);
			}
			else
			{
				map.put(ar, map.get(ar)+count);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}
