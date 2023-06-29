public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0; i< nums.length; i++){
                int reduceResult = target - nums[i];
                for(int j = i+1; j< nums.length; j++){
                    System.out.println(nums[j]);
                    if(nums[j] == reduceResult) {
                        output[0] = i;
                        output[1] = j;
                    }
                }
        }
        System.out.println("output[0]: " + output[0]);
        System.out.println("output[1]: " + output[1]);
        return output;
    }
}
