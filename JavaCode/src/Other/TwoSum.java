package Other;

import java.util.HashMap;
import java.util.Map;

/**
 * 针对与给定的数组nums和目标值target
 * 返回数组中两个相加之和等于目标值的下标
 *
 * 例如：
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    public static int[] sumOne(int[] nums,int target){
        for(int i = 0 ; i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if(target == nums[i] + nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no result");
    }

    public static int[] sumTwo(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no result");
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,11};
        int target = 9;
        int[] result = sumOne(nums,target);
        int[] result2 = sumTwo(nums,target);
        System.out.println(result[0]+"+"+result[1]);
        System.out.println(result2[0]+"+"+result2[1]);
    }
}
