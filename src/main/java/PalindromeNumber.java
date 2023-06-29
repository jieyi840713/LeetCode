public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String[] nums = (x + "").split("");
        int left = 0;
        int right  = nums.length -1;
        while(left <= right){
            if(!nums[left].equals(nums[right]) ) return false;
            left++;
            right--;
        }
        return true;
    };
}
