package step10_Ajax;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class algorithm {

	public static void main(String[] args) {

		int[] nums = {3,3,3,2,2,2};
		
		Set<Integer> set = new HashSet<>();
		int select = nums.length/2;
		
		for(int i=0; i<nums.length; i++)
			set.add(nums[i]);
		
		if(set.size()>=select) {
			System.out.println(select);
		} else {
			System.out.println(set.size());
		}
		
		
		
//		Iterator it = set.iterator();
//		
//		int num2[] = new int[set.size()];
//		int j=0;
//		while(it.hasNext()) {
//			num2[j] = (int)it.next();
//			j++;
//		}
//		
		
		
		
		
	}
}
