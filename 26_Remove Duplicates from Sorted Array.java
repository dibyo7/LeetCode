https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<1) return nums.length;
        int counter = 0;
        nums[counter] = nums[0];
        for(int i =0; i<nums.length; i++){
            if(nums[counter]<nums[i]){
                nums[++counter] = nums[i];
            }
        }
        return counter+1;
    }
}
