Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

import java.util.HashMap;
import java.util.Map;

public class methodClass {

        public int[] twoSum(int[] nums, int target) {


                Map<Integer, Integer> map = new HashMap<>();

                for(int i = 0; i < nums.length; ++i) {
                        map.put(nums[i], i);
// value is index of nums[i]
                }


                for(int i = 0; i < nums.length; ++i) {

                        int compare = target - nums[i];         // give
us the value that we want to search for

                        if(map.containsKey(compare) && map.get(compare)
!= i ) {        // if map contains this element and its not the current

// element i.e. dont use element twice
                                return new int[] {i , map.get(compare)};
                        }

                }

                throw new IllegalArgumentException(" No such values
exist in given array ");


        }




}


