//Given an array of integers, return indices of the two numbers such 
that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and 
you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return


		
public class mainTest {

	
	public static void main(String[] args) {
	
		int[] nums = {2,7,11,15};
		
		int target = 9;
		
		methodClass mc = new methodClass();
		
		int[] solution = mc.twoSum(nums, target);
		
		System.out.println(solution[0] + ", " + solution[1]);
	}
	
	

	
	//
	
	
	
}


