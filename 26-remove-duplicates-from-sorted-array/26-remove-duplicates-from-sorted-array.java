class Solution {
   public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        
        int slow = 0;
        int fast = 1;
        int currentValue = nums[0];
        
        while(fast < nums.length)
        {
            while(fast < nums.length && nums[fast] == currentValue)
            {
                fast++;
            }
            
            if(fast < nums.length)
            {
                slow++;
                nums[slow] = nums[fast];
                currentValue = nums[fast];
            }
        }
        return slow+1;
    }
}