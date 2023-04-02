package dataStructure;

import java.util.Arrays;

public class TwoSum {
    public static void  main(String[] args) {
        Integer[] nums = {3,2,4};
        int target = 6;
        int[] output = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int value = target - nums[i];
            if (Arrays.asList(nums).contains(value) && Arrays.asList(nums).indexOf(value) !=i) {
                output[0] = i;
                output[1] = Arrays.asList(nums).indexOf(value);
                break;
            }
            //     for(int j =i+1; j<nums.length; j++){
            //         if(nums[i]+nums[j] == target){
            //         output[0]=i;
            //         output[1]= j;
            //         break;
            //     }
            // }
        }
        System.out.println(Arrays.toString(output));
    }

}
