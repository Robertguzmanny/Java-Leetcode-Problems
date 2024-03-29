import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twosum(int[] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)){
                return new int[] { prevMap.get(diff), i};
            }
            prevMap.put(num, i);

        }
        return new int[] {};
    }

    public static void main (String[] args){
        TwoSum solution = new TwoSum();
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(solution.twosum(nums1, target1)));
    }
}
